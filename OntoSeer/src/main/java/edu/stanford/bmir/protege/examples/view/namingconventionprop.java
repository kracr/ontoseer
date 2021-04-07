package edu.stanford.bmir.protege.examples.view;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class namingconventionprop {
	public  String convertToCamelCaseproperties(String sentence) {
		String sentence1=sentence; 
		// Extract all words
		String words[] = sentence.split("_");
		
		// Creating an empty string of type StringBuilder so that modification of string is possible.
		StringBuilder sb = new StringBuilder();
		
		// Iterating through words
		for (int i=0;i<words.length;i++) {
			//Extracting first char
			String word=words[i];
			char firstChar = word.charAt(0);
			if(i==0) {
			if (!Character.isUpperCase(firstChar)) {
				// Convert first char into upper case and then append remaining characters of words. 
				sb.append(Character.toLowerCase(firstChar)).append(word.substring(1));
			} else
				sb.append(word.substring(0));
			
		
		}
			else {
			
			// Checking if firstchar is not in upper case already
			if (!Character.isUpperCase(firstChar)) {
				// Convert first char into upper case and then append remaining characters of words. 
				sb.append(Character.toUpperCase(firstChar)).append(word.substring(1));
			} else
				sb.append(word.substring(0));
			
		
		}
		}
		// Iterating through words
	
		// Converting StringBuilder to String. trim() is needed to trim last space appended. 
		String result = sb.toString().trim();
		return result;
	}
	public String convertproperties(String classname) {
		String words1[]=classname.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : words1) {
			//Extracting first char
			char firstChar = word.charAt(0);
			// Checking if firstchar is not in upper case already
			if (Character.isUpperCase(firstChar)) {
				// Convert first char into upper case and then append remaining characters of words. 
				sb.append(Character.toLowerCase(firstChar)).append(word.substring(1));
			} else
				sb.append(word.substring(0));
			
			
			
		}
		String result = sb.toString().trim();
		naming_conventions n=new naming_conventions();
		String s=n.convertToCamelCaseproperties(result);
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
	public List<String> recomproperties(String classname) {
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
		
		String x=s.convertproperties(classname);
		String x1=s.remove_spaceproperties(x);
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
	public String remove_spaceproperties(String classname) {
        
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
	      
	      
	      boolean checkproperties(String classname) {
	    	  
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
	  	public static void main(String args[]) {
			namingconventionprop s=new namingconventionprop();
			List<String>ls=new ArrayList<String>();
			List<String>ls1=new ArrayList<String>();
		
			
			ls1.addAll(s.recomproperties("Person_under"));
			System.out.println(ls.size());
			System.out.println(ls1.size());
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
		for(int i=0;i<ls1.size();i++) {
			
			System.out.println(ls1.get(i));
		}
		}
}
