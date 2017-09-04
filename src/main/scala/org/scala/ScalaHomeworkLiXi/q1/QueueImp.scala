package org.scala.ScalaHomeworkLiXi.q1;

class QueueImp extends Queue{
  private var CAPACITY = 10
  private var size = 0;
  private var arr : Array[String] = new Array[String](CAPACITY) // Make it private
  
  override def put (elem : String) = {
    if(size >= CAPACITY) grow()
    arr(size) = elem
    size += 1
    true
  }
  def grow() = {
    CAPACITY = CAPACITY + (CAPACITY>>1)
    var newArr = new Array[String](CAPACITY)
    Array.copy(arr, 0, newArr, 0, arr.length)
    arr = newArr
  }
  override def get() : Option[String] = { //Nice
    if(size == 0) None
    else{
      val res = arr(0)
      size -= 1
      if(size > 0) Array.copy(arr, 1, arr, 0, size)
      arr(size) = null
      Some(res)
    }
  }
  
  override def getSize(): Int = this.size
}
