package org.scala.ScalaHomeworkLiXi.q5

import org.scalatest.FunSpec
import org.scalatest.Matchers

class timeitTest extends FunSpec with Matchers{
  describe("timeit test"){
    it("timeit method return the original output of the block"){
      def productRange(a: Int, b: Int): Int = (a to b) reduce (_*_)
      val res = productRange(1, 10)
      val time = timeit.time(productRange(1, 10)) 
      res should equal (time)
    }
  }
}

// We can verify the output written using a quirky approach like mine below
/*
import org.specs2.mutable.Specification

import scala.util.Try

class Wiki5TimeitSpec extends Specification {
  import Wiki5Timeit._

  "Timeit" should {

    "print the time taken and also return the result of the given block" in {
      val stream = new java.io.ByteArrayOutputStream()
      try {
        Console.withOut(stream) {
          val a = timeit {
            Thread.sleep(1000)
            1 + 1
          }

          a must be_==(2)

          val pattern = "(Timetaken: )(\\d+).*".r

          val pattern(text, number) = stream.toString.replaceAll("[\\r\\n]", "")
          text must be_==("Timetaken: ")
          number.toInt must be_>=(1000)
        }
      } finally {
        Try(stream.close)
      }
    }

  }
}
*/
