package org.scala.ScalaHomeworkLiXi.q7

import org.scalatest.FunSpec
import org.scalatest.Matchers

class StringListToCharListTest extends FunSpec with Matchers {
  describe("StringListToCharList test"){
    
    info("""create list("abc","bce","feg")""")
    val list = List("abc","bce","feg")
        
    it("after call convert should get('a','b','c','b','c', 'e', 'f', 'e', 'g')"){
      ((new StringListToCharList).convert(list)) should be (List('a','b','c','b','c', 'e', 'f', 'e', 'g'))
    }
  }
}