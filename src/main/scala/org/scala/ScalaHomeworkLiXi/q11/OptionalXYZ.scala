package org.scala.ScalaHomeworkLiXi.q11

class OptionalXYZ {
  def getOption[A](x: Option[A], y: Option[A], z: Option[A]) = {
    x.getOrElse(y.getOrElse(z.getOrElse(None))) //you can also use `x orElse y orElse z`
  }
}
