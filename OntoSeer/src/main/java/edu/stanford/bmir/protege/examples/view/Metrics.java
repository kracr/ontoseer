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

public class Metrics extends JPanel implements ItemListener {
	

    private JButton refreshButton = new JButton("Axiom");
    private JButton refreshButton1 = new JButton("ODP");
    private JButton refreshButton2 = new JButton("VocabSuggestion");
    private JButton refreshButton3 = new JButton("Naming Recommendation");
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
    private ActionListener refreshAction1 = e -> recalculate1();
    private ActionListener refreshAction2 = e -> recalculate2();
    private ActionListener refreshAction3 = e -> recalculate3();
    private ActionListener refreshAction4 = e -> recalculate4();

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
      //  refreshButton3.addActionListener(refreshAction4);
 
        

        add(refreshButton1);
       add(refreshButton);
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
        refreshButton1.removeActionListener(refreshAction3);
        refreshButton3.removeActionListener(refreshAction1);
        
        refreshButton2.removeActionListener(refreshAction2);
        refreshButton.removeActionListener(refreshAction4);
        /*
        refreshButton2.removeActionListener(refreshAction2);
        refreshButton3.removeActionListener(refreshAction3);
        refreshButton4.removeActionListener(refreshAction4);
        */
    }
    
    @SuppressWarnings("unchecked")
	private void recalculate1() {
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
        	s1[1]=s1[1].substring(0,s1[1].length()-1);
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
        
        detect(classname);
    
        
       
        
    
    	}catch(Exception e) {
        	e.printStackTrace();
        }

        
    }
    
    @SuppressWarnings("unchecked")
  	private void recalculate2() {
    	
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
            
            Metrics1 m=new Metrics1(modelManager);
        
            
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

            
            m.detect(classname);
    
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
        f = new JFrame("VocabSuggestion"); 
        
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
        JsonReader j=new JsonReader();
        ls.addAll(j.vocab(c1.getSelectedItem().toString()));
        textArea = new JTextArea(20,20);
        l2=new JLabel("Vocab_Output");
        l3=new JLabel("Vocab_Output");
        l4=new JLabel("Vocab_Output");
        l5=new JLabel("Vocab_Output");
        l6=new JLabel("         ");
        l7=new JLabel("         ");
        l8=new JLabel("         ");
        l9=new JLabel("         ");
        l10=new JLabel("         ");
        l11=new JLabel("         ");
        l12=new JLabel("         ");
        l13=new JLabel("         ");
        l14=new JLabel("         ");
        l15=new JLabel("         ");
        l16=new JLabel("         ");
        l17=new JLabel("         ");
        l18=new JLabel("         ");
        l19=new JLabel("         ");
        l20=new JLabel("         ");
        
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
  
        p.add(l); 
        
        
       // p.add(l3);
        //p.add(l4);
        // add combobox to panel 
        p.add(c1); 
        p.add(l6);
        p.add(l7);
        p.add(l8);
        p.add(l9);
        p.add(l10);
        p.add(l11);
        p.add(l12);
        p.add(l13);
        p.add(l14);
        p.add(l15);
        p.add(l16);
        p.add(l17);
        p.add(l18);
        p.add(l19);
        p.add(l20);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        p.add(l5);
  
      //  p.add(l1); 

  
        // set a layout for panel 
        p.setLayout(new FlowLayout()); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(400, 400); 
  
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
  
           // l1.setText(c1.getSelectedItem().toString() + " selected"); 
            String value= c1.getSelectedItem().toString();
            List<String>ls=new ArrayList<String>();
            JsonReader j=new JsonReader();
            ls.addAll(j.vocab(c1.getSelectedItem().toString()));
            
            //textArea = new JTextArea(20,20);
            l2.setText("Vocab: "+"http://purl.org/dc/terms/description@en");
            l3.setText("Desc: "+"A metadata vocabulary for describing comic books");
            l4.setText("Vocab: "+"http://purl.org/dc/terms/title@en");
            l5.setText("Title: "+"Comic Book Ontology");
       
            String f=l2.getText();
            
            textArea.append(f + "\n");
            	
            System.out.println(value);
           // detects(value);

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
		jpanel j=new jpanel();
		j.result();
    	
    }
    
    @SuppressWarnings("unchecked")
  	private void recalculate4() {
    	
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
            
            Metrics2 m=new Metrics2(modelManager);
        
            
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
            

            
            m.detect(classname);
    
    }
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }

}
  
    
 
    	
    	
    	
    	
    

