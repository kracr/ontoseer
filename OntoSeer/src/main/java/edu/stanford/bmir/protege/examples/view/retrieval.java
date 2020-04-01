package edu.stanford.bmir.protege.examples.view;

import java.io.*;
import java.nio.file.Files;

import java.util.*;
public class retrieval {
	

	
		
		public static void re(String a,String folder) {
			String s;
			
			Set<String> hash_Set = new HashSet<String>(); 
			Set<String> al = new HashSet<String>();
			//System.out.println(jw.similarity("My string", "My ntrisg"));
			 try{
				  // Open the file that is the first 
				  // command line parameter
				 File file=new File(folder);
				 File [] files = file.listFiles();
				 for (int i = 0; i < files.length; i++){
				      //  if (files[i].isFile()){ //this line weeds out other directories/folders
				           // System.out.println(files[i]);
					 
				           File fstream = new File(files[i].toString());
				            Scanner in = null;
				  // Get the object of DataInputStream
				  
				        in = new Scanner(fstream);
				        int linecount=0;
				        
				       
				        	while(in.hasNext())
				        
				        {
				            String line=in.nextLine();
				            if(line.contains(a)){
				            	//System.out.println(files[i]);
				            	al.add(files[i].toString());
				            	hash_Set.add(line);
				            	// System.out.println(line);
				                 line=in.nextLine();
				                 hash_Set.add(line);
				                 //System.out.println(line);
				                 
				                 line=in.nextLine();
				                 hash_Set.add(line);
				                 //System.out.println(line);
				                 line=in.nextLine();
				                 hash_Set.add(line);
				                 //System.out.println(line);
				                 line=in.nextLine();
				                 hash_Set.add(line);
				                // System.out.println(line);
				                 line=in.nextLine();
				                 hash_Set.add(line);
				                //System.out.println(line);

				        }
				         }in.close();}
					  //boolean isFound = strLine.indexOf(a) !=-1? true: false;
					 // boolean isFound1 = strLine.indexOf(b) !=-1? true: false;
					 /* if(isFound && isFound1) {
						  System.out.println (strLine);
				  }
					  else {
						 // System.out.println("No recommendation");
					  }*/
				  
				  //Close the input stream
				 // in.close();
				 
				 Iterator<String> i1 = al.iterator(); 
			        while (i1.hasNext()) 
			            System.out.println(i1.next()); 
				 
				 
				 Iterator<String> i = hash_Set.iterator();
				 int count=0;
			        while (i.hasNext()) {
			        	count++;
			        	if(count==1) {
			            System.out.println(i.next());
			            } 
			        }
			        }catch (Exception e){//Catch exception if any
				   e.printStackTrace();
				  }
			 
			 
			 
			 
			
		}
		public static void main(String args[]) {
			try {
			//JaroWinkler jw = new JaroWinkler();
				
				retrieval r=new retrieval();
				r.re("Book","/home/pramit67/Downloads/owl2_rl_benchmark_corpus/oxford/");
			
			
		}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	}
