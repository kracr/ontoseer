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
	public String arr10[]= {"family","group","species","order","includesOrder","includesFamily","includesSpecies","Animal","Fish","Mammals","Reptiles","Birds","Person"};
	public String arr11[]= {"countryOfRecord","fishingAreaOfRecord","forCountry","fromFishingArea","hasCatchRecord","isCatchRecordFor","unitUsedInRecord","withUnit","CatchRecord","referenceYear","amount","reportingYear","Country","UnitOfMeasure","Fish","Fishery"};
	public String arr12[]= {"Chess","hasmadehalfmove","hasmadequartermove"};
	public String arr13[]= {"Concept","Entity","classifies","is classified"};
	public String arr14[]={"ClimaticZone","AquaticResource","AquaticResourceObservation","hasResource","hasClimaticZone","isClimaticZoneOf","isResourceOf","hasReferenceYear"};
	public String arr15[]= {"hasMember","isMemberOf","Collection"};
	public String arr16[]= {"isCompatibleWith","requiresHardware","requiresSoftware","usesDriver","usesHardware","usesOperatingSystem","usesSoftware","Computer","Driver","Hardware","OperatingSystem","Software"};
	public String arr17[]= {"hasName","hasNumber","hasFirstName","hasLastName","taughtBy","takenBy","hasId","Course","Grad-Course","Grad-Student","Instructor","Person","Student","Under-Grad-Course","Under-Grad-Student","hasCourseLevel","teaches","hasLevelStudent"};
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
	public String arr39[]= {"hasImmediateNextEvent","hasNextEvent","hasImmediatePreviousEvent","Event","hasMemberEvent","hasTimePeriod","hasTimePeriodBeforeNextEvent","hasUnifyingFactor","isEventMemberOf","eventNumber","Event","RecurrentEventSeries"};
	public String arr40[]= {"directlyFollows","directlyPrecedes","hasSetting","isSettingFor","hasConsequence","hasNextAction","hasPreviousAction","hasOutcome","Action","Event","Consequence","isRaisedBy","isOutcomeOf","isCoagentWith","Situation","Reaction"};
	public String arr41[]= {"RTMS_Code","hasRTMS_Code"};
	public String arr42[]= {"carriesPollutant","Carrier","Contributor","EndingPoint","NaturalResourcePollution"," NonNaturalResourcePollution","Observation","Pollutant","Pollution","PrescribedStandardForPollutant","StartingPoint","TimeEntity","Trajectory","TrajectoryPoint","TrajectorySegment","hasPrescribedStandard","startsFrom","hasObservation"};	
	public String arr43[]= {"assignedTo","hasAutomationStatus","hasImplementationStatus","hasLanguage","hasPolicyType","hasRequirementLevel","hasStatement","hasSubPolicy","hasValidationProcess","hasVersion","implementedBy","targetsEntity","targetsUsers","AutomationStatus","Descriptor","ImplementationStatus","Language","Policy","PolicyType","Process","RequirementLevel","Statement","Version"};
	public String arr44[]= {"followsPrecondition","hasPostcondition","hasPrecondition","isPostconditionOf","isPostconditionPrecededBy","isPreconditionFollowedBy","isPreconditionOf","precedesPostcondition"};
	public String arr45[]= {"hasLocation","isLocationOf","Place"};
	public String arr46[]= {"Header","Body","Summary","Invoice","has_summary","has_header","has_body"};
	public String arr47[]= {"hasIntervalDurationPerPeriod","hasPeriod","PeriodicInterval"};
	public String arr48[]= {"Participation","Participant","hasParticipant","isParticipantIn","Event","Object"};
	public String arr49[]= {"Role","ParticipantRole","participatingInEvent","objectParticipating","roleOfParticipant","objectIncludedIn","roleIncludedIn","eventIncludedIn"};
	public String arr50[]= {"Entity","hasPart","isPartOf"};
	public String arr51[]= {"hasParameter","isParameterFor","hasParameterDataValue","Concept","Parameter"};
	public String arr52[]= {"hasObservation","hasParameter","isObservationOf","isParameterOf","inDate","Observation","Parameter"};
	public String arr53[]= {"Role","Object"," isRoleOf","hasRole"};	
	public String arr54[]={"hasState","isStateOf","Object","State","StateSet"};
	public String arr55[]= {"hasClass","hasMethod","hasMetric","hasMetricCategory","hasPackage","hasFloatValue","hasIntegerValue","hasLongName","hasName","hasTag","OOPClass","OOPMethod","OOPMetric","OOPMetricCategory","OOPPackage","OOPProject"};	
	public String arr56[]= {"Music","Song","SymbolicNote","Accidental","Position","NotePitch","NoteDuration","NoteDynamic","hasMeasure","hasMeasurePosition","hasMidiPitch","isDefinedByOctave","hasLiteralDynamic","hasMidiVelocity","hasNoteDynamic","isDynamicOf","hasNoteDuration","isDurationOfNote","hasNotePitch","isPitchOf","hasAccidental","isAccidentalOf","hasPosition","isPositionOf"};
	public String arr57[]= {"News","hasPresentationContext","presentedAt","Media","NewsEventReporter","NewsPresentationContext","NewsProvider","NewsReportingEvent","PresentationContext","Reporter","Reporting"};
	public String arr58[]= {"NaryParticipation","participationIncludes","isIncludedInParticipation"};
	public String arr59[]= {"Music","Song","Frequency","FundamentalFrequency","PartialFrequency","MusicalObject","MusicalObjectDuration","SoundIntensity","hasDuration","hasFrequency","hasSoundIntensity","isDurationOf","isFrequencyOf","isSoundIntensityOf","hasAttack","hasDecay","hasDurationInSeconds","hasFrequencyMagnitude","hasIntensityValue","hasRelease","hasSustain"};
	public String arr60[]= {"consistsOf","formsPartOf","moved","movedBy","movedFrom","movedTo","tookPlaceAt","wasDestinationOf","wasOriginOf","witnessed","Move","PhysicalObject","Place"};
	public String arr61[]= {"Social Media","Twitter","Facebook","Instagram","LinkedIn","MicroBlog","MicroBlogSites","Agent","Entity","Media","Location","Topic","Payload","TrustMetric","writtenby","hastimestamp","writtenat","referencestopic","haspayload","presentedon","hasTrustMetric"};
	public String arr62[]= {"Material","MaterialProperty","MaterialPropertywithAssertion","Condition","MaterialPropertyCollection","MaterialPropertyDescriptor","Quantity"};
	public String arr63[]= {"hasCatalyst","hasEmbodiedEnergy","hasEnergyUnit","hasEnergyValue","hasInput","hasOutput","needsEnergy","occursAtTimeInterval","occursInNeighborhood","asLiteral","asNumeric","Catalyst","Energy","EnergyUnit","EnergyValue","MaterialTransformation","MaterialType","Neighborhood","Product","Resource","Material"};
	public String arr64[]= {"Map","Geography","highways","forests","streets","trails","Location","Mountains"};
	public String arr65[]= {"literal","has literal","has same literal value as","is literal of","has literal value","comment","contributor","covers requirements","creator","date","description","has component","has intent","has unit test","is specialization of","label","node id","related cps","scenarios","title"};
	public String arr66[]= {"ListItem","Item","OrderedCollection","List","lastItemOf","hasLastItem","firstItemOf","nextItem","previousItem","hasFirstItem"};
	public String arr67[]= {"Taxonomy","AnimalTaxonomy","PlantTaxonomy","hasDirectHigherRank","hasDirectLowerRank","hasHigherRank","hasLowerRank","Genus","Kingdom","Order","Phylum","Species","Taxon"};
	public String arr68[]= {"hasCompartmen","hasLocation","hasProperty","hasTemporalExtent","isInputOf","isOutputOf","performs","playsRoleOf","Activity","Agent","Compartment","ElementaryFlow","Flow","IntermediateFlow","Location","Product","Property","ReferencedProduct","Time","air","soil","water"};
	public String arr69[]= {"Buying","Context","Currency measure","Grounding","Invoice","Line item","Order","Selling","Transaction amount","buyer transaction","grounding"};
	public String arr70[]= {"expresses","isAbout","isExpressedBy","isReferenceOf","InformationObject","SocialObject"};
	public String arr71[]= {"conceptualizes","formallyRepresents","hasRepresentationLanguage","isConceptualizedBy","isFormallyRepresentedIn","isRepresentationLanguageOf","FormalExpression","FormalLanguage"," IconicLanguage","IconicObject","Language","LinguisticObject","NaturalLanguage"};
	public String arr72[]= {"isRealizedBy","realizes","InformationObject","InformationRealization"};
	public String arr73[]= {"PrimeMeridian","MapMathematicalElement","Scale","ReferenceSystem","Projection","Orientation","MathematicalNote","Collection","HistoricalMap","includes","hasCurrentOwner","Collector","Actor","MapElement","Title","Technique","Subject","SpatialCoverage","Language","Dimension","Note","Material","MapDescriptiveElement","SpatialObject","Creator","created","Cartographer","Publisher","designed","published","isPublishedBy","hasOrientation","hasLanguage","hasProjection","isCreatedBy","hasTitle","hasReferenceSystem","hasSubject","isMadeBy","isPartOf","hasScale","hasNote","hasDimension","hasMathematicalNote","hasPrimeMeridian","isDesignedBy","isMadeOf","isCurrentOwnerOf","hasDateOfPublication","MyProperties","isPublishedAt","isMathematicalNoteOf","isEditedBy","edited","isLanguageOf","isOrientationOf","hasDateOfEdition","isDepictedIn","depicts","hasPlaceOfPublication","hasDateOfCreation","hasColor","type","copy","numberOfSheets","date"};
	public String arr74[]= {"casuallyFollows","exposedTo","Hazard","Object","Cause","Consequence","HazardousEvent","hasDuration","participantIn","hasParticipant","TimeInterval","HazardousSituation","Event","involves"};
	public String arr75[]= {"Gesture","Human","Movement","BodyPart","Pose","Affordance","Device","uses","Activity","performs","includesgesture","supportsgesture","hasmovement","hasEndPose","hasStartPose"};
	public String arr76[]= {"GearType"," WaterArea","isUsedInWaterArea","isSuitableForGearType","Fishery"};
	public String arr77[]= {"Criterion","Criterion Setter","criterion set by","has valididty for","sets criterion","is applied in case of","is criterion of use for","is determined by"};
	public String arr78[]= {"Fishery","VesselType","GearType","usesGearType","usedByVesselType"};
	public String arr79[]= {"Fishery","AquaticSpecies","GearType","incidentallyCatchesSpecies","targetsSpecies","isCaughtByGearType","isCaughtBy","catchesSpecies"};
	public String arr80[]= {"Gene","Cellular component","Molecular function","Biological process","partOf","Gene Ontology"};
	public String arr81[]= {"Engagement","Observation","inActivity","isReflectionOn","isReflectedUponIn","isEngagedIn","hasEngagement","producedObservation","includes"};
	public String arr82[]= {"Explanantion","Situation","Agent","Theory","Event","hasCondition","isBasedOn","hasExplanans","hasExplanandum","hasSituation"};
	public String arr83[]= {"po-component","po-feature","po-member","po-place","po-portion","po-stuff"};
	public String arr84[]= {"Tagging","byAgent","isTagUsedIn","isTaggingAgentIn","usingTag"};
	public String arr85[]= {"Abstract","Event","Object","Quality"};
	public String arr86[]= {"hasResource","hasVerticalDistribution","isResourceOf","isVerticalDistributionOf","hasReferenceYear","AquaticResource","AquaticResourceObservation","VerticalDistribution"};
	public String arr87[]= {"VesselType","WaterArea","canCrossWaterArea","canBeCrossedByVesselType"};
	public String arr88[]= {"atTime","forEntity","hasTimeIndexedSetting","isTimeIndexFor","TimeIndexedSituation"};
	public String arr89[]= {"Object","Time Indexed Part Of","at time","is time of","includes whole object","is whole object of","includes part object","is part object of"};
	public String arr90[]= {"Time indexed participation","includesEvent","includesObject","isEventIncludedIn","isObjectIncludedIn"};
	public String arr91[]= {"enforcesGuideline","enforcesStandard","guidelinePrescribedIn","hasDomainScope","hasProcessScope","isEnforcedBy","prescribesGuideline","DomainScope","Guideline","Process","ProcessEnforcingStandard","ProcessScope","Standard"};
	public String arr92[]= {"AquaticSpecies","hasLocalName","canBeConfusedWith","hasSynonym"};
	public String arr93[]= {"Habitat","hasHabitat","isHabitatFor"};
	public String arr94[]= {"AquaticSpecies","feedsUpon","isPreyedUponBy","isFoodOf","preyesUpon"};
	public String arr95[]= {"BathymetricRange","hasBathymetricRange","isBathymetricRangeOf","hasRangeMin","hasRangeMax"};
	public String arr96[]= {"Habitat","SpeciesConditions","AquaticSpecies","BathymetricRange","WaterArea","hasHabitat","inWaterArea","hasBathymetricRange","forSpecies","hasConditions","isWaterAreaFor","isHabitatFor","isBathymetricRangeFor"};
	public String arr97[]= {"hasSpatioTemporalExtent","hasTrajectory","SpatioTemporalExtent","Trajectory"};
	public String arr98[]= {"SpatialObject","GeoSpatialObject","SpatialRepresentationObject","represents","Attribute","Value","Type","ContexualizedRelation","hasContextRelation"};
	public String arr99[]= {"SocialReality","context","has_OR","is_OR","counts-as","BF","C","OR"};
	public String arr100[]= {"SmartHomeTimeInterval","SmartHomeTemporalDistance","hasUpperTimestampValue","hasLowerTimestampValue"};
	public String arr101[]= {"SmartObjectSituation","State"};
	public String arr102[]= {"SensingProcess"," SmartHomeSensor","SmartHomeSensorOutput"};
	public String arr103[]= {"SmartHomeProperty"};
	public String arr104[]= {"SmartHome","SmartHomeSection"};
	public String arr105[]= {"Location","MobileObject","NodeHolder","NonMobileObject","SmartHomeAgent","SmartHomeObject","SmartObject"};
	public String arr106[]= {"receivesDataFrom","sendsDataTo","DataReceiverNode","DataSenderNode","Network","Node","NodeStation","ReceiverNodeStation","SenderNodeStation","SmartHomeDeployment"};
	public String arr107[]= {"eastOf","hasDirectionalRelation","hasSpatialRelation","northEastOf","northOf","northWestOf","southEastOf","southOf","southWestOf","westOf","SmartHomeGeoFeature"};
	public String arr108[]= {"SmartHomeFeatureOfInterest"};
	public String arr109[]= {"ComplexEvent","EventCondition","Manifestation"};
	public String arr110[]= {"farTopicFrom","hasCoreConcept","Topic","hasSubTopic","isSubTopicOf","SubTopic","nearTopicTo","overlappingTopic"};
	public String arr111[]= {"hasSetting","isSettingFor","Situation"};
	public String arr112[]= {"hasAggregatedMember","isAggregatedMemberOf","AggregatedObject","Object","ObjectByCardinality","SimpleObject"};
	public String arr113[]= {"directlyFollows","directlyPrecedes","follows","precedes"};
	public String arr114[]= {"NewsProvider","News","Agent","ReportingEvent","Media","NewsEventReporter","NewsReportingEvent","ActualEvent","NewsPresentationContext","isBasedOn","owns","actsFor"};
	public String arr115[]= {"Entity","Property","Usage","RelativeExistence","relativeExistenceOf","hasProperty","usageType","Domain","hasDomain","RelationshipDescription","hasAttribute","Attribute","hasScope","Scope","LevelofDetail","hasBound"};
	public String arr116[]= {"hasRegion","isRegionFor","hasRegionDataValue","Region"};
	public String arr117[]= {"hasEstimatedTimePeriod","hasImmediateNextSituation","hasImmediatePreviousSituation","hasMeasuredTimePeriod","hasMemberSituation","hasNextSituation","hasPreviousSituation","hasTimePeriod","hasTimePeriodBeforeNextSituation","hasUnifyingFactor","hasUnifyingSituation","involvesUnifyingFactor","isEstimatedTimePeriodOf","isInvolvedInUnifyingSituation","isLocallyInconsistentWith","isMeasuredTimePeriodOf","isSituationMemberOf","isTimePeriodBeforeNextSituationOf","isTimePeriodOf","isUnifyingFactorOf","isUnifyingSituationOf","isValidIn","isTheLastSituation","situationNumber","RecurrentSituationSeries","Situation","TimePeriod","UnifyingFactor","UnifyingSituation"};
	public String arr118[]= {"AbundanceLevel","ResourceAbundanceObservation","hasReferenceYear","hasAbundanceLevel","hasResource","isResourceOf","isAbundanceLevelOf"};
	public String arr119[]= {"ResourceExploitationObservation","hasReferenceYear","hasResource","hasExploitationRate"," ExploitationRate","ExploitationState","hasExploitationState","isExploitationStateOf","isResourceOf","isExploitationRateOf"};
	public String arr120[]= {"role","has task","Task","is task ok"};
	public String arr121[]= {"Part","Section"," Instrument","Voice","HomogeneousFragment","hasMidiProgram","hasStaff","hasClef","hasTempo","hasMetric","isPlayedBy","hasVoice","hasSection","hasFragment","isFragmentOf"," isSectionOf","isVoiceOf","playsPart"};
	public String arr122[]= {"Actuation","involves","trigger","implements","satisfies","Procedure","Actuator","Effect","impacts","ImpactedProperty","FeatureofInterest"};
	public String arr123[]= {"hasParameter","hasTask","holds","isHeldBy","affordanceStrength","Affordance","Frame","Situation","TaskParameter"};
	public String arr124[]= {"hasDependent","hasOutcome","hasPart","hasParticipant","hasRequirement","isDependentOf","isPartOf","isPrecededBy","isRequirementOf","precedes","produces","supports"," takesPlaceAt","hasDuration","hasEnd","hasStart","Activity","FixedActivity","FlexibleActivity","Outcome","Place","Requirement"};
	public String arr125[]= {"hasCreator","hasPart","Creator","File","Fonds","Item","Series","Unit"};
	public String arr126[]= {"Address","Building","Citizenship","City","ControlledEntity","Country","HomeType","LandArea","Organization","Person","Residence","Resident","ResidentThing","ResidentialRelationship","ResidentObjectProperty","citizenOf","entity","forCity","forCountry","hasAddress","hasHomeType","hasResidence","hasResidentialRelationship","operates","owns","apartment","condominium","freeload","hotel","house","lease","openLand"};
	public String arr127[]= {"coparticipatesWith"};
	public String arr128[]= {"Collection","Entity","hasMember","isMemberOf"};
	public String arr129[]= {"ContactMechanism","isValidContactMechanismFor","CommunicationEventRole","mediumOf","CommunicationEvent","EventDuration","eventStartTime","RelationshipDuration","relationshipStartTime","PartyRole","RelationshipPartyRole","roleInRelationship","PartyRelationship","includesCommunication","relationshipIncludes","relationshipHasDuration","EmailCommunication","throughMedium","e-mail","PhoneCommunication","Phone","CommunicationPurpose","purposeOfEvent","WebSiteCommunication","Website","FaceToFaceCommunication","roleOfParty","partyParticipating","inRelationship","Party","partyInvolvedIn","CommunicationEventPartyRole","partyInRelationship","hasValidContactMechanism","eventRoleIncludedIn","LetterCorrespondence","Letter","FaxCommunication","Fax","roleOfEvent","partyInEvent","inCommunicationEvent","eventIncludes","communicationHasSetting","eventHasPurpose","eventHasDuration","hasEventStatus","CommunicationEventStatus","statusOfEvent","isDurationOfEvent","isDurationOfRelationship","relationshipEndTime","eventEndTime"};
	public String arr130[]= {"basedOn","expressedIn","hasComplaintMotivation","justifiedBy","madeBy","supportedBy","hasSpace","hasStampTime","hasTimeOccurrence","Agent","Complainant","Complaint","Complaint_Recipient","Complaint_Recipient","Fact","Medium","Motivation","Request","ThirdParty","partOf","addressedTo"};
	public String arr131[]= {"Object","hasComponent","isComponentOf"};
	public String arr132[]= {"IO_Device","GPU","Processor","CPU","NetworkInterface","Disk","Memory","Hardware","Software","CPUType","CPUArchitecture","Kernel","OperatingSystem","OS_Shell_Environment","hasKernelVersion","hasFrequency","hasCores","hasVirtualAddress","hasPhysicalAddress","EnvironmentVariable"};
	public String arr133[]= {"Concept","ConceptGroup","MembershipRestriction","BroaderNarrowerRelation"};
	public String arr134[]= {"Concept","ConceptTermsRelation","PreferredTerm","SimpleNonPreferredTerm","Term","CompoundPreferredTerm","hasForConcept"};
	public String arr135[]= {"Entity","hasConstituent","isConstituentOf"};
	public String arr136[]= {"AbstractMergingTask","ActionTask","ActivationTask","BooleanCaseTask","BranchingTask","CaseTask","ConcurrencyTask","ControlTask","DecisionActivity","DeliberationState","DeliberationTask","EndingTask","LoopTask","MergingTask","SynchroTask"};
	public String arr137[]= {"executedIn","hasDataType","hasPayload","implements","occursIn","performsInputRole","performsOutputRole","performsParameterRole","providesInputDataRole","providesOutputDataRole","providesParameterRole","Algorithm","ComputationalEnvironment","DataTransformation","DataType","EntityWithProvenance","InputDataRole","OutputDataRole","ParameterRole","Payload","SpatiotemporalExtent","aData"};
	public String arr138[]= {"Description","Concept","is defined in","is concept used in","defines","uses concept"};
	public String arr139[]= {"DescriptionInRange","Entity","isRangedByValue","hasInclusiveLowerBoundValue","hasNonInclusiveLowerBoundValue","hasInclusiveUpperBoundValue","hasNonInclusiveUpperBoundValue","isDescribedBy","describes"};
	public String arr140[]= {"describes","isDescribedBy","isSatisfiedBy","satisfies","Situation","Concept"};
	public String arr141[]= {"DetectorFinalState","Physics","AND/OR","Logic","BinaryRelation","SelectionCriteria","PhysicalValue","FinalStateObject","PhysicalQuantity","Unit","NumericalValue","Number","BaseDefinition","PhysicsObject","EventLevelQuantity","hasOperand","hasFirstArgument","hasSecondArgument","refersToObject"};
	public String arr142[]= {"Audio","Video","DigitalVideo","Codec","AudioCodec","VideoCodec","Stream","AudioStream","VideoStream","SubtitleStream","Container","Descriptor","AnalogBroadcastStandard","AspectRatio","Bit Rate","ChromaFormat","CodingStandard","ColourSpaceType","CompressionType","EmbeddingType","FrameRate","FrameSize","PlaybackDuration","RangeType","SampleRate","ScanType","SetOfStandards","E.g. SubRip, SubViewer, etc.","VideoCodecLevel","VideoCodecProfile","VideoQualityMeasurement","VideoQualityMetric","YUVSampleRange","hasBitRate","wrappedBy","hasStream","hasAudioStream","hasVideoStream","hasSubtitleStream","hasCodingStandard","hasRangeType","hasVideoQualityMeasurement","hasChromaFormat","hasEmbeddingType","hasAspectRatio","hasSubtitleTextFormat","hasVideoQualityMetric","hasCompressionType","hasScanType","hasVideoCodecProfile","hasColourSpaceType","hasFrameSize","hasSetOfStandards","processedBy","hasAnalogBroadcastStandard","hasVideoCodecLevel","hasFrameRate","hasPlaybackDuration","hasYUVSampleRange","hasSampleRate"};
	public String arr143[]= {"Bearer","Trigger","Disposition","Realization","hasDisposition","inheresIn","hasTriggerR","has_triggerD","hasRealization","Biology"};
	public String arr144[]= {"EthnicGroup","hasIsland","Person","hasTown","hasCountry","hasEthnicGroup","hasContinent","hasOfficeHolder","Continent","Place","River","Island","AdministrativeRegion","Language"};
	public String arr145[]= {"DASE_RULE","freshProp1","freshProp2","hasInformationObject","hasSpatioTemporalExtent","providesParticipantRole","subEventOf","subSpatioTemporalExtentOf","Event","InformationObject","ParticipantRole","SpatioTemporalExtent"};
	public String arr146[]= {"SimpleEventObject","EventObject","CompositeEventObject","ComplexEventObject","hasEventObjectPart","SensorOutput","hasSubEventObject","EventObjectHeader","hasEventObjectTime","hasEventDuration","hasEventObjectAttributeValue","hasEventObjectAttributeDataValue","isEventObjectHeaderOf","EventObjectPart","EventObjectBody","isEventObjectBodyOf","hasEventObjectHeader","informationAboutEvent","hasEventLocation","hasEventObjectBody","refersToEventObjectConstituent","refersToEventObjectComponent","isEventObjectComponentOf","hasEventObjectComponent","isEventObjectPartOf","hasSensorReadingValue","hasDirectSubEventObject","isDirectSubEventObjectOf","isSubEventObjectOf","hasEventObjectSystemTime","hasEventObjectExpirationTime","hasEventObjectSamplingTime","hasEventObjectApplicationTime"};

	
	
	
	
	
	
	List<String[]> myList = new ArrayList<String[]>();
	public String name[]= {"ActingFor","Action","ActivitySpecification","BasicPlan","AffectedBy","Agent","Airline","Algorithm",
			"AquaticResources","Bag","BiologicalEntities","CatchRecord","Chess","Classification","ClimaticZone","Collection","ComputerSystem",
			"Course","Criterion","Persons","Price","PrivacyPolicyPersonalData","Professor","Provenance","RelativeRelationship",
			"Reporting","Set","SmartHome","SpeciesConservation","TaskExecution","TimeIndexedClassification","TimeIndexedPersonRole",
			"TimeInterval","TimePeriod","Topic","Trajectory","VesselSpecies","Transition","Transport",
			"RecurrentEventSeries","Reaction","RTMSMapping","Pollution","Policy","PlanConditions","Place","PharmaInnova","PeriodicInterval",
			"Participation","ParticipantRole","Partof","Parameter","Observation","ObjectRole","Object with states","OOPMetrics",
			"NotePattern","NewsReportingEvent","NaryParticipation","MusicalObject","Move","MicroBlogEntry","MaterialProperty",
			"MaterialTransformation","MapLegendOntolgy","Literal Reification pattern","List","LinnaeanTaxonomy","LCA Pattern",
			"Invoice","IntensionExtension","InformationObjectsAndRepresentationLanguages","Information Realization","HistoricalMap",
			"HazardousSituation","GearWaterArea","Gesture Interaction","Criterion Setter","GearVessel","GearSpecies","GO Top","Experience & Observation",
			"ExplanationODP","WinstonPartWhole","Tagging","Types of entities","VerticalDistribution","VesselWaterArea","TimeIndexedSituation","TimeIndexedPartOf",
			"Time indexed participation","Standard Enforcer Pattern","SpeciesNames","SpeciesHabitat","SpeciesEat","SpeciesBathymetry","SpeciesConditions","SpatioTemporalExtent","Spatial Graph Adapter (SGA)","Social Reality (OWL 2)",
			"SmartHome TimeInterval","SmartHome Situation","SmartHome Sensing","SmartHome Property","SmartHome Place","SmartHome Object","SmartHome Network","SmartHome Geometry","SmartHome FeatureOfInterest",
			"SmartHome Event","SimpleTopic","Situation","SimpleOrAggregated","Sequence","NewsReportingEvent","RelativeRelationship","Region","RecurrentSituationSeries",
			"ResourceAbundanceObservation","ResourceExploitationObservation","Role task","ScorePart","Actuation-Actuator-Effect","Affordance","Activity Pattern",
			"Born Digital Archives","City Resident Pattern","Co-participation","CollectionEntity","CommunicationEvent","Complaint Design Pattern",
			"Componency","ComputationalEnvironment","ConceptGroup","ConceptTerm","Constituency","ControlFlow","DataTransformationPattern","Description",
			"Description in Range","DescriptionAndSituation","DetectorFinalState","DigitalVideo","Disposition","EthnicGroup","EventCore","EventProcessing"};
	

	
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
		myList.add(arr39);
		myList.add(arr40);
		myList.add(arr41);
		myList.add(arr42);
		myList.add(arr43);
		myList.add(arr44);
		myList.add(arr45);
		myList.add(arr46);
		myList.add(arr47);
		myList.add(arr48);
		myList.add(arr49);
		myList.add(arr50);
		myList.add(arr51);
		myList.add(arr52);
		myList.add(arr53);
		myList.add(arr54);
		myList.add(arr55);
		myList.add(arr56);
		myList.add(arr57);
		myList.add(arr58);
		myList.add(arr59);
		myList.add(arr60);
		myList.add(arr61);
		myList.add(arr62);
		myList.add(arr63);
		myList.add(arr64);
		myList.add(arr65);
		myList.add(arr66);
		myList.add(arr67);
		myList.add(arr68);
		myList.add(arr69);
		myList.add(arr70);
		myList.add(arr71);
		myList.add(arr72);
		myList.add(arr73);
		myList.add(arr74);
		myList.add(arr75);
		myList.add(arr76);
		myList.add(arr77);
		myList.add(arr78);
		myList.add(arr79);
		myList.add(arr80);
		myList.add(arr81);
		myList.add(arr82);
		myList.add(arr83);
		myList.add(arr84);
		myList.add(arr85);
		myList.add(arr86);
		myList.add(arr87);
		myList.add(arr88);
		myList.add(arr89);
		myList.add(arr90);
		myList.add(arr91);
		myList.add(arr92);
		myList.add(arr93);
		myList.add(arr94);
		myList.add(arr95);
		myList.add(arr96);
		myList.add(arr97);
		myList.add(arr98);
		myList.add(arr99);
		myList.add(arr100);
		myList.add(arr101);
		myList.add(arr102);
		myList.add(arr103);
		myList.add(arr104);
		myList.add(arr105);
		myList.add(arr106);
		myList.add(arr107);
		myList.add(arr108);
		myList.add(arr109);
		myList.add(arr110);
		myList.add(arr111);
		myList.add(arr112);
		myList.add(arr113);
		myList.add(arr114);
		myList.add(arr115);
		myList.add(arr116);
		myList.add(arr117);
		myList.add(arr118);
		myList.add(arr119);
		myList.add(arr120);
		myList.add(arr121);
		myList.add(arr122);
		myList.add(arr123);
		myList.add(arr124);
		myList.add(arr125);
		myList.add(arr126);
		myList.add(arr127);
		myList.add(arr128);
		myList.add(arr129);
		myList.add(arr130);
		myList.add(arr131);
		myList.add(arr132);
		myList.add(arr133);
		myList.add(arr134);
		myList.add(arr135);
		myList.add(arr136);
		myList.add(arr137);
		myList.add(arr138);
		myList.add(arr139);
		myList.add(arr140);
		myList.add(arr141);
		myList.add(arr142);
		myList.add(arr143);
		myList.add(arr144);
		myList.add(arr145);
		myList.add(arr146);
		

}
	public List<Double> findsimilarity(String st[]) {
		System.out.println(myList.size());
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
		
		String st[]= {"Fishery","AquaticSpecies"};
		d.findsimilarity(st);
		
		
	}
}
