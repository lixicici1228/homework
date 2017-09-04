package org.scala.ScalaHomeworkLiXi.q15

import org.scalatest.FunSpec
import org.scalatest.Matchers

class MedianImpTest extends FunSpec with Matchers{
  describe("MedianImp test"){
    
    
    it("median of (2,1,3,4) should be 2.5"){
      Median.medianInt(Seq(2,1,3,4)) should be (2.5)
    }
    
    it("median of(2,1,3,4,5) should be 3"){
      Median.medianInt(Seq(2,1,3,4,5)) should be(3)
    }
    
    it("median of(1.1,2.2,3.3,4.4) should be 2.75"){
       Median.medianDouble(Seq(1.1, 2.2, 3.3, 4.4)) should be (2.75)
    }
    
    it("median of(1.1,2.2,3.3,4.4,5.5) should be 3.3"){
      Median.medianDouble(Seq(1.1, 2.2, 3.3, 4.4, 5.5)) should be (3.3)
    }
  }
}