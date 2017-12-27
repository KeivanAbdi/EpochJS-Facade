package com.keivanabdi.scalajs.epochjs.chart.basic.line

class Value(
    val x: Double,
    val y: Double
) extends scalajs.js.Object

object Value {
  def apply(
      x: Double,
      y: Double
  ): Value = new Value(x, y)
}
