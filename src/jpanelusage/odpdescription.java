package jpanelusage;
import java.io.*;
import java.util.*;
public class odpdescription {
	public String arr[]=new String[65];
	public String arr1[]=new String[65];
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
	arr[10]="A relation stating that an Agent is internally representing a SocialObject.";
	arr[11]="To represent biological species and relations between them.";
	arr[12]="To represent the catch records from time series FIGIS application, which contain temporally-indexed aggregated information about aquatic species cacthing.\n"; 
			
	arr[13]="To model a flexible schema to allow exposing chess games as linked data.";
	arr[14]="To represent the relations between concepts (roles, task, parameters) and entities (person, events, values), which concepts can be assigned to. To formalize the application (e.g. tagging) of informal knowledge organization systems such as lexica, thesauri, subject directories, folksonomies, etc., where concepts are first-order elements.";
	arr[15]="The intent of the pattern is to be able to represent climatic zones for aquatic resources.";
	arr[16]="To represent domain (not set theory) membership.";
	arr[17]="The pattern intends to model computer systems based on a hardware/software approach. This pattern has been developed by MKLab at CERTH/ITI and Tate for the PERICLES FP7 project.";
	arr[18]="The aim of this content ontology design patterns-Course Pattern- is to model the core attributes of a course and the basic relationships of the course in an educational institution.";
	arr[19]="The purpose of this pattern is to provide a basis for criteria modeling. For more advanced use see the 'criterion setter' pattern that enables describing entities that define criteria (such as requirements, constraints etc.).";
	arr[20]="Not applicable for refactoring patterns.";
	arr[21]="This pattern helps resolving a logical inconsistency triggered by a situation of disjoint classes subsuming a common sub-class.";
	arr[22]="To formally represent a conceptualization or a descriptive context.";
	arr[23]="This pattern helps resolving a logical inconsistency triggered by a situation of disjoint classes subsuming a common sub-class.";
	arr[24]="To represent the encyclopedic knowledge expressed by an object typed as EthnicGroup.";
	arr[25]="The purpose of this pattern is to provide a minimalistic model of event where it is not always possible to separate its spatial and the temporal aspects, thus can model events that move or possess discontinuous temporal extent. Events according to this model has at least one participant, attached via a participant-role, and may have additional descriptive information through its information object.";
	arr[26]="Describing the process and components of an explanation in different disciplines.";
	arr[27]="to represent types of fishing gear with respect to the aquatic species they either are targeted to catch or can accidentally catch.";
	arr[28]="To model hazardous situations and their associated hazardous events with events' participating objects and the hazards the objects are exposed to with the exposure value.";
	arr[29]="To represent information objects and their physical realization.";
	arr[30]="Ambiguous (or polisemic) expressions in English that can state three different types of relations: (1) the relation of possession between two individuals, (2) the relation between an object and its features or attributes, and (3) the relation between a whole and its parts (meronymy relation).";
	arr[31]="Recurrent expressions in English that state a relation between a (super)class and all the distinct (sub)classes that belong to the superclass.";
	arr[32]="To provide a pattern for expressing rights on Linked Data Resources, understood as RDF triples, datasets or mappings.";
	arr[33]="To represent ordered collections, i.e. lists.";
	arr[34]="Provide a core pattern for capturing information related to microblog entries (e.g. twitter, instagram, facebook, etc.)";
	arr[35]="To represent events with their participants, time, space, etc.";
	arr[36]="The motivation of this pattern is to model negative property assertions (NPAs) in ontology languages such as OWL.";
	arr[37]="There are ontologies where a given class can have plenty of superclasses, building a polyhierarchy.";
	arr[38]="To represents objects and the roles they play.";
	arr[39]="The intent of this pattern is to represent observations of things, under a set of parameters. Common parameters may be the time and place of the observation, but may be any feature that is observed concerning the specific thing being observed..";
	arr[40]="To represent software metrics especially for the purpose of detecting design-flaws in software systems based on these metrics. This is useful for re-engineering the software system., De a reprezenta metricile soft in special in scopul detectarii defectelor de proiectare din sistemele soft pe baza acestor metrici. Acest lucru este folositor pentru reingineria sistemului soft.";
	arr[41]="To represent participants in events holding specific roles in that particular event.";
	arr[42]="The Partition Pattern is a logical pattern that introduces axioms which model a partition of concepts.";
	arr[43]="The relation holding between any Agent, and a SocialPerson.";
	arr[44]="hasCurrency page";
	arr[45]="Provides a model for personal data information within privacy policies";
	arr[46]="Professor building";
	arr[47]="Extracted core of PROV-O";
	arr[48]="For dynamically conceptualizing, establishing, tracking, and updating relative relationships and dependencies between entities (real or representational) of a physical, temporal, and/or importance scope.";
	arr[49]="The intent of the pattern is to allow for modelling situations in which the knowledge about an event cannot be treated as certain. It is particularly useful for cases in which two or more agents provide different, contradictory information about the same event.";
	arr[50]="Capture the relational nature of roles using OWL 2 property chains, using theSocial Reality (OWL 2) pattern. Using this pattern the role-as-relation and role-as-class approach can coexist peacefully inside a single ontology";
	arr[51]="To represent the assignment of tasks to roles.";
	arr[52]="To model sets of things (elements). A Set is a collection that cannot contain duplicate elements.";
	arr[53]="The SmartEnv as a network of 8 ontology patterns relies on the SSN ontology and represents a smart environment. Each pattern model one aspect of such environments including temporal, spatial, objects, network, observation etc.";
	arr[54]="Capture Searle's theory on observer relative and institutional facts, used in creating social reality. See also the OWL 2 Agent-Role pattern.";
	arr[55]="This pattern intend to represent a description of the conservation status of aquatic species.";
	arr[56]="An n-ary relationship should be used to address any of the following situations:\n" + 
			"(a) a binary relationship that really needs a further argument. For example, to represent the distance between two places.\n" + 
			"\n" + 
			"(b) two binary relationships that always go together and should be represented as one n-ary relation. For example, to represent the value of an observation (e.g. temperature in a patient) and its trend.\n" + 
			"\n" + 
			"(c) a relationship that is really amongst several things. For example, to represent the spatial location of a person in a given point of time.\n" + 
			"";
	arr[57]="The symmetric n-ary relationship pattern emerged from the need of modelling distances among two points.";
	arr[58]="To represent topics and their relations.";
	arr[59]="The pattern provides a model of trajectory, which is understood as a sequence of spatiotemporal points. The model generalizing the Semantic Trajectory pattern from [Hu, et al., COSIT 2013] by employing the notion of place, instead of location/geo-coordinate, to represent the spatial extent of the trajectory. This pattern is suitable for a variety of trajectory datasets and easily extendible by by aligning to or matching with existing trajectory ontologies, foundational ontologies, or other domain specific vocabularies.";
	arr[60]="To represent basic knowledge about transitions (events, states, processes, objects).";
	arr[61]="The goal of the pattern is to facilitate modelling the movement of mass or energy from one location to another, based on a common persistent frame of reference.";
	arr[62]="Trees - i.e., the type of data structure known under this name - are central to many aspects of knowledge organization. ";
	arr[63]="A class denoted in one ontology is the union of two classes in the second ontology.";
	arr[64]="There are ontology domain concepts that are difficult to represent due to the complexities in their definition and the presence of multiple alternative criteria to classify their abstractions.";
	arr1[0]="ActingFor";
	arr1[1]="Action";
	arr1[2]="ActivitySpecification";
	arr1[3]="AdrianWalker";
	arr1[4]="AffectedBy";
	arr1[5]="AgentRole";
	arr1[6]="Airline";
	arr1[7]="AlgorithmImplementationExecution.";
	arr1[8]="AquaticResources";
	arr1[9]="Bag";
	arr1[10]="BasicPlan";
	arr1[11]="Biological Entities.";
	arr1[12]="CatchRecord.";
	arr1[13]="ChessGame";
	arr1[14]="Classification.";
	arr1[15]="ClimaticZone.";
	arr1[16]="Collection";
	arr1[17]="Computer System";
	arr1[18]="Course";
	arr1[19]="Criterion";
	arr1[20]="CyclicSubClassOf.";
	arr1[21]="Define Hybrid Class Resolving Disjointness due to Subsumption";
	arr1[22]="Description";
	arr1[23]="Enlarge Class Definition for Resolving Disjointness due to Subsomption";
	arr1[24]="EthnicGroup.";
	arr1[25]="EventCore.";
	arr1[26]="ExplanationODP.";
	arr1[27]="GearSpecies";
	arr1[28]="HazardousSituation";
	arr1[29]="Information realization";
	arr1[30]="Lexico Syntactic ODPs corresponding to Object Property or Datatype Property or Simple Part-Whole relation ODPs";
	arr1[31]="Lexico Syntactic ODPs corresponding to SubclassOf relation, Disjoint Classes, and Exhaustive Classes ODPs";
	arr1[32]="LicenseLinkedDataResources.";
	arr1[33]="List";
	arr1[34]="MicroblogEntry";
	arr1[35]="Nary Participation";
	arr1[36]="NegativePropertyAssertions";
	arr1[37]="Normalization";
	arr1[38]="Objectrole";
	arr1[39]="Observation";
	arr1[40]="OOPMetrics";
	arr1[41]="ParticipantRole";
	arr1[42]="Partition.";
	arr1[43]="Persons";
	arr1[44]="Price";
	arr1[45]="PrivacyPolicyPersonalData";
	arr1[46]="Professor";
	arr1[47]="Provenance";
	arr1[48]="RelativeRelationship";
	arr1[49]="ReportingEvent.";
	arr1[50]="Roles (OWL 2)";
	arr1[51]="Role task.";
	arr1[52]="Set";
	arr1[53]="SmartHome";
	arr1[54]="Social Reality (OWL 2).";
	arr1[55]="SpeciesConservation";
	arr1[56]="Summarization of an inverse n-ary relation.";
	arr1[57]="Symmetric n-ary relationship";
	arr1[58]="Topic.";
	arr1[59]="Trajectory.";
	arr1[60]="Transition.";
	arr1[61]="TransportPattern.";
	arr1[62]="Tree Pattern.";
	arr1[63]="Union.";
	arr1[64]="View Inheritance.";
	
}
	public List<String> findsimilarity(String st) {
		List<Double>ls=new ArrayList<Double>();
		List<String>ls1=new ArrayList<String>();
		List<String>ls2=new ArrayList<String>();
		StringEqualityPercentCheckUsingJaroWinklerDistance c=new StringEqualityPercentCheckUsingJaroWinklerDistance();
		for(int i=0;i<65;i++) {
			double d=c.similarity(st, arr[i]);
			ls.add(d);
			ls1.add(arr1[i]);
			
		}
		for(int j=0;j<ls.size()-1;j++) {
			for (int i=0;i<ls.size()-j-1;i++) {
    		
				if(ls.get(i)<ls.get(i+1)) {
					Collections.swap(ls,i,i+1);
					Collections.swap(ls1,i,i+1);
    			
    		}
    	}
		}
    	for (int i=0;i<5;i++) {
    		
    		
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
		d.findsimilarity(st);
		
	}
}
