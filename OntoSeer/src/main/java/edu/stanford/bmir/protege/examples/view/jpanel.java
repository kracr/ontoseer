package edu.stanford.bmir.protege.examples.view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.protege.editor.owl.model.OWLModelManager;
import org.protege.editor.owl.model.event.EventType;
import org.protege.editor.owl.model.event.OWLModelManagerListener;
import org.semanticweb.owlapi.model.OWLClass;

public class jpanel extends JFrame  {
	JFileChooser fileChooser = new JFileChooser();
    private JLabel labelEnterdescription = new JLabel("Please enter the description of the ontology.");    
    private JLabel labelEnterDomain = new JLabel("Please enter the domain of ontology.");    
    private JLabel labelcqs = new JLabel("Please enter the competency questions.");
        
  //  private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textDescription = new JTextField(20);
    private JTextField textdomain = new JTextField(20);
    private JTextField textclass = new JTextField(20);
    private JTextField textcqs = new JTextField(20);
    private JTextField textadd = new JTextField(20);
    private JTextField textfinal = new JTextField(20);
    private JTextArea textarea= new JTextArea("ODP Recommendation");
    
    private JLabel comment=new JLabel("<html>The class and properties will be considered for ODP recommendation. Without any class or property ODP recommendation will not be shown.</html>");
    private JLabel commentq=new JLabel("<html>Along with that the following can also be provided for ODP recommendation but they are optional.</html>");
    private JLabel comment2=new JLabel("Hover over label to get more information.");
    
    
    
    //private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("ODP Recommendation");
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

        labelEnterdescription.setToolTipText("<html>Provide key value related to description of ontology<br>For example :-<br>If you want to know about the ontology of college with professor, teacher, students etc then type \"college\"<br>If you want to know about the ontology related to wine then type \"wine\"</html>");
        labelEnterDomain.setToolTipText("<html>Provide key value related to domain of ontology<br>For example :-<br>If you want to know about the ontology of teacher but in the domain of college then type \"college\" in the domain and \"teacher\" in the description<br>If you want to know about the ontology related to color in the domain of wine ontology then type \"color\" in the domain and \"wine\" in the description</html>");
        labelcqs.setToolTipText("<html>Provide key value related to competency questions<br>For example :-<br>If you want CQ as \"No of teachers in college\" then type \"Teacher in the CQ\", \"college\" in the domain and \"teacher\" in the description<br>If you want CQ as \"All Color of wine in Asia\" then type \"color\" in the CQ, \"color\" in the domain and \"wine\" in the description</html>");
         
        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        Insets insets = new Insets(10,10,10,10);
        constraints.insets = insets;
        
        constraints.anchor = GridBagConstraints.WEST;
        constraints = new GridBagConstraints(0, 0, 1, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets, 0, 0);
        newPanel.add(comment, constraints); 
        comment.setFont(comment.getFont().deriveFont(Font.BOLD, comment.getFont().getSize()));
        
        constraints = new GridBagConstraints(0, 3, 1, 2, 0.5, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets, 0, 0);
        newPanel.add(commentq, constraints);
        commentq.setFont(commentq.getFont().deriveFont(commentq.getFont().getSize()-1));

        constraints = new GridBagConstraints(0, 5, 1, 1, 0.5, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets, 0, 0);
        newPanel.add(comment2, constraints);
        comment2.setFont(comment2.getFont().deriveFont(comment2.getFont().getSize()-1));

        constraints = new GridBagConstraints(0, 7, 1, 1, 0.5, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets, 0, 0);    
        newPanel.add(labelEnterdescription, constraints);
        constraints = new GridBagConstraints(1, 7, 1, 1, 0.5, 0.5, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets, 0, 0);
        newPanel.add(textDescription, constraints);

        constraints = new GridBagConstraints(0, 8, 1, 1, 0.5, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets, 0, 0);
        newPanel.add( labelEnterDomain, constraints);
        constraints = new GridBagConstraints(1, 8, 1, 1, 0.5, 0.5, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets, 0, 0);
        newPanel.add(textdomain, constraints);
  
        constraints = new GridBagConstraints(0, 9, 1, 1, 0.5, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets, 0, 0);   
        newPanel.add(labelcqs, constraints);
        constraints = new GridBagConstraints(1, 9, 1, 1, 0.5, 0.5, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets, 0, 0);
        newPanel.add(textcqs, constraints);
        
        constraints = new GridBagConstraints(0, 10, 1, 1, 4, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, insets, 0, 0);    
        newPanel.add(textarea, constraints);
        textarea.setEditable(false);
        textarea.setFont(textarea.getFont().deriveFont(textarea.getFont().getSize()));

        constraints.anchor = GridBagConstraints.CENTER;
        constraints = new GridBagConstraints(0, 16, 1, 1, 1, 0.6, GridBagConstraints.CENTER, GridBagConstraints.CENTER, insets, 0, 0);
        newPanel.add(buttonLogin, constraints);
        buttonLogin.addActionListener(refreshAction);
        

        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "ODP Recommendation panel"));
        
         
        // add the panel to this frame
        add(newPanel);
       
        pack();
        setLocationRelativeTo(null);
    }
     
    public List ODP() {
    	List<String>ls=new ArrayList<String>();
    	//ls.addAll(ct1);
    	List<String>ls1=new ArrayList<String>();
    	List<String>ls2=new ArrayList<String>();
    	
    	
    	
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
    	ls2.addAll(o.findsimilarity1(s, ct2));
    	
    	System.out.println("Ls is"+ls1);
    	textarea.setText("1. "+ls1.get(0).toString()+"\n"+"IRI: "+ls2.get(0)+"\n"+"\n"+"2. "+ls1.get(1).toString()+"\n"+"IRI: "+ls2.get(1)+"\n"+"\n"+"3. "+ls1.get(2).toString()+"\n"+"IRI: "+ls2.get(2)+"\n"+"\n"+"4. "+ls1.get(3).toString()+"\n"+"IRI: "+ls2.get(3));
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
