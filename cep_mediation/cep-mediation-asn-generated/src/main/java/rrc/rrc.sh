#!/bin/sh

JAVAC=${1:-${JAVAC:-javac}}
$JAVAC *.java
$JAVAC constant_definitions/*.java
$JAVAC informationelements/*.java
$JAVAC internode_definitions/*.java
$JAVAC pdu_definitions/*.java
$JAVAC class_definitions/*.java
