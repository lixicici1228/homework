

package org.scala.ScalaHomeworkLiXi.q1;

trait Queue {
   def put(elem : String): Boolean
   def get: Option[String] //Having Option as return type was a good idea
   def getSize: Int
}
