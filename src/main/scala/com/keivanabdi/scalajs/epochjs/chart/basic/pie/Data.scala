package com.keivanabdi.scalajs.epochjs.chart.basic.pie

class Data(
    val label: String,
    val value: Double
) extends scalajs.js.Object

object Data {
  def apply(
      label: String,
      value: Double
  ): Data = new Data(
    label,
    value
  )
}
