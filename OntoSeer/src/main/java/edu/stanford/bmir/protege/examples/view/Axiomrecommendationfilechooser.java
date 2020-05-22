package edu.stanford.bmir.protege.examples.view;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import java.awt.event.ActionListener;
import java.io.File;

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

public class Axiomrecommendationfilechooser extends JFrame{
	JFileChooser fileChooser = new JFileChooser();
	private JLabel labelEnterdescription = new JLabel("Class name for which you want to get axiom recommendation ");
	 private JTextField textDescription = new JTextField(20);
	 private JButton buttonLogin = new JButton("ODPRecommendation");
	 private JButton close = new JButton("Close the panel");
	 File selectedFile;
	 private ActionListener refreshAction = e ->Axiom();
	public  Axiomrecommendationfilechooser () {
		  super("JPanel Demo Program");
	        JPanel newPanel = new JPanel(new GridBagLayout());
	        
	        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	     //   fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
	    	int result = fileChooser.showOpenDialog(this);
	    	if (result == JFileChooser.APPROVE_OPTION) {
	    	    selectedFile = fileChooser.getSelectedFile();
	    	    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
	    	}
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
	        constraints.gridy = 4;
	        constraints.gridwidth = 2;
	        constraints.anchor = GridBagConstraints.CENTER;
	        newPanel.add(buttonLogin, constraints);
	        newPanel.add(buttonLogin, constraints);
	        buttonLogin.addActionListener(refreshAction);
	        
	       
	      
	         
	        // set border for the panel
	        newPanel.setBorder(BorderFactory.createTitledBorder(
	                BorderFactory.createEtchedBorder(), "Axiom Recommendation panel"));
	        
	      
	        
	         
	        // add the panel to this frame
	        add(newPanel);
	       
	        pack();
	        setLocationRelativeTo(null);
	}
	
    public void Axiom() {
    	List<String>ls=new ArrayList<String>();
    	
    	retrieval r=new retrieval();
    	
    	String s=selectedFile.getAbsolutePath();
    	String s1=null;
    	s1=textDescription.getText();
    	
    	
    	System.out.println(s1);
    	
    	//ls.addAll(r.re(s1,s));
    	
    	//return s;
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
               new Axiomrecommendationfilechooser().setVisible(true);
           }
       });
	   
   }
    public static void main(String[] args) {
        // set look and feel to the system look and feel
    	Axiomrecommendationfilechooser a= new Axiomrecommendationfilechooser();
    	a.result();

    }
	

}
