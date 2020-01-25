# Ontoseer
This document provides documentation for the first version of OntoSeer.OntoSeer is a tool that monitors the ontology development process andprovides suggestions in real time to improve the quality of the ontology under development.


# Table of Contents
1. [ Introduction. ](#intro)

2. [ About the Repository. ](#repo)

3. [ TBox Details. ](#tbox)

4. [ Usage. ](#usage)

   4.1 [ Direct execution using executable jar (with default configurations). ](#exe)
   
   4.2 [ Using Source Code (with or without default configurations). ](#code)
   
5. [ Future Work. ](#future)
<a name="intro"></a>
## 1. Introduction
OWl 2 is gaining popularity in a variety of domains because of its high level of expressivity. OWL 2 has several profiles such as OWL 2 EL, OWl 2 QL, OWL 2 RL, and OWL 2 DL that vary in terms of their expressivity and reasoning performance. There are several OWL 2 reasoners (Hermit, JFact, Openllet) and some SPARQL query engines (Stardog, GraphDB, Virtuoso) that are backed by OWL 2 Reasoners so as to help answer queries that involve reasoning. OWL2Bench is our first step towards a standard benchmark for all the OWL 2 profiles. Our benchmark is an extension of well known University Ontology Benchmark (UOBM). OWL2Bench includes TBox for each profile covering the set of constructs supported by that profile, generation of synthetic data scalable to arbitrary size and a separate set of SPARQL queries for each profile to be executed over generated data for performance evaluation of several reasoners and SPARQL query engines.

The images below represent a subset of TBox and ABox. First image represents the TBox i.e classes and relationships that exist between them. Relationships written in red represent added OWL 2 constructs. Second image represents the ABox (generated instances) red dashed edges in the ABox represent the interlinks across Universities.
                            
			    
## Prerequisites

1. User should have Protege installed in the machine .Version  should be >5.0.0.

 	If one is not having protege or protege5.0.0 or higher installed they can download latest version of protege from https://protege.stanford.edu/products.php based on machine’s operating system:
	

2. JRE should be installed in user machine and version should be  >1.8
   To check for java version one can type java -version in terminal.The following will be the output. 
   ![java-version check](/home/pramit67/Desktop/Onto1.png)


## Installation Guide

1.One can downlaod Ontoseer.jar file from the  following link:

https://github.com/kracr/ontoseer/releases

The link to download the code repository and instruction manual is :

https://github.com/kracr/ontoseer

2. Click on Assets->Ontoseer.jar

The jar file will get downloaded.

To copy the source code and jar file clone the github repository using   :

       git clone https://github.com/kracr/ontoseer


3. Copy the jar file to the plugins folder of Protege.

a. Click on the plugins folder.

4. Restart Protege.

5. Go to about Section of Protege and check whether the plugin has been correctly installed or not .It will be shown in the window.


6. Click on Windows. Click on Tabs .Click on Example Tab.This window will appear.

Now Start Building your Ontology.

For tutorial on ontology building one can refer to the Protege tutorial. This can be found in the following link:

https://cgi.csc.liv.ac.uk/~frank/teaching/comp08/protege_tutorial.pdf .

For more information for using OntoSeer please go through **OntoSeer_Manual.pdf** file present in master branch of OntoSeer. 

*All the other files necessary for using OntoSeer along with dataset are present in github page.*



