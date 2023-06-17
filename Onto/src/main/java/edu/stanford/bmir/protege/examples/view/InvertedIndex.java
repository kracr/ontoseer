package edu.stanford.bmir.protege.examples.view;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class InvertedIndex {
	
	List<String> stopwords = Arrays.asList("https://","IRI","Class","Declaration","subclassof","subpropertiesof");

	Map<String, List<Tuple>> index = new HashMap<String, List<Tuple>>();
	List<String> files = new ArrayList<String>();
//Creating index for folder of owl files
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
				System.out.println("word "+word+"FileNo"+t.getfileno()+"Position"+t.getposition());
			    try {
			        String str = word+","+t.getfileno();
			        int n=t.getfileno();
			    
		            	     BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\rohan\\Downloads\\Onto\\Onto\\src\\main\\resources\\index.txt", true));
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
//Searching the index
	public List<String> search(String word) {
		List<String> myList= new ArrayList<String>();
		List<String> myList1= new ArrayList<String>();
		List<String> indexretrieval= new ArrayList<String>();
		String fileName="/index.txt";
		StringEqualityPercentCheckUsingJaroWinklerDistance c=new StringEqualityPercentCheckUsingJaroWinklerDistance();
	      try {
	        	int count=0;
	            
	            BufferedReader br = new BufferedReader(new InputStreamReader(
	                    this.getClass().getResourceAsStream(fileName), "UTF-8"));
	 
	            String line = null;

	            while ((line = br.readLine()) != null) {
	            	count++;
	            	String arr[]=null;
	            	arr = line.split(",");  
	            	myList.add(arr[0]);
	            	myList1.add(arr[1]);
	            	if(myList.indexOf(word)!=-1) {
	            		
	            		indexretrieval.add(arr[1]);
	            		
	            	}
	            	else {
	            		double d=c.similarity(arr[0],word );
	            		if(d>=0.75) {
	            			indexretrieval.add(arr[1]);
	            		}
	            	}
	            	
	            	}
	            System.out.println(indexretrieval.toString());
	            return indexretrieval;
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	            return indexretrieval;
	        } catch (IOException e) {
	            e.printStackTrace();
	            return indexretrieval;
	        }
		
	/*	
		for (String _word : words) {
			Set<String> answer = new HashSet<String>();
			String word = _word.toLowerCase();
			List<Tuple> idx = index.get(word);
			if (idx != null) {
				for (Tuple t : idx) {
					answer.add(files.get(t.fileno));
				}
			}
			System.out.print(word);
			for (String f : answer) {
				System.out.print(" " + f);
			}
			System.out.println("");
		}
		*/
	}
	
	public void index(String st) {
		try {
			InvertedIndex idx = new InvertedIndex();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter file path to index");
			String trial=sc.nextLine();
			List<String>files=new ArrayList<>();
			File dir = new File(trial);
			File[] directoryListing = dir.listFiles();
			if (directoryListing != null) {
			    for (File file : directoryListing) {
			  
			    	//System.out.println(file.toString());
			    	idx.indexFile(file);
			  
			    	//System.out.println("Done indexing");
					
			    }
			}
			
		
		//	idx.search(st);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			InvertedIndex idx = new InvertedIndex();
			
			/*generate index over folder*/
			idx.index("resource");
			/*searching for terms in index*/
			idx.search("resour");
		}
			catch (Exception e) {
			e.printStackTrace();
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

}
