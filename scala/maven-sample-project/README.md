#Code Quality tools for Maven
This sample project include all the plugin required for the following code quality metrics. 

###1. Scalastyle  
Below mvn command will print all the scala style warnings. 
```$xslt
mvn verify 
```

###2. Scoverage
The below command will print scoverage report as well on the terminal. Alternatively `mvn scoverage:check` can be run to check coverage. To configure reporting, please visit https://github.com/scoverage/scoverage-maven-plugin 
```$xslt
mvn verify 
```

###3. Copy paste detector
To get duplicate code please run:
```$xslt
mvn pmd:cpd
```

###4. Find security Bugs
To configure inclusion and exclusion of code where analysis can be performed, configure it as part of `spotbugs-security-exclude.xml` and `spotbugs-security-include.xml` in the base directory. (It is already configured in this example)
To get security bugs in your code run:
```$xslt
mvn compile
mvn spotbugs:spotbugs
```
An XML report is generated at target/findbugsXml.xml

###5. Scala formatter
To configure/include/exclude specific rules, change `.scalafmt.conf` in the base directory. The scala source will be formatted on compile by default. 
```$xslt
mvn compile
```

Note: The scala formatter plugin requires the `mvn` version >= 3.6.3