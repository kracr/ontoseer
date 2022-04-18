package edu.stanford.bmir.protege.examples.view;
import java.io.*;
import java.util.*;

import org.semanticweb.owlapi.model.OWLClass;


public class odpdescription {
	public String arr[]=new String[200];
	public String arr1[]=new String[200];
	public String IRI[]=new String[200];
	List<String>ls5;
	List<Double>ls;
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
	arr[32]="To represent time intervals.";
	arr[33]="To represent time periods between events.";
	arr[36]="To provide a direct relation between aquatic species and vessels that are able to catch them, regardless of the fishing gear used.";
	arr[39]="To represent recurrent event series as situations and collections of consecutive events, with a regular time period between events and unifying factors.";
	arr[40]="To model dynamic situations, tracking agents and actions they produce, events that are results of some action(s), and consequences as new actions, i.e. reactions";
	arr[41]="To represent mappings between FSDAS application ontology network, and RTMS ontologies";
	arr[42]="The Pollution ontology design pattern (ODP) intends to model the pollution, the pollutants and their observations at various spatio-temporal points. It also captures the information about the various direct and indirect sources of pollution.";
	arr[43]="The pattern intends to model policies, their characteristics and their associated entities, such as processes and agents";
	arr[44]="Used for condition planning.";
	arr[45]="To talk about places of things.";
	arr[46]="To describe invoices with the PharmaInnova Model. This schema can be applied to other invoice models.";
	arr[47]="The goal of this pattern is to represent non-convex intervals where the duration of each internal interval and the duration of the gaps between intervals are constant. These intervals are called periodic intervals within the context of this pattern.";
	arr[48]="To represent participation of an object in an event. ";
	arr[49]="To represent participants in events holding specific roles in that particular event.";
	arr[50]="To represents entities and their parts.";
	arr[51]="To represent parameters to be used for a certain concept.";
	arr[52]="The intent of this pattern is to represent observations of things, under a set of parameters. Common parameters may be the time and place of the observation, but may be any feature that is observed concerning the specific thing being observed.";
	arr[53]="To represents objects and the roles they play.";
	arr[54]="An object can have different states for which different restrictions apply. The goal of the pattern is to allow modelling the different states of an object and the restrictions on such object for its different states.";
	arr[55]="To represent software metrics especially for the purpose of detecting design-flaws in software systems based on these metrics. This is useful for re-engineering the software system., De a reprezenta metricile soft in special in scopul detectarii defectelor de proiectare din sistemele soft pe baza acestor metrici. Acest lucru este folositor pentru reingineria sistemului soft.";
	arr[56]="Music Notes";
	arr[57]="News Reporting";
	arr[58]="To represent events with their participants, time, space, etc.";
	arr[59]="This content ODP models the acoustic features of a music note played in a performance.";
	arr[60]="Movement";
	arr[61]="Provide a core pattern for capturing information related to microblog entries or social media (e.g. twitter, instagram, facebook, linkedIn, etc.)";
	arr[62]="Material Property. To capture the provenance an assertion about a material's properties as well as capture the particulars of the property itself.";
	arr[63]="Material transformation. To contextualize the transformation process from raw components and the required equipment to a final manufactured artifact";
	arr[64]="Map of geographical location.";
	arr[65]="Literal for RDF";
	arr[66]="Representation of ordered collection";
	arr[67]="Taxonomy";
	arr[68]="Life Cycle Assessment (LCA) studies the environmental impact of products taking into account their entire life-span and production chain. This ontology design pattern specifies key aspects of LCA/LCI data models, namely the notions of flows, activities, agents, and products, as well as their properties";
	arr[69]="To represent the core attributes of an invoice";
	arr[70]="To represent the meaning of an information object: the concepts it expresses, the things it is about.";
	arr[71]="Object Representation";
	arr[72]="To represent information objects and their physical realization.";
	arr[73]="The ontology's intent is to describe a historical map and its attributes.";
	arr[74]="To model hazardous situations and their associated hazardous events with events' participating objects and the hazards the objects are exposed to with the exposure value.";
	arr[75]="Ontology pattern to model concepts related to human gesture interactions.";
	arr[76]="To represent gear types in terms of the water areas where they can be employed to collect aquatic resources";
	arr[77]="The purpose of this pattern is to provide a broader context for criteria modeling. Possible specializations could introduce new kinds of criteria setters representing criteria in detailed contexts (for example: a pattern for describing the success/failure condition for some actions). Possible criteria setters may include requirements, recommendations, constraints etc.";
	arr[78]="To represent types of fishing gear with regard to the types of vessel they can be mounted on";
	arr[79]="To represent types of fishing gear with respect to the aquatic species they either are targeted to catch or can accidentally catch";
	arr[80]="To represent types of gene-related entities and their parts.";
	arr[81]="To represent the epistemological \"missing link\" between a cognitive activity, e.g. the interaction with a cultural object, and any evidence of the effects this activity has on the individuals that are engaged with it; what can collectively be considered as an experience.";
	arr[82]="Describing the process and components of an explanation in different disciplines.";
	arr[83]="Part whole membership.";
	arr[84]="To represent a tagging situation, in which someone uses a term, from a list of a folksonomy, to tag something (or the content of something). We might also want to represent the time and the polarity of the tagging.";
	arr[85]= "To identify and categorize the most general types of things in the domain of discourse.";
	arr[86]= "The intent of the pattern is to be able to represent vertical distribution for aquatic resources.";
	arr[87]= "To represent a direct relation between vessel types and water areas regardless of what type of fishing gear is fitted";
	arr[88]= "To represent time indexed situations.";
	arr[89]= "To represent objects that have temporary parts.";
	arr[90]= "To represent participants in events at some time,To represent participants in parts of events.";
	arr[91]= "The remit of the SEP content pattern is to represent the relation between standards and the processes, operations, activities and services that enforce them, the domains they cater to and the scope of that specific process, operation, activity, service within the context of the domain.";
	arr[92]= "To express the terminological variants and the conceptual similarity that can be sources of confusion between species.";
	arr[93]= "To represent species together with their typical environment in terms of habitat and water area";
	arr[94]= "The pattern intends to model the situation that a certain species feed upon other species and that some species are preyed upon by a certain species.";
	arr[95]= "To represent species together with their typical environment in terms of bathymetric range and water area";
	arr[96]= "This pattern aims at representing the habitat and bathymetric features that are typical for an aquatic species, in the context of a given water area.";
	arr[97]= "This pattern models a spatiotemporal extent, i.e., a combination of spatial and temporal extent as a set of generalized trajectories which cannot have temporal overlap. This pattern reuses semantic trajectory pattern as component.";
	arr[98]= "To answer the modern, interdisciplinary questions asked within the Building domain, industry tools and data standards need to become far more interoperable in order to be able to provide a full and accurate set of analysis to engineers and designers. To provide this full picture from which to make decisions, we needed a way to resolve the spatial data that tools provide in order to synthesize it together. In addition to missing, incorrect, and inconsistent information, there is also the challenge of not being able to use existing spatial patterns to capture the full granularity or specificity of the geospatial descriptions required to capture full and dynamic geometric contexts.";
	arr[99]= "Capture Searle's theory on observer relative and institutional facts, used in creating social reality. See also the OWL 2 Agent-Role pattern.";
	arr[100]= "This pattern allows us to represent a temporal distance between two timestamps within an observation process in a SmartHome. There are other situations where we need to measure the interval (temporal distance) in the form of time steps regardless of the exact dates indicating the boundaries of the interval.";
	arr[101]= "Smart Home Situation";
	arr[102]= "Smart Home Sensing";
	arr[103]= "Smart Home Property";
	arr[104]= "	To represent a SmartHome as a place (specialization of http://www.ontologydesignpatterns.org/ont/dul/DUL.owl#PhysicalPlace) which contains a number of sections (other physical places) and is also seen as a platform (e.g. a platform for a sensor network).";
	arr[105]= "Smart Home Object";
	arr[106]= "	This pattern relies on both the SSN ontology and DUL in order to represent sensors and other techniqually needed objects to deploy a network in a smart home environment.";
	arr[107]= "To represent geospatial relations between objects.";
	arr[108]= "	To represent the specific feature (property) of a certain object that is observed (measured) by a sensing process. Since an object can have many features, it is not enough to point at the object itself, but one also need to specify the property that is in focus.";
	arr[109]= "This pattern is used to represent events in the context of smart environments. An event in this pattern is represented in the form of either a Manifestation or a Complex Event, where a manifestation represents the occurrence of a specific situation of an object which can be directly captured from sensor data (\"the TV is switched on\"), whereas a complex event is defined based on its preconditions that can involve different events (e.g., \"watching TV\" happens when \"the TV is switched on\" and \"someone is sitting on the couch\").";
	arr[110]= "	It is a simplified version of the ontology \"ontopic\". It is used when we want to talk about the topics of a documents and their relationships.";
	arr[111]= "To represent contexts or situations, and the things that are contextualized.";
	arr[112]="The goal of this pattern is to represent objects that can be simple or aggregated (that is, several objects gathered in another object acting as a whole)";		
	arr[113]="To represent sequence schemas. It defines the notion of transitive and intransitive precedence and their inverses.";	
	arr[114]="The pattern can be used for modelling situations in which we are not certain that a particular actual event has the properties which were described in a news message. We want to define the properties of an actual event which were reported (time, place, actors, subevents, cause, effect etc.), but not to treat them as universal, verified knowledge. ";	
	arr[115]="For dynamically conceptualizing, establishing, tracking, and updating relative relationships and dependencies between entities (real or representational) of a physical, temporal, and/or importance scope.";	
	arr[116]="To represent and reason on values of attributes of things, by explicitly talking about the dimensions (\"regions\") of the attributes, which include those values.";	
	arr[117]="To represent recurrent situation series as situations and collections of consecutive situations, with a regular time period between situations and unifying factors.";	
	arr[118]="The intent of the pattern is to be able to represent observations of aquatic resources, where the observations have been made a certain year and has certain other parameters.";	
	arr[119]="The intent of the pattern is to be able to represent observations of aquatic resources, where the observations have been made a certain year and has certain other parameters.";	
	arr[120]="To represent the assignment of tasks to roles";	
	arr[121]="This content ODP formalises the structure and the hierarchies of a music score/symbolic representation system.";	
	arr[122]="This ODP intents to model the relationship between an Actuator and the Effect it has on its environment through Actuations. It structures an Actuator ontology :";	
	arr[123]="To represent the model for supporting the action selection mechanism.";	
	arr[124]="To incorporate the general two perspectives of activities: a workflow perspective, which are often observed in planning-related applications, and a spatiotemporal perspective, which are often found in geographic activity analysis.";	
	arr[125]="The pattern intends to model the domain of born digital archives.";	
	arr[126]="This file defines an ontology design pattern for City \"Resident.” Why is the development a Resident pattern important for the development of a city data on-tology?";	
	arr[127]="To represent two objects that both participate in a same event.";	
	arr[128]="To represent collections, and their entities, i.e. to represent membership.";	
	arr[129]="To model communication events, such as phone calls, e-mails and meetings, their involved parties and the roles and relations of the parties in the context of the communication events.";	
	arr[130]="To represent core constituents found commonly in complaints across domains.";	
	arr[131]="To represent (non-transitively) that objects either are proper parts of other objects, or have proper parts";	
	arr[132]="The pattern is intended to support comparison and reproducibility of computational analyses.";	
	arr[133]="This CP allows designers to represent concept group defined by intention (all concepts satisfying group membership condition) or by extension (all concepts referring a group).";	
	arr[134]="This CP allows designers to represent jointly conceptual and linguistic part of a vocabulary.";	
	arr[135]="To represent the constituents of a layered structure.";	
	arr[136]="To represent control flows: activation, branching, decisions, concurrency, etc.";	
	arr[137]="Data Transformation Pattern";	
	arr[138]="To formally represent a conceptualization or a descriptive context.";	
	arr[139]="This pattern allows one to range the conceptualization of a descriptive context within specific borders defined by means of literal values.";
	arr[140]="Description and Situation";
	arr[141]="This pattern represent schematic model for high-energy physics experiment data.";
	arr[142]="The pattern intends to model digital video files, their components and other associated entities, such as codecs and containers";
	arr[143]="This pattern allow the representation of non-probabilistic dispositions with unique triggering and realization process types.";
	arr[144]="To represent the encyclopedic knowledge expressed by an object typed as EthnicGroup";
	arr[145]="The purpose of this pattern is to provide a minimalistic model of event where it is not always possible to separate its spatial and the temporal aspects, thus can model events that move or possess discontinuous temporal extent. Events according to this model has at least one participant, attached via a participant-role, and may have additional descriptive information through its information object.";
	arr[146]="To model event objects (in the context of complex event processing), their attributes, and their relations actual events, and sensor readings producing the events. Different types of event objects, such as complex, composite, and simple events are modelled, preoperties for expressing relations between event objects, such as constituency and componency are expressed, and attributes of event objects, such as timestamps and other data values.";
																											
	
	
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
	arr1[11]="CatchRecord";
	arr1[12]="Chess";
	arr1[13]="Classification";
	arr1[14]="ClimaticZone";
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
	arr1[39]="RecurrentEventSeries";
	arr1[40]="Reaction";
	arr1[41]="RTMSMapping";
	arr1[42]="Pollution";
	arr1[43]="Policy";
	arr1[44]="PlanConditions";
	arr1[45]="Place";
	arr1[46]="PharmaInova";
	arr1[47]="PeriodicInterval";
	arr1[48]="Participation";
	arr1[49]="ParticipantRole";
	arr1[50]="Partof";
	arr1[51]="Parameter";
	arr1[52]="Observation";
	arr1[53]="ObjectRole";
	arr1[54]="Object_with_States";
	arr1[55]="OOPMetrics";
	arr1[56]="NotePattern";
	arr1[57]="NewsReportingEvent";
	arr1[58]="NaryParticipation";
	arr1[59]="Musicalobject";
	arr1[60]="Move";
	arr1[61]="MicroBlogEntry";
	arr1[62]="MaterialProperty";
	arr1[63]="MaterialTransformation";
	arr1[64]="MapLegendOntology";
	arr1[65]="Literal Reification pattern";
	arr1[66]="List";
	arr1[67]="LinnaeanTaxonomy";
	arr1[68]="LCA Pattern";
	arr1[69]="Invoice";
	arr1[70]="IntensionExtension";
	arr1[71]="InformationObjectsAndRepresentationLanguages";
	arr1[72]="Information realization";
	arr1[73]="HistoricalMap";
	arr1[74]="HazardousSituation";
	arr1[75]="Gesture Interaction";
	arr1[76]="GearWaterArea";
	arr1[77]="CriterionSetter";
	arr1[78]="GearVessel";
	arr1[79]="GearSpecies";
	arr1[80]="Go Top";
	arr1[81]="Experience & Observation";
	arr1[82]="ExplanationODP";
	arr1[83]="WinstonPartWhole";
	arr1[84]="Tagging";
	arr1[85]="Types of entities";
	arr1[86]="VerticalDistribution";
	arr1[87]="VesselWaterArea";
	arr1[88]="TimeIndexedSituation";
	arr1[89]="TimeIndexedPartOf";
	arr1[90]="Time indexed participation";
	arr1[91]="Standard Enforcer Pattern";
	arr1[92]="SpeciesNames";
	arr1[93]="SpeciesHabitat";
	arr1[94]="SpeciesEat";
	arr1[95]="SpeciesBathymetry";
	arr1[96]="SpeciesConditions";
	arr1[97]="SpatioTemporalExtent";
	arr1[98]="Spatial Graph Adapter (SGA)";
	arr1[99]="Social Reality";
	arr1[100]="SmartHome TimeInterval";
	arr1[101]="SmartHome Situation";
	arr1[102]="SmartHome Sensing";
	arr1[103]="SmartHome Property";
	arr1[104]="SmartHome Place";
	arr1[105]="SmartHome Object";
	arr1[106]="SmartHome Network";
	arr1[107]="SmartHome Geometry";
	arr1[108]="SmartHome FeatureOfInterest";
	arr1[109]="SmartHome Event";
	arr1[110]="SimpleTopic";
	arr1[111]="Situation";
	arr1[112]="SimpleOrAggregated ";
	arr1[113]="Sequence";
	arr1[114]="NewsReportingEvent";
	arr1[115]="RelativeRelationship";
	arr1[116]="Region";
	arr1[117]="RecurrentSituationSeries";
	arr1[118]="ResourceAbundanceObservation";
	arr1[119]="ResourceExploitationObservation";
	arr1[120]="RoleTask";
	arr1[121]="ScorePart";
	arr1[122]="Actuation-Actuator-Effect";
	arr1[123]="Affordance";
	arr1[124]="Activity";
	arr1[125]="Born Digital Archives";
	arr1[126]="City Resident Pattern";
	arr1[127]="Co-participation";
	arr1[128]="CollectionEntity";
	arr1[129]="CommunicationEvent";
	arr1[130]="Complaint Ontology Pattern";
	arr1[131]="Componency";
	arr1[132]="ComputationalEnvironment";
	arr1[133]="ConceptGroup";
	arr1[134]="ConceptTerms";
	arr1[135]="Constituency";
	arr1[136]="Controlflow";
	arr1[137]="DataTransformationPattern";
	arr1[138]="Description";
	arr1[139]="Description in Range";
	arr1[140]="DescriptionAndSituation";
	arr1[141]="DetectorFinalState";
	arr1[142]="DigitalVideo";
	arr1[143]="Disposition";
	arr1[144]="EthnicGroup";
	arr1[145]="EventCore";
	arr1[146]="EventProcessing";
	
	
	
	
	
	
	
	
	
	
	
	
	IRI[0]="http://www.ontologydesignpatterns.org/cp/owl/actingfor.owl";
	IRI[1]="http://www.ontology.se/odp/content/owl/Action.owl";
	IRI[2]="http://ontology.eil.utoronto.ca/icity/ActivitySpecification";
	IRI[4]="https://w3id.org/affectedBy";
	IRI[5]="http://www.ontologydesignpatterns.org/cp/owl/agentrole.owl";
	IRI[6]="http://ontologydesignpatterns.org/ekp/Airline.owl";
	IRI[7]="https://github.com/ML-Schema/core/blob/master/AlgorithmImplementationExecution.owl";
	IRI[8]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/aquaticresources.owl";
	IRI[9]="http://www.ontologydesignpatterns.org/cp/owl/bag.owl";
	IRI[3]="http://www.ontologydesignpatterns.org/cp/owl/basicplan.owl";
	IRI[10]="http://www.fao.org/aims/aos/fi/species_v1.0_model.owl";
	IRI[11]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/catchrecord.owl";
	IRI[12]="http://krisnadhi.github.io/onto/chesspattern.owl";
	IRI[13]="http://www.ontologydesignpatterns.org/cp/owl/classification.owl";
	IRI[14]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/climaticzone.owl";
	IRI[15]="http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl";
	IRI[16]="http://mklab.iti.gr/pericles/ComputerSystem_ODP.owl";
	IRI[17]="http://www.cs.kent.edu/~malzyoud/ODPs/Course.ow.htm";
	IRI[18]="http://criteria-modeling.googlecode.com/svn/trunk/criterion.owl";
	IRI[19]="http://www.ontologydesignpatterns.org/cp/owl/persons.owl";
	IRI[20]="http://www.ontologydesignpatterns.org/cp/owl/price.owl";
	IRI[21]="http://openscience.adaptcentre.ie/ontologies/privacypolicy.owl";
	IRI[22]="http://www.cs.kent.edu/~malzyoud/ODPs/Professsor.htm";
	IRI[23]="https://raw.githubusercontent.com/cogan-shimizu-wsu/ProvenanceOWL/master/EntityWithProvenanceOntologyPattern.owl ";
	IRI[24]="https://curate.nd.edu/downloads/9p29086355b";
	IRI[25]="http://semantic.cs.put.poznan.pl/ontologies/reportingevent.owl";
	IRI[26]="http://www.ontologydesignpatterns.org/cp/owl/set.owl";
	IRI[27]="https://w3id.org/smartenvironment/smartenv.owl";
	IRI[28]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/speciesconservation.owl";
	IRI[29]="http://www.ontologydesignpatterns.org/cp/owl/taskexecution.owl";
	IRI[30]="http://www.ontologydesignpatterns.org/cp/owl/timeindexedclassification.owl";
	IRI[31]="http://www.ontologydesignpatterns.org/cp/owl/timeindexedpersonrole.owl";
	IRI[32]="http://www.ontologydesignpatterns.org/cp/owl/timeinterval.owl";
	IRI[33]="http://www.ontologydesignpatterns.org/cp/owl/timeperiod.owl";
	IRI[34]="http://ontologydesignpatterns.org/cp/owl/topic.owl";
	IRI[35]="http://krisnadhi.github.io/onto/trajectory.owl";
	IRI[36]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/vesselspecies.owl ";
	IRI[37]="http://ontologydesignpatterns.org/cp/owl/transition.owl";
	IRI[38]="https://wiki.auckland.ac.nz/download/attachments/52016791/TransportPattern.owl";
	IRI[39]="http://www.ontologydesignpatterns.org/cp/owl/recurrenteventseries.owl";
	IRI[40]="http://www.ontologydesignpatterns.org/cp/owl/reaction.owl";
	IRI[41]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/rtmsmapping.owl";
	IRI[42]="";
	IRI[43]="http://mklab.iti.gr/pericles/Policy_ODP.owl";
	IRI[44]="http://www.ontologydesignpatterns.org/cp/owl/planconditions.owl";
	IRI[45]="http://www.ontologydesignpatterns.org/cp/owl/place.owl";
	IRI[46]="http://www.isoco.com/ontologies/neon/PharmaInnovaODP.owl";
	IRI[47]="http://delicias.dia.fi.upm.es/ontologies/PeriodicInterval.owl";
	IRI[48]="http://ontologydesignpatterns.org/cp/owl/participation.owl";
	IRI[49]="http://www.ontology.se/odp/content/owl/ParticipantRole.owl";
	IRI[50]="http://www.ontologydesignpatterns.org/cp/owl/partof.owl ";
	IRI[51]="http://ontologydesignpatterns.org/cp/owl/parameter.owl";
	IRI[52]="http://www.ontologydesignpatterns.org/cp/owl/observation.owl";
	IRI[53]="http://ontologydesignpatterns.org/cp/owl/objectrole.owl";
	IRI[54]="http://delicias.dia.fi.upm.es/ontologies/ObjectWithStates.owl";
	IRI[55]="http://www.cs.ubbcluj.ro/~ivpop/ontologies/oopmetrics.owl";
	IRI[56]="http://ontologydesignpatterns.org/cp/owl/notepattern.owl";
	IRI[57]="http://semantic.cs.put.poznan.pl/ontologies/newsreportingevent.owl";
	IRI[58]="http://www.ontologydesignpatterns.org/cp/owl/naryparticipation.owl";
	IRI[59]="https://purl.org/andreapoltronieri/musicalobject";
	IRI[60]="http://www.ontologydesignpatterns.org/cp/owl/move.owl";
	IRI[61]="https://github.com/cogan-shimizu-wsu/MicroblogEntryOWL/blob/master/MicroblogEntry.owl";
	IRI[62]="https://raw.githubusercontent.com/cogan-shimizu-wsu/MaterialsPropertyOwl/master/matl-prop.owl";
	IRI[63]="https://raw.githubusercontent.com/Vocamp/MaterialTransformation/master/owl/MaterialTransformationPattern.owl";
	IRI[64]="http://stko-exp.geog.ucsb.edu/mlo/map_legend_ontology.owl";
	IRI[65]="https://sparontologies.github.io/literal/current/literal.html";
	IRI[66]="http://www.ontologydesignpatterns.org/cp/owl/list.owl";
	IRI[67]="http://www.ontologydesignpatterns.org/cp/owl/linnaeantaxonomy.owl";
	IRI[68]="http://descartes-core.org/ontologies/lca/1.0/LCAPattern.owl";
	IRI[69]="http://www.ontologydesignpatterns.org/cp/owl/invoice.owl";
	IRI[70]="http://ontologydesignpatterns.org/cp/owl/intensionextension.owl";
	IRI[71]="http://www.ontologydesignpatterns.org/cp/owl/informationobjectsandrepresentationlanguages.owl";
	IRI[72]="http://www.ontologydesignpatterns.org/cp/owl/informationrealization.owl";
	IRI[73]="http://gaia.gge.unb.ca/eg/HistoricalMap.owl";
	IRI[74]="http://semantic.cs.put.poznan.pl/ontologies/oshdo/HazardousSituation.owl";
	IRI[75]="https://w3id.org/hdgi/gesture-interaction-pattern";
	IRI[76]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/gearwaterarea.owl";
	IRI[77]="http://criteria-modeling.googlecode.com/svn/trunk/criterion_setter.owl ";
	IRI[78]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/gearvessel.owl";
	IRI[79]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/gearspecies.owl";
	IRI[80]="http://www.ontologydesignpatterns.org/cp/owl/gotop.owl";
	IRI[81]="https://raw.githubusercontent.com/modellingDH/odp_experience/master/owl/cp_experience.owl.rdfxml";
	IRI[82]="https://github.com/kmitd/various";
	IRI[83]="https://raw.githubusercontent.com/cogan-shimizu-wsu/WinstonPartWhole/master/WinstonPartWhole.owl";
	IRI[84]="http://ontologydesignpatterns.org/cp/owl/tagging.owl ";
	IRI[85]="http://www.ontologydesignpatterns.org/cp/owl/typesofentities.owl";
	IRI[86]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/verticaldistribution.owl";
	IRI[87]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/vesselwaterarea.owl";
	IRI[88]="http://ontologydesignpatterns.org/cp/owl/timeindexedsituation.owl ";
	IRI[89]="http://www.ontologydesignpatterns.org/cp/owl/timeindexedpartof.owl ";
	IRI[90]="http://ontologydesignpatterns.org/cp/owl/timeindexedparticipation.owl ";
	IRI[91]="http://windermere.aston.ac.uk/~monika/ontologies/Standards-Enforcer-Pattern.owl";
	IRI[92]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/speciesnames.owl";
	IRI[93]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/specieshabitat.owl";
	IRI[94]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/specieseat.owl";
	IRI[95]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/speciesbathymetry.owl";
	IRI[96]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/speciesconditions.owl";
	IRI[97]="http://krisnadhi.github.io/onto/spatiotemporalextent.owl";
	IRI[98]="https://raw.githubusercontent.com/HollyFerguson/Spatial-Graph-Adapter-Pattern/master/SGA_Protege_OWL.owl ";
	IRI[99]="http://purl.org/net/social-reality";
	IRI[100]="http://ecareathome-ontology.mpi.aass.oru.se/patterns/time.owl ";
	IRI[101]="http://ecareathome-ontology.mpi.aass.oru.se/patterns/SmartHome_Situation.owl ";
	IRI[102]="http://ecareathome-ontology.mpi.aass.oru.se/patterns/SmartHome_Sensing.owl";
	IRI[103]="http://ecareathome-ontology.mpi.aass.oru.se/patterns/SmartHome_Property.owl";
	IRI[104]="http://ecareathome-ontology.mpi.aass.oru.se/patterns/SmartHome_Place.owl";
	IRI[105]="http://ecareathome-ontology.mpi.aass.oru.se/patterns/SmartHome_Object.owl";
	IRI[106]="http://ecareathome-ontology.mpi.aass.oru.se/patterns/SmartHome_Network.owl ";
	IRI[107]="http://ecareathome-ontology.mpi.aass.oru.se/patterns/SmartHome_Geometry.owl ";
	IRI[108]="http://ecareathome-ontology.mpi.aass.oru.se/patterns/SmartHome_FeatureOfInterest.owl";
	IRI[109]="https://w3id.org/smartenvironment/event.owl";
	IRI[110]="http://www.ontologydesignpatterns.org/cp/owl/topic.owl";
	IRI[111]="http://www.ontologydesignpatterns.org/cp/owl/situation.owl";
	IRI[112]="http://delicias.dia.fi.upm.es/ontologies/SimpleOrAggregated.owl ";
	IRI[113]="http://ontologydesignpatterns.org/cp/owl/sequence.owl ";
	IRI[114]="http://semantic.cs.put.poznan.pl/ontologies/newsreportingevent.owl ";
	IRI[115]="https://curate.nd.edu/downloads/9p29086355b";
	IRI[116]="http://ontologydesignpatterns.org/cp/owl/region.owl";
	IRI[117]="http://www.ontologydesignpatterns.org/cp/owl/recurrentsituationseries.owl";
	IRI[118]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/resourceabundanceobservation.owl ";
	IRI[119]="http://www.ontologydesignpatterns.org/cp/owl/fsdas/resourceexploitationobservation.owl ";
	IRI[120]="http://www.ontologydesignpatterns.org/cp/owl/taskrole.owl";
	IRI[121]="http://ontologydesignpatterns.org/cp/owl/scorepart.owl";
	IRI[122]="http://www.irit.fr/recherches/MELODI/ontologies/AAE.owl ";
	IRI[123]="http://www.ontologydesignpatterns.org/ont/mario/affordance.owl ";
	IRI[124]="http://descartes-core.org/ontologies/activities/1.0/ActivityPattern.owl  ";
	IRI[125]="http://mklab.iti.gr/pericles/BornDigitalArchives_ODP.owl";
	IRI[126]="http://ontology.eil.utoronto.ca/cdm/Resident.owl ";
	IRI[127]="http://www.ontologydesignpatterns.org/cp/owl/coparticipation.owl ";
	IRI[128]="http://www.ontologydesignpatterns.org/cp/owl/collectionentity.owl";
	IRI[129]="http://www.ontology.se/odp/content/owl/CommunicationEvent.owl";
	IRI[130]="http://ontoology.linkeddata.es/publish/cop/index-en.html ";
	IRI[131]="http://www.ontologydesignpatterns.org/cp/owl/componency.owl";
	IRI[132]="https://raw.githubusercontent.com/mcheatham/computationalEnvironmentODP/master/docs/ComputationalEnvironment.owl";
	IRI[133]="http://sites.google.com/site/pierreyvesvandenbussche/resources/ConceptGroup.owl";
	IRI[134]="http://sites.google.com/site/pierreyvesvandenbussche/resources/ConceptTerms.owl";
	IRI[135]="http://www.ontologydesignpatterns.org/cp/owl/constituency.owl";
	IRI[136]="http://www.ontologydesignpatterns.org/cp/owl/controlflow.owl ";
	IRI[137]="https://raw.githubusercontent.com/cogan-shimizu-wsu/DataTransformationPattern/master/DataTransformationPattern.owl";
	IRI[138]="http://www.ontologydesignpatterns.org/cp/owl/description.owl";
	IRI[139]="https://w3id.org/food/ontology/dir";
	IRI[140]="http://www.ontologydesignpatterns.org/cp/owl/descriptionandsituation.owl";
	IRI[141]="https://www.dropbox.com/s/uy0bh33wsdzx6bp/dectectorfinalstate.owl?dl=0";
	IRI[142]="http://mklab.iti.gr/pericles/DigitalVideo_ODP.owl";
	IRI[143]="Roehl-jansen_disposition-pattern.owl ";
	IRI[144]="http://ontologydesignpatterns.org/ekp/owl/EthnicGroup.owl ";
	IRI[145]="http://krisnadhi.github.io/onto/event.owl";
	IRI[146]="http://www.ontologydesignpatterns.org/cp/owl/eventprocessing.owl";
	
	
	
	
	ls5=new ArrayList<String>();
	ls=new ArrayList<Double>();
	
	
}
	public List<String> findsimilarity(String st,String sts[]) {
		odpelements e=new odpelements();
		

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
			ls5.add(IRI[i]);
			
		}
		for(int i=0;i<ls.size();i++) {
			ls4.add(ls.get(i)+ls3.get(i));
		}
		for(int j=0;j<ls4.size()-1;j++) {
			for (int i=0;i<ls4.size()-j-1;i++) {
    		
				if(ls4.get(i)<ls4.get(i+1)) {
					Collections.swap(ls4,i,i+1);
					Collections.swap(ls1,i,i+1);
					Collections.swap(ls5,i,i+1);
    			
    		}
    	}
		}
    	for (int i=0;i<7;i++) {
    		
    		
    		System.out.println("Rank "+(i+1)+" ODP is :"+ls.get(i)+" with scores: "+ls1.get(i)+"  IRI:"+ls5.get(i));
    		ls2.add(ls1.get(i));
    	
    }
		return ls2;
		
	}
	public List<String> findsimilarity1(String st,String sts[]){
		odpdescription d=new odpdescription();
		
		System.out.println(ls5.size());
		for (int i=0;i<7;i++) {
		System.out.println(ls5.get(i));
		}
		return ls5;

		
		
	}
	public static void main(String args[]) {
		odpdescription d=new odpdescription();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter description for ontology");
		String st=sc.nextLine();
		
		String sts[]= {"Sports"," News"
				};
		d.findsimilarity(st, sts);
		d.findsimilarity1(st,sts);
		
	}
  

	
}