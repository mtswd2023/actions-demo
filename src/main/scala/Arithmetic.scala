package com.tkroman.kpi

import scala.util.Random

class Arithmetic {
  // no overflow checks!
  def sum(a: Int, b: Int): Int = {
    a + b
  }

  def mul(x: Int, y: Int): Int = {
    x * y
  }

  def buggy(): Boolean = {
    Random.nextBoolean()
  }
}
