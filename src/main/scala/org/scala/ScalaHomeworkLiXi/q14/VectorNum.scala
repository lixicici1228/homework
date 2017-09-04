package org.scala.ScalaHomeworkLiXi.q14

class VectorNum(val vector : Vector[Int]) { //nice
  lazy val x = vector map (i => i*i)
  lazy val y = x reduce (_ +_)
  lazy val z = Math.sqrt(y) 
}
