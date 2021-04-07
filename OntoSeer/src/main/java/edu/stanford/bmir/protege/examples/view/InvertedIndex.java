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
	List<String> stopwords = Arrays.asList("a", "able", "about",
			"across", "after", "all", "almost", "also", "am", "among", "an",
			"and", "any", "are", "as", "at", "be", "because", "been", "but",
			"by", "can", "cannot", "could", "dear", "did", "do", "does",
			"either", "else", "ever", "every", "for", "from", "get", "got",
			"had", "has", "have", "he", "her", "hers", "him", "his", "how",
			"however", "i", "if", "in", "into", "is", "it", "its", "just",
			"least", "let", "like", "likely", "may", "me", "might", "most",
			"must", "my", "neither", "no", "nor", "not", "of", "off", "often",
			"on", "only", "or", "other", "our", "own", "rather", "said", "say",
			"says", "she", "should", "since", "so", "some", "than", "that",
			"the", "their", "them", "then", "there", "these", "they", "this",
			"tis", "to", "too", "twas", "us", "wants", "was", "we", "were",
			"what", "when", "where", "which", "while", "who", "whom", "why",
			"will", "with", "would", "yet", "you", "your","http:",".com","Prefix","Class","IRI");

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
				}
				idx.add(new Tuple(fileno, pos));
			}
		}
		System.out.println("indexed " + file.getPath() + " " + pos + " words");
	}

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
			List<String>files=new ArrayList<>();
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00434.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00453.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00455.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00456.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00466.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00467.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00478.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00499.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00503.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00517.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00549.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00567.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00568.owl");
			files.add("/home/pramit67/Downloads/owl2_rl_benchmark_corpus/00643.owl");
			
			String str=sc.nextLine();
		//	File folder=new File(str);
		//	File [] files = folder.listFiles();
		//	for(int i=0;i<files.length;i++) {
			for(int i=0;i<files.size();i++) {
				File file=new File(files.get(i));
				System.out.println(""+i);
				idx.indexFile(file);
				System.out.println("Done indexing");
				
			}
			
			
			
			List<String>words=new ArrayList<>();
			words.add("Book");
			idx.search(words);
			/*
			for (int i = 1; i < args.length; i++) {
				idx.indexFile(new File(args[i]));
			}
			idx.search(Arrays.asList(args[0].split(",")));
			*/
			
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
