package com.sfti.exercises.ch2
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class ComputePowSpec extends FlatSpec with ShouldMatchers {

  it should "calculate the 3rd power of 3" in {
      ComputePow.func(3,3) should be (27)
  }


}
