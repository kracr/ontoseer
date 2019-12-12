package edu.stanford.bmir.protege.examples.view;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;



import java.util.regex.Pattern;
public class naming_conventions {
	public  String convertToCamelCase(String sentence) {
		 
		// Extract all words
		String words[] = sentence.split("_");
		
		// Creating an empty string of type StringBuilder so that modification of string is possible.
		StringBuilder sb = new StringBuilder();
		
		// Iterating through words
		for (String word : words) {
			//Extracting first char
			char firstChar = word.charAt(0);
			// Checking if firstchar is not in upper case already
			if (!Character.isUpperCase(firstChar)) {
				// Convert first char into upper case and then append remaining characters of words. 
				sb.append(Character.toUpperCase(firstChar)).append(word.substring(1));
			} else
				sb.append(word.substring(0));
			
		}
		
		// Converting StringBuilder to String. trim() is needed to trim last space appended. 
		String result = sb.toString().trim();
		return result;
	}
	public  String isStringOnlyAlphabet(String str) 
	{ 
		String d=str;
	    if(!str.equals("")&& (str != null)&& (str.matches(".*\\d.*"))){
	    	 d=str.replaceAll("\\d","");
	    }
	    return d;
	            
	}
	public boolean t(String s) {
		
		Pattern pattern = Pattern.compile("\\s");
		Matcher matcher = pattern.matcher(s);
		boolean found = matcher.find();
		return found;
	}
	
/*	public List<String> namesuggestion(String s3) {
		
		List<String>names=new ArrayList<>();
		naming_conventions s1=new naming_conventions();
		String x=s1.convertToCamelCase(s3);
		return names;

	}*/
	
	public static void main(String args[]) {
		naming_conventions s=new naming_conventions();
		String x=s.convertToCamelCase("persons_news");
		System.out.println(x);
		String y=s.isStringOnlyAlphabet("persons_news1234");
		System.out.println(y);
	}
	/*
	 public static void spell(String s) {
		 System.out.println("Enter");
         	try {
         	System.out.println("Enter");
	        File dir = new File("/home/pramit67/outputstest.txt");
	        IndexWriterConfig indexWriterConfig =new IndexWriterConfig(new WhitespaceAnalyzer());
	        System.out.println("4");
	        Directory directory = FSDirectory.open(dir.toPath());
	        System.out.println("4");
	        @SuppressWarnings("resource")
			SpellChecker spellChecker = new SpellChecker(directory);
	        System.out.println("4");
	        spellChecker.indexDictionary(new PlainTextDictionary(new File("/home/pramit67/Downloads/WordNet-3.0/dict/noun.txt").toPath()),indexWriterConfig,false);
	        System.out.println("4");
	        String wordForSuggestions ="humanbeing";
	        System.out.println("Enter");
	  
	         
	        int suggestionsNumber = 5;
	        double accuracy=0.3;
	        String[] su= spellChecker.suggestSimilar(wordForSuggestions, suggestionsNumber, (float) accuracy);
	        boolean suggestions = spellChecker.exist(wordForSuggestions);
	        System.out.println(Arrays.toString(su));
	        if (suggestions) {
	            
	                System.out.println("Did you mean:" +wordForSuggestions);
	            
	        }
	        else {
	            System.out.println("No suggestions found for word:"+wordForSuggestions);
	        }
	        
	             
	    }
	 
	 catch(Exception e) {
		 System.out.println(e.getMessage());;	 }
}*/
}
