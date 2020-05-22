package edu.stanford.bmir.protege.examples.view;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;



import java.util.regex.Pattern;
public class naming_conventions {
	public  String convertToCamelCase(String sentence) {
		String sentence1=sentence; 
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
		// Iterating through words
	
		// Converting StringBuilder to String. trim() is needed to trim last space appended. 
		String result = sb.toString().trim();
		return result;
	}
	public String convert(String classname) {
		String words1[]=classname.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : words1) {
			//Extracting first char
			char firstChar = word.charAt(0);
			// Checking if firstchar is not in upper case already
			if (!Character.isUpperCase(firstChar)) {
				// Convert first char into upper case and then append remaining characters of words. 
				sb.append(Character.toUpperCase(firstChar)).append(word.substring(1));
			} else
				sb.append(word.substring(0));
			
			
			
		}
		String result = sb.toString().trim();
		naming_conventions n=new naming_conventions();
		String s=n.convertToCamelCase(result);
		return s;
	}
	public  String isStringOnlyAlphabet(String str) 
	{ 
		String d=str;

	       
		
	    if(!str.equals("")&& (str != null)&& (str.matches(".*\\d.*"))){
	    	 d=str.replaceAll("\\d","");
	    }
	    //System.out.println(d);
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
		List<String>ls=new ArrayList<String>();
	
		ls.addAll(s.recom("Person_1234"));
		System.out.println(ls.size());
		/*
		ls.addAll(s.recom("Person news"));
		ls.addAll(s.recom("@#%"));
		ls.addAll(s.recom("1234"));
		ls.addAll(s.recom("1234_"));
		ls.addAll(s.recom("1234_Person"));
		ls.addAll(s.recom("1234 Person"));
		ls.addAll(s.recom("Person_news"));
		*/
	for(int i=0;i<ls.size();i++) {
			
			System.out.println(ls.get(i));
			}
	}
	public List<String> recom(String classname) {
		List<String>ls=new ArrayList<String>();
		 String EMPTY = "";
		String splChrs = "-/@#$%^&_+=()" ;
		boolean found = classname.matches("[" + splChrs + "]+");
		if(found) {
			
			ls.add("Classname only contains Special characters Please change.");
			return ls;
		}
		else if(classname.matches("[0-9]+") && classname.length() > 2) {
	          System.out.println("");
	          ls.add("Classname only contains digits Please change.");
	          return ls;
	         // classname="";
	      }
		else { 
		naming_conventions s=new naming_conventions();
		
		//System.out.println(classname);
		String y1;
		
		
	//	System.out.println(x1);
		
		String x=s.convert(classname);
		String x1=s.remove_space(x);
		String y=s.isStringOnlyAlphabet(x1);
		
		ls.add(y);
		//System.out.println(y+"size"+y.length());
		y1=y+"_";
		ls.add(y1);
		//System.out.println(ls.size());
		
		return ls;
		//System.out.println(y);
		
	
	}
	}
	
	public String remove_space(String classname) {
        
       char[] charArray = classname.toCharArray();
        
       String stringWithoutSpaces = "";
        
       for (int i = 0; i < charArray.length; i++) 
       {
           if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
           {
               stringWithoutSpaces = stringWithoutSpaces + charArray[i];
           }
       }
       return stringWithoutSpaces;
	}
	
	      boolean check(String classname) {
	    	  
	      boolean f=false;
	      int count=0;
	      if (classname == null) {
	          return false;
	       }
	       int len = classname.length();
	       for (int i = 0; i < len; i++) {
	           
	          if ((Character.isDigit(classname.charAt(i)) == false) && (classname.charAt(i) != ' ')) {
	        	  count++;

	          }
	       }
	       if(count==1) {
	    	  return true;
	       }
	       else {
	    	   return false;
	       }
	    	  
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
