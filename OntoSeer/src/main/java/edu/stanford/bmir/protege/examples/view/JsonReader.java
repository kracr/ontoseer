package edu.stanford.bmir.protege.examples.view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;
public class JsonReader {


	

	  private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }

	  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException{
	    InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);
	      JSONObject json = new JSONObject(jsonText);
	      
	      return json;
	    } finally {
	      is.close();
	    }
	  }

	  public List<String> vocab(String s) throws IOException, JSONException {
		  
		  List<Map<String, Object>> map = new ArrayList<Map<String, Object>>();
		  List<String >ls= new ArrayList<String>();
		//  ObjectMapper mapper = new ObjectMapper();
		  try {
		  
		 // String s="Human";
		 String x="https://lov.linkeddata.es/dataset/lov/api/v2/vocabulary/search?q="+s;	
	    JSONObject json = readJsonFromUrl(x);
	    
	    //String 
	   // System.out.println(json.toString(4));
	    String[] keys = JSONObject.getNames(json);
	    int count=0;
	    int total=0;
	    for (String key : keys)
	    {	count++;
	    	
	    	
	    	if(count==5) {
	    		total++;
	        Object value = json.get(key);
	        String x1=value.toString();
	       
	    	 ls.add(x1);
	           
	    	
	    }
	    }
	    if(total<3) {
	    	 System.out.println(ls.toString());
	     }
	     else {
	       for (int i=0;i<3;i++) {
	    	   System.out.println(ls.get(i));
	       }}}
	   
	          //  System.out.println(map.toString());
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	       
	  
	        
	  
	        // Printing content of array 
	       
	      // System.out.println(x1.toString(4)); // pretty print json
	       
	        // Determine type of value and do something with it...
	    return ls;
	    }
	
	    
	    //System.out.println(count);
	    //System.out.println(json.get("id"));
	  
	  
	  public  List<String>  suggestnames(String s) throws IOException, JSONException {
		  List<Map<String, Object>> map = new ArrayList<Map<String, Object>>();
		  List<String >ls= new ArrayList<String>();
		 // String s="Human";
		 String x="https://lov.linkeddata.es/dataset/lov/api/v2/term/suggest?q="+s;	
	    JSONObject json = readJsonFromUrl(x);
	   
	    //String 
	   // System.out.println(json.toString(4));
	    String[] keys = JSONObject.getNames(json);
	    int count=0;
	    for (String key : keys)
	    {	count++;
	    	//if(count==5) {
	    	
	    	
	        Object value = json.get(key);
	        String x1=value.toString();
	        ls.add(x1);
	    }
	     System.out.println(count);
	     if(count<3) {
	    	 System.out.println(ls.toString());
	     }
	     else {
	       for (int i=0;i<3;i++) {
	    	   System.out.println(ls.get(i));
	       }
	  }
	
	    return ls;
	  }
	  
	  public static void main(String[] args){
		  JsonReader j=new JsonReader();
		  try {
			  j.vocab("Person");
			  j.suggestnames("Person");
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
}
}

