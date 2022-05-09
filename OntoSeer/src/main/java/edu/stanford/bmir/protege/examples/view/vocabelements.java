package edu.stanford.bmir.protege.examples.view;

import java.util.*;

public class vocabelements {
	

	
	public vocabelements() {
		desc=new ArrayList<String>();
		ls4=new ArrayList<String>();
		ls3=new ArrayList<String>();
		ls2=new ArrayList<String>();
		myList = new ArrayList<String[]>();
		vocabnames=new ArrayList<String>();
	

		
	}
	
	public List<String> findsimilarity(String st) {
		List<Double>counts=new ArrayList<>();
		int count=0;
		int count1=0;
		List<Double>ls=new ArrayList<Double>();
		List<String>ls1=new ArrayList<String>();

		StringEqualityPercentCheckUsingJaroWinklerDistance c=new StringEqualityPercentCheckUsingJaroWinklerDistance();
		for(int i=0;i<myList.size();i++) {
			count=0;
			count1=0;
			for(int j=0;j<myList.get(i).length;j++) {
					//if the term is present in vocabulary
					if((myList.get(i))[j].equalsIgnoreCase(st)) {
						count=count+20;
					}
					else {
					//if the term matches greater than threshold of 0.75
					double d=c.similarity((myList.get(i))[j],st );
					
				if(d>=0.75) {
					count=count+1;
				}
					}
			
			
		}
				
			
			double e=(count);
			//System.out.println(myList.get(i)+" "+e);
			counts.add(e);
			
		
		}

		

		
		for(int i=0;i<vocabnames.size();i++) {
			//only considering vocab with count greater than 1.0 for relevant recommendations
			if(counts.get(i)>=1) {
				int l=i;
				
				ls2.add(" "+vocabnames.get(l));
				
				ls4.add("IRI: "+uri[l]);
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
		
   
    	public List<String> URI(String st){
    		for(int i=0;i<ls4.size();i++) {
    			System.out.println(ls4.get(i));
    		}
    		return ls4;
    		
    	}

   public static void main(String args[]) {
		vocabelements d=new vocabelements();
		Scanner sc=new Scanner(System.in);
	
		
		String st= "Fishery";
		d.findsimilarity(st);
		
		d.URI(st);
		
		
		
	}

}
