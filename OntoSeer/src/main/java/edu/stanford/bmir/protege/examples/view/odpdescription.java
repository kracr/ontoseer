package edu.stanford.bmir.protege.examples.view;
import java.io.*;
import java.util.*;

import org.semanticweb.owlapi.model.OWLClass;


public class odpdescription {
	public String arr[]=new String[39];
	public String arr1[]=new String[39];
	odpdescription() {
	arr[0]="To represent that some agent is acting in order to forward the action of a social (non-physical) agent.";
	arr[1]="The purpose of the pattern is to model actions that are proposed, planned, and performed or abandoned, together with their status and durations in time.";
	arr[2]="This work is concerned with supporting a correct and meaningful representation of activities on the Semantic Web, with the potential to support tasks such as activity recognition and reasoning about causation. This requires an ontology capable of more than simply documenting and annotating individual activity occurrences; definitions of activity specifications are required.\n" + 
			"Current representations of activities in OWL do not meet the basic requirements for activity specifications. Detailed definitions of an activity's preconditions and effects are lacking, in particular with respect to a consideration of change over time. This pattern leverages existing work to fill this void with an ontology design pattern for activity specifications in OWL.";
	arr[3]="Enable government and other web sites to answer an open ended collection of English questions,  and also to explain the answers in English.  Support government folks and citizens socially networking, Wikipedia-style, to continually expand the range of questions that can be answered.";
	arr[4]="A room (feature of interest) has a temperature (quality) and this temperature is affected by the air conditioner status, by the number of people in the room, and by the sun radiation that passes through the room’s windows";
	arr[5]="To represent agents and the roles they play..";
	arr[6]="To model algorithm specifications, their implementations and executions, together with parameters of implementations, settings of the parameters for the execution, and inputs the execution consumes (e.g., data) and outputs the execution produces (e.g., models, reports).";
	arr[7]="To represent the encyclopedic knowledge expressed by an object typed as Airline";
	arr[8]="To represent aquatic resources or stocks as composed of aquatic organisms from one or more species, and living in a water area.";
	arr[9]="To model bags of items (elements). The Bag is characterized by a collection that can have multiple copies of each object.";
	
	arr[10]="To represent biological species and relations between them.";
	arr[11]="To represent the catch records from time series FIGIS application, which contain temporally-indexed aggregated information about aquatic species cacthing.\n"; 
			
	arr[12]="To model a flexible schema to allow exposing chess games as linked data.";
	arr[13]="To represent the relations between concepts (roles, task, parameters) and entities (person, events, values), which concepts can be assigned to. To formalize the application (e.g. tagging) of informal knowledge organization systems such as lexica, thesauri, subject directories, folksonomies, etc., where concepts are first-order elements.";
	arr[14]="The intent of the pattern is to be able to represent climatic zones for aquatic resources.";
	arr[15]="To represent domain (not set theory) membership.";
	arr[16]="The pattern intends to model computer systems based on a hardware/software approach. This pattern has been developed by MKLab at CERTH/ITI and Tate for the PERICLES FP7 project.";
	arr[17]="The aim of this content ontology design patterns-Course Pattern- is to model the core attributes of a course and the basic relationships of the course in an educational institution.";
	arr[18]="The purpose of this pattern is to provide a basis for criteria modeling. For more advanced use see the 'criterion setter' pattern that enables describing entities that define criteria (such as requirements, constraints etc.).";
	
	arr[19]="The relation holding between any Agent, and a SocialPerson.";
	arr[20]="hasCurrency page";
	arr[21]="Provides a model for personal data information within privacy policies";
	arr[22]="Professor building";
	arr[23]="Extracted core of PROV-O";
	arr[24]="For dynamically conceptualizing, establishing, tracking, and updating relative relationships and dependencies between entities (real or representational) of a physical, temporal, and/or importance scope.";
	arr[25]="The intent of the pattern is to allow for modelling situations in which the knowledge about an event cannot be treated as certain. It is particularly useful for cases in which two or more agents provide different, contradictory information about the same event.";
	
	arr[26]="To model sets of things (elements). A Set is a collection that cannot contain duplicate elements.";
	arr[27]="The SmartEnv as a network of 8 ontology patterns relies on the SSN ontology and represents a smart environment. Each pattern model one aspect of such environments including temporal, spatial, objects, network, observation etc.";
	
	arr[28]="This pattern intend to represent a description of the conservation status of aquatic species.";
	
	arr[34]="To represent topics and their relations.";
	arr[35]="The pattern provides a model of trajectory, which is understood as a sequence of spatiotemporal points. The model generalizing the Semantic Trajectory pattern from [Hu, et al., COSIT 2013] by employing the notion of place, instead of location/geo-coordinate, to represent the spatial extent of the trajectory. This pattern is suitable for a variety of trajectory datasets and easily extendible by by aligning to or matching with existing trajectory ontologies, foundational ontologies, or other domain specific vocabularies.";
	arr[37]="To represent basic knowledge about transitions (events, states, processes, objects).";
	arr[38]="The goal of the pattern is to facilitate modelling the movement of mass or energy from one location to another, based on a common persistent frame of reference.";
	arr[29]="To represent actions through which tasks are executed.";
	arr[30]="A Situation to represent classification ('counting as') of an entity at some time";
	arr[31]="To represent classification of things at a certain time.";
	arr[32]="	To represent time intervals.";
	arr[33]="	To represent time periods between events.";
	arr[36]="	to provide a direct relation between aquatic species and vessels that are able to catch them, regardless of the fishing gear used.";
	arr1[0]="ActingFor";
	arr1[1]="Action";
	arr1[2]="ActivitySpecification";

	arr1[4]="AffectedBy";
	arr1[5]="AgentRole";
	arr1[6]="Airline";
	arr1[7]="Algorithm";
	arr1[8]="AquaticResources";
	arr1[9]="Bag";
	arr1[3]="BasicPlan";
	arr1[10]="Biological Entities";
	arr1[11]="CatchRecord.";
	arr1[12]="Chess";
	arr1[13]="Classification.";
	arr1[14]="ClimaticZone.";
	arr1[15]="Collection";
	arr1[16]="Computer System";
	arr1[17]="Course";
	arr1[18]="Criterion";
	
	arr1[19]="Persons";
	arr1[20]="Price";
	arr1[21]="PrivacyPolicyPersonalData";
	arr1[22]="Professor";
	arr1[23]="Provenance";
	arr1[24]="RelativeRelationship";
	arr1[25]="Reporting";

	arr1[26]="Set";
	arr1[27]="SmartHome";

	arr1[28]="SpeciesConservation";
	arr1[29]="TaskExecution";
	arr1[30]="TimeIndexedClassification";
	arr1[31]="Time indexed person role";
	arr1[32]="TimeInterval";
	arr1[33]="TimePeriod";
	arr1[34]="Topic";
	arr1[35]="Trajectory";
	arr1[36]="VesselSpecies";
	arr1[37]="Transition";
	arr1[38]="Transport";

	
}
	public List<String> findsimilarity(String st,String sts[]) {
		odpelements e=new odpelements();
		
		List<Double>ls=new ArrayList<Double>();
		List<String>ls1=new ArrayList<String>();
		List<String>ls2=new ArrayList<String>();
		List<Double>ls3=new ArrayList<Double>();
		List<Double>ls4=new ArrayList<Double>();
		ls3.addAll(e.findsimilarity(sts));
		StringEqualityPercentCheckUsingJaroWinklerDistance c=new StringEqualityPercentCheckUsingJaroWinklerDistance();
		for(int i=0;i<39;i++) {
			double d=c.similarity(st, arr[i]);
			ls.add(d);
			ls1.add(arr1[i]);
			
		}
		for(int i=0;i<ls.size();i++) {
			ls4.add(ls.get(i)+ls3.get(i));
		}
		for(int j=0;j<ls4.size()-1;j++) {
			for (int i=0;i<ls4.size()-j-1;i++) {
    		
				if(ls4.get(i)<ls4.get(i+1)) {
					Collections.swap(ls4,i,i+1);
					Collections.swap(ls1,i,i+1);
    			
    		}
    	}
		}
    	for (int i=0;i<7;i++) {
    		
    		
    		System.out.println("Rank "+(i+1)+" ODP is :"+ls.get(i)+" with scores: "+ls1.get(i));
    		ls2.add(ls1.get(i));
    	
    }
		return ls2;
		
	}
	public static void main(String args[]) {
		odpdescription d=new odpdescription();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter description for ontology");
		String st=sc.nextLine();
		String sts[]= {"Person","Professor"};
		d.findsimilarity(st,sts);
		
	}
  

	
}