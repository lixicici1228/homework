package org.scala.ScalaHomeworkLiXi.q3

import org.scalatest.FunSpec
import org.scalatest.Matchers

class CompareTest extends FunSpec with Matchers{

  describe("Compare test"){ //Almost right but check my comments in the main/q3
    
    val compare = new Compare(10.001)
    
    it("~= method have an default difference constant "){   
      (compare ~= 10.002) should be (true)
    }
    
    it("~= method constant value could be configurable"){
      (compare.~=(10.002)(3)) should be (false)
      (compare.~=(10.05)(1)) should be (true)
    }
    
    it("~= method constant value could be configured implicitly"){
      implicit val constant: Int = 3
      (compare ~= 10.001) should be (true) 
      (compare ~= 10.002) should be (false)
    }
    
    it("~= method could be used on Double value directly"){
      import Compare._
      implicit val constant: Int = 1
      (10.001 ~= 10.06) should be (true)
      (10.001 ~= 9.5) should be (false)
      
    }
  }
}
// already changed according to the comment