package com.keivanabdi.scalajs.epochjs.chart.realtime.line

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

class Data(
    val label:  String,
    val values: scalajs.js.Array[Value],
    val range:  js.UndefOr[js.Array[Double]]
) extends scalajs.js.Object

object Data {
  def apply(
      label:  String,
      values: Seq[Value],
      range:  Option[(Double, Double)] = None
  ): Data = new Data(
    label,
    values.toJSArray,
    range.orUndefined.map(x => Seq(x._1, x._2).toJSArray)
  )

}
