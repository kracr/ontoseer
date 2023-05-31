package edu.stanford.bmir.protege.examples.view;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
public class AxiomTriples {

		List<String>axim;
	public AxiomTriples() {
		axim=new ArrayList<String>();
	}
    public List<String> readFile(String fileName) {
    	fileName="/axiom.txt";
        try {
        	//System.out.println("Enter try"+fileName);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    this.getClass().getResourceAsStream( fileName), "UTF-8"));
            //System.out.println(fileName);
            String line = null;

            while ((line = br.readLine()) != null) {
            	//System.out.println("Inside while");
            	axim.add(line)      ;    
            	}
          //  System.out.println(axim.size());
            return axim;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return axim;
        } catch (IOException e) {
            e.printStackTrace();
            return axim;
        }
    }
	public List<String> axioms() {

		AxiomTriples a=new AxiomTriples();
		axim=a.readFile("/axiom.txt");
		//System.out.println(axim.size());
		for(int i=0;i<axim.size();i++) {
			//System.out.println(axim.get(i));		
			}
		return axim;
	}
	public static void main(String args[]) {
		AxiomTriples a=new AxiomTriples();
		a.axioms();
	}







}
