package edu.stanford.bmir.protege.examples.view;
import java.io.*;
import java.util.*;

import org.semanticweb.owlapi.model.OWLClass;


public class odpdescription {
	List<String> arr;
	List<String> arr1;
	List<String> IRI;
	List<String>ls5;
	List<Double>ls;
	public odpdescription() {

	
	
	IRI=new ArrayList<String>();
	arr=new ArrayList<String>();
	arr1=new ArrayList<String>();
	
	ls5=new ArrayList<String>();
	ls=new ArrayList<Double>();
	
	
}
	
    public List<String> readFileUri() {
    	String fileName="/odpuri.txt";
        try {
        	int count=0;
            
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    this.getClass().getResourceAsStream( fileName), "UTF-8"));
 
            String line = null;

            while ((line = br.readLine()) != null) {
            	count++;
            	IRI.add(line);
            	
            	}
            return IRI;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return IRI;
        } catch (IOException e) {
            e.printStackTrace();
            return IRI;
        }
    }
    public List<String> readFiledescription() {
    	String fileName="/odpdescription.txt";
        try {
        	int count=0;
            
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    this.getClass().getResourceAsStream( fileName), "UTF-8"));
 
            String line = null;

            while ((line = br.readLine()) != null) {
            	count++;
            	arr.add(line);
            	
            	}
            return arr;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return arr;
        } catch (IOException e) {
            e.printStackTrace();
            return arr;
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
            	arr1.add(line);
            	
            	}
            return arr1;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return arr1;
        } catch (IOException e) {
            e.printStackTrace();
            return arr1;
        }
    }
	
	public List<String> findsimilarity(String st,String sts[]) {
		odpelements e=new odpelements();
		odpdescription v=new odpdescription();
		IRI=v.readFileUri();
		arr=v.readFiledescription();
		arr1=v.readFileNames();
		List<String>ls1=new ArrayList<String>();
		List<String>ls2=new ArrayList<String>();
		List<Double>ls3=new ArrayList<Double>();
		List<Double>ls4=new ArrayList<Double>();
		
		ls3.addAll(e.findsimilarity(sts));
		StringEqualityPercentCheckUsingJaroWinklerDistance c=new StringEqualityPercentCheckUsingJaroWinklerDistance();
		for(int i=0;i<147;i++) {
			double d=c.similarity(st, arr.get(i));
			ls.add(d);
			ls1.add(arr1.get(i));
			ls5.add(IRI.get(i));
			
		}
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
    	for (int i=0;i<7;i++) {
    		
    		
    		System.out.println("Rank "+(i+1)+" ODP is :"+ls4.get(i)+" with scores: "+ls1.get(i)+"  IRI:"+ls5.get(i));
    		ls2.add(ls1.get(i));
    	
    }
		return ls2;
		
	}
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
		
	}
  

	
}