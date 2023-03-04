package com.tkroman.kpi

import munit.FunSuite

class ArithmeticTest extends FunSuite {
  private val arithmetic = new Arithmetic

  test("sum happy path") {
    assertEquals(arithmetic.sum(1, 2), 3)
  }

  test("sum overflow") {
    assertEquals(arithmetic.sum(Int.MaxValue, 1), Int.MinValue)
  }

  test("sum 0") {
    val x = 10123123
    assertEquals(arithmetic.sum(0, x), x)
    assertEquals(arithmetic.sum(x, 0), x)
  }
}
