package org.scala.ScalaHomeworkLiXi.q14

import org.scalatest.FunSpec
import org.scalatest.Matchers

class VectorNumTest extends FunSpec with Matchers{
  describe("VectorNum test"){
    info("create a vector (1, 2, 3, 4, 5)")
    val vector = Vector(1, 2, 3, 4, 5)
    
    it("the x value should be (1, 4, 9, 16, 25), y value should be 55, z value should be Math.sqrt(55)"){
      val ins = new VectorNum(vector)
      ins.x should be (Vector(1, 4, 9, 16, 25))
      ins.y should be (55)
      ins.z should be (Math.sqrt(55))
    }
  }
}