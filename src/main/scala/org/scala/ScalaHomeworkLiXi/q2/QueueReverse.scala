
package org.scala.ScalaHomeworkLiXi.q2

import org.scala.ScalaHomeworkLiXi.q1.Queue

trait QueueReverse extends Queue{
  abstract override  def put(elem : String): Boolean = {
    super.put(elem.reverse)
  }
}