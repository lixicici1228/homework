package org.scala.ScalaHomeworkLiXi.q4

import org.scalatest.FunSpec
import org.scalatest.Matchers


class GCDTest extends FunSpec with Matchers{

  describe("GCD test"){
    it("GCD of 18 and 12 should be 6"){
      val gcd = new GCD
      (gcd.gcd(18, 12)) should be (6)
    }
  }
}