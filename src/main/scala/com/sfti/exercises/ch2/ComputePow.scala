package com.sfti.exercises.ch2

object ComputePow {

    /* computes X^n where X is an integer
       recursive definition
       * x^n = y^2 if n is even and positve, where y = x^(n/2)
       * x^n = x * x^(n-1) if n is odd and positive
       * x^0 = 1
       * x^n = 1 / x^-n if n is negative

       * don't use the return statement
      */

      def func(x: Double, n: Int) : Double = {
          if (n == 0) 1
          else {
            if (n > 0) {
              if ((n % 2) == 0 && n > 2) {
                func(func(x, n/2), 2) 
              } else {
                x * func(x, n-1)
              }
            } else {
                1 / func(x, -n)
            }
          }
      }



      def main(args: Array[String]) : Unit = {
        
        println("3rd power of 3 -- should be 27")
        val res4 = func(3, 3)
        println(res4)
        println("0 power of 3 -- should be 1")
        val res5 = func(3, 0)
        println(res5)
        println("1st power of 3 -- should be 3")
        val res6 = func(3, 1)
        println(res6)
        println("-3rd power of 3  -- should be 0.03, rounded to 0.3")
        val res7 = func(3, -3)
        println(res7)
      }


}
