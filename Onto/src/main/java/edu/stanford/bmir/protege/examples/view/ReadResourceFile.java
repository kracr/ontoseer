package edu.stanford.bmir.protege.examples.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ReadResourceFile {

    public void readFile(String fileName) {
        try {
        	System.out.println("Enter try"+fileName);
            // the slash '/' is required
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    this.getClass().getResourceAsStream( fileName), "UTF-8"));
            System.out.println(fileName);
            String line = null;

            while ((line = br.readLine()) != null) {
            	System.out.println(line);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadResourceFile readResouceFile = new ReadResourceFile();
        readResouceFile.readFile("/axiom.txt");
    }

}
