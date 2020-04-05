package edu.stanford.bmir.protege.examples.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
public class jpanel extends JFrame  {
	JFileChooser fileChooser = new JFileChooser();
    private JLabel labelEnterdescription = new JLabel("Please enter the description\n" + 
    		"of Ontology You want to develop ");
    //private JLabel labeldescriptionanswer = new JLabel("Enter: ");
    private JLabel labelEnterDomain = new JLabel("Please enter Domain Name you want to\n" + 
    		"create. ");
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
    private JTextArea textarea= new JTextArea("Final ODP Recommendation");
    
    
    //private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("ODPRecommendation");
    private JButton close = new JButton("Close the panel");
    private ActionListener refreshAction = e ->ODP();
     
    public jpanel() {
        super("JPanel Demo Program");
         
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
         
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel.add(labelEnterdescription, constraints);
        constraints.gridx = 1;
        newPanel.add(textDescription, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;     
        newPanel.add( labelEnterDomain, constraints);
        constraints.gridx = 1;
        newPanel.add(textdomain, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;     
        newPanel.add(labelelements, constraints);
        
       
        constraints.gridx = 1;
        newPanel.add(textclass, constraints);
     
        constraints.gridx = 0;
        constraints.gridy = 3;     
        newPanel.add(labelcqs, constraints);
        constraints.gridx = 1;
        newPanel.add(textcqs, constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;     
        newPanel.add(labeladditional, constraints);
        constraints.gridx = 1;
        newPanel.add(textadd, constraints);
        constraints.gridx = 0;
        constraints.gridy = 5;     
        newPanel.add(finala, constraints);
        constraints.gridx = 1;
        newPanel.add(textfinal, constraints);
        textfinal.setEditable(false);
        

        constraints.gridx = 0;
        constraints.gridy = 6;     
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
        constraints.gridy = 7;
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
    	odpdescription o=new odpdescription();
    	List<String>ls=new ArrayList<String>();
    	String s;
    	String S1=textDescription.getText();
    	String S2=textdomain.getText();
    	String S3=textclass.getText();
    	String S4=textcqs.getText();
    	String S5=textadd.getText();
    	s=S1+" "+S2+" "+" "+S3+" "+S4+" "+S5;
    	//System.out.println(s);
    	textfinal.setText(s);
    	
    	ls.addAll(o.findsimilarity(s));
    	System.out.println("Ls is"+ls);
    	textarea.setText(ls.toString());
    	return ls;
    	
    }
    public void dispose() {
        
    	buttonLogin.removeActionListener(refreshAction);
    	

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
                new jpanel().setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        // set look and feel to the system look and feel
    		jpanel j=new jpanel();
    		j.result();
    }
}
