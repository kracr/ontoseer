package edu.stanford.bmir.protege.examples.view;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
	List<String> stopwords = Arrays.asList("https://","IRI","Class","Declaration");

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
				}
				idx.add(new Tuple(fileno, pos));
			}
		}
		System.out.println("indexed " + file.getPath() + " " + pos + " words");
	}
//Searching the index
	public void search(List<String> words) {
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
	}

	public static void main(String[] args) {
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
			  
			    	System.out.println(file.toString());
			    	idx.indexFile(file);
			    	System.out.println("Done indexing");
					
			    }
			}
			
			    

			
		
			
			List<String>words=new ArrayList<>();
			System.out.println("Please enter the words you want to search");
			Scanner sc1=new Scanner(System.in);
			String lrt=sc1.nextLine();
			words.add(lrt);
			idx.search(words);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private class Tuple {
		private int fileno;
		private int position;

		public Tuple(int fileno, int position) {
			this.fileno = fileno;
			this.position = position;
		}
	}

}
