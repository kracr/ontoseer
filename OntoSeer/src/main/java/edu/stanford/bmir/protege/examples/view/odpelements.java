package edu.stanford.bmir.protege.examples.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class odpelements {

	
	
	
	
	
	
	List<String[]> myList = new ArrayList<String[]>();

	

	
	odpelements(){
	
		

}
//finding similarity of terms in active ontology
	public List<Double> findsimilarity(String st[]) {
		System.out.println(myList.size());
		List<Double>counts=new ArrayList<>();
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
					//score when there is a complete match of term
					if((myList.get(i))[j].equalsIgnoreCase(st[k])) {

						count=count+20;
					}
					// score when there is a threshold matching of greater than 0.65
					else {
					double d=c.similarity((myList.get(i))[j], st[k]);
					
				if(d>=0.85) {
					count=count+1;
				}
					}
			
			
		}
				
			}
			// normalization with matching of number of terms
			double e=(count)/((myList.get(i).length*st.length));
			
			counts.add(e);
			
		}
		System.out.println(name.length);
		for(int i=0;i<name.length;i++) {
				
				ls2.add(name[i]);
				System.out.println(name[i]+counts.get(i));
			
		}
	
		
	
		return counts;
    	}
		
    	

    	
    
		
		
	
	public static void main(String args[]) {
		odpelements d=new odpelements();
		Scanner sc=new Scanner(System.in);
	
		
		String st[]= {"Fishery","AquaticSpecies"};
		d.findsimilarity(st);
		
		
	}
}
