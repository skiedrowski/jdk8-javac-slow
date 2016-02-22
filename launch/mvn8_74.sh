#!/bin/sh

cd ..
export JAVA_HOME=`/usr/libexec/java_home -v 1.8.0_74`
mvn clean package -DskipTests=true

