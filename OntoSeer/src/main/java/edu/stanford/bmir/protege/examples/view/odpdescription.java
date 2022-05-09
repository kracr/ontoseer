

package edu.stanford.bmir.protege.examples.view;
import java.io.*;
import java.util.*;

import org.semanticweb.owlapi.model.OWLClass;


public class odpdescription {
	public String arr[]=new String[200];
	public String arr1[]=new String[200];
	public String IRI[]=new String[200];
	List<String>ls5;
	List<Double>ls;
	odpdescription() {

	
	
	
	
	ls5=new ArrayList<String>();
	ls=new ArrayList<Double>();
	
	
}
	
	/*checking similarity of terms and description and generating score with weighted values*/
	public List<String> findsimilarity(String st,String sts[]) {
		odpelements e=new odpelements();
		

		List<String>ls1=new ArrayList<String>();
		List<String>ls2=new ArrayList<String>();
		List<Double>ls3=new ArrayList<Double>();
		List<Double>ls4=new ArrayList<Double>();
		
		ls3.addAll(e.findsimilarity(sts));
		StringEqualityPercentCheckUsingJaroWinklerDistance c=new StringEqualityPercentCheckUsingJaroWinklerDistance();
		/*147 odps are indexed*/
		for(int i=0;i<147;i++) {
			double d=0.0;
			
			d=c.similarity(st, arr[i]); //calling the JaroWinkler similarity function
			ls.add(d);
			ls1.add(arr1[i]);
			ls5.add(IRI[i]);
			
		}
		
		/*addition of scores of terms matching, description matching */
		for(int i=0;i<ls.size();i++) {
			ls4.add(ls.get(i)+ls3.get(i));
		
		}
		System.out.println(ls4.size());
		for(int j=0;j<ls4.size()-1;j++) {
			for (int i=0;i<ls4.size()-1;i++) {
    		
				if(ls4.get(i)<ls4.get(i+1)) {
					Collections.swap(ls4,i,i+1);
					Collections.swap(ls1,i,i+1);
					Collections.swap(ls5,i,i+1);
    			
    		}
    	}
		}
		/*considering only the TOP 7 recommendations*/
    	for (int i=0;i<7;i++) {
    		
    		
    		System.out.println("Rank "+(i+1)+" ODP is :"+ls4.get(i)+" with scores: "+ls1.get(i)+"  IRI:"+ls5.get(i));
    		ls2.add(ls1.get(i));
    	
    }
		return ls2;
		
	}
	/*checking similarity of description*/
	public List<String> findsimilarity1(String st,String sts[]){
		odpdescription d=new odpdescription();
		
		System.out.println(ls5.size());
		for (int i=0;i<7;i++) {
		System.out.println(ls5.get(i));
		}
		return ls5;

		
		
	}
	public static void main(String args[]) {
		odpdescription d=new odpdescription();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter description for ontology");
		String st=sc.nextLine();
		
		String sts[]= {"Person","Professor"};
		d.findsimilarity(st, sts);
		//d.findsimilarity1(st,sts);
		
	}
  

	
}
