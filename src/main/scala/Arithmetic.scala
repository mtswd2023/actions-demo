package com.tkroman.kpi

class Arithmetic {
  // no overflow checks!
  def sum(a: Int, b: Int): Int = {
    a + b
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    println(new Arithmetic().sum(1, 10))
  }
}
