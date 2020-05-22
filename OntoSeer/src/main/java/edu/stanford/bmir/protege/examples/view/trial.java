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

public class trial extends JPanel {
	

    private JButton refreshButton = new JButton("Naming");
    private JButton refreshButton1 = new JButton("ODP");
    private JButton refreshButton2 = new JButton("VocabSuggestion");
    private JButton refreshButton3 = new JButton("Axiom Recommendation");
    private JButton refreshButton4 = new JButton("Naming Convention");

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
 //   private ActionListener refreshAction1 = e -> recalculate1();
  //  private ActionListener refreshAction2 = e -> recalculate2();
   // private ActionListener refreshAction3 = e -> recalculate3();
   // private ActionListener refreshAction4 = e -> recalculate4();

    private OWLModelManagerListener modelListener = event -> {
        if (event.getType() == EventType.ACTIVE_ONTOLOGY_CHANGED) {
           Metrics m=new Metrics(modelManager);
        }
    };
    
    public trial(OWLModelManager modelManager) {
    	
    	this.modelManager = modelManager;
       // recalculate();
        
        modelManager.addListener(modelListener);
        
      //  refreshButton.addActionListener(refreshAction);
        refreshButton1.addActionListener(refreshAction);
        refreshButton2.addActionListener(refreshAction);
       // refreshButton3.addActionListener(refreshAction3);
      //  refreshButton3.addActionListener(refreshAction4);
 
        

 
        add(refreshButton1);
        add(refreshButton2);
     //   add(refreshButton1);
      //  add(refreshButton2);
      //  add(refreshButton3);
        


        Font font = new Font("Serif",Font.PLAIN, 14);


        Font font1 = new Font("Serif",Font.PLAIN, 14);

       
    }
    
    public void dispose() {
        modelManager.removeListener(modelListener);
        refreshButton1.removeActionListener(refreshAction);
        
        refreshButton2.removeActionListener(refreshAction);
        /*
        refreshButton2.removeActionListener(refreshAction2);
        refreshButton3.removeActionListener(refreshAction3);
        refreshButton4.removeActionListener(refreshAction4);
        */
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
        Vocabsuggesstionpanel v=new Vocabsuggesstionpanel();
        naming_panel p=new naming_panel();
        
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
       

        
        	

        //	naming_conventions n=new naming_conventions();

        	
      
        	
        	/*System.out.print("Altername combinations of name for class "+s2);
        	textArea.append("CamelCase for class "+s2+"->"+n.convertToCamelCase(s2)+"\n");
        	textArea.append("Without Alphabet "+s2+"->"+n.isStringOnlyAlphabet(s2)+"\n");

        	scrollPane.add(textArea);
        	

        	

        	textComponent.setText(s2);
   
        */
       // Interface i=new Interface();
        
       // i.result();
        scrolllisttrial s=new scrolllisttrial() ;
        s.detect(classname);
    
        
       
        
    
    	}catch(Exception e) {
        	e.printStackTrace();
        }

        
    }
    
    public  void main(String args[]) {
    	trial m=new trial(modelManager);
    	m.recalculate();
    }

}
  
    
 
    	
    	
    	
    	
    


