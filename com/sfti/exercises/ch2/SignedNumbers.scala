package com.sfti.execises.ch2

object SignedNumbers {

  // exercise 1
  def signum(number: Double) : Int = {
    if (number > 0) 1 else if (number == 0) 0 else -1
  }

  

  def main(args: Array[String]) = {

    // test signum
    println("1: " + signum(1))
    println("0: " + signum(0))
    println("-1: " + signum(-1))

  }

}

