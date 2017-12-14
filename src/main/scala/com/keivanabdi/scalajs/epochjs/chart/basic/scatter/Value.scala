package com.keivanabdi.scalajs.epochjs.chart.basic.scatter

import scala.scalajs.js


class Value(
    val x: Double,
    val y: Double,
    val r: scalajs.js.UndefOr[Double]
) extends scalajs.js.Object

object Value {
  def apply(
      x: Double,
      y: Double
  ): Value = new Value(x, y, js.undefined)
  def apply(
      x: Double,
      y: Double,
      r: Double
  ): Value = new Value(x, y, r)
}
