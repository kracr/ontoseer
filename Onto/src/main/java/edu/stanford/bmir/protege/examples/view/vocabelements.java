package edu.stanford.bmir.protege.examples.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class vocabelements {

	List<String>desc;
	List<String[]> myList;
	List<String>vocabnames;
	List<String>uri;
	
	List<String>ls2;
	List<String>ls3;
	List<String>ls4;
	
	
	public vocabelements() {
		desc=new ArrayList<String>();
		ls4=new ArrayList<String>();
		ls3=new ArrayList<String>();
		ls2=new ArrayList<String>();
		myList = new ArrayList<String[]>();
		vocabnames=new ArrayList<String>();
		uri=new ArrayList<String>();

		
	}
	
	
    public List<String> readFileVocab() {
    	String fileName="/vocabnames.txt";
        try {
        	int count=0;
            
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    this.getClass().getResourceAsStream( fileName), "UTF-8"));
 
            String line = null;

            while ((line = br.readLine()) != null) {
            	count++;
            	vocabnames.add(line)      ;    
            	}
            return vocabnames;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return vocabnames;
        } catch (IOException e) {
            e.printStackTrace();
            return vocabnames;
        }
    }
	
	
    public List<String> readFileUri() {
    	String fileName="/urii.txt";
        try {
        	int count=0;
            
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    this.getClass().getResourceAsStream( fileName), "UTF-8"));
 
            String line = null;

            while ((line = br.readLine()) != null) {
            	count++;
            	uri.add(line);
            	
            	}
            return uri;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return uri;
        } catch (IOException e) {
            e.printStackTrace();
            return uri;
        }
    }
    
    public List<String> readFileDescription() {
    	String fileName="/vocabdescription.txt";
        try {
        	int count=0;
            
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    this.getClass().getResourceAsStream( fileName), "UTF-8"));
 
            String line = null;

            while ((line = br.readLine()) != null) {
            	count++;
            	desc.add(line);
            	
            	}
            return desc;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return desc;
        } catch (IOException e) {
            e.printStackTrace();
            return desc;
        }
    }
    
    public List<String[]> readFileElements() {
    	String fileName="/vocabelements.txt";
        try {
        	int count=0;
            
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    this.getClass().getResourceAsStream( fileName), "UTF-8"));
 
            String line = null;

            while ((line = br.readLine()) != null) {
            	count++;
            	String arr[]=null;
            	arr = line.split(",");  
            	myList.add(arr);
            	
            	}
            return myList;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return myList;
        } catch (IOException e) {
            e.printStackTrace();
            return myList;
        }
    }
	
	
	
	
	public List<String> findsimilarity(String st) {
		vocabelements v=new vocabelements();
		List<Double>counts=new ArrayList<>();
		int count=0;
		int count1=0;
		List<Double>ls=new ArrayList<Double>();
		List<String>ls1=new ArrayList<String>();
		vocabnames=v.readFileVocab();
		uri=v.readFileUri();
		desc=v.readFileDescription();
		myList=v.readFileElements();
		StringEqualityPercentCheckUsingJaroWinklerDistance c=new StringEqualityPercentCheckUsingJaroWinklerDistance();
		for(int i=0;i<myList.size();i++) {
			count=0;
			count1=0;
			for(int j=0;j<myList.get(i).length;j++) {
					
					if((myList.get(i))[j].equalsIgnoreCase(st)) {
						count=count+20;
					}
					else {
					double d=c.similarity((myList.get(i))[j],st );
					
				if(d>=0.75) {
					count=count+1;
				}
					}
			
			
		}
				
			
			double e=(count);
			counts.add(e);
			
		
		}

		

		
		for(int i=0;i<vocabnames.size()-1;i++) {
			if(counts.get(i)>=1) {
				int l=i;
				System.out.println(i);
				ls2.add(" "+vocabnames.get(l));
				ls3.add("Description: "+desc.get(l));
				ls4.add("IRI: "+uri.get(l));
			}
			
			else {
				continue;
			}
			
			
		}
	
		
		for(int i=0;i<ls2.size();i++) {
			System.out.println(ls2.get(i));
			
		}
		return ls2;
    	}

	
	
/* Inverted index called here */
	
	public List<String> indexretrieval(String st) {
			
			List<String> index=new ArrayList<String>();
			try {
				InvertedIndex idx = new InvertedIndex();
				
				index=idx.search(st);
				return index;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return index;
	
	}
	
	
    	public List<String> description(String st){
    		for(int i=0;i<ls3.size();i++) {
    			System.out.println(ls3.get(i));
    		}
    		return ls3;
    		
    	}
    	public List<String> URI(String st){
    		for(int i=0;i<ls4.size();i++) {
    			System.out.println(ls4.get(i));
    		}
    		return ls4;
    		
    	}

   public static void main(String args[]) {
		vocabelements d=new vocabelements();
		Scanner sc=new Scanner(System.in);
		String st= "Book";
		d.findsimilarity(st);
		//d.description(st);
		//d.URI(st);
		//d.readFileUri();
		d.indexretrieval(st);
		
		
		
	}

}
