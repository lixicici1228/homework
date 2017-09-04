package org.scala.ScalaHomeworkLiXi.q3

class Compare (val a: Double) {
  def ~=(b:Double)(implicit constant: Int = 2): Boolean = Math.abs(a-b) <= Math.pow(0.1, constant) //No! This question is like allowing 4.001 and 4.002 to be compared as equal. In this case the constant is 2 digits.
}

object Compare {
  implicit def createInstance(a: Double) : Compare = new Compare(a)
}

//already changed according to the comment