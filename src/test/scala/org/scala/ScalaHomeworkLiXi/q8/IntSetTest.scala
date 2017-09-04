package org.scala.ScalaHomeworkLiXi.q8

import org.scalatest.FunSpec
import org.scalatest.Matchers

class IntSetTest extends FunSpec with Matchers {
  describe("IntSet test") {
    
    info("create IntSet(1,2,3,4,5)")
    val set = (new EmptySet).incl(1).incl(2).incl(3).incl(4).incl(5)

    it("isEmpty in emptySet should be true and in nonEmptySet should be false") {
      (new EmptySet).isEmpty should be (true)
      set.isEmpty should be (false)
    }

    it("should contain all the element created: 1, 2, 3, 4, 5") {
      List(1, 2, 3, 4, 5) foreach (set.contains(_) should be (true))
    }

    it("should not contain other element not in set: 0, 6, 7") {
      List(0, 6, 7) foreach (set.contains(_) should be (false))
    }

    it("should not contain element that have be excl: 2, 4") {
      val set1 = set.excl(2).excl(4)
      List(2, 4) foreach (set1.contains(_) should be (false))
      List(1, 3, 5) foreach (set1.contains(_) should be (true))
    }

    it("should contain (1, 2, 3, 4, 5, 0, 6, 7) if set union with other set (0, 6, 7) that have these elem") {
      val set1 = (new EmptySet).incl(0).incl(6).incl(7)
      val set2 = set union set1
      List(1, 2, 3, 4, 5, 0, 6, 7) foreach (set2.contains(_) should be (true))
      List(-1, -1, 8, 9) foreach (set2.contains(_) should be (false))
    }

    it("should only contain (2, 4) when intersection with other set(-2, 0, 2, 4, 6)") {
      val set1 = (new EmptySet).incl(-2).incl(0).incl(2).incl(4).incl(6)
      val set2 = set intersection set1
      List(2, 4) foreach (set2.contains(_) should be (true))
      List(-2, 0, 1, 3, 5, 6) foreach (set2.contains(_) should be (false))
    }
  }
}