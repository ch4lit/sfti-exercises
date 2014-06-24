package com.sfti.exercises.ch2

object ComputeUnicodeSum {

  def calcProductForeach(s: String) : Long = {
      var product : Long = 1
 
      s.foreach( (f : Char) => product *= f.toLong  )
      product
   } 

  def calcProductForApply(s: String) : Long = {
      var product : Long = 1
  
      for (i <- 0 until s.length) {
        product *= s(i).toLong
      }

      product
   } 

  def calcProductFor(s: String) : Long = {
    var product : Long = 1
  
      for (c <- s)
          product *= c

      product
   } 

  def calcProdRecursive(s: String, p: Long) :Long = {
        if (s.isEmpty()) p else
        calcProdRecursive(s.tail, s.head * p)
  }

  // also try one version with foreach (function)

  def formatResult(s: String, l: Long) :String = {
      val msg = "The unicode product for the string %s is %d"
      msg.format(s, l)
  }

  def main(args: Array[String]) = {
    
    var prod = calcProdRecursive("Hello", 1)
    println(formatResult("Recursive: Hello", prod))

    prod = 0
    prod = calcProductFor("Hello")
    println(formatResult("For      : Hello", prod))
    
    prod = 0
    prod = calcProductForApply("Hello")
    println(formatResult("For Apply: Hello", prod))
    
    prod = 0
    prod = calcProductForeach("Hello")
    println(formatResult("Foreach  : Hello", prod))
    
  }
}
