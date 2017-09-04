package org.scala.ScalaHomeworkLiXi.q11

import org.scalatest.FunSpec
import org.scalatest.Matchers

class OptionXYZTest extends FunSpec with Matchers{
  describe("OptionalXYZ test"){
    
    info("instance of OptionalXYZ")
    val ins = new OptionalXYZ
    
    it("2, 5, 8 should be 2"){
      ins.getOption(Some(2), Some(5), Some(8)) should be (2)
    }
    
    it("None, 5, 8 should be 5"){
      ins.getOption(None, Some(5), Some(8)) should be (5)
    }
    
    it("None, None, 8 should be 8"){
      ins.getOption(None, None, Some(8)) should be (8)
    }
    
    it("None, None, None should be None"){
      ins.getOption(None, None, None) should be (None)
    }
  }
}