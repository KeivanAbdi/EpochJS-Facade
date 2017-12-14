package com.keivanabdi.scalajs.epochjs.chart.basic.line

class Value(
    val x: Int,
    val y: Double
) extends scalajs.js.Object

object Value {
  def apply(
      x: Int,
      y: Double
  ): Value = new Value(x, y)
}
