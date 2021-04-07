package edu.stanford.bmir.protege.examples.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class odpelements {
	public String arr[]={"actsfor","actsthrough","Agent"};
	public String arr1[]= {"Action ","Action_status","has_status","is_consequence_of","is_dependent_on","Suspension","has_suspension","Performance_duration","is_duration_of","Implemented_action","is_suspension_of","plan_composed_of","Proposed_action","is_status_of","Abandoned_action","Completed_action","has_duration","action_proposed_in","has_direct_consequence","is_direct_consequence_of","is_directly_dependent_on","has_direct_dependent","has_dependent"};
	public String arr2[]= {"Activity"};
	public String basicplan3[]= {"conceptualizes","executesTask","isConceptualizedBy","isExecutedIn","isParametrizedBy","isSatisfiedBy","parametrizes","satisfies","GoalSituation"};
	public String arr4[]= {"FeatureOfInterest","Quality","affectedBy","belongsTo"};
	public String arr5[]= {"Agent"};
	public String arr6[]= {"hasAircraft","Airline","Aircraft"};
	public String arr7[]= {"Algorithm","InformationEntity","Implementation","Execution","Process","ParameterSetting","Task","TimeInterval","Parameter","Input","Output","Top"};
	public String arr8[]= {"AquaticSpecies","AquaticResource","WaterArea","hasSpecies","hasWaterArea","isSpeciesPresentIn","isWaterAreaOf"};
	public String arr9[]= {"Item","itemContent","Bag","itemOf","hasItem","size"};
	public String arr10[]= {"family","group","species","order","includesOrder","includesFamily","includesSpecies"};
	public String arr11[]= {"countryOfRecord","fishingAreaOfRecord","forCountry","fromFishingArea","hasCatchRecord","isCatchRecordFor","unitUsedInRecord","withUnit","CatchRecord","referenceYear","amount","reportingYear","Country","UnitOfMeasure"};
	public String arr12[]= {"Chess","hasmadehalfmove","hasmadequartermove"};
	public String arr13[]= {"Concept","Entity","classifies","is classified"};
	public String arr14[]={"ClimaticZone","AquaticResource","AquaticResourceObservation","hasResource","hasClimaticZone","isClimaticZoneOf","isResourceOf","hasReferenceYear"};
	public String arr15[]= {"hasMember","isMemberOf","Collection"};
	public String arr16[]= {"isCompatibleWith","requiresHardware","requiresSoftware","usesDriver","usesHardware","usesOperatingSystem","usesSoftware","Computer","Driver","Hardware","OperatingSystem","Software"};
	public String arr17[]= {"hasName","hasNumber","hasFirstName","hasLastName"};
	public String arr18[]= {"Criterion"};
	public String arr19[]= {"actsFor","actsThrough","introduces","isIntroducedBy","NaturalPerson","Person","SocialPerson"};
	public String arr20[]= {"hasCurrency","hasPrice","isPriceOf","hasValue","Currency","Price"};
	public String arr21[]= {"Process","PersonalData","LawfulbasisforProcessing","DataSharingstep","Duration","DataCollectionStep","CollectionMechanism","Agent","sharesData","hasDuration","haslegalbasis","hasCollectionMechanism"};
	public String arr22[]= {"Professor","University","Faculty"};
	public String arr23[]= {"Agent","ProvenanceActivity","EntitywithProvenance"};
	public String arr24[]= {"Relationship","RelativeExistence","Entity","hasAttribute","hasScope"};
	public String arr25[]= {"EventReporter","ReportingEvent","ActualEvent","hasAuthor","hasContext"};
	public String arr26[]= {"Set","size "};
	public String arr27[]= {"Home","SmartHome","AirCondition","AirCondition"};
	public String arr28[]= {"AquaticSpecies","hasConservationStatus"};
	public String arr29[]= {"Action","executesTask","isExecutedIn"};
	public String arr30[]= {"TimeIndexedClassification"};
	public String arr31[]= {"Person","TimeIndexedPersonRole"};
	public String arr32[]= {"Time Interval","has interval date","has interval start date","has interval end date"};
	public String arr33[]= {"TimePeriod","TimePeriodMeasurementUnit","hasTimePeriodMeasurementUnit"};
	public String arr34[]= {"farTopicFrom","hasCoreConcept","hasSubTopic","hasTopic","isCoreConceptFor","isSubTopicOf","isTopicOf","nearTopicTo","overlappingTopic ","Concept","Topic"};
	public String arr35[]= {"atPlace","atTime","endsAt","hasAttribute","hasFix","hasSegment","hasTrajectory","nextFix","startsFrom","traversedBy","Attribute","EndingFix","Fix","MovingObject","Place","Segment","StartingFix","TimeEntity","Trajectory"};
	public String vesselspecies[]= {"isCaughtBy","catchesSpecies","isCaughtByVesselType"};
	public String arr37[]= {"hasEventAtTime","hasFinalStateAtTime","hasInitialStateAtTime","includesFinalSituation","includesInitialSituation","includesProcess","isFinalSituationIncludedIn","isInitialSituationIncludedIn","isProcessIncludedIn","isTimeOf","occursAt","Process","Transition"};
	public String arr38[]= {"partOf","referenceFrame","transportEvent","transportEntity"};
	List<String[]> myList = new ArrayList<String[]>();
	public String name[]= {"ActingFor","Action","ActivitySpecification","BasicPlan","AffectedBy","Agent","Airline","Algorithm","AquaticResources","Bag","BiologicalEntities","CatchRecord","Chess","Classification","ClimaticZone","Collection","ComputerSystem","Course","Criterion","Persons","Price","PrivacyPolicyPersonalData","Professor","Provenance","RelativeRelationship","Reporting","Set","SmartHome","SpeciesConservation","TaskExecution","TimeIndexedClassification","TimeIndexedPersonRole","TimeInterval","TimePeriod","Topic","Trajectory","VesselSpecies","Transition","Transport"};
	

	
	odpelements(){
		myList.add(arr);
		myList.add(arr1);
		myList.add(arr2);
		myList.add(basicplan3);
		myList.add(arr4);
		myList.add(arr5);
		myList.add(arr6);
		myList.add(arr7);
		myList.add(arr8);
		myList.add(arr9);
		myList.add(arr10);
		myList.add(arr11);
		myList.add(arr12);
		myList.add(arr13);
		myList.add(arr14);
		myList.add(arr15);
		myList.add(arr16);
		myList.add(arr17);
		myList.add(arr18);
		myList.add(arr19);
		myList.add(arr20);
		myList.add(arr21);
		myList.add(arr22);
		myList.add(arr23);
		myList.add(arr24);
		myList.add(arr25);
		myList.add(arr26);
		myList.add(arr27);
		myList.add(arr28);
		myList.add(arr29);
		myList.add(arr30);
		myList.add(arr31);
		myList.add(arr32);
		myList.add(arr33);
		myList.add(arr34);
		myList.add(arr35);
		myList.add(vesselspecies);
		myList.add(arr37);
		myList.add(arr38);
		

}
	public List<Double> findsimilarity(String st[]) {
		List<Double>counts=new ArrayList<>();
		int count=0;
		int count1=0;
		List<Double>ls=new ArrayList<Double>();
		List<String>ls1=new ArrayList<String>();
		List<String>ls2=new ArrayList<String>();
		StringEqualityPercentCheckUsingJaroWinklerDistance c=new StringEqualityPercentCheckUsingJaroWinklerDistance();
		for(int i=0;i<myList.size();i++) {
			count=0;
			count1=0;
			for(int j=0;j<myList.get(i).length;j++) {
				for(int k=0;k<st.length;k++) {
					if((myList.get(i))[j].equalsIgnoreCase(st[k])) {
						count=count+25;
					}
					else {
					double d=c.similarity((myList.get(i))[j], st[k]);
					
				if(d>=0.85) {
					count1++;
				}
					}
			
			
		}
				
			}
			double e=(count)/((myList.get(i).length*st.length));
			//System.out.println(myList.get(i)+" "+e);
			counts.add(e);
			
		}
		System.out.println(name.length);
		for(int i=0;i<name.length;i++) {
				
				ls2.add(name[i]);
				System.out.println(name[i]+counts.get(i));
			
		}
	
		
	
		return counts;
    	}
		
    	

    	
    
		
		
	
	public static void main(String args[]) {
		odpelements d=new odpelements();
		Scanner sc=new Scanner(System.in);
		//System.out.print("Enter description for ontology");
		
		String st[]= {"Chess","Catch","Person","Bird","Animal","Sports"};
		d.findsimilarity(st);
		
		
	}
}
