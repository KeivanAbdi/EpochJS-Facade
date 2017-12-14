package com.keivanabdi.scalajs.epochjs.chart.basic.area

import scala.scalajs.js.JSConverters._

class Data(
    val label:  String,
    val values: scalajs.js.Array[Value]
) extends scalajs.js.Object

object Data {
  def apply(
      label:  String,
      values: Seq[Value]
  ): Data = new Data(
    label,
    values.toJSArray
  )
}
