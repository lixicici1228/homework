package org.scala.ScalaHomeworkLiXi.q6

// General comment. Use readable names for variables.

class StringOpera {
  def longestWord(s: String): String =  { //Nice
    (getList(s) foldLeft ""){
      case(longest, x) =>
        if(x.length > longest.length) x
        else longest
    }
  }
  
  def mostCommonWord(s: String): String = getMostCommon(getCountMap(getList(s))) 

  def mostCommonLetter(s:String): Char = getMostCommon(getCountMap(getCharList(s)))
  
  def letterToWords(s: String) = {
    val wordsSet = getList(s).toSet // wordsSet is a better name
    (getCharList(s).toSet foldLeft Map.empty[Char, Set[String]]) { // You can extract `(getList(s) flatMap(_.toList))` into a common method with a readable name and reuse it
      case(map, char) => map + (char -> (wordsSet filter (_.contains(char))))
    }
  }
  
  def getCharList(s: String) = (getList(s) flatMap(_.toList))
  
  def getCountMap[A](list: List[A])= { //Nice
    (list foldLeft Map.empty[A, Int]){
      case(map, x) =>
        if(!map.contains(x)) map + (x -> 1)
        else map + (x -> (map(x)+1))
    }
  }
  
  // Comment 1: Why asInstanceOf? Just pass empty string ""
  // Comment 2: Never use these _1 or _2. See my version
  //
  //def getMostCommon[A](map: Map[A, Int]) = {
  //  (map foldLeft (asInstanceOf[A], 0)){ 
  //    case((common, num), (key, value)) =>
  //      if(value > num) (key, value)
  //      else (common, num)
  //  }._1
  //}
  
  def getMostCommon[A](map: Map[A, Int]) = {
    val (common, _) = (map foldLeft (asInstanceOf[A], 0)) {
      case((common, num), (key, value)) =>
        if(value > num) (key, value)
        else (common, num)
    }
    common
  }
  
  def getList(s:String): List[String] = {
    s.split("\\s+").toList
  }
  
  // use asInstanceOf because the third function mostCommonLetter pass Char to this getMostCommon instead of String.
  // Others already changed according to your comments
}
