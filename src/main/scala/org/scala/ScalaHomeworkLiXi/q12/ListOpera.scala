package org.scala.ScalaHomeworkLiXi.q12

class ListOpera {
  def listMultiply(list: List[Int], map: Map[Int, Double]) = 
    list withFilter(i => map.contains(i)) map ( i =>  i*map(i))  // you can use collect instead of filter + map
}