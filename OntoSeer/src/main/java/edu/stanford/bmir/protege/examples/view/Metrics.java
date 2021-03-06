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
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;

public class Metrics extends JPanel implements ItemListener {
	

    private JButton refreshButton = new JButton("Axiom Recommendation");
    private JButton refreshButton1 = new JButton("ODP Recommendation");
    private JButton refreshButton2 = new JButton("Class Naming  Recommendation");
    private JButton refreshButton3 = new JButton("Vocabulary Recommendation");
    private JButton refreshButton4 = new JButton("Class Hierarchy Validation");
    private JButton refreshButton5 = new JButton("Property Naming Recommendation");

    private JLabel textComponent = new JLabel();
    private JLabel textComponent1 = new JLabel();
    private JLabel textComponent2 = new JLabel();

    public JTextPane textPane = new JTextPane();
    public JTextArea textArea = new JTextArea(20,20);
    public JTextArea textArea1 = new JTextArea(1,100);
    public JTextArea textArea2 = new JTextArea(20,20);
    JScrollPane scrollPane = new JScrollPane(); 
   
    static JFrame f; 
    
    // label 
    static JLabel l, l2,l1, l3, l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20; 
  
    // combobox 
    static JComboBox c1, c2; 
    private OWLModelManager modelManager;

    private int xts,yts,zts;
   // private ActionListener refreshAction = e -> recalculate();
    private ActionListener refreshAction1 = e -> recalculate1();
    private ActionListener refreshAction2 = e -> recalculate2();
    private ActionListener refreshAction3 = e -> recalculate3();
    private ActionListener refreshAction4 = e -> recalculate4();
    private ActionListener refreshAction5 = e -> recalculate5();
    private ActionListener refreshAction6 = e -> recalculate6();
    private OWLModelManagerListener modelListener = event -> {
        if (event.getType() == EventType.ACTIVE_ONTOLOGY_CHANGED) {
           Metrics m=new Metrics(modelManager);
        }
    };
    
    public Metrics(OWLModelManager modelManager) {
    	
    	this.modelManager = modelManager;
       // recalculate();
        
        modelManager.addListener(modelListener);
        
       refreshButton.addActionListener(refreshAction4);
       // refreshButton1.addActionListener(refreshAction);
        //refreshButton2.addActionListener(refreshAction);
       refreshButton3.addActionListener(refreshAction1);
       refreshButton2.addActionListener(refreshAction2);
       refreshButton1.addActionListener(refreshAction3);
       refreshButton4.addActionListener(refreshAction5);
        refreshButton5.addActionListener(refreshAction6);
 
        
       // add(textArea1);
        add(refreshButton1);
       add(refreshButton);
        add(refreshButton2);
        add(refreshButton3);
        add(refreshButton4);
        add(refreshButton5);
       
        //textArea1.setEditable(true);
     //   add(refreshButton1);
      //  add(refreshButton2);
      //  add(refreshButton3);
        

        textArea1.append("Please make at least 2 classes and 2 properties to get recommendations through OntoSeer.");
        textArea1.setFont(textArea1.getFont().deriveFont(Font.BOLD, textArea1.getFont().getSize()));
        Font font = new Font("Serif",Font.PLAIN, 14);


        Font font1 = new Font("Serif",Font.PLAIN, 14);
        
    }
        
        
  

       
    
    
    
    
    public void dispose() {
        modelManager.removeListener(modelListener);
        refreshButton1.removeActionListener(refreshAction3);
        refreshButton3.removeActionListener(refreshAction1);
        
        refreshButton2.removeActionListener(refreshAction2);
        refreshButton.removeActionListener(refreshAction4);
        refreshButton4.removeActionListener(refreshAction5);
        refreshButton5.removeActionListener(refreshAction6);
        /*
         * 
        refreshButton2.removeActionListener(refreshAction2);
        refreshButton3.removeActionListener(refreshAction3);
        refreshButton4.removeActionListener(refreshAction4);
        */
    }
    
    @SuppressWarnings({ "unchecked", "unlikely-arg-type" })
	private void recalculate1() {
    	try {
    	
        int count = modelManager.getActiveOntology().getClassesInSignature().size();
        int properties1=modelManager.getActiveOntology().getDataPropertiesInSignature().size();
        int properties2=modelManager.getActiveOntology().getObjectPropertiesInSignature().size();
        int count2= modelManager.getActiveOntology().getLogicalAxiomCount();
        System.out.println(properties1);
        System.out.println(properties2);
        
        
    	Set<String>xt34=new HashSet<String>();
    	Set<String>yt34=new HashSet<String>();
    	Set<String>zt34=new HashSet<String>();
    	List<String>ls2=new ArrayList<String>();

    	String s1[]=new String[500];
    	String s2[]=new String[500];
    	String s3[]=new String[500];
    	String s4[]=new String[500];
    	String s5[]=new String[500];

    	List<String>iri=new ArrayList<>();
    	List<String>classname=new ArrayList<>();
    	List<String>data=new ArrayList<>();
    	List<String>object=new ArrayList<>();
    	List<String>finals=new ArrayList<>();
    	
    	List<String> map3 = new ArrayList<String>();
    	
    	
        Set<OWLClass> xt= modelManager.getActiveOntology().getClassesInSignature();
        Set<OWLDataProperty>yt=modelManager.getActiveOntology().getDataPropertiesInSignature();
        
        
        	System.out.println(yt);
        	yt.remove("owl:topObjectProperty");
        	
        
        Set<OWLObjectProperty>zt=modelManager.getActiveOntology().getObjectPropertiesInSignature();
        System.out.println(zt);
       // Vocabsuggesstionpanel v=new Vocabsuggesstionpanel();
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
        	s1[1]=s1[1].substring(0,s1[1].length()-1);
        	iri.add(s1[0]);
        	classname.add(s1[1]);
        	
        	
        }
        
        for(OWLDataProperty c1:yt) {
        	String xt1=c1.toString();
        	System.out.println(xt1);
        	yt34.add(xt1);
        	
        }
        if (count == 0) {
            count = 1;  
        }
        if(count2==0) {
        	count2=1;
        }
        for(String s:yt34) {
        	if(s.equalsIgnoreCase("owl:topDataProperty")) {
        		//yt34.remove(s);
        	}
        	else {
        	s2=s.split("#");
        	
        	
        	s2[1]=s2[1].substring(0,s2[1].length()-1);
        	iri.add(s2[0]);
        	data.add(s2[1]);
        	
        	
        
        	}
    
        }
       
        for(OWLObjectProperty c1:zt) {
        	String xt1=c1.toString();
        	System.out.println(xt1);
        	zt34.add(xt1);
        	
        }
        if (count == 0) {
            count = 1;  
        }
        if(count2==0) {
        	count2=1;
        }
        for(String s:zt34) {
        	if(s.equalsIgnoreCase("owl:topObjectProperty")) {
        		//zt34.remove(s);
        	
        	}
        	else {
        	s3=s.split("#");
        	
        	s3[1]=s3[1].substring(0,s3[1].length()-1);
        	iri.add(s3[0]);
        	object.add(s3[1]);
        	
        	
        	
        }
        }
        finals.add("--select--");
        finals.addAll(classname);
        finals.addAll(data);
        finals.addAll(object);

        
       detect (finals);
    
        
       
        
    
    	}catch(Exception e) {
        	e.printStackTrace();
        }

        
    }
    
    @SuppressWarnings("unchecked")
  	private void recalculate2() {
    	
    	try {
        	
     
            
            Metrics1 m=new Metrics1(modelManager);
            int count = modelManager.getActiveOntology().getClassesInSignature().size();
            int properties1=modelManager.getActiveOntology().getDataPropertiesInSignature().size();
            int properties2=modelManager.getActiveOntology().getObjectPropertiesInSignature().size();
            int count2= modelManager.getActiveOntology().getLogicalAxiomCount();
            System.out.println(properties1);
            System.out.println(properties2);
            
            
        	Set<String>xt34=new HashSet<String>();
        	Set<String>yt34=new HashSet<String>();
        	Set<String>zt34=new HashSet<String>();
        	List<String>ls2=new ArrayList<String>();

        	String s1[]=new String[500];
        	String s2[]=new String[500];
        	String s3[]=new String[500];
        	String s4[]=new String[500];
        	String s5[]=new String[500];

        	List<String>iri=new ArrayList<>();
        	List<String>classname=new ArrayList<>();
        	List<String>data=new ArrayList<>();
        	List<String>object=new ArrayList<>();
        	List<String>finals=new ArrayList<>();
        	
        	List<String> map3 = new ArrayList<String>();
        	
        	
            Set<OWLClass> xt= modelManager.getActiveOntology().getClassesInSignature();
            Set<OWLDataProperty>yt=modelManager.getActiveOntology().getDataPropertiesInSignature();
            
            
            	System.out.println(yt);
            	yt.remove("owl:topObjectProperty");
            	
            
            Set<OWLObjectProperty>zt=modelManager.getActiveOntology().getObjectPropertiesInSignature();
            System.out.println(zt);
           // Vocabsuggesstionpanel v=new Vocabsuggesstionpanel();
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
            	s1[1]=s1[1].substring(0,s1[1].length()-1);
            	iri.add(s1[0]);
            	classname.add(s1[1]);
            	
            	
            }
            
            for(OWLDataProperty c1:yt) {
            	String xt1=c1.toString();
            	System.out.println(xt1);
            	yt34.add(xt1);
            	
            }
            if (count == 0) {
                count = 1;  
            }
            if(count2==0) {
            	count2=1;
            }
            for(String s:yt34) {
            	if(s.equalsIgnoreCase("owl:topDataProperty")) {
            		//yt34.remove(s);
            	}
            	else {
            	s2=s.split("#");
            	
            	
            	s2[1]=s2[1].substring(0,s2[1].length()-1);
            	iri.add(s2[0]);
            	data.add(s2[1]);
            	
            	
            
            	}
        
            }
           
            for(OWLObjectProperty c1:zt) {
            	String xt1=c1.toString();
            	System.out.println(xt1);
            	zt34.add(xt1);
            	
            }
            if (count == 0) {
                count = 1;  
            }
            if(count2==0) {
            	count2=1;
            }
            for(String s:zt34) {
            	if(s.equalsIgnoreCase("owl:topObjectProperty")) {
            		//zt34.remove(s);
            	
            	}
            	else {
            	s3=s.split("#");
            	
            	s3[1]=s3[1].substring(0,s3[1].length()-1);
            	iri.add(s3[0]);
            	object.add(s3[1]);
            	
            	
            	
            }
            }
            //finals.add("Select");
            finals.add("--select--");
            finals.addAll(classname);
           // finals.addAll(data);
            //finals.addAll(object);

            
           
            

            
            m.detect(finals);
    
    }
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public  void main(String args[]) {
    	Metrics m=new Metrics(modelManager);
    }
    public void detect(List<String>s_run) {
    	try {
        f = new JFrame("Vocabulary Recommendation"); 
        
        // create a object 
       Metrics  s = new  Metrics(modelManager);
  
        // array of string contating cities 
        String s1[] = new String[s_run.size()];
        s_run.toArray(s1);
       // String s2[] = { "male", "female", "others" }; 
  
        // create checkbox 
        c1 = new JComboBox(s1); 
       // c2 = new JComboBox(s2); 
  
        // set Kolakata and male as selected items 
        // using setSelectedIndex 
        c1.setSelectedIndex(0); 
      //  c2.setSelectedIndex(0); 
  
        // add ItemListener 
        c1.addItemListener(s); 
   //     c2.addItemListener(s); 
  
        // set the checkbox as editable 
        c1.setEditable(true); 
  
        // create labels 
        l = new JLabel("Select Class or property"); 
       // l1 = new JLabel(c1.getSelectedItem().toString()+" class selected"); 
        List<String>ls=new ArrayList<String>();
       //S JsonReader j=new JsonReader();
        //ls.addAll(j.vocab(c1.getSelectedItem().toString()));
        textArea = new JTextArea(20,20);
        l2=new JLabel(" Please select or make a class or a property          ");
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
        
        //textArea.setText(ls.toString());
        
        JScrollPane scroll = new JScrollPane(
                
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS
        );
  
        // set color of text 
        l.setForeground(Color.BLACK); 
       // l1.setForeground(Color.BLACK); 
        l2.setForeground(Color.BLACK);

        l3.setForeground(Color.BLACK); 
        l4.setForeground(Color.BLACK); 
        l5.setForeground(Color.BLACK); 
        // create a new panel 
        JPanel p = new JPanel(); 
        p.add(l10);

        
       
        p.add(l8);
        p.add(l9);
        p.add(l7);
        p.add(l18);
        p.add(l19);
        p.add(l16);
        
        p.add(l17);
    
        p.add(l20);
        p.add(l); 
        
        
       // p.add(l3);
        //p.add(l4);
        // add combobox to panel 
        p.add(c1); 
       
        p.add(l6);
       
        p.add(l2);
       
   
        p.add(l7);
       
        p.add(l13);
        p.add(l8);
        p.add(l9);
        p.add(l14);
        p.add(l15);
        p.add(l16);
    
        p.add(l17);
        p.add(l18);
        p.add(l19);
        p.add(l20);
        
        
        p.add(l4);
        p.add(l5);
  
      //  p.add(l1); 

        l2.setFont(new Font("Serif", Font.PLAIN, 16));
        l.setFont(new Font("Serif", Font.PLAIN, 16));
        // set a layout for panel 
        p.setLayout(new FlowLayout()); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(700, 700); 
  
        f.show();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    public void itemStateChanged(ItemEvent e) 
    { 
    	try {
    	vocabelements v=new vocabelements();
        // if the state combobox 1is changed 
        if (e.getSource() == c1) { 
  
           // l1.setText(c1.getSelectedItem().toString() + " selected"); 
            String value= c1.getSelectedItem().toString();
            
            List<String>ls=new ArrayList<String>();
            List<String>ls1=new ArrayList<String>();
            List<String>ls2=new ArrayList<String>();
           // String value= c1.getSelectedItem().toString();
            if(value.equalsIgnoreCase("--select--")) {
            	l2.setText("Please select a class or property");
            }
            else {
            ls.addAll(v.findsimilarity(value));
            ls1.addAll(v.URI(value));
            ls2.addAll(v.description(value));
         //   JsonReader j=new JsonReader();
          //  ls.addAll(j.vocab(c1.getSelectedItem().toString()));
            if(ls.size()==0) {
            	l2.setText("No Recommendation Found");
            	 l3.setText("");
                 l4.setText("");	
            	
            }
            if(ls.size()==1) {
            	 l2.setText("1. "+ls.get(0)+"   "+ls2.get(0)+"    "+ls1.get(0));
                 l3.setText("");
                 	
            }
            else {
            	String labelText ="<html>1. "+ls.get(0)+"<br>"+ls1.get(0)+"<br>"+"<br>2. "+ls.get(1)+"<br>"+ls1.get(1)+"</html>";
                l2.setText(labelText);
                l3.setText(" ");
                
            	
            }
          
 
            	
            System.out.println(value);
           // s(value);

        } 
        }
  
        // if state of combobox 2 is changed 

            //l4.setText(c2.getSelectedItem() + " selected"); 
    }
    catch(Exception E) {
    	E.printStackTrace();
    }
    }	
    

    @SuppressWarnings("unchecked")
  	private void recalculate3() {
    	try {
        	
            int count = modelManager.getActiveOntology().getClassesInSignature().size();
            int properties1=modelManager.getActiveOntology().getDataPropertiesInSignature().size();
            int properties2=modelManager.getActiveOntology().getObjectPropertiesInSignature().size();
            int count2= modelManager.getActiveOntology().getLogicalAxiomCount();
            System.out.println(properties1);
            System.out.println(properties2);
            
            
        	Set<String>xt34=new HashSet<String>();
        	Set<String>yt34=new HashSet<String>();
        	Set<String>zt34=new HashSet<String>();
        	List<String>ls2=new ArrayList<String>();

        	String s1[]=new String[500];
        	String s2[]=new String[500];
        	String s3[]=new String[500];
        	String s4[]=new String[500];
        	String s5[]=new String[500];

        	List<String>iri=new ArrayList<>();
        	List<String>classname=new ArrayList<>();
        	List<String>data=new ArrayList<>();
        	List<String>object=new ArrayList<>();
        	List<String>finals=new ArrayList<>();
        	
        	List<String> map3 = new ArrayList<String>();
        	
        	
            Set<OWLClass> xt= modelManager.getActiveOntology().getClassesInSignature();
            Set<OWLDataProperty>yt=modelManager.getActiveOntology().getDataPropertiesInSignature();
            
            
            	System.out.println(yt);
            	yt.remove("owl:topObjectProperty");
            	
            
            Set<OWLObjectProperty>zt=modelManager.getActiveOntology().getObjectPropertiesInSignature();
            System.out.println(zt);
           // Vocabsuggesstionpanel v=new Vocabsuggesstionpanel();
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
            	s1[1]=s1[1].substring(0,s1[1].length()-1);
            	iri.add(s1[0]);
            	classname.add(s1[1]);
            	
            	
            }
            
            for(OWLDataProperty c1:yt) {
            	String xt1=c1.toString();
            	System.out.println(xt1);
            	yt34.add(xt1);
            	
            }
            if (count == 0) {
                count = 1;  
            }
            if(count2==0) {
            	count2=1;
            }
            for(String s:yt34) {
            	if(s.equalsIgnoreCase("owl:topDataProperty")) {
            		//yt34.remove(s);
            	}
            	else {
            	s2=s.split("#");
            	
            	
            	s2[1]=s2[1].substring(0,s2[1].length()-1);
            	iri.add(s2[0]);
            	data.add(s2[1]);
            	
            	
            
            	}
        
            }
           
            for(OWLObjectProperty c1:zt) {
            	String xt1=c1.toString();
            	System.out.println(xt1);
            	zt34.add(xt1);
            	
            }
            if (count == 0) {
                count = 1;  
            }
            if(count2==0) {
            	count2=1;
            }
            for(String s:zt34) {
            	if(s.equalsIgnoreCase("owl:topObjectProperty")) {
            		//zt34.remove(s);
            	
            	}
            	else {
            	s3=s.split("#");
            	
            	s3[1]=s3[1].substring(0,s3[1].length()-1);
            	iri.add(s3[0]);
            	object.add(s3[1]);
            	
            	
            	
            }
            }

            finals.addAll(classname);
            finals.addAll(data);
            finals.addAll(object);
            String sts[]= new String[finals.size()];

            for(int i=0;i<finals.size();i++) {
            	sts[i]=finals.get(i);
            	
            }

            
            jpanel j=new jpanel(sts);
    		j.result();
            
           
    
    }
    	catch(Exception e) {
    		e.printStackTrace();
    	}
		
    	
    }
    
    @SuppressWarnings("unchecked")
  	private void recalculate4() {
    	
    	try {

            
            Metrics2 m=new Metrics2(modelManager);
        
            
            int count = modelManager.getActiveOntology().getClassesInSignature().size();
            int properties1=modelManager.getActiveOntology().getDataPropertiesInSignature().size();
            int properties2=modelManager.getActiveOntology().getObjectPropertiesInSignature().size();
            int count2= modelManager.getActiveOntology().getLogicalAxiomCount();
            System.out.println(properties1);
            System.out.println(properties2);
            
            
        	Set<String>xt34=new HashSet<String>();
        	Set<String>yt34=new HashSet<String>();
        	Set<String>zt34=new HashSet<String>();
        	List<String>ls2=new ArrayList<String>();

        	String s1[]=new String[500];
        	String s2[]=new String[500];
        	String s3[]=new String[500];
        	String s4[]=new String[500];
        	String s5[]=new String[500];

        	List<String>iri=new ArrayList<>();
        	List<String>classname=new ArrayList<>();
        	List<String>data=new ArrayList<>();
        	List<String>object=new ArrayList<>();
        	List<String>finals=new ArrayList<>();
        	
        	List<String> map3 = new ArrayList<String>();
        	
        	
            Set<OWLClass> xt= modelManager.getActiveOntology().getClassesInSignature();
            Set<OWLDataProperty>yt=modelManager.getActiveOntology().getDataPropertiesInSignature();
            
            
            	System.out.println(yt);
            	yt.remove("owl:topObjectProperty");
            	
            
            Set<OWLObjectProperty>zt=modelManager.getActiveOntology().getObjectPropertiesInSignature();
            System.out.println(zt);
           // Vocabsuggesstionpanel v=new Vocabsuggesstionpanel();
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
            	s1[1]=s1[1].substring(0,s1[1].length()-1);
            	iri.add(s1[0]);
            	classname.add(s1[1]);
            	
            	
            }
            
            for(OWLDataProperty c1:yt) {
            	String xt1=c1.toString();
            	System.out.println(xt1);
            	yt34.add(xt1);
            	
            }
            if (count == 0) {
                count = 1;  
            }
            if(count2==0) {
            	count2=1;
            }
            for(String s:yt34) {
            	if(s.equalsIgnoreCase("owl:topDataProperty")) {
            		//yt34.remove(s);
            	}
            	else {
            	s2=s.split("#");
            	
            	
            	s2[1]=s2[1].substring(0,s2[1].length()-1);
            	iri.add(s2[0]);
            	data.add(s2[1]);
            	
            	
            
            	}
        
            }
           
            for(OWLObjectProperty c1:zt) {
            	String xt1=c1.toString();
            	System.out.println(xt1);
            	zt34.add(xt1);
            	
            }
            if (count == 0) {
                count = 1;  
            }
            if(count2==0) {
            	count2=1;
            }
            for(String s:zt34) {
            	if(s.equalsIgnoreCase("owl:topObjectProperty")) {
            		//zt34.remove(s);
            	
            	}
            	else {
            	s3=s.split("#");
            	
            	s3[1]=s3[1].substring(0,s3[1].length()-1);
            	iri.add(s3[0]);
            	object.add(s3[1]);
            	
            	
            	
            }
            }
          //  finals.add("Select");
            finals.add("--select--");
            finals.addAll(classname);
            finals.addAll(data);
            finals.addAll(object);

            

            
            m.detect(finals);
    
    }
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    
    @SuppressWarnings("unchecked")
  	private void recalculate5() {
    	
    	try {
    		chatbotpanel j=new chatbotpanel();
    		j.result();
    	}
    	
    	catch(Exception e) {
    		
    	}
    	}
    
    @SuppressWarnings("unchecked")
  	private void recalculate6() {
    	
    	try {
        	
     
            
            Metrics3 m=new Metrics3(modelManager);
            int count = modelManager.getActiveOntology().getClassesInSignature().size();
            int properties1=modelManager.getActiveOntology().getDataPropertiesInSignature().size();
            int properties2=modelManager.getActiveOntology().getObjectPropertiesInSignature().size();
            int count2= modelManager.getActiveOntology().getLogicalAxiomCount();
            System.out.println(properties1);
            System.out.println(properties2);
            
            
        	Set<String>xt34=new HashSet<String>();
        	Set<String>yt34=new HashSet<String>();
        	Set<String>zt34=new HashSet<String>();
        	List<String>ls2=new ArrayList<String>();

        	String s1[]=new String[500];
        	String s2[]=new String[500];
        	String s3[]=new String[500];
        	String s4[]=new String[500];
        	String s5[]=new String[500];

        	List<String>iri=new ArrayList<>();
        	List<String>classname=new ArrayList<>();
        	List<String>data=new ArrayList<>();
        	List<String>object=new ArrayList<>();
        	List<String>finals=new ArrayList<>();
        	
        	List<String> map3 = new ArrayList<String>();
        	
        	
            Set<OWLClass> xt= modelManager.getActiveOntology().getClassesInSignature();
            Set<OWLDataProperty>yt=modelManager.getActiveOntology().getDataPropertiesInSignature();
            
            
            	System.out.println(yt);
            	yt.remove("owl:topObjectProperty");
            	
            
            Set<OWLObjectProperty>zt=modelManager.getActiveOntology().getObjectPropertiesInSignature();
            System.out.println(zt);
           // Vocabsuggesstionpanel v=new Vocabsuggesstionpanel();
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
            	s1[1]=s1[1].substring(0,s1[1].length()-1);
            	iri.add(s1[0]);
            	classname.add(s1[1]);
            	
            	
            }
            
            for(OWLDataProperty c1:yt) {
            	String xt1=c1.toString();
            	System.out.println(xt1);
            	yt34.add(xt1);
            	
            }
            if (count == 0) {
                count = 1;  
            }
            if(count2==0) {
            	count2=1;
            }
            for(String s:yt34) {
            	if(s.equalsIgnoreCase("owl:topDataProperty")) {
            		//yt34.remove(s);
            	}
            	else {
            	s2=s.split("#");
            	
            	
            	s2[1]=s2[1].substring(0,s2[1].length()-1);
            	iri.add(s2[0]);
            	data.add(s2[1]);
            	
            	
            
            	}
        
            }
           
            for(OWLObjectProperty c1:zt) {
            	String xt1=c1.toString();
            	System.out.println(xt1);
            	zt34.add(xt1);
            	
            }
            if (count == 0) {
                count = 1;  
            }
            if(count2==0) {
            	count2=1;
            }
            for(String s:zt34) {
            	if(s.equalsIgnoreCase("owl:topObjectProperty")) {
            		//zt34.remove(s);
            	
            	}
            	else {
            	s3=s.split("#");
            	
            	s3[1]=s3[1].substring(0,s3[1].length()-1);
            	iri.add(s3[0]);
            	object.add(s3[1]);
            	
            	
            	
            }
            }

           // finals.addAll(classname);
           // finals.add("Select");
            finals.add("--select--");
            finals.addAll(data);
            finals.addAll(object);

            
           
            

            
            m.detect(finals);
    
    }
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
        	

}   



  
    
 
    	
    	
    	
    	
    

