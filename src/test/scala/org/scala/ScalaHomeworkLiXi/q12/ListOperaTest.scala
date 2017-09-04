package org.scala.ScalaHomeworkLiXi.q12

import org.scalatest.FunSpec
import org.scalatest.Matchers

class ListOperaTest extends FunSpec with Matchers{
  describe("ListOpera test"){
    it("should return (3.0, 15.0) when input list(1, 2, 3, 4) and map(1 -> 3, 3 -> 5)"){
      (new ListOpera).listMultiply(List(1, 2, 3, 4), Map(1 -> 3, 3 -> 5)) should be (List(3.0, 15.0))
    }
  }
}