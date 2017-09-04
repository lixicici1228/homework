package org.scala.ScalaHomeworkLiXi.q5

// You can make TimeIt an object so you can import the function anywhere just by doing `import TimeIt._`
// and call 

// time { 
//  someMethod() 
// }

object timeit { 
  def time[A](f: => A): A = {
    val start = System.currentTimeMillis
    val res = f
    val end = System.currentTimeMillis
    println(s"During for the code runtime is ${end - start}")
    res
  }
}

// already change according to the comment