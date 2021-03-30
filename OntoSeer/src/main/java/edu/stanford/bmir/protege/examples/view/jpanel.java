package edu.stanford.bmir.protege.examples.view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.protege.editor.owl.model.OWLModelManager;
import org.protege.editor.owl.model.event.EventType;
import org.protege.editor.owl.model.event.OWLModelManagerListener;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLIndividual;
public class jpanel extends JFrame  {
	JFileChooser fileChooser = new JFileChooser();
    private JLabel labelEnterdescription = new JLabel("Please enter the description of the ontology");
    //private JLabel labeldescriptionanswer = new JLabel("Enter: ");
    private JLabel labelEnterDomain = new JLabel("Please enter the domain of ontology");
    private JLabel labelelements = new JLabel("Please enter some of the elements like classes and properties you want\n" + 
    		"to make. ");
    private JLabel labelcqs = new JLabel("Please enter the competency questions. ");
    private JLabel labeladditional = new JLabel("Please enter any additional\n" + 
    		"comments. ");
    private JLabel finala = new JLabel("Final Input ");
    private JLabel Final_Recommendation = new JLabel("Final ODP recommendation based on your input is ");
    
  //  private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textDescription = new JTextField(20);
    private JTextField textdomain = new JTextField(20);
    private JTextField textclass = new JTextField(20);
    private JTextField textcqs = new JTextField(20);
    private JTextField textadd = new JTextField(20);
    private JTextField textfinal = new JTextField(20);
    private JTextArea textarea= new JTextArea("ODP Recommendation");
    
    private JLabel comment=new JLabel("The class and properties will be considered for ODP recommendation. Without any class or property ODP recommendation will not be shown.");
    private JLabel commentq=new JLabel("Along with that the following can also be provided for ODP recommendation but they are optional");
    
    
    
    //private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("ODPRecommendation");
    private JButton close = new JButton("Close the panel");
    private ActionListener refreshAction = e ->ODP();
    private OWLModelManager modelManager;
    private OWLModelManagerListener modelListener = event -> {
        if (event.getType() == EventType.ACTIVE_ONTOLOGY_CHANGED) {
           Metrics m=new Metrics(modelManager);
        }
    };
    public List<String>ct1;
    String ct2[]=new String[50000];
    public List<String> classname() {
    	
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
         //   Vocabsuggesstionpanel v=new Vocabsuggesstionpanel();
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
           


            
          
        
            
           return classname;
            
        
        	}catch(Exception e) {
            	e.printStackTrace();
            	return null;
            }

            
        }
    
    public jpanel(String ct[]) {
    	
        super("ODP Recommendation");
        ct1=new ArrayList<>();
    	ct2=ct;
         
        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());
       /*
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
    	int result = fileChooser.showOpenDialog(this);
    	if (result == JFileChooser.APPROVE_OPTION) {
    	    File selectedFile = fileChooser.getSelectedFile();
    	    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
    	}
    	*/
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel.add(comment, constraints); 
        comment.setFont(comment.getFont().deriveFont(Font.BOLD, comment.getFont().getSize()));
        constraints.gridx = 0;
        constraints.gridy = 1;     
        newPanel.add(commentq, constraints);
        commentq.setFont(commentq.getFont().deriveFont(Font.BOLD, commentq.getFont().getSize()));
         
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 2;     
        newPanel.add(labelEnterdescription, constraints);
        constraints.gridx = 1;
        newPanel.add(textDescription, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;     
        newPanel.add( labelEnterDomain, constraints);
        constraints.gridx = 1;
        newPanel.add(textdomain, constraints);
  
        constraints.gridx = 0;
        constraints.gridy = 4;     
        newPanel.add(labelcqs, constraints);
        constraints.gridx = 1;
        newPanel.add(textcqs, constraints);
        constraints.gridx = 0;
        constraints.gridy = 5;     
        //newPanel.add(labeladditional, constraints);
        constraints.gridx = 1;
        newPanel.add(textadd, constraints);
        constraints.gridx = 0;
        constraints.gridy = 6;     

        

        constraints.gridx = 0;
        constraints.gridy = 8;     
        newPanel.add(textarea, constraints);
        textarea.setEditable(false);
        /* 
        constraints.gridx = 0;
        constraints.gridy = 6;     
        newPanel.add(labelPassword, constraints);
         
        constraints.gridx = 1;
        newPanel.add(fieldPassword, constraints);
        */
         
        constraints.gridx = 0;
        constraints.gridy = 12;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);
        buttonLogin.addActionListener(refreshAction);
        
       
      
         
        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "ODP Recommendation panel"));
        
      
        
         
        // add the panel to this frame
        add(newPanel);
       
        pack();
        setLocationRelativeTo(null);
    }
     
    public List ODP() {
    	List<String>ls=new ArrayList<String>();
    	//ls.addAll(ct1);
    	List<String>ls1=new ArrayList<String>();
    	
    	
    	String[] arr = new String[ls.size()];
    	for(int i=0;i<ls.size();i++) {
    		arr[i]=ls.get(i);
    		System.out.println(arr[i]);
    	}
    	for(int i=0;i<arr.length;i++) {
    		System.out.println(arr[i]);
    	}
    	//System.out.println(arr.toString());
    	odpdescription o=new odpdescription();
    	
    	String s;
    	String S1=textDescription.getText();
    	String S2=textdomain.getText();
    	
    	String S4=textcqs.getText();
    	String S5=textadd.getText();
    	s=S1+" "+S2+" "+" "+S4+" "+S5;
    	//System.out.println(s);
    	//textfinal.setText(S3);
    	//arr=S3.split(",");
    	ls1.addAll(o.findsimilarity(s, ct2));
    	
    	System.out.println("Ls is"+ls1);
    	textarea.setText(ls1.get(0).toString()+"\n"+ls1.get(1).toString()+"\n"+ls1.get(2).toString()+"\n"+ls1.get(3).toString()+"\n"+ls1.get(4).toString()+"\n"+ls1.get(5).toString()+"\n"+ls1.get(6).toString()+"\n");
    	return ls1;
    	
    }
    public void dispose() {
        
    	buttonLogin.removeActionListener(refreshAction);
    	

    }
    public void classnames(List<String>ct) {
    	
    }
    public void result() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new jpanel(ct2).setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        // set look and feel to the system look and feel
    		List<String>ct=new ArrayList<>();
    		ct.add("Person");
    		
    		String sts[]= {"Person","Professor"};
    		jpanel j=new jpanel(sts);
    		j.result();
    }
}
