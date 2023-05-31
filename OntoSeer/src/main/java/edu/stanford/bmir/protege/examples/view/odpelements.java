package edu.stanford.bmir.protege.examples.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class odpelements {
	
List<String[]> myList = new ArrayList<String[]>();
List<String>name=new ArrayList<String>();

odpelements(){

}
	
    public List<String[]> readFileElements() {
    	String fileName="/odpelements.txt";
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
    public List<String> readFileNames() {
    	String fileName="/odpnames.txt";
        try {
        	int count=0;
            
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    this.getClass().getResourceAsStream( fileName), "UTF-8"));
 
            String line = null;

            while ((line = br.readLine()) != null) {
            	count++;
            	name.add(line);
            	
            	}
            return name;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return name;
        } catch (IOException e) {
            e.printStackTrace();
            return name;
        }
    }
	
	public List<Double> findsimilarity(String st[]) {
		odpelements ele=new odpelements();

		List<Double>counts=new ArrayList<>();
		myList=ele.readFileElements();
		//System.out.println(myList.size());
		name=ele.readFileNames();
		int count=0;
		int count1=0;
		List<Double>ls=new ArrayList<Double>();
		List<String>ls1=new ArrayList<String>();
		List<String>ls2=new ArrayList<String>();
		StringEqualityPercentCheckUsingJaroWinklerDistance c=new StringEqualityPercentCheckUsingJaroWinklerDistance();
		for(int i=0;i<myList.size();i++) {
			count=0;
			count1=0;
			for(int j=0;j<myList.get(i).length;j++) {
				for(int k=0;k<st.length;k++) {
					if((myList.get(i))[j].equalsIgnoreCase(st[k])) {
						count=count+20;
					}
					else {
					double d=c.similarity((myList.get(i))[j], st[k]);
					
				if(d>=0.85) {
					count=count+1;
				}
					}
			
			
		}
				
			}
			double e=(count)/((myList.get(i).length*st.length));
			//System.out.println(myList.get(i)+" "+e);
			counts.add(e);
			
		}
		//System.out.println(name.length);
		for(int i=0;i<name.size();i++) {
				
				ls2.add(name.get(i));
				System.out.println(name.get(i)+counts.get(i));
			
		}
	
		
	
		return counts;
    	}
		
 /*Inverted index for ODP called here*/   	
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
    	
    
		
		
	
	public static void main(String args[]) {
		odpelements d=new odpelements();
		Scanner sc=new Scanner(System.in);
		//System.out.print("Enter description for ontology");
		
		String st[]= {"Fishery","AquaticSpecies"};
		d.findsimilarity(st);
		
		
	}
}
