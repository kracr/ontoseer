package edu.stanford.bmir.protege.examples.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.*;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.OutputStream; 

import javax.swing.text.*;

import java.awt.Font;


import java.awt.event.*; 

import java.util.*;


import org.protege.editor.owl.model.OWLModelManager;
import org.protege.editor.owl.model.event.EventType;
import org.protege.editor.owl.model.event.OWLModelManagerListener;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLIndividual;

public class Metrics extends JPanel {
	

    private JButton refreshButton = new JButton("Refresh");
    private JButton refreshButton1 = new JButton("ODP");
    private JButton refreshButton2 = new JButton("VocabSuggestion");
    private JButton refreshButton3 = new JButton("Axiom Recommendation");
    private JButton refreshButton4 = new JButton("ChatBot Action");

    private JLabel textComponent = new JLabel();
    private JLabel textComponent1 = new JLabel();
    private JLabel textComponent2 = new JLabel();

    public JTextPane textPane = new JTextPane();
    public JTextArea textArea = new JTextArea(20,20);
    public JTextArea textArea1 = new JTextArea(20,20);
    public JTextArea textArea2 = new JTextArea(20,20);
    JScrollPane scrollPane = new JScrollPane(); 
   

    private OWLModelManager modelManager;


    private ActionListener refreshAction = e -> recalculate();
    private ActionListener refreshAction1 = e -> recalculate1();
    private ActionListener refreshAction2 = e -> recalculate2();
    private ActionListener refreshAction3 = e -> recalculate3();
    private ActionListener refreshAction4 = e -> recalculate4();

    private OWLModelManagerListener modelListener = event -> {
        if (event.getType() == EventType.ACTIVE_ONTOLOGY_CHANGED) {
            recalculate();
        }
    };
    
    public Metrics(OWLModelManager modelManager) {
    	
    	this.modelManager = modelManager;
        recalculate();
        
        modelManager.addListener(modelListener);
        refreshButton.addActionListener(refreshAction);
        refreshButton1.addActionListener(refreshAction1);
        refreshButton2.addActionListener(refreshAction2);
        refreshButton3.addActionListener(refreshAction3);
        refreshButton3.addActionListener(refreshAction4);
  
        

 
        
        add(refreshButton1);
        add(refreshButton2);
        add(refreshButton3);
        add(refreshButton4);


        Font font = new Font("Serif",Font.PLAIN, 14);


        Font font1 = new Font("Serif",Font.PLAIN, 14);

       
    }
    
    public void dispose() {
        modelManager.removeListener(modelListener);
        refreshButton.removeActionListener(refreshAction);
        refreshButton1.removeActionListener(refreshAction1);
        refreshButton2.removeActionListener(refreshAction2);
        refreshButton3.removeActionListener(refreshAction3);
        refreshButton4.removeActionListener(refreshAction4);
    }
    
    @SuppressWarnings("unchecked")
	private void recalculate() {
    	try {
        int count = modelManager.getActiveOntology().getClassesInSignature().size();
        int count2= modelManager.getActiveOntology().getLogicalAxiomCount();
    	Set<String>xt34=new HashSet<String>();
    	List<String>ls2=new ArrayList<String>();

    	String s1[]=new String[500];

    	List<String>iri=new ArrayList<>();
    	List<String>classname=new ArrayList<>();
    	List<String> map3 = new ArrayList<String>();
    	
    	
        Set<OWLClass> xt= modelManager.getActiveOntology().getClassesInSignature();
        for(OWLClass c:xt) {
        	String xt1=c.toString();
        	System.out.println(xt1);
        	xt34.add(xt1);
        	
        }
        if (count == 0) {
            count = 1;  
        }
        if(count2==0) {
        	count2=1;
        }
        for(String s:xt34) {
        	s1=s.split("#",2);
        	iri.add(s1[0]);
        	classname.add(s1[1]);
        	
        	
        }
       
        for(String s2:classname) {
        	
        		List<String> map = new ArrayList<String>();
        		List<String> map1 = new ArrayList<String>();
        		List<String> map2 = new ArrayList<String>();
        		JsonReader j=new JsonReader();
        		retrieval r=new retrieval();
        	
        	

        	naming_conventions n=new naming_conventions();
        	
      
        	
        	System.out.print("Altername combinations of name for class "+s2);
        	textArea.append("CamelCase for class "+s2+"->"+n.convertToCamelCase(s2)+"\n");
        	textArea.append("Without Alphabet "+s2+"->"+n.isStringOnlyAlphabet(s2)+"\n");

        	scrollPane.add(textArea);
        	

        	

        	textComponent.setText(s2);
   
        
        	
       
        }
    	}catch(Exception e) {
        	e.printStackTrace();
        }

        
    }
    @SuppressWarnings("unchecked")
  private void   recalculate1() {
	  List<String>ls2=new ArrayList<String>();
	  jpanel j=new jpanel();
	  
	  textComponent1.setText("Please press the refresh button to see recommendations");
      	
	  j.result();
  }
   @SuppressWarnings("unchecked")
  private void   recalculate2() {
	  try {
	  	JsonReader j=new JsonReader();
	    int count = modelManager.getActiveOntology().getClassesInSignature().size();
        int count2= modelManager.getActiveOntology().getLogicalAxiomCount();
    	Set<String>xt34=new HashSet<String>();
    	List<String>ls2=new ArrayList<String>();

    	String s1[]=new String[500];

    	List<String>iri=new ArrayList<>();
    	List<String>classname=new ArrayList<>();
    	List<String> map3 = new ArrayList<String>();
    	
    	
        Set<OWLClass> xt= modelManager.getActiveOntology().getClassesInSignature();
        for(OWLClass c:xt) {
        	String xt1=c.toString();
        	System.out.println(xt1);
        	xt34.add(xt1);

        }
        if (count == 0) {
            count = 1;  
        }
        if(count2==0) {
        	count2=1;
        }
        for(String s:xt34) {
        	s1=s.split("#",2);
        	iri.add(s1[0]);
        	classname.add(s1[1]);
        	
        	
        }
       
       for(String s2:classname) {
	  textArea2.append("Vocabularies for class "+s2+"->"+j.vocab(s2)+"\n");
  	  textArea2.append("Alternate names for class "+s2+"->"+j.suggestnames(s2)+"\n");
	  
  }
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
  }
   @SuppressWarnings("unchecked")
  private void   recalculate3() {
	  
	  try {
	    	Axiomrecommendationfilechooser a= new Axiomrecommendationfilechooser();
	    	a.result();
	  }catch (Exception e) {
		  e.printStackTrace();
	  }
  }
   @SuppressWarnings("unchecked")
  private void   recalculate4() {
	  
	  try {

		  ChatBot c=new ChatBot();
	  
	  }catch (Exception e) {
		  e.printStackTrace();
	  }
  }
  
    
 
    	
    	
    	
    	
    }

