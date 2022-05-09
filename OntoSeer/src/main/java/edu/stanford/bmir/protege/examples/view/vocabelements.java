package edu.stanford.bmir.protege.examples.view;

import java.util.*;

public class vocabelements {
	
	String uri[]=new String[100];
	String vocab1[]= {"Changes","Example","Preferred Namespace Prefix","Preferred Namespace Uri","Term Group","Usage Note"};
	String desc1= "This document describes a vocabulary for annotating descriptions of vocabularies with examples and usage notes";
	String vocab2[]= {"Agent"," Document","Group","Image","LabelProperty","OnlineAccount","OnlineChatAccount","OnlineEcommerceAccount","OnlineGamingAccount","Organization","Person","PersonalProfileDocument","Project","account","accountName","accountServiceHomepage","age",
			"aimChatID","based_near","birthday","currentProject","depiction","depicts","dnaChecksum","familyName","family_name","firstName","focus","fundedBy","geekcode","gender","givenName","givenname","holdsAccount","homepage",
			"icqChatID","img","interest","isPrimaryTopicOf","jabberID","knows","lastName","logo","made","maker","mbox","mbox_sha1sum","member","membershipClass","msnChatID","myersBriggs","name","nick","openid",				
			"page","pastProject","Phone","plan","primaryTopic","publications","schoolHomepage","sha1","skypeID","status","surname","theme","thumbnail","tipjar","title","topic","topic_interest","weblog","workInfoHomepage",
			"workplaceHomepage","yahooChatID"};
	String desc2= "FOAF is a project devoted to linking people and information using the Web";
	String vocab3[]= {"abstract","accessRights","accrualMethod","accrualPeriodicity","accrualPolicy","alternative","audience","available","bibliographicCitation",
			"conformsTo","contributor","coverage","created","creator","date","dateAccepted","dateCopyrighted","dateSubmitted","description","educationLevel","extent","format","hasFormat","hasPart","hasVersion","identifier","instructionalMethod","isFormatOf",
			"isPartOf","isReferencedBy","isReplacedBy","isRequiredBy","issued","isVersionOf","language","license","mediator","medium","modified","provenance","publisher","references","relation","replaces","requires","rights","rightsHolder","source","spatial",
			"subject","tableOfContents","temporal","title","type","valid","Agent","AgentClass","BibliographicResource","FileFormat","Frequency","Jurisdiction",
			"LicenseDocument","LinguisticSystem","Location","LocationPeriodOrJurisdiction","MediaType","MediaTypeOrExtent","MethodOfAccrual","MethodOfInstruction","PeriodOfTime","PhysicalMedium","PhysicalResource","Policy","ProvenanceStatement",
			"RightsStatement","SizeOrDuration","Standard",};
	String desc3= "This document describes a vocabulary for annotating descriptions of vocabularies with examples and usage notes";
	String vocab4[]= {"Agent","Artwork","Binding","Box","Character","Collection","ComicAge","ComicUniverse","Contributor","Copy","Distributor","Document","Edition","Event","Format","Frequency","Genre","Grade","Guarantor","Imprint","Issue","Item","Library","Location","Material","Museum","Object","Page","Page Type",
			"Panel","Paper","Pedigree","Attribute","Planet","Plastic","Publication","Publisher","Quality","Role","Sequence","Series","State","Story","Team","Vehicle","Volume","adaptation","adaptation of","appearance",
					"artist","artwork","artwork of","artwork type","attribute","bagged","balloon","binding","boarded","box","cameo","caption","character","collected in","collection" , "plotter","preview","publication frequency","publisher",
							"collects","colorist","comic age","condition","contains","contributor","copy","copy of","copy state","country","cover art","cover artist","creator","distributed by","edition","quality","rating","related","reprinted in","reprints",
							"editor","encased","event","format","genre","grade","guaranteed by","imprint","imprint of","in box","inker","issue","issue of", "role","sequence","series","series of","state","story","story arc","has story","subject","team","translation",
									"item","item of","language","letterer","material","object","owner","owner of","page","page type","panel","paper","penciller","translation of" 
									,"Book"		,"universe", "universe of","variant","variant of","volume","volume of","writer", "alternative title","CCA","certification number","copyright date","cover date","coverPrice","Diamond code","distributor code","end year","feature",
													};
	String desc4= "The Comic Book Ontology is a metadata vocabulary for describing comic books and comic book collections.";
	String vocab5[]= {"Ring"," Geometry collection","Curve","Envelope","Geometry","Line","List of Points","Multicurve","Multipoint","  Multipolygon","Multi-line","  Multisurface","Point","Polygon","Polyline","Area","has for geometry","centroid","lower corner","upper corner","envelope",
			"outside","border","interior","point member","points","polygon member","polyline member","first and last  coordinate system","m","x","y","z","bernard vatant","cv.php? firstname = benedict & lastname = bucher","http://www.eurecom.fr/~atemezin/","http://www.eurecom.fr/~troncy/"};
	String desc5= "Ontology of geometric primitives representing the shape and location of topographic features.";
	String vocab6[]= {"ArraySchema","BooleanSchema","DataSchema","IntegerSchema","NullSchema","NumberSchema","ObjectSchema","StringSchema", "allOf","anyOf","items","oneOf","properties","const","contentEncoding","contentMediaType",
			"enum","exclusiveMaximum","exclusiveMinimum","format","maxItems","maxLength","maximum","minItems","minLength","minimum","multipleOf","propertyName","readOnly","required","writeOnly"};
					
	String desc6= "his vocabulary provides a stable namespace IRI for JSON schema keywords, as well as simple axioms, defined against schema.org's meta-model";
	String vocab7[]= {"Changes","Example","Preferred Namespace Prefix","Preferred Namespace Uri","Term Group","Usage Note"};
	String desc7= "his vocabulary provides a stable namespace IRI for JSON schema keywords, as well as simple axioms, defined against schema.org's meta-model";
	String vocab8[]= {"CollectableProperty","Collection","Concept","ConceptScheme","OrderedCollection","altLabel","altSymbol","broader","changeNote","definition","editorialNote","example","hasTopConcept","hiddenLabel","historyNote","inScheme","isPrimarySubjectOf","isSubjectOf","member",
			"memberList","narrower","note","prefLabel","prefSymbol","primarySubject","related","scopeNote","semanticRelation","subject","subjectIndicator","symbol","TopConcept","broaderGeneric","broaderInstantive","broaderPartitive","externalID","narrowerGeneric","narrowerInstantive",
			"narrowerPartitive","privateNote","publicNote","relatedHasPart","relatedPartOf"};
	String desc8= "SKOS Core is a model and an RDF vocabulary for expressing the basic structure and content of concept schemes such as thesauri, classification schemes, subject heading lists, taxonomies, 'folksonomies', other types of controlled vocabulary, and also concept schemes embedded in glossaries and terminologies";
	String vocab9[]= {"Parentage","Marital Status","Domicile","Birth","No Resident","Registered Person","Family","Family Relationship","Wedding","Citizen","Citizen Board","Nationality","Death","Permanent Resident","Person Event","Person Relationship","Cohabitation","Citizenship","citizen","Take Resident","Residence","Guardianship","Stranger", 
			"parentage type","alternative name","within jurisdiction","date","date of parentage","first name used","race","family address","family relationship type","has marital status","has birth","has resident status","has nationality","has death","has personal relationship","has citizenship","has residence"," is head of","is a member of","is relationship with","land",
			"nationality","place","registration","type","residence address","full name","Person","contact point","family name","birth name", "given name","residency","patronymic","citizenship"}; 
				
	String desc9= " Person focuses on describing a natural person, ie a physical person and not an organization.";
	String vocab10[]= {"Center","College","Course","Department","Division","Faculty","Institute","Institution","KnowledgeGrouping","Module","Programme","Research Group","School","Subject","Code","Description","Name","Organization","Organizational Unit","Part of","Responsibility of","Responsible for","Teaches"};
	String desc10= "The Academic Institution Internal Structure Ontology (AIISO) provides classes and properties to describe the internal organizational structure of an academic institution";
	String vocab11[]= {"Competition","CompetitionType","CompetitiveSportingGroup","CompetitiveSportingOrganisation","CompetitiveSportingRole","DivisionalCompetition","EventGender","GoverningBody","GroupCompetition","Home","KnockoutCompetition","LeagueCompetition","Match","MedalCompetition","MultiDisciplineCompetition","MultiDisciplineRecurringCompetition","MultiRoundCompetition", 
			"MultiStageCompetition","Person","RecurringCompetition","Round","RoundType","Session","SportingOrganisation","SportsDiscipline","UnitCompetition","Venue","awayCompetitor","competesIn","competitionType","discipline","eventGender","firstRound","firstSession","firstStage","firstUnitCompetition","hasCompetedFor","hasCompetitor","hasCompetitor","hasGroup","hasHome","hasMatch","hasRound",
			"hasSession","hasStage","hasUnitCompetition","homeCompetitor","isCompetitiveSportingOrganisationOf","isGroupOf","isMatchOf","isRoundOf","isSessionOf","isStageOf","lastRound","lastSession","lastStage","lastUnitCompetition","nextRound","nextSession","nextStage","nextUnitCompetition","prevRound","prevSession","prevStage","prevUnitCompetition","promotesTo","recurringCompetition","relegatesTo","roundNumber","roundType","subDiscipline","subDisciplineOf"};
	String desc11= "The Sport Ontology is a simple lightweight ontology for publishing data about competitive sports events.";
	String vocab12[]= {"Certification","qualification","principal","has-certification","authority","certifies","proof","proves"};
	String desc12= "This document specifies a vocabulary for asserting the existence of official endorsements or certifications of agents, such as people and organizations.";
	String vocab13[]= {"Application","Application Interface","Attribute Mapping","Business Object","Business Object Attribute","Business Process","Business Rule","Business Rule Assessment","Change History","Change Request","Code","Code List","Code Mapping","Data Flow","Data Management Process","Data Object","Data Object Attribute","Data Object Type","Data Object Type Attribute","data quality score","data requirement","data set","Enumeration","Example","FAQ","Key Mapping","KPI Definition","KPI Measurement","Mapping","Named Value","Organizational Unit","Person","Project","Project Plan","Regulation","Report","Responsibility","role",
			"Role","Schema Mapping","Supplementary Documentation","Terms of Use","Training Opportunity","Type Mapping","addresses","affects Application","affects Data Conceptualization","answers question about","applies to","based on","comprises","computed on","cooperates with","defines integrity of attribute","defines integrity of object","defines integrity of type","defines lifecycle of instances","documents","fills Role","flows from","flows to","has application lifecycle","has data lifecycle","has Knowledge Lifecycle","has Role","has Terms of Use","illustrates","initiated by Process","initiated by Project","instantiates Business Object Type",
			"instantiates Data Object Type","is measurement of","is related to","maintains","maintains instances of","maps from","maps to","refers to Code List","refers to Enumeration","responsible for","takes on","tracks","transfers data","uses","uses instances of","works on Application","works on Conceptualization"};
	String desc13= "The Data Knowledge Vocabulary allows for a comprehensive description of data assets and enterprise data management";
	String vocab14[]= {"Antiquity","City","Farm","Feature Type","Forest or Wood","Hill or Mountain","Named Place","Other","Other Settlement","Roman Antiquity","Town","Water Feature","feature type","map reference"};
	String desc14= "An ontology describing the 50K Gazetteer.";
	String vocab15[]= {"a construction task","a modification task","a removal task","a repair task","a task (execution) method","a task context","an inspection task","an installment task","after finished task","has complex task method description","has task context","has task method","is subject of task","results in added statement","results in deleted statement","results in statement","has simple task method description"};
	String desc15= "";
	String vocab16[]= {"Animal","Animal Group","Building","Building space","Crop","Deployment","Eating activity sensor","Farm","Farm holding","Farmer" ,"ID","Intake" ,"Yield","contains","generates","has deployment period","has id","has member","has received","is contained in","is deployed at space","is located in","is location of","is member of","manages farm","receives","has birth date",
			"Milking sensor","Movement activity sensor","Parcel","Platform","Pluviometer","Soil","Soil tensiometer","Thermometer","Watering gun","Watering system","Watering valve","Weather station","Weight sensor","has death date","has harvest date","has name","has plant date","Air temperature","Ambient humidity","Irrigation water","Plant growth stage","Precipitation","Soil moisture","Soil temperature"};
	String desc16= "The livestock farming and smart irrigation use cases used as basis to create SAREF4AGRI in the present document are concerned with the integration of multiple data sources for the purpose of providing decision support services located on the local \"Farm Management System\" of the farmers or provided by a service over the network.";
	String vocab17[]= {"Vehicle","Automobile","AirplaneModel","BusOrCoach","Train","emissionsPerPassenger","hasElectricEnergyConsumtion","hasEmissionsReduction","hasEngineCapacity","hasFuelMode","hasInnovativeTechnology","hasMSRegManufacturerName","hasManufacturerHarmonisedName","hasManufacturerPooling","hasOtherAxleWidth","hasSteeringAxleWidth","hasTotalNewRegistrations","hasTypeApprovalNumber","numberOfPassengers","type","variant","vehicleTypeApprovedCategory","version"};
	String desc17= "An ontology for describing vehicles and their emissions";
	String vocab18[]= {"Accreditation","Association object","Awarding activity","Awarding body","Competence sub-type","Concept scheme (ESCO pillar)","entry requirement","Esco extension","ESCO Structure","Label role","Member concept","node literal","Occupation","Qualification","Recognition","Skill","Work context","Additional note","association from","association to","awarding body","belongs to ISCO Group with code","can have work context","defines structure for","has accreditation","has association","has awarding activity","has awarding body","has code list","has coded property","has entry requirement","has essential skill","has label role","has NACE code","has optional skill",
			"has poly-hierarchy","has recogition","has version record","is essential skill for","is indirectly included","is optional skill for","ISCED FoET Code","location","note text","replaced by","replaces","requirement level","skill type","supplementary doc","supported language","target framework","to ESCO concept","way to acquire","is transversal","country code","editorial status","qualification expiration period","expiry period","ECTS credit points","has poly-hierarchy","is indirectly included","is partial qualification","language","Reference language","review date","target notation","volume of learning","status","skill reuse level"};
	String desc18= "The ontology of the taxonomy \"European Skills, Competences, qualifications and Occupations.";
	String vocab19[]= {"activity","AdditionalInformation","Attribute","CAEXFile","eClassSpecification","ExternalInterface","ExternalReference","ExternalStandard","InstanceHierarchy","InterfaceClass","InterfaceClassLib","InternalElement","InternalLink","Project","RoleClass","RoleClassLib","SystemUnitClass","SystemUnitClassLib","contains","eClassIsConnectedTo","eClassRCReference","has part","has part i e","has part s u c","has ref partner side a object","has ref partner side a object i e","has ref partner side a object s u c","has ref partner side b object","has ref partner side b object i e","\n" + 
			"has ref partner side b object s u c","has ref sem attribute","has role requirement i e","has role requirement s u c","has supported role class i e","has supported role class s u c","has unit","hasAdditionalInformation","hasAdditionalInformation","hasAttribute","hasAttributeIC","hasAttributeIE","hasAttributeRC","hasAttributeSUC","hasAttributeValue","hasBaseSystemUnitClass","hasExternalReference","hasInstanceHierarchy","hasInterface","hasInterfaceClass","hasInterfaceClassLib","hasInterfaceIE","hasInterfaceRC","hasInterfaceSUC","hasInternalElement","hasProject","hasRefPartnerSideA","hasRefPartnerSideB","hasRoleClass","hasRoleClassLib","hasRoleRequeriment","hasSemanticRef",
			"hasSystemUnitClass","is part of","isPartOfIE","isPartOfSUC","supportedRoleClass","was generated by","eClassClassificationClass","eClassIRDI","eClassVersion","externalReferenceAlias","externalReferencePath","General property to define versions of the AutomationML elements",
			"has ref base class path i c","has ref base class path r c","has ref base class path s u c","hasAMLVersion","hasAttributeName","hasAttributeValue","hasDataType","hasDescription","hasICID","hasName","hasNameAttribute","hasNameFile","hasNameIC","hasNameIE","hasNameIH","hasNameRC","hasNameSUC","hasProjectRelease","hasProjectTitle","hasRefBaseRoleClassPath","hasSchemaVersion","hasVersionICL","hasVersionRCL","hasVersionSUC","hasWriterId","hasWriterName",
			"hasWriterRelease","hasWriterVendor","hasWriterVendorURL","hasWriterVersion","internalElementId","ref base system unit path","refBaseClassPath","refBaseSUPath","refRCPath","refSemanticAttribute"};
	String desc19= "An Ontology to represents the AutomationML Standard with focus on CAEX - IEC 62424.";
	String vocab20[]= {"Automobile","Bicycle","Boat","BodyStyleValue","BusOrCoach","Canoe","DriveWheelConfigurationValue","EmissionStandardValue","EngineTypeValue","FeatureValue","FuelQuantity","FuelTypeValue","Kayak","MotorBoat","Motorcycle","MotorizedBicycle","MotorizedRoadVehicle","Quadracycle","Rickshaw","SailingBoat","Ship","SpeedInterval","SteeringPositionValue","TransmissionTypeValue","Truck","Van","Vehicle","Watercraft","ACRISSCode","color","condition","damages","engineName","firstRegistration","modelDate","productionDate","rentalUsage","VIN","acceleration","axles","bodyStyle","cargoVolume","doors","driveWheelConfiguration","engineDisplacement","enginePower","engineType","feature",
			"fuelConsumption","fuelEconomy","fuelTankVolume","fuelType","gearsTotal","height","length","meetsEmissionStandard","mileageFromOdometer","payload","previousOwners","referenceDistance","referenceFuelQuantity","referenceSpeeds","roofLoad","seatingCapacity","speed","steeringPosition","tongueWeight","trailerWeight","transmission","weight","weightTotal","wheelbase","width","0to100KMH","0to60MPH","1GLI","1GLL","1LTR","4WD","AWD","FWD","Left","Right","RWD","TwoStrokeMixture"};
	String desc20= "The Vehicle Sales Ontology is a Web vocabulary for describings cars, boats, bikes, and other vehicles for e-commerce.";
	String vocab21[]= {"anyURI","boolean","date","dateTime","double","float","gDay","gMonth","gMonthDay","gYear","gYearMonth","integer","negativeInteger","nonNegativeInteger","nonPositiveInteger","positiveInteger","string","time","Company","Activity","Name","Person","Actor","Actor","Publisher","Genre","Language","Department","Software","School","Type","thumbnail","deathPlace","deathDate","birthPlace","birthDate","wikiPageID","wikiPageRevisionID","wikiPageWikiLink","wikiPageExternalLink","wikiPageRedirects","wikiPageDisambiguates","location","restingPlacePosition","FloweringPlant","BoxingLeague","BritishRoyalty","BritishRoyalty","militaryUnit","suppreddedDate","generalManager","viceLeader","administrator","stateDelegate","trustee","AustralianFootballTeam","CricketTeam","FieldHockeyLeague","MilitaryPerson","VolleyballLeague","areaLand","dateOfAbandonment","dressCode","facultySize","icaoLocationIdentifier","lengthReference",
			"maximumDepth","numberOfStudents","toll","acceleration","hipSize","lastPosition","numberOfVineyards","orcidId","waistSize","worldChampionTitleYear","VideogamesLeague","MixedMartialArtsLeague","TopicalConcept","Instrumentalist","RaceTrack","Tower","Ginkgo","CurlingLeague","derivative","hubAirport","incumbent","musicFusionGenre","musicSubgenre","nominee","stylisticOrigin","areaMetro","areaUrban","areaWater","averageAnnualGeneration","bestFinish","block","bnfId","bowlRecord","buildingStartYear","capacityFactor","captureDate","careerPrizeMoney","censusYear","centuryBreaks","chemicalFormula","classes","closed","code","committee","commoName","complexity","complications","conservationStatus","conservationStatusSystem","countryCode","currencyCode","decommissioningDate","distanceToCardiff","distanceToCharingCross","distanceToEdinburgh","distanceToLondon","electionMajority","firstAscentYear","generationUnits","headLabel","highestBreak",
			"id","inseeCode","installedCapacity","interest","iso6391Code","iso6392Code","latinName","licenceNumber","locationIdentifier","mouthElevation","municipalityCode","numberOfFilms","numberOfOrbits","numberOfPiersInWater","numberOfVehicles","otherWins","passengersUsedSystem","percentageOfAreaWater","plays","populationMetro","populationRural","populationUrbanDensity","projectBudgetFunding","railGauge","rating","reportingMark","reservations","rocketStages","schoolCode","schoolNumber","seniority","servingTemperature","spike","throwingSide","timeInSpace","trackLength","voltageOfElectrification","watershed","wins","addressInRoad","artery","authority","binomial","border","branchFrom","branchTo","chairperson","childOrganisation","curator","department","drainsTo","firstAscentPerson","formerChoreographer","frazioni","innervates","isPartOfAnatomicalStructure","languageRegulator","legalForm","legislature","medicalSpecialty","mission","mother","nerve",
			"nobelLaureates","officerInCharge","officialLanguage","patronSaint","placeOfBurial","precursor","principalEngineer","provost","sales","selection","sisterCollege","statisticLabel","supplies","typeOfElectrification","vein","viceChancellor","wineRegion","winsAtChallenges","winsAtMajors","Coach","SportFacility","SportsManager","WinterSportPlayer","Airline","Bank","BasketballLeague","Fashion","FictionalCharacter","HandballLeague","IceHockeyLeague","Locomotive","MusicGenre","ReligiousBuilding","RoadTunnel","SpaceShuttle","University","Baronet","HorseRider","MedicalSpecialty","Novel","Pope","AmericanFootballTeam","BaseballTeam","SoftballLeague","SpaceStation","TennisLeague","LaunchPad","GovernmentalAdministrativeRegion","Municipality","ClubMoss","ClericalAdministrativeRegion","abstract","Battery","GolfLeague","PlayboyPlaymate","SnookerChamp","SpeedwayLeague","AnimangaCharacter","MusicalWork","WaterwayTunnel","InlineHockeyLeague","SnookerWorldRanking","SolarEclipse",
			"mouthPosition","sourcePosition","AmericanFootballLeague","MusicFestival","SpeedwayTeam","SportsLeague","SportCompetitionResult","AmericanFootballCoach","ArchitecturalStructure","BaseballLeague","Bay","CanadianFootballLeague","ConcentrationCamp","Continent","Diocese","Embryology","FormulaOneRacer","NationalCollegiateAthleticAssociationAthlete","Presenter","Rower","Surname","TelevisionHost","VoiceActor","VolleyballCoach","Gnetophytes","Agent","Biomolecule","Broadcaster","Cartoon","Case","CelestialBody","ChemicalSubstance","Document","Gene","GridironFootballPlayer","Group","Identifier","Infrastructure","LegalCase","MeanOfTransportation","MotorsportRacer","NaturalEvent","NaturalPlace","OrganisationMember","PeriodicalLiterature","Project","Race"};
	String desc21= "This ontology is generated from the manually created specifications in the DBpedia Mappings Wiki";
	String vocab22[]= {"AbbreviatedTitle","AccessPolicy","AcquisitionSource","AdminMetadata","Agent","Ansi","AppliedMaterial","Archival","Arrangement","AspectRatio","Audio","AudioIssueNumber","AudioTake","Barcode","BaseMaterial","BookFormat","BroadcastStandard","Capture","Carrier","Cartographic","CartographicDataType","CartographicObjectType","Cartography","Chronology","Classification","ClassificationDdc","ClassificationLcc","ClassificationNlm","ClassificationUdc","Coden","Collection","CollectiveTitle","ColorContent","Content","ContentAccessibility","Contribution","CopyrightNumber","CopyrightRegistration","CoverArt","Dataset","DescriptionAuthentication","DescriptionConventions","DigitalCharacteristic","Dissertation","DissertationIdentifier","Distribution","Doi","Ean","Electronic","Emulsion","EncodedBitrate","EncodingFormat","Enumeration","EnumerationAndChronology","Event","Extent","Family","FileSize","FileType","Fingerprint","FontSize","	Frequency","Generation","GenerationProcess","GenreForm","GeographicCoverage","GrooveCharacteristic","musicKey","musicMedium","musicOpusNumber","musicSerialNumber","musicThematicNumber","natureOfContent",
			"Gtin14Number","Hdl","Identifier","Illustration","ImmediateAcquisition","Instance","IntendedAudience","Isan","Isbn","Ismn","Isni","Iso","Isrc","Issn","IssnL","Issuance","Istc","Iswc","Item","Jurisdiction","KeyTitle","Language","Layout","Lccn","LcOverseasAcq","Local","Manufacture","Manuscript","MatrixNumber","Media","Meeting","MixedMaterial","Mount","MovementNotation","MovingImage","Multimedia","MusicDistributorNumber","MusicEnsemble","MusicFormat","MusicInstrument","MusicMedium","MusicNotation","MusicPlate","MusicPublisherNumber","MusicVoice","Nbn","NotatedMovement","NotatedMusic","Notation","Note","Object","ObjectCount","Organization","ParallelTitle","Person","Place","PlaybackChannels","PlaybackCharacteristic","PlayingSpeed","Polarity","PostalRegistration","PresentationFormat","Print","Production","ProductionMethod","Projection","	ProjectionCharacteristic","ProjectionSpeed","ProvisionActivity","Publication","PublisherNumber","RecordingMedium","RecordingMethod","ReductionRatio","RegionalEncoding","ReportNumber","Resolution","RetentionPolicy","notation","note","noteType","organization","originalVersion","originalVersionOf",
			"Role","Scale","Script","ShelfMark","ShelfMarkDdc","ShelfMarkLcc","ShelfMarkNlm","ShelfMarkUdc","Sici","SoundCharacteristic","SoundContent","Source","Status","StillImage","StockNumber","Strn","StudyNumber","Sublocation","Summary","SupplementaryContent","SystemRequirement","TableOfContents","Tactile","TactileNotation","TapeConfig","Temporal","Text","Title","Topic","TrackConfig","Unit","Upc","Urn","UsageAndAccessPolicy","UsePolicy","VariantTitle","VideoCharacteristic","VideoFormat","VideoRecordingNumber","Work","absorbed","absorbedBy","accompaniedBy","accompanies","acquisitionSource","acquisitionTerms","adminMetadata","agent","appliedMaterial","arrangement","ascensionAndDeclination","aspectRatio","assigner","awards","baseMaterial","bookFormat","capture","carrier","cartographicAttributes","changeDate","classification","classificationPortion","code","colorContent","content","contentAccessibility","continuedBy","continuedInPartBy","continues","continuesInPart","	contribution","coordinates","copyrightDate","copyrightRegistration","count","coverArt","creationDate","mount","musicFormat","originDate","originPlace","otherEdition"
			,"credits","custodialHistory","dataSource","date","degree","derivativeOf","derivedFrom","descriptionAuthentication","descriptionConventions","descriptionLanguage","descriptionModifier","digitalCharacteristic","dimensions","dissertation","duration","edition","editionEnumeration","editionStatement","electronicLocator","emulsion","ensemble","ensembleType","enumerationAndChronology","equinox","eventContent","eventContentOf","exclusionGRing","expressionOf","extent","findingAid","findingAidOf","firstIssue","fontSize","frequency","generation","generationDate","generationProcess","genreForm","geographicCoverage","grantingInstitution","hasDerivative","hasEquivalent","hasExpression","hasInstance","hasItem","hasPart","hasReproduction","hasSeries","hasSubseries","heldBy","hierarchicalLevel","historyOfWork","identifiedBy","identifies","illustrativeContent","immediateAcquisition","index","indexOf","instanceOf","instrument","instrumentalType","intendedAudience","issuance","issuedWith","itemOf","itemPortion","language","lastIssue","layout","legalDate","mainTitle","media","mergedToForm","mergerOf","otherPhysicalFormat","outerGRing","part",
			"partName","partNumber","partOf","pattern","physicalLocation","place","polarity","precededBy","	preferredCitation","productionMethod","projection","projectionCharacteristic","provisionActivity","provisionActivityStatement","qualifier","reductionRatio","referencedBy","references","relatedTo","replacedBy","replacementOf","reproductionOf","responsibilityStatement","review","role","scale","schedulePart","separatedFrom","seriesEnumeration","seriesOf","seriesStatement","shelfMark","soundCharacteristic","soundContent","source","spanEnd","splitInto","status","subject","sublocation","subseriesEnumeration","subseriesOf","	subseriesStatement","subtitle","succeededBy","summary","supplement","supplementaryContent","supplementTo","systemRequirement","table","tableOfContents","tableSeq","temporalCoverage","title","translation","translationOf","unit","usageAndAccessPolicy","	variantType","version","videoCharacteristic","voice","voiceType"};
	String desc22= "";
	
	String vocab23[]= {"AcceleratorMassSpectrometer","age","Al/Ca","Ar-Ar","Archea","arcticOscillation","Assemblage","atlanticMultiDecadalOscillation","AtmosphericChemistry","author","B/Ca","Ba/Ca","BinocularMicroscope","Bivalves","book","bottomWaterTemperature","calibratedVia","CalibrationModel","calibrationReferences","CarbonateIonConcentration","carbonateSaturation","carbonDioxideConcentration","CFAMS","Chemical","Chironomids","ChronData","ChronDataTable","ChronModel","chronModeledBy","ChronProxySystem","ClayFraction","ClimateIndex","Coccolithophores","collectedFrom","Color","Compilation","compilationCitation","compilationDate","compilationVersion","Composition","contributor","coral","CRDS","d13C","d15N","d170","d180","d34S","Data","Dataset","datasetCitation","datasetDate","datasetLicense","datasetVersion","DataTable","dD","Density","description","detail","deuteriumExcess","Diffraction","DiffuseSpectralReflectance","DistributionTable","distributionTableGeneratedByModel","document","ElNinoIndex","Email","EnergyDispersiveSpectrometer","EnsembleTable","ensembleTableGeneratedByModel","equation","Faunal","Fe/Ca","Floral","Fluorescence","Foraminifera","foundInMeasurementTable","foundInTable","freeOxygenLevels",
			"fundedBy","Funding","fundingAgency","fundingCountry","GasChromatograph","GasChromatographyMassSpectrometer","Gastropods","GC-IR-MS","GCMS","generatedByModel","GlacierIce","GrainSize","grantNumber","hasCode","hasColumnNumber","hasDOI","hasExecutionCommand","hasExecutionEnvironment","hasFileName","hasIGSN","hasIntegrationTime","hasISBN","hasISSN","hasLink","hasMaxValue","hasMeanValue","hasMedianValue","hasMinValue","hasMissingValue","hasProxySystem","hasRank","hasResolution","hasUncertainty","hasUnits","hasValue","hasVariableID","Historic","housedAt","hybrid","Hydrology","IceSheet","ICP-AES","ICP-MS","ICP-OES","includesChronData","includesData","includesPaleoData","includesVariable","inferredFrom","InferredVariable","inferredVariableType","InorganicProxySensor","Instrument","IntegrationTime","Interpretation","interpretationDirection","interpretationReferences","interpretedAs","IRMS","isLocal","Isotope","IsotopeRatioMassSpectrometer","IsotopicComposition","issue","journal","julianDay","Karst","LA-ICP-MS","lakeSediment","LayerThickness","LeadIsotope","Li/Ca","Lithics","Location","Luminescence","MagneticSusceptibility","MajorElement" ,"MarineSediment","MassSpectrometer","MassSpectrometerInstrument","MC-ICP-MS", 
			"measuredBy","measuredOn","MeasuredVariable","MeasurementTable","methaneConcentration","method","Mg/Ca","Microscope","MineralMatter","Mn/Ca","Model","modeledBy","modelReferences","MoistureContent","Mollusk","MolluskShells","name","Neodymium","nino1" ,"Nino1Plus2","nino2","nino3","nino3_4","nino4","nitrousOxideConcentration","NonPeerReviewedPublication","northAtlanticOscillation","NOSAMSTandetron","notes","OceanChemistry","oceanMixedLayerTemperature","orcidNumber","OrganicIndex","OrganicMatter","OrganicProxySensor","Ostracods","pages","PaleoData","PaleoDataTable","PaleoModel","paleoModeledBy","PaleoProxySystem","palmerDroughtIndex","palmerDroughtSeverityIndex","partOfCompilation","Peat","PeerReviewedPublication","Permeability","Person","pH","Physical" ,"PhysicalSample","Polyp","Porosity","Precipitation","precipitationAmount","principalInvestigator","programmedIn","ProxyArchive","ProxyArchiveModel","proxyArchiveType","ProxyObservation","ProxyObservationModel","proxyObservationType","ProxySensor","ProxySensorModel","proxySensorType","ProxySystem","ProxySystemModel","Publication","publicationYear","publicationYear","Radiocarbon","radiocarbonAge","Radioisotope","Reflectance","relevantQuote","reportedIn","Resistivity",
			"Resolution","Rock","RockHammer","salinity","SandFraction","sclerosponge","scope","seasonality","seaSurfaceTemperature","SecondaryIonMassSpectrometer","sensorGenus","sensorSpecies","SHRIMP","Si","SiltFraction","SIMS","Snow","SoftwareCode","southernAnnularMode","southernOscillationIndex","Spectral","Spectrometer","Spectroscope","speleothem","Sr/Ca","StableCarbonIsotope","StableHydrogenIsotope","StableIsotope","StableNitrogenIsotope","StableOxygenIsotope","StableSulfurIsotope","standard","SummaryTable","summaryTableGeneratedByModel","surfaceAirTemperature","takenAtDepth","Temperature","TEX86","Time","title","TraceElement","Tree","U-Th","Uk37","Uk37Prime","Uncertainty","uncertaintyLevel","UncertaintyModel","Variable","Vegetation","volume","Watershed","WavelengthDispersiveSpectrometer","Wood","X-RayDiffraction","X-rayFluorescence","year","ZeissPetrographicMicroscope","Zn/Ca"};
					
	String desc23= "Here you can find a pointer to the main concepts and ontologies in the Linked Earth specification.";	
	String vocab24[]= {"Female","Male","Person","AdoptedDaughterOf","AdoptedSonOf","AncestorOf","AuntOf","BiologicalDaughterOf","BiologicalFatherOf","BiologicalMotherOf","BiologicalSonOf","BrotherOf","ChildOf","CommonLawHusbandOf","CommonLawWifeOf","CousinDe","CousinOf","DaughterInLawOf","DaughterOf","DescendantOf","DonorFatherOf","EggDonorOf","ExCommonLawHusbandOf","ExCommonLawWifeOf","ExGayHusbandOf","ExGayWifeOf","ExHusbandOf","ExPolyandrousWifeOf","ExPolygynousHusbandOf","ExStraightHusbandOf","ExStraightWifeOf","ExWifeOf","FatherOf","GayHusbandOf","GayWifeOf","GivenGirlOf","GivenSonOf","GrandChildOf","GrandDaughterOf","GrandFatherOf","GrandMotherOf","GrandParentOf","GrandSonOf","GreatGrandFatherOf","GreatGrandMotherOf","GreatGrandParentOf","HalfBrotherOf","HalfSiblingOf","HalfSisterOf","HusbandOf","LegalFatherOf","LegalMotherOf","MotherOf","NaturalDaughterOf","NaturalFatherOf","NaturalMotherOf","NaturalSonOf","NephewOf","NieceOf","ParentOf","PartnerOf","PolyandrousWifeOf","PolygynousHusbandOf","SeparatedFrom","SiblingOf","SisterOf","SonInLawOf","SonOf","StraightHusbandOf","StraightWifeOf","SurrogateDaughterOf","SurrogateOf","SurrogateSonOf","UncleOf","WidowerOf","WidowOf","WifeOf"};
	String desc24= "A Multilingual and Multicultural Ontology Representing Family Relationships";
	String vocab25[]= {"Accoustic Need","Action","Behavior","Building object","Coefficient","Concept","Concept Scheme","Constant Value Formula","Custom probability model","Day of week","Device","Driver","Driver set","Environment","Environmental parameter","Equipment","Event","Habit","HVAC","IAQ Need","Interaction","Interaction concept","Interaction Formula","Interaction scheme","Lighting device","Linear Formula","Logit Formula","Markov chain model","Meeting","Movement","Movement Model","Need","Non Physical Need","Normal probability model","Occupant","Operational mode concept","Operational mode scheme","Parameter Range","Person","Physical Need","Physical object","Property","Quadratic Formula","Random movement","Report","Season","Shading device","Space","Space occupancy","Spatial","Status transition","Status transition scheme","Status transition type concept","Thermal Need","Thermostat","Time","Time Of Day","Unit of measure","Unitary control elemen","Visual Need","Weibull Formula","Window","Inaction","indoor air quality","leaving room","monday","morning","night","noise","noon","on off","operable","rain","relative humidity","saturday","set to control value","short term leaving","short term visiting","solar irradiance",
			"broader","composed of","contains","defined by range","described by formula","describes parameter","detailed by","driven by","has behavior","has coefficient","has day of week","has environmental parameter","has independent variable","has meeting","has occupant","has operational mode","has season","has time of day","has transition type","has unit of measure","in scheme","influenced by need","interacts over","leads to","narrower","related to space","specified by","building address","coefficient value","control value","duration","early occur time","end season","end time","identifier","max number occupants","max range value","min number occupants","min range value","occupant age","occupant gender","occupant jobtype","occupant lifestyle","on holidays","percent time presence","probability","start season","start time","typical duration","typical time","adjustable","afternoon","arrival","continuous control","day","day light","departure","entering room","evening","fall","fixed","friday","glare","illuminance","spring","staying in room","summer","sunday","temperature","thursday","tuesday","turn off","turn on","wednesday","winter","zone on off"};
	
	String desc25= "The Occupancy Profile ontology has been developed to represent and define occupancy profiles in building spaces.";
	String vocab26[]= {"has acquaintance","has adoptive child / adoptive parent","has adoptive sibling","has group affiliation","has biological child / parent","has biological sibling","has child / parent","has child/parent-in-law" ,"has cohabitee","has colleague","has collaborator","has correspondent","has cousin","has employee / employer","has fiancee or fiance","has foster child / parent","has foster sibling","has friend","has godchild / godparent","has grandchild / grandparent","has half sibling","has illegitimate child / parent","has influence on / is influenced by","has in-law","has channel / is channel of","has chief / is chief of","has founder / is founder of","has member / is member of","has muse / is muse of","has lover","has multiple birth sibling","has murder victim / murderer","has aunt or uncle / niece or nephew","has ancestor / offspring","has professional contact","has relative","has sibling","has sibling-in-law","has spiritual contact","has spouse","has stepchild / stepparent","has stepsibling","has Student / teacher","has vital or lethal contact","has patron / is patron of","has physician / is physician of","n-ary classes","related Agent","corresponds to","corresponds to inverse","has acquaintance","has adoptive child","has adoptive parent","has adoptive sibling","has ancestor","has channel","has chief",
			"has child","has child-in-law","has cohabitee","has collaborator","has correspondent","has cousin","has employee","has employer","has fiancee or fiance","has founder","has friend","has godchild","has godparent","has grandchild","has grandparent","has half sibling","has illegitimate child","has illegitimate parent","has influence on","is influenced by","has-in-law","has lover","has member","has multiple birth sibling","has murder victim","has murderer","has muse","has niece or nephew","has object","has offspring","has parent","has parent-in-law","has patron","has physician","has professional contact","has relative","has sibling","has sibling-in-law","has spiritual contact","has spouse","has stepchild","has stepparent","has stepsibling","has Student","has subject","has subject or object","has teacher","has vital or lethal contact","is channel of","is chief of","is founder of","is member of","is muse of","is object","is patron of","is physician of","is subject","is subject or object","has validity period","related Agent","has begin date","has end date","has confidence value","has provenance","has GND code"}; 
				
	String desc26= "The ontology of agent relationships (AgRelOn) defines relations of persons to other persons and to organisations, since agents (persons, organisations) and their interconnections are important in the cultural heritage domain.";
	String vocab27[]= {"Aging","AlcoholicBeverage","Ale","AmericanWhiskey"," Beer","BeerBottle","BeerCocktail","BeerKeg","Beverage","BeverageCan","BourbonWhiskey","Brandy","Brewery","CanadianWhisky","CarbonatedWater","Cocktail","Cognac","Container","DilutedSoju","DistilledBeverage","DistilledSoju","Distillery","DryStout","Dunkel","FermentationBase","FermentedBeverage","FruitWine","Gin","GlassBottle","Highball","IrishRedAle","IrishWhiskey","JapaneseWhisky","Keg","Lager","Liqueur","Longneck","MaltWhisky"," MineralWater"," MixedDrink","Mocktail","NonAlcoholicBeer","NonAlcoholicBeverage","PaleAle","PaleLager","Pilsner","Pisco","PlasticBottle","Porter","RedWine","Rum","Sake","ScotchWhisky",
			"Shandy","SingleMaltScotch","SingleMaltWhisky","Soju"," SpeysideSingleMalt","Stout","Tequila","TequilaBlanco","Vodka","Water","Whisky","WhiteWine","Wine","abv","aging","brewery","color","container","description","distillery","duration","fermentation_base","food","ibu","ingredient","launch","manufacturer","material",
			"name","non_alcoholic_version","origin","previous_content","proof","quantity","related","similar","srm","variant","variantOf","volume"};
	String desc27= "Beverage Ontology is a Web vocabulary for describing beverages, mainly alcoholic.";
	String vocab28[]= {"Whisky","Whisky Review","Age","Aging cask","Alcohol by volume","Body","Brand","Brand","Cask","Character\n" + 
			"","Colour","Colour description","Distillery","Expression label","Finish","Finishing cask","Grain","Material","Nose","Owner","Palate","Previous contents","Region","Water source"};
	String desc28= "Here you can find a pointer to the main concepts and ontologies in the Linked Earth specification.";
	List<String>desc;
	List<String[]> myList;
	List<String>vocabnames;
	
	List<String>ls2;
	List<String>ls3;
	List<String>ls4;
	
	
	public vocabelements() {
		desc=new ArrayList<String>();
		ls4=new ArrayList<String>();
		ls3=new ArrayList<String>();
		ls2=new ArrayList<String>();
		myList = new ArrayList<String[]>();
		vocabnames=new ArrayList<String>();
		desc.add(desc1);
		desc.add(desc2);
		desc.add(desc3);
		desc.add(desc4);
		desc.add(desc5);
		desc.add(desc6);
		desc.add(desc7);
		desc.add(desc8);
		desc.add(desc9);
		desc.add(desc10);
		desc.add(desc11);
		desc.add(desc12);
		desc.add(desc13);
		desc.add(desc14);
		desc.add(desc15);
		desc.add(desc16);
		desc.add(desc17);
		desc.add(desc18);
		desc.add(desc19);
		desc.add(desc20);
		desc.add(desc21);
		desc.add(desc22);
		desc.add(desc23);
		desc.add(desc24);
		desc.add(desc25);
		desc.add(desc26);
		desc.add(desc27);
		desc.add(desc28);
		
		myList.add(vocab1);
		myList.add(vocab2);
		myList.add(vocab3);
		myList.add(vocab4);
		myList.add(vocab5);
		myList.add(vocab6);
		myList.add(vocab7);
		myList.add(vocab8);
		myList.add(vocab9);
		myList.add(vocab10);
		myList.add(vocab11);
		myList.add(vocab12);
		myList.add(vocab13);
		myList.add(vocab14);
		myList.add(vocab15);
		myList.add(vocab16);
		myList.add(vocab17);
		myList.add(vocab18);
		myList.add(vocab19);
		myList.add(vocab20);
		myList.add(vocab21);
		myList.add(vocab22);
		myList.add(vocab23);
		myList.add(vocab24);
		myList.add(vocab25);
		myList.add(vocab26);
		myList.add(vocab27);
		myList.add(vocab28);
		
		vocabnames.add("vann");
		vocabnames.add("foaf");
		vocabnames.add("dublincore");
		vocabnames.add("comicbookontology");
		vocabnames.add("geometrie");
		vocabnames.add("owl-schema");
		vocabnames.add("json-schema");
		vocabnames.add("rdf-schema");
		vocabnames.add("Persoon");
		vocabnames.add("AIISO");
		vocabnames.add("Sport Ontology");
		vocabnames.add("An Agent Certification Ontology");
		vocabnames.add("The Data Knowledge Vocabulary");
		vocabnames.add("50k Gazetteer");
		vocabnames.add("CTO: Construction Tasks Ontology");
		vocabnames.add("SAREF4AGRI");
		vocabnames.add("Vehicle Emissions Ontology");
		vocabnames.add("The ESCO ontology");
		vocabnames.add("AutomationML Ontology");
		vocabnames.add("Vehicle Sales Ontology");
		vocabnames.add("DBpedia");
		vocabnames.add("BIBFRAME");
		vocabnames.add("Linked Earth landing");
		vocabnames.add("Cedric-cnam");
		vocabnames.add("Occupancy Profile ontology");
		vocabnames.add("AGRELON, AN AGENT RELATIONSHIP ONTOLOGY");
		vocabnames.add("BEVON: Beverage Ontology");
		vocabnames.add("Whisky");
		
		
		uri[0]="http://purl.org/vocab/vann/";
		uri[1]="http://xmlns.com/foaf/spec/";
		uri[2]="https://www.dublincore.org/specifications/dublin-core/dcmi-terms/";
		uri[3]="https://comicmeta.org/cbo/";
		uri[4]="http://data.ign.fr/def/geometrie/20190212.html";
		uri[5]="https://www.w3.org/2002/07/owl";
		uri[6]="https://www.w3.org/2019/wot/json-schema#";
		uri[7]="https://www.w3.org/2000/01/rdf-schema#";
		uri[8]="https://data.vlaanderen.be/ns/persoon";
		uri[9]="https://vocab.org/aiiso/schema";
		uri[10]="https://www.bbc.co.uk/ontologies/sport";
		uri[11]="https://privatealpha.com/ontology/certification/1#";
		uri[12]="http://www.data-knowledge.org/dk/1.2/index-en.html";
		uri[13]="http://data.ordnancesurvey.co.uk/ontology/50kGazetteer/";
		uri[14]="https://mathib.github.io/cto-ontology/";
		uri[15]="https://saref.etsi.org/saref4agri/v1.1.2/";
		uri[16]="http://linkeddata.finki.ukim.mk/lod/ontology/veo#";
		uri[17]="https://ec.europa.eu/esco/resources/data/static/model/html/model.xhtml";
		uri[18]="http://i40.semantic-interoperability.org/automationml/Documentation/index.html";
		uri[19]="http://purl.org/vso/ns (RDF/XML, HTML)";
		uri[20]="https://dbpedia.org/ontology/";
		uri[21]="https://id.loc.gov/ontologies/bibframe.html";
		uri[22]="http://linked.earth/ontology/#";
		uri[23]="http://cedric.cnam.fr/isid/ontologies/PersonLink.owl#";
		uri[24]="https://bimerr.iot.linkeddata.es/def/occupancy-profile/#";
		uri[25]="https://d-nb.info/standards/elementset/agrelon";
		uri[26]="http://rdfs.co/bevon/latest/html";
		uri[27]="https://vocab.org/whisky/terms";
		
	}
	
	public List<String> findsimilarity(String st) {
		List<Double>counts=new ArrayList<>();
		int count=0;
		int count1=0;
		List<Double>ls=new ArrayList<Double>();
		List<String>ls1=new ArrayList<String>();

		StringEqualityPercentCheckUsingJaroWinklerDistance c=new StringEqualityPercentCheckUsingJaroWinklerDistance();
		for(int i=0;i<myList.size();i++) {
			count=0;
			count1=0;
			for(int j=0;j<myList.get(i).length;j++) {
					
					if((myList.get(i))[j].equalsIgnoreCase(st)) {
						count=count+20;
					}
					else {
					double d=c.similarity((myList.get(i))[j],st );
					
				if(d>=0.75) {
					count=count+1;
				}
					}
			
			
		}
				
			
			double e=(count);
			//System.out.println(myList.get(i)+" "+e);
			counts.add(e);
			
		
		}

		

		
		for(int i=0;i<vocabnames.size();i++) {
			if(counts.get(i)>=1) {
				int l=i;
				System.out.println(i);
				ls2.add(" "+vocabnames.get(l));
				ls3.add("Description: "+desc.get(l));
				ls4.add("IRI: "+uri[l]);
			}
			
			else {
				continue;
			}
			
			
		}
	
		
		for(int i=0;i<ls2.size();i++) {
			System.out.println(ls2.get(i));
			//System.out.println(counts.get(i));
			
		}
		return ls2;
    	}
		
    	public List<String> description(String st){
    		for(int i=0;i<ls3.size();i++) {
    			System.out.println(ls3.get(i));
    		}
    		return ls3;
    		
    	}
    	public List<String> URI(String st){
    		for(int i=0;i<ls4.size();i++) {
    			System.out.println(ls4.get(i));
    		}
    		return ls4;
    		
    	}

   public static void main(String args[]) {
		vocabelements d=new vocabelements();
		Scanner sc=new Scanner(System.in);
		//System.out.print("Enter description for ontology");
		
		String st= "Book";
		d.findsimilarity(st);
		d.description(st);
		d.URI(st);
		
		
		
	}

}
