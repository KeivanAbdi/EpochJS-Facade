package com.keivanabdi.scalajs.epochjs.chart.realtime.line


class Value(
    val time: Double,
    val y: Double
) extends scalajs.js.Object

object Value {
  def apply(
      time: Double,
      y: Double
  ): Value = new Value(time, y)
}
