# coding-standards-java

Code Quality plugins which should be used in every Java projects.

## Checkstyle
Checkstyle can check many aspects of your source code. It can find class design problems, method design problems. It also has the ability to check code layout and formatting issues.


#### What is checkstyle?
Checkstyle is a development tool to help programmers write Java code that adheres to a coding standard. It automates the process of checking Java code to spare humans of this boring (but important) task. This makes it ideal for projects that want to enforce a coding standard.

Checkstyle is highly configurable and can be made to support almost any coding standard
#### How to run Checkstyle?

``` sh
mvn checkstyle:checkstyle
```

## PMD


####What is PMD?
PMD is a source code analyzer. It finds common programming flaws like unused variables, empty catch blocks, unnecessary object creation, and so forth. It supports Java, JavaScript, Salesforce.com Apex and Visualforce, PLSQL, Apache Velocity, XML, XSL.

#### How to run PMD?
``` sh
mvn pmd:pmd
```
Note - Additionally it includes CPD, the copy-paste-detector. CPD finds duplicated code in Java, C, C++, C#, Groovy, PHP, Ruby, Fortran, JavaScript, PLSQL, Apache Velocity, Scala, Objective C, Matlab, Python, Go, Swift and Salesforce.com Apex and Visualforce. So, we do not have to integrate a CPD plugin seperately.

##Spotbugs
#### What is Spotbugs?
SpotBugs is a program which uses static analysis to look for bugs in Java code. SpotBugs is the spiritual successor of FindBugs, carrying on from the point where it left off with support of its community.

SpotBugs requires JRE (or JDK) 1.8.0 or later to run. However, it can analyze programs compiled for any version of Java, from 1.0 to 1.9

#### How to run Spotbugs?

``` sh
mvn compile
mvn spotbugs:check // To run the scan
mvn spotbugs:spotbugs // Run the scan and generate report
mvn spotbugs:gui // Run the scan and show on GUI.
```

##JaCoCo
####What is JACOCO?
JaCoCo is a free code coverage library for Java.
JaCoCo runs as a Java agent, it is responsible for instrumenting the bytecode while running the tests. JaCoCo drills into each instruction and shows which lines are exercised during each test.

####How to run JaCoCo?
``` sh
mvn test 
```
Also, please bind all the code quality plugins to the verify phase of the maven build so that with one single command you could run all the plugins as part of you application's build.

Note - Configuration for all the code quality can be found under Java folder of this repository. Please refer to the configuration for setting up the plugin in you project's build.