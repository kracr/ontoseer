package edu.stanford.bmir.protege.examples.view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class chatbotpanel extends JFrame  {
	JFileChooser fileChooser = new JFileChooser();
    private JLabel labelEnterdescription = new JLabel("Do the properties of superclass cease to exist in the future (temporal dependency)? (Y/N)");        
    private JLabel labelEnterdescription1 = new JLabel("Do the properties of the sub class cease to exist in the future? (temporal dependency)? (Y/N)");
    private JLabel labelEnterDomain1 = new JLabel("Are the properties of super-class and subclass identical? (Y/N)");
    private JLabel labelelements1 = new JLabel("Are the properties of subclass part of the properties whole class? (Y/N)");
    
    
  //  private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textDescription = new JTextField(20);
    private JTextField textdomain = new JTextField(20);
    private JTextField textclass = new JTextField(20);
    private JTextField textDescription1 = new JTextField(20);
    private JTextField textdomain1 = new JTextField(20);
    private JTextField textclass1 = new JTextField(20);

    private JLabel textarea= new JLabel("Hierarchy Validation\n");
    private JLabel text123=new JLabel("\n");
    private JTextArea textarea1= new JTextArea("");
    private JLabel comment=new JLabel("Please answer the following questions for each subclass and superclass in the ontology");
    private JLabel comment1=new JLabel("All the below inputs are mandatory");
    private JLabel comment2=new JLabel("Hover over label to get more information");
    
    //private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Class Hierarchy Validation");
    private JButton close = new JButton("Close the panel");
    private ActionListener refreshAction = e ->ODP();
    private String data[][]={ {"Rule","SuperPositive","SuperNegative"},{"Identity","Positive","Negative"},    
            {"Rigidity","Positive","Negative"},    
            {"Unity","Positive","Negative"}};    
    private String column[]={"Rule","Superclass-Positive","SuperClass-Negative"};   
    JTable jt=new JTable(data,column); 
     
    public chatbotpanel() {
        super("Class Hierarchy Validation");
         
        labelEnterdescription.setToolTipText("<html>For example,<br>Person will always be a person, but Student can cease to exist to be a Student after a time lapse.<br>Person is a superclass of student so Person class property will cease to exist in future<br>If the property of superclass cease to exist in future then type Y otherwise N<br></html>");
        labelEnterdescription1.setToolTipText("<html>For example,<br>Person will always be a person, but Student can cease to exist to be a Student after a time lapse, as Student will have its class, subject, grades etc.<br>Subject is a subclass of student so Subject class property will not cease to exist in future<br>If the property of subclass cease to exist in future then type Y otherwise N<br></html>");
        labelEnterDomain1.setToolTipText("<html>For example:<br> two one-hour duration time intervals are identical, but an hour interval on Wednesday is not identical to an hour interval on Friday.<br>If the properties is similar then type Y otherwise N</html>");
        labelelements1.setToolTipText("<html>For example:<br>A lump of clay is part of \"amount of matter\", but \"amount of matter\" is not part of a lump of clay.<br>If the property of subclass is related or part of superclass then type Y otherwise N</html>");

        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        
        constraints.insets = new Insets(15, 15, 15, 15);

        constraints.anchor = GridBagConstraints.WEST;
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel.add(comment, constraints); 
        comment.setFont(comment.getFont().deriveFont(Font.BOLD, comment.getFont().getSize()));
        
        constraints.gridx = 0;
        constraints.gridy = 1;     
        newPanel.add(comment1, constraints);
        comment1.setFont(comment1.getFont().deriveFont(comment.getFont().getSize()-1));

        constraints.gridx = 0;
        constraints.gridy = 2;     
        newPanel.add(comment2, constraints);
        comment2.setFont(comment2.getFont().deriveFont(comment.getFont().getSize()-1));

        constraints.gridx = 0;
        constraints.gridy = 3;     
        newPanel.add(labelEnterdescription, constraints);
        constraints.gridx = 1;
        newPanel.add(textDescription, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;     
        newPanel.add(labelEnterdescription1, constraints);
        constraints.gridx = 1;
        newPanel.add(textDescription1, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;     
        newPanel.add( labelEnterDomain1, constraints); 
        constraints.gridx = 1;
        newPanel.add(textdomain1, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;     
        newPanel.add(labelelements1, constraints);      
        constraints.gridx = 1;
        newPanel.add(textclass1, constraints);


        constraints.gridx = 0;
        constraints.gridy = 9;     
        newPanel.add(textarea, constraints);
        textarea.setFont(textarea.getFont().deriveFont(Font.BOLD, textarea.getFont().getSize()));
        
        JScrollPane scroll = new JScrollPane(textarea);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        constraints.gridx = 0;
        constraints.gridy = 11;     
        newPanel.add(text123, constraints);

        constraints.gridx = 0;
        constraints.gridy = 12;     
        newPanel.add(textarea1, constraints);
        textarea1.setEditable(false);
        textarea1.setFont(textarea1.getFont().deriveFont(textarea.getFont().getSize()));
        
        constraints.gridx = 0;
        constraints.gridy = 13;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);
        buttonLogin.addActionListener(refreshAction);
               
        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Class Hierarchy Validation"));
        
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
    	String S4=textDescription1.getText();
    	String S5=textdomain1.getText();
    	String S6=textclass1.getText();
    	if(S1.equalsIgnoreCase("")||S4.equalsIgnoreCase("")||S5.equalsIgnoreCase("")||S6.equalsIgnoreCase("")) {
    		textarea1.append("All mandatory fields are not filled");
    	}
    	else {
    	s=S1+S2+S3;
    	//System.out.println(s);
    	if(S1.equalsIgnoreCase("y")) {
    		if(S4.equalsIgnoreCase("y")||S4.equalsIgnoreCase("N")) {
    			textarea1.append("Rigidity is correctly maintained.\n");
    		}
    		
    	}
    	else if(S1.equalsIgnoreCase("N")) {
    		if(S4.equalsIgnoreCase("N")) {
    			textarea1.append("Rigidity is correctly maintained.\n");
    		}
    		else if(S4.equalsIgnoreCase("Y")) {
    			textarea1.append("Rigidity is not correctly maintained. Subclass hierarchy is not correct.\n");
    		}
    	}
   
    	if(S5.equalsIgnoreCase("y")) {
    		
    			textarea1.append("Identity is correctly maintained.\n");
    		
    		
    	}
    	else if(S5.equalsIgnoreCase("N")) {
    		    textarea1.append("Identity is not correctly maintained. Subclass hierarchy is not correct.\n");
    	
    	}
    	
    	if(S6.equalsIgnoreCase("y")) {
    		
    			textarea1.append("Unity is correctly maintained.\n");
    		
    		
    	}
    	else if(S6.equalsIgnoreCase("N")) {
    		
    		
    			textarea1.append("Unity is not correctly maintained. Subclass hierarchy is not correct.\n");
    		
    	}
    
    	}
    	
    	//ls.addAll(o.findsimilarity(s));
    	//System.out.println("Ls is"+ls);
    	//textarea.setText("Final ODP Output is: "+ls.toString());
    	buttonLogin.setEnabled(false);
    	
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
                new chatbotpanel().setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        // set look and feel to the system look and feel
    		chatbotpanel j=new chatbotpanel();
    		j.result();
    }
}

