name := "scala-style-guide"

organization := "com.knoldus"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "org.scalatest"              %% "scalatest"              % "3.0.0"            % "test"
)

//Scoverage Related Settings

coverageMinimum := 90

coverageFailOnMinimum := true

coverageHighlighting := true

//Scapegoat versioning
scapegoatVersion in ThisBuild := "1.3.8"

//Copy paste minimum duplicate tokens to declare it as duplicate code, It can be larger but set it here to 5 for demo purpose.
cpdMinimumTokens := 5
