package edu.stanford.bmir.protege.examples.view;

import javax.swing.*;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.OutputStream; 

import javax.swing.text.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;


import java.awt.event.*; 

import java.util.*;


import org.protege.editor.owl.model.OWLModelManager;
import org.protege.editor.owl.model.event.EventType;
import org.protege.editor.owl.model.event.OWLModelManagerListener;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLIndividual;

public class Metrics1 extends JPanel implements ItemListener {
	

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
    public JTextArea textArea1 = new JTextArea(50,50);
    public JTextArea textArea2 = new JTextArea(20,20);
    JScrollPane scrollPane = new JScrollPane(); 
   
    static JFrame f; 
    
    // label 
    static JLabel l, l2,l1, l3, l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20; 
  
    // combobox 
    static JComboBox c1, c2; 
    private OWLModelManager modelManager;


   // private ActionListener refreshAction = e -> recalculate();
   


    private OWLModelManagerListener modelListener = event -> {
        if (event.getType() == EventType.ACTIVE_ONTOLOGY_CHANGED) {
           Metrics m=new Metrics(modelManager);
        }
    };
    
    public Metrics1(OWLModelManager modelManager) {
    	
    	this.modelManager = modelManager;
       // recalculate();
        
        modelManager.addListener(modelListener);
        
      //  refreshButton.addActionListener(refreshAction);
       // refreshButton1.addActionListener(refreshAction);
        //refreshButton2.addActionListener(refreshAction);
       
      //  refreshButton3.addActionListener(refreshAction4);
 
        

        add(refreshButton1);
        add(refreshButton1);
        add(refreshButton2);
        add(refreshButton3);
       // add(textArea1);
        //textArea1.setEditable(true);
     //   add(refreshButton1);
      //  add(refreshButton2);
      //  add(refreshButton3);
        


        Font font = new Font("Serif",Font.PLAIN, 14);


        Font font1 = new Font("Serif",Font.PLAIN, 14);

       
    }
    
    public void dispose() {
        modelManager.removeListener(modelListener);
      
        
        //refreshButton2.removeActionListener(refreshAction);
        /*
        refreshButton2.removeActionListener(refreshAction2);
        refreshButton3.removeActionListener(refreshAction3);
        refreshButton4.removeActionListener(refreshAction4);
        */
    }


        
        	



        
    
    
    public  void main(String args[]) {
    	Metrics1 m=new Metrics1(modelManager);
    }
    public void detect(List<String>s_run) {
    	try {
        f = new JFrame("Class Naming Recommendation"); 
        
        // create a object 
       Metrics1  s = new  Metrics1(modelManager);
  
        // array of string contating cities 
        String s1[] = new String[s_run.size()];
        s_run.toArray(s1);
       
  
        // create checkbox 
        c1 = new JComboBox(s1); 
      //  c2 = new JComboBox(s2); 
  
        // set Kolakata and male as selected items 
        // using setSelectedIndex 
        c1.setSelectedIndex(0); 
      //  c2.setSelectedIndex(0); 
  
        // add ItemListener 
        c1.addItemListener(s); 
      //  c2.addItemListener(s); 
  
        // set the checkbox as editable 
        c1.setEditable(true); 
    //    c2.setEditable(true);
  
        // create labels 
        l = new JLabel("Select Class  "); 
        l1 = new JLabel(c1.getSelectedItem().toString()+" class selected"); 

        l2=new JLabel("    Please select or make a class       ");
        l3=new JLabel("            ");
        l4=new JLabel("             ");
        l5=new JLabel("            ");
        l6=new JLabel("                                                                                                                                                      ");
        l7=new JLabel("                                                                                                                                                ");
        l8=new JLabel("                                                                                                                                                ");
        l9=new JLabel("                                                                                                                                                ");
        l10=new JLabel("  ");
        l11=new JLabel("                                                                                                                                               ");
        l12=new JLabel("                                                                                                                                               ");
        l13=new JLabel("                                                                                                                                               ");
        l14=new JLabel("                                                                                                                                               ");
        l15=new JLabel("                                                                                                                                               ");
        l16=new JLabel("                                                                                                                                               ");
        l17=new JLabel("                                                                                                                                               ");
        l18=new JLabel("                                                                                                                                               ");
        l19=new JLabel("                                                                                                                                               ");
        l20=new JLabel("                                                                                                                                               ");
        


        JScrollPane scroll = new JScrollPane(
                
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS
        );
  
        // set color of text 
        l.setForeground(Color.BLACK); 
        l1.setForeground(Color.BLACK); 
        l2.setForeground(Color.BLACK);
 

  
        // create a new panel 
        JPanel p = new JPanel(); 
  

        
        
 
        p.add(l7);

        

        p.add(l); 
        
       

        p.add(c1); 
   

   

 
        p.add(l11);

  
        p.add(l2);
        l2.setFont(new Font("Serif", Font.PLAIN, 16));
        l.setFont(new Font("Serif", Font.PLAIN, 16));
      //  p.add(textArea);
  
      //  p.add(l1); 
        //p.add(scroll);

  
        // set a layout for panel 
        p.setLayout(new FlowLayout()); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(500, 500); 
  
        f.show();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    public void itemStateChanged(ItemEvent e) 
    { 
    	try {
    		
        // if the state combobox 1is changed 
        if (e.getSource() == c1) { 
  
            l1.setText(c1.getSelectedItem().toString() + " selected"); 
            String value= c1.getSelectedItem().toString();
		//checking for term selection
            if(value.equalsIgnoreCase("--select--")) {
            	l2.setText("Please select or make a class");
            }
            else {
            List<String>ls=new ArrayList<String>();
            
            naming_conventions s=new naming_conventions();
	    //recommendations
            ls.addAll(s.recom(c1.getSelectedItem().toString()));
            String labelText ="<html>1. "+ls.get(0);
            l2.setText(labelText);
        }
        }

  
        // if state of combobox 2 is changed 

            //l4.setText(c2.getSelectedItem() + " selected"); 
    }
    catch(Exception E) {
    	E.printStackTrace();
    }
    }
}
