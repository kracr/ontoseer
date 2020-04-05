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

public class naming_panel extends JFrame{
	
	JFileChooser fileChooser = new JFileChooser();
    private JLabel labelEnterdescription = new JLabel("Enter class name for which you want to get recommendation");

    

    private JTextField textDescription = new JTextField(20);

    private JTextArea textarea= new JTextArea("");
    private  JComboBox c1;
    
    
    //private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("NamingRecommendation");
    private JButton buttoncontinue = new JButton("Want more recommendation?");
    private JButton close = new JButton("Close the panel");
    private ActionListener refreshAction = e ->vocab();
    private ActionListener refreshAction1 = e ->continues();
    
    public naming_panel() {
        super("Naming Convention Recommendation Panel");
  
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
        textarea.setEditable(false);
        textarea.setSize(250, 250);

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
                BorderFactory.createEtchedBorder(), "Naming convention Recommendation Panel"));
      //  newPanel.setSize(1500,1500);
      //  newPanel.setMinimumSize(new Dimension(500, 200));
          // add the panel to this frame
        add(newPanel);
        
        
       
        pack();
        setLocationRelativeTo(null);
        
    }
     
    public List<String> vocab() {
    	//odpdescription o=new odpdescription();
    	List<String>ls=new ArrayList<String>();
    	String s;
    	String S1=textDescription.getText();
    	naming_conventions v =new naming_conventions();
    	
    	ls.addAll(v.recom(S1));
    	

    	System.out.println("Ls is"+ls);
    	for(int i =0;i<ls.size();i++) {
    		textarea.append(ls.get(i)+"\n");
    		
    	}
    	return ls;
    	
    }
    public void dispose() {
        
    	buttonLogin.removeActionListener(refreshAction);
    	buttoncontinue.removeActionListener(refreshAction1);
    	

    }
    public void continues() {
    	naming_panel p=new naming_panel();
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
                new naming_panel().setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        // set look and feel to the system look and feel
    		naming_panel p=new naming_panel();
    		p.result();
    }

}
