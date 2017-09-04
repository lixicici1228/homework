package org.scala.ScalaHomeworkLiXi.q15


 // I think you just need to pick the middle value after sorting



object Median{
  def medianInt(seq: Seq[Int]): Double = {
    val sort = seq.sorted
    val len = sort.length
    if(len %2 == 0) (sort(len/2)+sort(len/2-1)) /2.0
    else sort(len/2)
  }
  
  def medianDouble(seq: Seq[Double]): Double = {
    val sort = seq.sorted
    val len = sort.length
    if(len %2 == 0) (sort(len/2)+sort(len/2-1)) /2
    else sort(len/2)
  }
}
// already changed according to the comment



