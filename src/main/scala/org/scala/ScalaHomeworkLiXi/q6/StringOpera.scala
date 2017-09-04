package org.scala.ScalaHomeworkLiXi.q6

class StringOpera {
  def longestWord(s: String): String =  {
    (getList(s) foldLeft ""){
      case(longest, x) =>
        if(x.length > longest.length) x
        else longest
    }
  }
  
  def mostCommonWord(s: String): String = getMostCommon(getCountMap(getList(s)))

  def mostCommonLetter(s:String): Char = getMostCommon(getCountMap(getList(s) flatMap(_.toList)))
  
  def letterToWords(s: String) = {
    val set = getList(s).toSet
    ((getList(s) flatMap(_.toList)).toSet foldLeft Map.empty[Char, Set[String]]) {
      case(map, char) => map + (char -> (set filter (_.contains(char))))
    }
  }
  
  def getCountMap[A](list: List[A])= {
    (list foldLeft Map.empty[A, Int]){
      case(map, x) =>
        if(!map.contains(x)) map + (x -> 1)
        else map + (x -> (map(x)+1))
    }
  }
  
  def getMostCommon[A](map: Map[A, Int]) = {
    (map foldLeft (asInstanceOf[A], 0)){
      case((common, num), (key, value)) =>
        if(value > num) (key, value)
        else (common, num)
    }._1
  }
  
  def getList(s:String): List[String] = {
    s.split("\\s+").toList
  }
}