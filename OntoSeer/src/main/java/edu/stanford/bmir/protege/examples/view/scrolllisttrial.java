package edu.stanford.bmir.protege.examples.view;
import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;


import java.awt.event.*; 
import javax.swing.*; 
import java.util.*;
import org.protege.editor.owl.model.OWLModelManager;
import org.protege.editor.owl.model.event.EventType;
import org.protege.editor.owl.model.event.OWLModelManagerListener;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLIndividual;
public class scrolllisttrial extends JFrame implements ItemListener{
	
	
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
    static JFrame f; 
    
    // label 
    static JLabel l, l1, l3, l4; 
  
    // combobox 
    static JComboBox c1, c2; 
  
    // main class 
    public void detect(List<String>s_run) {
        f = new JFrame("frame"); 
        
        // create a object 
       scrolllisttrial s = new scrolllisttrial(); 
  
        // array of string contating cities 
        String s1[] = new String[s_run.size()];
        s_run.toArray(s1);
        String s2[] = { "male", "female", "others" }; 
  
        // create checkbox 
        c1 = new JComboBox(s1); 
        c2 = new JComboBox(s2); 
  
        // set Kolakata and male as selected items 
        // using setSelectedIndex 
        c1.setSelectedIndex(0); 
        c2.setSelectedIndex(0); 
  
        // add ItemListener 
        c1.addItemListener(s); 
        c2.addItemListener(s); 
  
        // set the checkbox as editable 
        c1.setEditable(true); 
  
        // create labels 
        l = new JLabel("select your city "); 
        l1 = new JLabel("Jalpaiguri selected"); 
        l3 = new JLabel("select your gender "); 
        l4 = new JLabel("Male selected"); 
  
        // set color of text 
        l.setForeground(Color.red); 
        l1.setForeground(Color.blue); 
        l3.setForeground(Color.red); 
        l4.setForeground(Color.blue); 
  
        // create a new panel 
        JPanel p = new JPanel(); 
  
        p.add(l); 
  
        // add combobox to panel 
        p.add(c1); 
  
        p.add(l1); 
  
        p.add(l3); 
  
        // add combobox to panel 
        p.add(c2); 
  
        p.add(l4); 
  
        // set a layout for panel 
        p.setLayout(new FlowLayout()); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(400, 400); 
  
        f.show();
    }
    public static void main(String[] args) 
    { 
        // create a new frame 
    	 scrolllisttrial s = new scrolllisttrial(); 
    	 List<String>s_run=new ArrayList<>();
    	 s_run.add("Kolkata");
    	 s_run.add("Delhi");
    	 
    	 s.detect(s_run);
 
    } 
    public void itemStateChanged(ItemEvent e) 
    { 
        // if the state combobox 1is changed 
        if (e.getSource() == c1) { 
  
            l1.setText(c1.getSelectedItem() + " selected"); 
        } 
  
        // if state of combobox 2 is changed 
        else
            l4.setText(c2.getSelectedItem() + " selected"); 
    } 
    
    @SuppressWarnings("unchecked")
	public void recalculate() {
    	try {
    	scrolllisttrial s11 = new scrolllisttrial(); 
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
        s11.detect(classname);
       

    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
       

        	
      

