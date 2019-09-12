package edu.stanford.bmir.protege.examples.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.*;

import java.util.*;

import org.protege.editor.owl.model.OWLModelManager;
import org.protege.editor.owl.model.event.EventType;
import org.protege.editor.owl.model.event.OWLModelManagerListener;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLIndividual;

public class Metrics extends JPanel {

    private JButton refreshButton = new JButton("Refresh");

    private JLabel textComponent = new JLabel();

    private OWLModelManager modelManager;
  //  private JTextArea jt=new JTextArea(50,50);

    private ActionListener refreshAction = e -> recalculate();
    
    private OWLModelManagerListener modelListener = event -> {
        if (event.getType() == EventType.ACTIVE_ONTOLOGY_CHANGED) {
            recalculate();
        }
    };
    
    public Metrics(OWLModelManager modelManager) {
    	this.modelManager = modelManager;
        recalculate();
        
        modelManager.addListener(modelListener);
        refreshButton.addActionListener(refreshAction);
        
        add(textComponent);
        //add(jt);
        add(refreshButton);
    }
    
    public void dispose() {
        modelManager.removeListener(modelListener);
        refreshButton.removeActionListener(refreshAction);
    }
    
    private void recalculate() {
        int count = modelManager.getActiveOntology().getClassesInSignature().size();
        int count2= modelManager.getActiveOntology().getLogicalAxiomCount();
    	Set<String>xt34=new HashSet<String>();
    	String s1[]=new String[500];
    	//String s4[]=new String[500];
    	
    	//String s5[]=new String[500];
    	List<String>iri=new ArrayList<>();
    	List<String>classname=new ArrayList<>();
    	
    	
        Set<OWLClass> xt= modelManager.getActiveOntology().getClassesInSignature();
        for(OWLClass c:xt) {
        	String xt1=c.toString();
        	System.out.println(xt1);
        	xt34.add(xt1);
        	//textComponent.setText(xt1);
        }
        if (count == 0) {
            count = 1;  // owl:Thing is always there.
        }
        if(count2==0) {
        	count2=1;
        }
        for(String s:xt34) {
        	s1=s.split("#",2);
        	iri.add(s1[0]);
        	classname.add(s1[1]);
        	
        	
        }
        for(String s2:classname) {
        	System.out.print(s2);
        	textComponent.setText(s2);
        //	jt.getText(textComponent.setText(s2););
        }
       
        textComponent.setText("Class Count "+count+"Properties count "+count2+"names"+classname);
    }
   /* public Set<String> xt(List<String> s3) {
    	
    	Set<String>xtr=new HashSet<>();
    	List<String>url=new ArrayList<>();
    	for(String x3:s3) {
    		String x4="https://lov.linkeddata.es/dataset/lov/api/v2/term/search?q="+"x3"+"&type=class";
    		url.add(x4);
    	}
    	
    	for(String x5:url) {
    		
    	}
    	return xtr;
    	
    	
    	
    	
    }*/
}
