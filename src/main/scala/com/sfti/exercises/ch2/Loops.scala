package com.sfti.exercises.ch2

object Loops {


  def main(args: Array[String]) = {

    // exercise 3, java loop equivalent
    // for (int i = 10; i >=0; i--)
    // System.out.println(i);
    println("using while")
    var i = 10
    while( i >= 0 ) {
        println(i)
        i -= 1
    }

    println("using for")
    for (i <- 10.to(0, -1))
        println(i)
  }

}

