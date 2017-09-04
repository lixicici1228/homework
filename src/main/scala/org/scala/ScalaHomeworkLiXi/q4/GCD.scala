package org.scala.ScalaHomeworkLiXi.q4

import scala.annotation.tailrec

class GCD {
  @tailrec
  final def gcd(m : Int, n: Int): Int = {  //nice
    m%n match {
      case 0 => n
      case b => gcd(n, b)
    }
  }
}