# Ontoseer
This document provides documentation for the first version of OntoSeer.OntoSeer is a tool that monitors the ontology development process andprovides suggestions in real time to improve the quality of the ontology under development.


# Table of Contents
1. [ Introduction. ](#intro)

2. [ Pre-Requisites. ](#prerequisites)

3. [ Installation Guide. ](#InstallationGuide)

	3.1 [Using Source Code](#code)
	
	3.2 [Downloading .jar files](#exe)

4. [ User Manual. ](#UserManual)

   4.1 [ ODP Recommendation ](#ODP)
   
   4.2 [ Vocab and Alternate Name Recommendation ](#Vocab)
   
   4.3 [ Naming Convention Recommendation ](#Naming)
   
   4.4 [ Axiom Recommendation ](#Axiom)
   
5. [ Future Work. ](#future)

<a name="intro"></a>

## 1. Introduction
Building an ontology is not only a time consuming process,but it is also confusing, especially for beginners and the inexperienced.Although ontology developers can take the help of domain experts in building an ontology, they are not easily available in several cases for a variety of reasons. Ontology developers have to grapple with several questions related to the choice of classes, properties and the axioms that should be included. Apart from this, there are aspects such as modularity and reusability that should be taken care of. From among the thousands of publicly available ontologies and vocabularies such as Linked Open Vocabularies (LOV), it is hard to know the terms (classes and properties) that can be reused in the development of an ontology. Similar problem exists in implementing the right set of ontology design patterns (ODPs)
from among the several available. Generally, ontology developers make use of their experience in handling these issues, and the inexperienced ones have a hard time. In order to bridge this gap, we propose a tool named OntoSeer, that monitors the ontology development process and provides suggestions in real time to improve the quality of the ontology under development. It can provide suggestions on the naming conventions to follow, vocabulary to reuse, ODPs to implement, and axioms to
be added to the ontology.
                            
<a name="prerequisites"></a>

## 2.Prerequisites

1. User should have Protege installed in the machine. Version should be >5.0.0.

 	If one is not having protege or protege5.0.0 or higher installed they can download latest version of protege from https://protege.stanford.edu/products.php based on machine’s operating system:
	

2. JRE should be installed in user machine and version should be  >1.8.
   To check for java version one can type java -version in terminal.The following will be the output. 
   ![java-versioncheck](https://github.com/kracr/ontoseer/blob/master/Images/Onto1.png)

<a name="InstallationGuide"></a>

## 3.Installation Guide

In this section we will discuss how one can download OntoSeer.

<a name="code"></a>

## 3.1 Using Source Code

<a name="exe"></a>

## 3.2 Downloading .jar files

1.One can downlaod Ontoseer.jar file from the  following link:
	
	https://github.com/kracr/ontoseer/releases
	
![OntoSeer jar](https://github.com/kracr/ontoseer/blob/master/Images/Onto2.png)	

The link to download the code repository and instruction manual is :

	https://github.com/kracr/ontoseer

2. Click on Assets->Ontoseer.jar

![OntoSeer jar](https://github.com/kracr/ontoseer/blob/master/Images/Onto3.png)	

The jar file will get downloaded.

3. Copy the jar file to the plugins folder of Protege.

a. Click on the plugins folder.

![OntoSeer_jar_plugin](https://github.com/kracr/ontoseer/blob/master/Images/Onto4.png)	

b.Copy OntoSeer.jar in the plugin folder.

![OntoSeer_jar_plugin_folder](https://github.com/kracr/ontoseer/blob/master/Images/Onto6.png)





4. Restart Protege.

5. Go to about Section of Protege and check whether the plugin has been correctly installed or not .It will be shown in the window.

![OntoSeer_jar_plugin_About](https://github.com/kracr/ontoseer/blob/master/Images/OntoSeer3.png)

6. Click on Windows. Click on Tabs .Click on Example Tab.This window will appear.

![OntoSeer_jar_plugin_Actual_Tab](https://github.com/kracr/ontoseer/blob/master/Images/OntoSeer4.png)

Now Start Building your Ontology.

For tutorial on ontology building one can refer to the Protege tutorial. This can be found in the following link:

https://cgi.csc.liv.ac.uk/~frank/teaching/comp08/protege_tutorial.pdf .

For more information for using OntoSeer please go through **OntoSeer_Manual.pdf** file present in master branch of OntoSeer. 


<a name="UserManual"></a>

## 4.User Manual
 
 This section discusses how OntoSeer can be used  along with Protege to get various recommendations.
 
 <a name="ODP"></a>
 
 ## 4.1 ODP Recommendation
 1. Click On Odp button.
 
 ![OntoSeer ODP](https://github.com/kracr/ontoseer/blob/master/Images/Ontoseer2.png)
 
2. Enter description of the ontology that one is trying to make ,through terminal.Alternatively domain
name,name of class and properties one want to make or can additively provide with the competency
questions.One can provide additional comments also. But one have to make sure that they are actually
answering at least one of the question as it is necessary to get recommendation. But the
recommendation will get better if one provide answer to as many questions as one can.

 ![OntoSeer ODP reco](https://github.com/kracr/ontoseer/blob/master/Images/Ontoseer5.png)
 
3. Get Recommendation. The recommendation is based on the data that we have scraped from 223
ODPs that we collected from http://ontologydesignpatterns.org/wiki/Community:ListPatterns

 ![OntoSeer_jar_ODP_reco_show](https://github.com/kracr/ontoseer/blob/master/Images/Ontoseer6.png)
 
  <a name="Vocab"></a>
 
 ## 4.2 Vocab and Alternate Name Recommendation
 
 1. One should start buliding classes and properties in Protege .For example:-
  ![OntoSeer_jar_Vocab](https://github.com/kracr/ontoseer/blob/master/Images/Ontoseer7.png)
 2. Click on VocabSuggestion button.
  ![OntoSeer_jar_Vocab_reco](https://github.com/kracr/ontoseer/blob/master/Images/Ontosser8.png)
 3. Get Recommendation.The recommendation will be based on the results retrieved after querying
LOV https://lov.linkeddata.es/dataset/lov/suggest and bioportal
https://bioportal.bioontology.org/recommender
 ![OntoSeer_jar_Vocab_reco_show](https://github.com/kracr/ontoseer/blob/master/Images/Ontoseer9.png)
 
  <a name="Naming"></a>
  
 ## 4.3 Naming Convention Recommendation 
 
 1. One should start buliding classes and properties in Protege .For example:-
   ![OntoSeer_jar_Name](https://github.com/kracr/ontoseer/blob/master/Images/Ontoseer7.png)
 2. Click on the Refresh button.
   ![OntoSeer_jar_Name_reco](https://github.com/kracr/ontoseer/blob/master/Images/Ontoseer10.png)
 3. Get Recommendations.
 ![OntoSeer_jar_Name_reco_show](https://github.com/kracr/ontoseer/blob/master/Images/OntoSeer11.png)
 <a name="Axiom"></a>
 
 ## 4.4 Axiom Recommendation 
1. Start building the ontologies .
  ![OntoSeer_jar_Name](https://github.com/kracr/ontoseer/blob/master/Images/Ontoseer7.png)
2. Click on Axiom Recommendation button .
3. Get the recommendations. The recommendation will be shown on the basis of the Manchester Owl
corpus that we have downloaded .

<a name="future"></a>
## 5.Future Work

As part of future work, we plan to engage in a dialogue with the ontology developer to resolve confusing issues such as having some term as a class vs.property vs. instance, and help user in creating a good subclass hierarchy. This confusion will be resolved by asking the ontology developer a series of questions such as does the term interact with other concepts, are the terms very specific or general, if a term is made into a class, what will be its instances? A good subclass hierarchy can be created by asking questions such as is the subclass a specialization of the superclass, are the classes rigid or anti-rigid etc.



