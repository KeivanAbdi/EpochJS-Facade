package com.keivanabdi.scalajs.epochjs.chart.realtime.gauge

class Value(
    val value: Double
) extends scalajs.js.Object

object Value {
  def apply(
      value: Double
  ): Value = new Value(value)
}
