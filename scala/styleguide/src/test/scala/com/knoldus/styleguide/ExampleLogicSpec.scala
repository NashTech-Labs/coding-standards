package com.knoldus.styleguide

import org.scalatest.{Matchers, WordSpec}

class ExampleLogicSpec extends WordSpec with Matchers {

  "ExampleLogic.getResult" should {
    "return valid output" in {
      ExampleLogic.getResult shouldBe "13null"
    }
  }

}
