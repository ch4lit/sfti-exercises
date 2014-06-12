object ComputeUnicodeSum {

  // exercise 6
  def calcProduct(s: String) : Long = {
    var product : Long = 1
  
    /* check this further, as it's odd that this does work
    for (i <- 0 until s.length)
      println(i)
      var a = s.apply(i)
      //println(a)
      //println(a.toLong)
      //product *= s(i).toLong()
      product
      */
   
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
    
    val prod = calcProduct("Hello")
    println(formatResult("Hello", prod))

    val rProd = calcProdRecursive("Hello", 1)
    println(formatResult("Hello", rProd))

  }
}
