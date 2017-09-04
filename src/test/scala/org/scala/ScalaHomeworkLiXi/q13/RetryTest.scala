package org.scala.ScalaHomeworkLiXi.q13

import org.scalatest.FunSpec
import org.scalatest.Matchers
import scala.concurrent.duration._

class RetryTest extends FunSpec with Matchers {
  describe("Retry test"){
    
    it("automatically retry 3 times and sleep 1s when fails"){
      var count = 0
      (new Retry).retry{
        count += 1
      }
      count should be (4)
    }
    
    it("could config retry times and sleep time"){
      implicit val maxRetries = 5
      implicit val sleep = Duration(100, "millis")
      var count = 0
      (new Retry).retry{
        count += 1
      }
      count should be (6)
    }
  }
}