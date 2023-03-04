package com.tkroman.kpi

import munit.FunSuite

import scala.util.Random

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

  test("mul 1") {
    val x = Random.nextInt()
    assertEquals(arithmetic.mul(x, 1), x)
    assertEquals(arithmetic.mul(1, x), x)
  }

  test("mul specific case") {
    assertEquals(arithmetic.mul(123, 2), 246)
  }

  test("mul overflow") {
    assertEquals(arithmetic.mul(Int.MaxValue, 2), -2)
  }
}
