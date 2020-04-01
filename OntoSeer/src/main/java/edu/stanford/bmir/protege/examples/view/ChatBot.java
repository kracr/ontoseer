package edu.stanford.bmir.protege.examples.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import java.lang.Math;
public class ChatBot extends JFrame implements KeyListener{

	JPanel p=new JPanel();
	JTextArea dialog=new JTextArea(20,50);
	JTextArea input=new JTextArea(1,50);
	JScrollPane scroll=new JScrollPane(
		dialog,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
	);
	
	String[][] chatBot={
		//standard greetings
		{"hi","hello","hola","ola","howdy"},
		{"hi,This is OntoSeer I will help you with all the upcoming problems on \n"
				+"1. Essence .\n"
				+ "1.Rigidity.\n"
				+ "2.Identity. \n"
				+ "3.Unity .\n"
				+"Do you want definitions for these properties? \n"
				+"Please specify the number also with space between them like for example \n"
				+ "y /n \n"
				+ " , if nothing is shown default is all definitons will be shown"},
		
		{"y","Y"},
		{"Essence :A property of an entity is essential to that entity if it must be true of it in every\n" + 
				"possible world, i.e. if it necessarily holds for that entity. For example, the prop-\n" + 
				"erty of having a brain is essential to human beings. Every human must have a\n" + 
				"brain in every possible world.\n"
				+ "Rigidity : A special form of essentiality is rigidity; a property is rigid if it is essential to\n" + 
				"all its possible instances; an instance of a rigid property cannot stop being an in-\n" + 
				"stance of that property in a different world. For example, while having a brain\n" + 
				"may be essential to humans, it is not essential to, say, scarecrows in the Wizard of\n" + 
				"Oz. If we were modeling the world of the Wizard of Oz, the property of having a\n" + 
				"brain would not be rigid, though still essential to humans. On the other hand, the\n" + 
				"property being a human is typically rigid, every human is necessarily so.\n"
				+ "Identity :identity refers to the\n" + 
				"problem of being able to recognize individual entities in the world as being the\n" + 
				"same (or different)\n"
				+ "Unity: Unity refers to being able to recognize all the parts that\n" + 
				"form an individual entity. \n"
				+ "Do you want to check for correct subsumption?","Essence :A property of an entity is essential to that entity if it must be true of it in every\n" + 
						"possible world, i.e. if it necessarily holds for that entity. For example, the prop-\n" + 
						"erty of having a brain is essential to human beings. Every human must have a\n" + 
						"brain in every possible world.\n"
						+ "Rigidity : A special form of essentiality is rigidity; a property is rigid if it is essential to\n" + 
						"all its possible instances; an instance of a rigid property cannot stop being an in-\n" + 
						"stance of that property in a different world. For example, while having a brain\n" + 
						"may be essential to humans, it is not essential to, say, scarecrows in the Wizard of\n" + 
						"Oz. If we were modeling the world of the Wizard of Oz, the property of having a\n" + 
						"brain would not be rigid, though still essential to humans. On the other hand, the\n" + 
						"property being a human is typically rigid, every human is necessarily so.\n"
						+ "Identity :identity refers to the\n" + 
						"problem of being able to recognize individual entities in the world as being the\n" + 
						"same (or different)\n"
						+ "Unity: Unity refers to being able to recognize all the parts that\n" + 
						"form an individual entity.\n "
						+ "Do you want to check for correct subsumption? Plese say in Yes/No format"},
		
		{"Yes","yes","YES","No","no","NO"},
		{"What type of class is the parent class \n"
				+ "1.Entity\n"
				+ "2.Location\n"
				+ "3.Amount of matter\n"
				+ "4.Color\n"
				+ "5.Agent\n"
				+ "6.Group \n"
				+"7.Physical Object \n"
				+"8.Living Being\n"
				+"9. Food\n "
			
				+ "10. Flower \n"
				+ "11.Sports \n"
				+ "Please mention the number ?","What type of class is the parent class \n"
						+ "1.Entity\n"
						+ "2.Location\n"
						+ "3.Amount of matter\n"
						+ "4.Color\n"
						+ "5.Agent\n"
						+ "6.Group \n"
						+"7.Physical Object \n"
						+"8.Living Being\n"
						+"9. Food\n "
					
						+ "10. Flower \n"
						+ "11.Sports \n"
						+ "Please mention the number ?","What type of class is the parent class \n"
								+ "1.Entity\n"
								+ "2.Location\n"
								+ "3.Amount of matter\n"
								+ "4.Color\n"
								+ "5.Agent\n"
								+ "6.Group \n"
								+"7.Physical Object \n"
								+"8.Living Being\n"
								+"9. Food\n "
							
								+ "10. Flower \n"
								+ "11.Sports \n"
								+ "Please mention the number ?","Thank you for using Ontoseer","Thank you for using Ontoseer","Thank you for using Ontoseer"},
		
		
		{"0","1","2","3","4","5","6","7","8","9","10","11"},
		
		{"No vale","Entity is -I-U+R","Can the location expand? ","Amount of matter is -I-U+R","Is it general colour like Red or Magenta","Agent is -I-U-R,For more specific details about Legal agent please press 5+","Group is -U-I+R ,For more specific details about Group please press 6+","Physical object is +I+U+R ","Living being is +I+U+R For more specific details about Living being type 8+","Food is +I-U-R \n"+ 
		"For more detais about Food press 9+","Flower is +I+U+R For more details about flowers type 10+","Sports is +I+U+R For more details about sports type 11+"
		},		
		
		{"Yes","5+","6+","7+","8+","9+"},
		{"-I-U+R, Is it a country then press ++?.","Legal Agent is +I-U-R","Is the group an organization or social entity?Please answer O or S","Is it a vertebrate or Invertebrate?Please use V/I","Is it Fruit or Vegetables?Please mention F/V"},
		
		{"+","O","S","V","I","F","V"},
		{"Country is +I+U-R","Organization is +I+U+R","Social Entity is -I+U+R","Vertebrate is +I+U+R.Please use + for person,","Invertebrate is +I+U+R for butterfly caterpilar also.","Fruit is +I+U+R.For more specific like red apple please press /","Vegetable is +I+U+R"},
		
		{"++","/"},
		{"Person is +I+U+R","Specific like Red Apple +I+U-R"},
		{"Thanks"},
		{"Welcome Plese visit sometime else"}
		//question greetings
		
		/*{"how are you","how r you","how r u","how are u"},
		{"good","doing well"},
		//yes
		{"yes"},
		{"no","NO","NO!!!!!!!"},
		//default
		{"shut up","you're bad","noob","stop talking",
		"(michael is unavailable, due to LOL)"}*/
	};
	public void re()
	{
		ChatBot c=new ChatBot();
		
	}	
		
	public static void main(String[] args){
	
		ChatBot r=new ChatBot();
		r.re();
				
	}
	
	public ChatBot(){
		super("Chat Bot");
		setSize(600,400);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		dialog.setEditable(false);
		input.addKeyListener(this);
	
		p.add(scroll);
		p.add(input);
		p.setBackground(new Color(255,200,0));
		add(p);
		
		setVisible(true);
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			input.setEditable(false);
			//-----grab quote-----------
			String quote=input.getText();
			input.setText("");
			addText("-->You:\t"+quote);
			quote.trim();
			while(
				quote.charAt(quote.length()-1)=='!' ||
				quote.charAt(quote.length()-1)=='.' ||
				quote.charAt(quote.length()-1)=='?'
			){
				quote=quote.substring(0,quote.length()-1);
			}
			quote.trim();
			byte response=0;
			/*
			0:we're searching through chatBot[][] for matches
			1:we didn't find anything
			2:we did find something
			*/
			//-----check for matches----
			int j=0;//which group we're checking
			while(response==0){
				if(inArray(quote.toLowerCase(),chatBot[j*2])){
					response=2;
					int r=(int)Math.floor(Math.random()*chatBot[(j*2)+1].length);
					addText("\n-->OntoSeer:\t"+chatBot[(j*2)+1][r]);
				}
				j++;
				if(j*2==chatBot.length-1 && response==0){
					response=1;
				}
			}
			
		
			if(response==1){
				int r=(int)Math.floor(Math.random()*chatBot[chatBot.length-1].length);
				addText("\n-->OntoSeer:\t"+chatBot[chatBot.length-1][r]);
			}
			addText("\n");
		}
	}
	
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			input.setEditable(true);
		}
	}
	
	public void keyTyped(KeyEvent e){}
	
	public void addText(String str){
		dialog.setText(dialog.getText()+str);
	}
	
	public boolean inArray(String in,String[] str){
		boolean match=false;
		for(int i=0;i<str.length;i++){
			if(str[i].equals(in)){
				match=true;
			}
		}
		return match;
	}
}
