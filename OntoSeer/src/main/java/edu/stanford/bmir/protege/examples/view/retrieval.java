package edu.stanford.bmir.protege.examples.view;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;

import java.util.*;


public class retrieval {
	
		
		
		public  void re(String a,String folder) {
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
		
		public List<String> match(String name)  {
			//System.out.println(filename+name);
			AxiomTriples a=new AxiomTriples();
			List<String>axioms=new ArrayList<String>();
			axioms.addAll(a.axioms());
			List<String> hash_Set = new ArrayList<String>();
			List<Double>dd=new ArrayList<>();
			int count=0;
			StringEqualityPercentCheckUsingJaroWinklerDistance c=new StringEqualityPercentCheckUsingJaroWinklerDistance();
			try {
			
			//System.out.println(filename+name);
	  
			for(int i=0;i<axioms.size();i++) 
			{  
				//System.out.println(lines);
			   String s[]=axioms.get(i).split(" ");
			
			  
			   for(int j=0;j<3;j++) {
				 //  System.out.println(s[i]);
				   double d=c.similarity(s[j], name);
				   
				   if(d>=0.95&&count<8) {
					   
					   hash_Set.add(axioms.get(i));
					   count++;
				   
					   
				   }
				   
				   
				  

			   
			   
			}
			}
			
				return hash_Set;
			
		}catch(Exception e) {
			return null;
		}
		}
		
		public List<String>filtering(String s1){
			List<String>s=new ArrayList<>();
			List<String>s11=new ArrayList<>();
			List<String>s12=new ArrayList<>();
			s.addAll(match(s1));
			for(int i=0;i<s.size();i++) {
				String s2[]=s.get(i).split(" ");
			//	System.out.println(s2[0]+s2[4]);
				if(s2[0].equalsIgnoreCase(s2[4])) {
					s11.add(s.get(i));
					
				}
				else {
					s12.add(s.get(i));
				}
			}
			return s12;
			
		}
		public static void main(String args[]) {
			try {
			
				List<String>ls=new ArrayList<>();
				String s[]= {"Person","Book"};
				retrieval r=new retrieval();
				for(int i=0;i<s.length;i++) {
		
				ls=r.filtering(s[i]);
				System.out.print(ls);
				
				}
			
		}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	}
