package org.scala.ScalaHomeworkLiXi.q2

import org.scalatest.Matchers
import org.scalatest.FunSpec
import org.scala.ScalaHomeworkLiXi.q1.QueueImp


class QueueReverseTest extends FunSpec with Matchers{
  describe("Queue reverse"){
    val queue = new QueueImp() with QueueReverse
    queue.put("first")
    it("input string should be reversed"){
      queue.get should be (Some("tsrif"))
    }
  }
}