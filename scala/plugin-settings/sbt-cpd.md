#sbt-cpd
This is an sbt plugin for duplicate code detection using Copy/Paste Detector (CPD) from the PMD project. The installation and integration settings are described in the [plugin page](https://github.com/sbt/sbt-cpd).

##Configuration
There is one specific configuration we should always check in the plugin config is `cpdMinimumTokens` which is `Minimum number of tokens of potential duplicates.` The full list of settings can be found at the [plugin settings](https://github.com/sbt/sbt-cpd#settings)
The length of the Token can be adjusted such that logical or compuational part of the code or method is not duplicated. There might be some Constants or project specific duplication which are required may come under exception.
 



