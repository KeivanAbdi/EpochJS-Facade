package com.keivanabdi.scalajs.epochjs.chart.realtime.bar

class Value(
    val time: Long,
    val y:    Double
) extends scalajs.js.Object

object Value {
  def apply(
      time: Long,
      y:    Double
  ): Value = new Value(time, y)
}
