package org.scala.ScalaHomeworkLiXi.q13

// No. Here is a method signature for you. The return type of the retry function should be the same as the input function. give it a try

// def retry[B](fn: => B)(implicit maxRetries: Int = 3, sleep: Duration = 1 second): B

import scala.concurrent.duration._

class Retry { 
  def retry[B](fn: => B)(implicit maxRetries: Int = 3, sleep: Duration = 1 second): B = 
    retryable[B](fn, maxRetries, sleep)
  
  def retryable[B](fn: => B, maxRetries: Int, sleep: Duration) : B = {
    if(maxRetries <=0) fn
    else{
      fn
      Thread.sleep(sleep.toMillis)
      retryable(fn, maxRetries -1, sleep)
    }
  }
}

// already changed the class according to the comment