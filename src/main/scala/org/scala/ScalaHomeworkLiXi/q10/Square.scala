package org.scala.ScalaHomeworkLiXi.q10

class Square {
  def squareList(xs: List[Int]) : List[Int] = xs match {
    case List() => List()
    case y :: ys => (y * y)::squareList(ys)
  }
  
  def squareMapList(xs: List[Int]) : List[Int] = 
    xs map (i => i*i)
}