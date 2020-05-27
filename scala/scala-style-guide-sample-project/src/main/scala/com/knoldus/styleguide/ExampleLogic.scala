package com.knoldus.styleguide

object ExampleLogic {

  def getResult = {
    val randomResul1 = 13
    val Randomoutput = null
    randomResul1 + Randomoutput
  }

  //Duplicating everything for sbt-cpd
  def getResult1 = {
    val randomResul1 = 13
    val Randomoutput = null
    randomResul1 + Randomoutput
  }

  def main (args: Array[String]) = {
    //Potential FindSecurity Bug
    val file = new java.io.File(args(0))
    println(s"The file contents are:${file.setReadable(false)}")
  }
}
