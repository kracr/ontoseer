#!/bin/bash
java /OntoSeer/src/main/java/edu/stanford/bmir/protege/examples/view/indices.java
mvn clean install
java -jar -OntoSeer.awt.UIElement="true" target/OntoSeer.jar -h
