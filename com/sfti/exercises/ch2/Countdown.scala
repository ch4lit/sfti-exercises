package com.sfti.execises.ch2

object Countdown {

  def countdown(n: Int) {
      if (n > 0) {
        for (i <- n.to(0, -1))
            println(i)
      }
  }

  def main(args: Array[String]) = {

    // exercise 4
    countdown(5)
  }

}

