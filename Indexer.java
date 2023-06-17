import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.FileInputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;
import java.lang.Thread;

public class Indexer {

    List<String> stopwords = Arrays.asList("https://","IRI","Class","Declaration","subclassof","subpropertiesof");

	Map<String, List<Tuple>> index = new HashMap<String, List<Tuple>>();
	List<String> files = new ArrayList<String>();

    public void indexFile(File file) throws IOException {
		int fileno = files.indexOf(file.getPath());
		if (fileno == -1) {
			files.add(file.getPath());
			fileno = files.size() - 1;
		}

		int pos = 0;
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		for (String line = reader.readLine(); line != null; line = reader
				.readLine()) {
			for (String _word : line.split("\\W+")) {
				String word = _word.toLowerCase();
				pos++;
				if (stopwords.contains(word))
					continue;
				List<Tuple> idx = index.get(word);
				if (idx == null) {
					idx = new LinkedList<Tuple>();
					index.put(word, idx);
					//System.out.println(word+"idx"+idx.toString());
				}
				idx.add(new Tuple(fileno, pos));
				Tuple t=new Tuple(fileno,pos);
				// System.out.println("word "+word+"FileNo"+t.getfileno()+"Position"+t.getposition());
			    try {
			        String str = word+","+t.getfileno();
			        int n=t.getfileno();
			    
		            	     BufferedWriter writer = new BufferedWriter(new FileWriter("Onto/src/main/resources/index.txt", true));
		            	     writer.append('\n');
		 			         writer.append(str);
		 			        
		 			        writer.close();
		            	}
			        	
			        
			   
			    
			       catch (IOException e) {
			        System.out.println("An error occurred.");
			        e.printStackTrace();
			      }

				
				
				

			}
			 
		}

		
	}

    public void index(String st) {
		try {
			String trial=st;
			List<String>files= new ArrayList<>();
			File dir = new File(trial);
			File[] directoryListing = dir.listFiles();
			if (directoryListing != null) {
			    for (File file : directoryListing) {
			  
			    	//System.out.println(file.toString());
			    	indexFile(file);
			  
			    	System.out.println("Done indexing");
					
			    }
			}
			
		
		//	idx.search(st);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    public static void main(String[] args) {
        try {
            //Reading from the config file
			Properties inputDir= new Properties();
			FileInputStream ip= new FileInputStream("Onto/src/main/resources/config.properties");
			inputDir.load(ip);

			String indexDir = inputDir.getProperty("directory");
			//System.out.println(indexDir);
            // Overrides directory to be indexed given in config file.
			if(args.length>0){
				indexDir = args[0];
			}

            Indexer obj = new Indexer();

            System.out.println("Starting ReIndexing Process");

            obj.index(indexDir);
            // Till here we have generated the index.txt, now generate axiom triples.

            // Specify the path to the Python file
            String pythonScriptPath = "axiomgen.py";

            // Create a process to run the Python script
            //Cgeck command, alter axiomgen.py to accept command line arguments.
            ProcessBuilder pb = new ProcessBuilder("python", pythonScriptPath, indexDir);

            // Start the process
            Process process = pb.start();

            // Wait for the process to complete
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Python script executed successfully.");
            } else {
                System.err.println("An error occurred while executing the Python script.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        // Till this point, indexing is done.
        System.out.println("Completed the Reindexing process. Now building the JAR file.");
        // Write code to do 'mvn clean package' in Onto directory.
		System.out.println("The terminal window will open shortly. 'cd' into the Onto directory, and run the 'mvn clean package' command. The 'Ontoseer.jar' file will be created in the 'target' directory.");

		try{
			Thread.sleep(7500); // sleeping for 7.5 seconds

			Runtime.getRuntime().exec(new String[] {"cmd", "/K", "Start"}); //opens terminal window.
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Program execution over.");
		//Done.
    }
}

class Tuple {
    int fileno;
    int position;

   public Tuple(int fileno, int position) {
       this.fileno = fileno;
       this.position = position;
   }
   public int getfileno() {
       return this.fileno;
   }
   public int getposition() {
       return this.position;
   }
}
