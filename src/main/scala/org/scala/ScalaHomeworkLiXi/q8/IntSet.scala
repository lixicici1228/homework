package org.scala.ScalaHomeworkLiXi.q8

trait IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int) : Boolean
  
  def union(set: IntSet) : IntSet
  def intersection(set: IntSet) : IntSet
  def isEmpty: Boolean
  def excl(x: Int) : IntSet 
}

class EmptySet extends IntSet { //nice
  def contains(x: Int): Boolean = false
  def incl(x: Int) : IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)
  
  def union(set: IntSet): IntSet = set
  def intersection(Set: IntSet) = this
  def isEmpty = true
  def excl(x: Int) = this
}

class NonEmptySet(val elem: Int, val left: IntSet, val right: IntSet) extends IntSet {
  def contains(x: Int): Boolean = 
    if (x < elem) left contains x
    else if( x> elem) right contains x
    else true
    
  def incl(x: Int): IntSet = 
    if ( x< elem) new NonEmptySet(elem, left incl x, right)
    else if ( x > elem) new NonEmptySet(elem, left, right incl x)
    else this
    
    
  def union(set: IntSet): IntSet = left union set union right incl elem
  
  //bit too complicated. You can make use of contains method and simplify this.

  
  def intersection(set: IntSet): IntSet = {
    if(set.contains(elem)) left intersection set union right intersection set incl elem
    else left intersection set union right intersection set
  }
    
 // already change according to your comment
  
  def isEmpty = false
  
  def excl(x: Int) = 
    if(x < elem) new NonEmptySet(elem, left excl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right excl x)
    else left union right
}
