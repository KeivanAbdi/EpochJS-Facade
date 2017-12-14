package com.keivanabdi.scalajs.epochjs.chart.realtime.area

class Value(
    val time: Int,
    val y:    Double
) extends scalajs.js.Object

object Value {
  def apply(
      time: Int,
      y:    Double
  ): Value = new Value(time, y)
}
