package org.scala.ScalaHomeworkLiXi.q7

class StringListToCharList {
  def convert(list: List[String]) : List[Char] = {
    list flatMap (_.toList)
  }
}