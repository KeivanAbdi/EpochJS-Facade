package com.keivanabdi.scalajs.epochjs.chart.realtime.bar

class Value(
    val x: Long,
    val y: Double,
) extends scalajs.js.Object

object Value {
  def apply(
      x: Long,
      y: Double,
  ): Value = new Value(x, y)
}
