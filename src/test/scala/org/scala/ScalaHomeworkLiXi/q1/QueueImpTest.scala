package org.scala.ScalaHomeworkLiXi.q1;

import org.scalatest.Matchers
import org.scalatest.{FunSpec, GivenWhenThen}

class QueueImpTest extends FunSpec with GivenWhenThen with Matchers { 
  
  describe("empty Queue"){

    val queue = new QueueImp()
    
    it("should implement Queue"){
      queue.asInstanceOf[Queue] === (true)
    }
    
    it("get method for empty Queue should be None"){
      queue.get should be (None)
    }
    
    it("after put method the size of Queue should be 1"){
      if(queue.put("first")) queue.getSize() should be (1)
    }
  }
  
  describe("nonEmpty Queue"){
    Given("Queue with two element")
    val queue = new QueueImp()
    queue.put("first")
    queue.put("second")
     
    it("after put method the size of Queue should be 3"){
      if(queue.put("third")) queue.getSize should be (3)
    }
    
    it("get method should get 'first' and after it queue size should be 2"){
      queue.get should be (Some("first"))
      queue.getSize should be (2)
    }
    
    it("get queue three times, the second one should be 'third' , the last one should be None"){
      queue.get
      queue.get should be (Some("third"))
      queue.get should be (None)
    }
    
  }
}