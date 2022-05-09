/*file for axiom recommendation*/

package edu.stanford.bmir.protege.examples.view;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;

import java.util.*;

/*running over all the indexed tuples and matching each of the three term and storing most relevant terms in hashset*/
public class retrieval {
	
		
		
		public  void re(String a,String folder) {
			String s;
			
			Set<String> hash_Set = new HashSet<String>(); 
			Set<String> al = new HashSet<String>();
		
			 try{
				 
				 File file=new File(folder);
				 File [] files = file.listFiles();
				 /*running over entire indexed tuples*/
				 for (int i = 0; i < files.length; i++){
				 
				           File fstream = new File(files[i].toString());
				            Scanner in = null;
			
				  
				        in = new Scanner(fstream);
				        int linecount=0;
				        
				       
				        	while(in.hasNext())
				        
				        {
				            String line=in.nextLine();
				            if(line.contains(a)){
				            	
				            	al.add(files[i].toString());
				            	hash_Set.add(line);
				            	
				                 
				   

				        }
				         }in.close();}
		
				 
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
			        }catch (Exception e){
				   e.printStackTrace();
				  }
			 
			 
			 
			 
			
		}
		/*similarity finding of terms with any of the three indexed terms of each axioms*/
		public List<String> match(String name)  {
			
			AxiomTriples a=new AxiomTriples();
			List<String>axioms=new ArrayList<String>();
			axioms.addAll(a.axioms());
			List<String> hash_Set = new ArrayList<String>();
			List<Double>dd=new ArrayList<>();
			int count=0;
			//JaroWinkler similarity approach has been used
			StringEqualityPercentCheckUsingJaroWinklerDistance c=new StringEqualityPercentCheckUsingJaroWinklerDistance();
			try {
			
				  
			for(int i=0;i<axioms.size();i++) 
			{  
				
			   String s[]=axioms.get(i).split(" ");
			
			  
			   for(int j=0;j<3;j++) {
			
				   double d=c.similarity(s[j], name);
				  //Threshold is kept at 0.85 after multiple iterations 
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
