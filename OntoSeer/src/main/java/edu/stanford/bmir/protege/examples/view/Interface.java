package edu.stanford.bmir.protege.examples.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Interface extends JFrame {

	JFileChooser fileChooser = new JFileChooser();
    private JLabel labelEnterdescription = new JLabel("Enter class name for which you want to get recommendation");

    

    private JTextField textDescription = new JTextField(20);

    private JTextArea textarea= new JTextArea("Vocab URLs");
    private  JComboBox c1;
    
    
    //private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonVocab = new JButton("VocabRecommendation");
    private JButton buttoncontinue = new JButton("Want more recommendation?");
    private JButton buttonNaming=new JButton("Naming Conventions");
    private JButton buttonAxiom=new JButton("Axiom Recommendations");
    private JButton ODP  = new JButton("ODP recommendation");
    private ActionListener refreshAction = e ->vocab();
    private ActionListener refreshAction1 = e ->continues();
    private ActionListener refreshAction2 = e ->recalculate1();
    private ActionListener refreshAction3 = e ->recalculate3();
    private ActionListener refreshAction4= e ->recalculate4();
  //  private ActionListener refreshAction1 = e ->continues();
    public Interface () {
        super("Vocabulary Recommendation Panel");
  
        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(25, 25, 25, 25);
         


        constraints.gridx = 0;
        constraints.gridy = 7;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonVocab, constraints);
        buttonVocab.addActionListener(refreshAction);
        constraints.gridx = 1;
        constraints.gridy = 7;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonNaming, constraints);
        ODP.addActionListener(refreshAction2);
        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonAxiom, constraints);
        buttonAxiom.addActionListener(refreshAction3);
        constraints.gridx = 1;
        constraints.gridy = 8;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(ODP, constraints);
        buttonNaming.addActionListener(refreshAction4);
  
        
        constraints.gridx = 0;
        constraints.gridy = 9;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttoncontinue, constraints);
        buttoncontinue.addActionListener(refreshAction1);
        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "OntoSeer Plugin "));
      //  newPanel.setSize(1500,1500);
      //  newPanel.setMinimumSize(new Dimension(500, 200));
          // add the panel to this frame
        add(newPanel);
        
        
       
        pack();
        setLocationRelativeTo(null);
        
    }
     
    public void vocab() {
 
		  Vocabsuggesstionpanel v=new Vocabsuggesstionpanel();
		  v.result();
    }
    public void dispose() {
        
    	buttonVocab.removeActionListener(refreshAction);
    	ODP.removeActionListener(refreshAction2);
    	buttonAxiom.removeActionListener(refreshAction3);
    	buttonNaming.removeActionListener(refreshAction4);
    	//buttonVocab.removeActionListener(refreshAction);
    	buttoncontinue.removeActionListener(refreshAction1);

    }
    public void continues() {
		Interface p=new Interface();
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
                new Interface().setVisible(true);
            }
        });
    }
    
    public static void main(String[] args) {
        // set look and feel to the system look and feel
    		Interface p=new Interface();
    		p.result();
    }
    
    @SuppressWarnings("unchecked")
    private void   recalculate3() {
  	  
  	  try {
  	    	Axiomrecommendationfilechooser a= new Axiomrecommendationfilechooser();
  	    	a.result();
  	  }catch (Exception e) {
  		  e.printStackTrace();
  	  }
    }
    // @SuppressWarnings("unchecked")
     
    private void   recalculate4() {
  	  
  	  try {

        	naming_panel pi=new naming_panel();
        	pi.result();
  	  
  	  }catch (Exception e) {
  		  e.printStackTrace();
  	  }
  	  
    }
    private void   recalculate1() {
  	  List<String>ls2=new ArrayList<String>();
  	  jpanel j=new jpanel();
  	  
  	//  textComponent1.setText("Please press the refresh button to see recommendations");
        	
  	  j.result();
    }
}
