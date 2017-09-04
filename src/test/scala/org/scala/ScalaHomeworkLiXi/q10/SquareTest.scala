package org.scala.ScalaHomeworkLiXi.q10

import org.scalatest.FunSpec
import org.scalatest.Matchers

class SquareTest extends FunSpec with Matchers{
  describe("Square test"){
    
    info("create list(1, 2, 3, 4, 5)")
    val list = List(1, 2, 3, 4, 5)
    
    it("after call squareList should get (1, 4, 9, 16, 25)"){
      (new Square).squareList(list) should be (List(1, 4, 9, 16, 25))
    }
    
    it("after call squareMapList should get (1, 4, 9, 16, 25)"){
      (new Square).squareMapList(list) should be (List(1, 4, 9, 16, 25))
    }
  }
}