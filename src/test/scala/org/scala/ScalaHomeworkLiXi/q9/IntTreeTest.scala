package org.scala.ScalaHomeworkLiXi.q9

import org.scalatest.FunSpec
import org.scalatest.Matchers

class IntTreeTest extends FunSpec with Matchers{
  describe("IntTree test"){
    
    info("create IntTree of (4, 5, 6)")
    val tree = Node(5, Node(4, EmptyTree, EmptyTree), Node(6, EmptyTree, EmptyTree))
    
    it("should contain 4, 5, 6"){
      List(4, 5, 6) foreach (IntTree.contains(tree, _) should be (true))
    }
    
    it("should not contain other element: 3, 7, 8"){
      List(3, 7, 8) foreach (IntTree.contains(tree, _) should be (false))
    }
    
    it("should contain element(4, 5, 6, 3, 7, 8) after insert corresponding element"){
      val tree1 = IntTree.insert(IntTree.insert(IntTree.insert(tree, 3), 7), 8)
      List(4, 5, 6, 3, 7, 8) foreach (IntTree.contains(tree1, _) should be (true))
    }
  }
}