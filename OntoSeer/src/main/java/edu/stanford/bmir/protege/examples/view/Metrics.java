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
   // private JButton refreshButton3 = new JButton("Axioms");

    private JLabel textComponent = new JLabel();
    private JLabel textComponent1 = new JLabel();
    private JLabel textComponent2 = new JLabel();
//   private JTextArea jt = new JTextArea(20, 20); 
    public JTextPane textPane = new JTextPane();
    public JTextArea textArea = new JTextArea(20,20);
    public JTextArea textArea1 = new JTextArea(20,20);
    public JTextArea textArea2 = new JTextArea(20,20);
    JScrollPane scrollPane = new JScrollPane(); 
   

    private OWLModelManager modelManager;
  //  private JTextArea jt=new JTextArea(50,50);

    private ActionListener refreshAction = e -> recalculate();
    private ActionListener refreshAction1 = e -> recalculate1();
    private ActionListener refreshAction2 = e -> recalculate2();
  //  private ActionListener refreshAction3 = e -> recalculate3();
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
  //      refreshButton3.addActionListener(refreshAction3);
        
        add(textComponent);
        add(textComponent1);
        add(textComponent2);
        //add(jt);
        add(refreshButton);
        add(refreshButton1);
        add(refreshButton2);
      //  add(refreshButton3);
        add(textArea);
        add(textArea1);
        add(textArea2);
        //add(textArea3);
       // add(scrollPane);
        Font font = new Font("Serif",Font.PLAIN, 14);
      //  scrollPane.add(textArea);
        textArea.setEditable(false);
        textArea.setFont(font);
        textArea.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        textArea1.setEditable(false);
        textArea1.setFont(font);
        textArea1.setLineWrap(true);
        textArea2.setWrapStyleWord(true);
        textArea2.setEditable(false);
        textArea2.setFont(font);
        textArea2.setLineWrap(true);
        textArea2.setWrapStyleWord(true);
       // add(jt);
        Font font1 = new Font("Serif",Font.PLAIN, 14);
      //  scrollPane1.add(jt);
       
    }
    
    public void dispose() {
        modelManager.removeListener(modelListener);
        refreshButton.removeActionListener(refreshAction);
        refreshButton1.removeActionListener(refreshAction1);
        refreshButton2.removeActionListener(refreshAction2);
    }
    
    @SuppressWarnings("unchecked")
	private void recalculate() {
    	try {
        int count = modelManager.getActiveOntology().getClassesInSignature().size();
        int count2= modelManager.getActiveOntology().getLogicalAxiomCount();
    	Set<String>xt34=new HashSet<String>();
    	List<String>ls2=new ArrayList<String>();
    //	List<String> ls=new ArrayList<>();
    //	List<String> ls1=new ArrayList<>();
    	String s1[]=new String[500];
    	//String s4[]=new String[500];
    	
    	//String s5[]=new String[500];
    	List<String>iri=new ArrayList<>();
    	List<String>classname=new ArrayList<>();
    	List<String> map3 = new ArrayList<String>();
    	
    	
        Set<OWLClass> xt= modelManager.getActiveOntology().getClassesInSignature();
        for(OWLClass c:xt) {
        	String xt1=c.toString();
        	System.out.println(xt1);
        	xt34.add(xt1);
        	//textComponent.setText(xt1);
        }
        if (count == 0) {
            count = 1;  // owl:Thing is always there.
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
        	/*retrieval r=new retrieval();
        	Set<String> hash_Set = new HashSet<String>();
        	hash_Set.addAll(r.re(s2));*/
        	retrieval r=new retrieval();
        	
        	
        	//urlconnection u=new urlconnection();
        	naming_conventions n=new naming_conventions();
        	
      
        	
        	System.out.print("Altername combinations of name for class "+s2);
        	
        //	map3.add(n.convertToCamelCase(s2));
        	textArea.append("CamelCase for class "+s2+"->"+n.convertToCamelCase(s2)+"\n");
        	textArea.append("Without Alphabet "+s2+"->"+n.isStringOnlyAlphabet(s2)+"\n");
        //	textArea.append("Vocabularies for class "+s2+"->"+j.vocab(s2)+"\n");
        	//textArea.append("Alternate names for class "+s2+"->"+j.suggestnames(s2)+"\n");
        	scrollPane.add(textArea);
        	

        	
        //	System.out.print(s2);
        	textComponent.setText(s2);
        	//textComponent1.setText(hash_Set.toString());
        //	jt.getText(textComponent.setText(s2););
        
        	
       
        }
    	}catch(Exception e) {
        	e.printStackTrace();
        }
        /*
        textComponent.setText("Please press the refresh button to see recommendations");
        odpdescription d=new odpdescription();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter description for ontology");
		String st=sc.nextLine();
		odpdescription p=new odpdescription();
		ls2.addAll(p.findsimilarity(st));
		textArea.append("ODP for classes "+ls2);*/
       // textComponent.setText("Recommendation"+ls);
       // textComponent.setText("Suggestion"+ls1);
       // textArea.setText("Alternamte names:"+map2.toString()+"\n");
     //   textArea.setText("Naming Conventions: "+map3.toString());
        
    }
    @SuppressWarnings("unchecked")
  private void   recalculate1() {
	  List<String>ls2=new ArrayList<String>();
	  textComponent1.setText("Please press the refresh button to see recommendations");
      	odpdescription d=new odpdescription();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter description for ontology");
		String st=sc.nextLine();
		odpdescription p=new odpdescription();
		ls2.addAll(p.findsimilarity(st));
		textArea1.append("ODP for classes "+ls2);
  }
   @SuppressWarnings("unchecked")
  private void   recalculate2() {
	  try {
	  	JsonReader j=new JsonReader();
	    int count = modelManager.getActiveOntology().getClassesInSignature().size();
        int count2= modelManager.getActiveOntology().getLogicalAxiomCount();
    	Set<String>xt34=new HashSet<String>();
    	List<String>ls2=new ArrayList<String>();
    //	List<String> ls=new ArrayList<>();
    //	List<String> ls1=new ArrayList<>();
    	String s1[]=new String[500];
    	//String s4[]=new String[500];
    	
    	//String s5[]=new String[500];
    	List<String>iri=new ArrayList<>();
    	List<String>classname=new ArrayList<>();
    	List<String> map3 = new ArrayList<String>();
    	
    	
        Set<OWLClass> xt= modelManager.getActiveOntology().getClassesInSignature();
        for(OWLClass c:xt) {
        	String xt1=c.toString();
        	System.out.println(xt1);
        	xt34.add(xt1);
        	//textComponent.setText(xt1);
        }
        if (count == 0) {
            count = 1;  // owl:Thing is always there.
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
		  
	  }catch (Exception e) {
		  e.printStackTrace();
	  }
  }
  
    
 
    	
    	
    	
    	
    }

