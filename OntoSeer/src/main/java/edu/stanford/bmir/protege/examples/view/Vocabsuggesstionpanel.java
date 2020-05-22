package edu.stanford.bmir.protege.examples.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
public class Vocabsuggesstionpanel extends JFrame  {
	JFileChooser fileChooser = new JFileChooser();
    private JLabel labelEnterdescription = new JLabel("Enter class name for which you want to get recommendation");

    

    private JTextField textDescription = new JTextField(20);

    private JTextArea textarea= new JTextArea("Vocab URLs");
    private JTextArea textarea1= new JTextArea("Alternate names");
    private  JComboBox c1;
    
    
    //private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("VocabRecommendation");
    private JButton buttoncontinue = new JButton("Want more recommendation?");
    private JButton close = new JButton("Close the panel");
    private ActionListener refreshAction = e ->vocab();
    private ActionListener refreshAction1 = e ->continues();
    public Vocabsuggesstionpanel () {
        super("Vocabulary Recommendation Panel");
  
        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(25, 25, 25, 25);
         
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel.add(labelEnterdescription, constraints);
        constraints.gridx = 1;
        newPanel.add(textDescription, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;     
        newPanel.add(textarea, constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;     
        newPanel.add(textarea1, constraints);
        
        textarea.setEditable(false);
        textarea.setSize(150, 450);
        textarea1.setEditable(false);
        textarea1.setSize(150, 450);

        constraints.gridx = 0;
        constraints.gridy = 7;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);
        buttonLogin.addActionListener(refreshAction);
        
        constraints.gridx = 0;
        constraints.gridy = 9;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttoncontinue, constraints);
        buttoncontinue.addActionListener(refreshAction1);
        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Vocab Recommendation Panel"));
      //  newPanel.setSize(1500,1500);
      //  newPanel.setMinimumSize(new Dimension(500, 200));
          // add the panel to this frame
        add(newPanel);
        
        
       
        pack();
        setLocationRelativeTo(null);
        
    }
     
    public List<String> vocab() {
    	try {
    	odpdescription o=new odpdescription();
    	List<String>ls=new ArrayList<String>();
    	String s;
    	String S1=textDescription.getText();
    	JsonReader v =new JsonReader();
    	
    	ls.addAll(v.vocab(S1));
    	
    	

    	System.out.println("Ls is"+ls);
    	textarea.setText(ls.toString());
    	return ls;
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		return null;
    	}
    	
    }
    
    public List<String> suggestalternatenames() {
    	
    	try {
        	List<String>ls=new ArrayList<String>();
        	String s;
        	String S1=textDescription.getText();
        	JsonReader v =new JsonReader();
        	
        	ls.addAll(v.suggestnames(S1));
        	
        	

        	System.out.println("Ls is"+ls);
        	for(int i =0;i<2;i++) {
        		textarea1.append(ls.get(i)+"\n");
        		
    	}
        	return ls;
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		return null;
    	}
    	
    }
    public void dispose() {
        
    	buttonLogin.removeActionListener(refreshAction);
    	buttoncontinue.removeActionListener(refreshAction1);
    	

    }
    public void continues() {
		Vocabsuggesstionpanel p=new Vocabsuggesstionpanel();
		p.result();
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
                new Vocabsuggesstionpanel().setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        // set look and feel to the system look and feel
    		Vocabsuggesstionpanel p=new Vocabsuggesstionpanel();
    		p.result();
    }

}
