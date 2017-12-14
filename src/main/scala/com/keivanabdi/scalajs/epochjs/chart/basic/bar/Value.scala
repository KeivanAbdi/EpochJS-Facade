package com.keivanabdi.scalajs.epochjs.chart.basic.bar

/**
  *
  */
class Value(
    val x: String,
    val y: Double,
) extends scalajs.js.Object

/**
  *
  */
object Value {
  def apply(
      x: String,
      y: Double,
  ): Value = new Value(x, y)
}
