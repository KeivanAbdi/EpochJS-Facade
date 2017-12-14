package com.keivanabdi.scalajs.epochjs.chart.realtime.line.options

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

class Range(
    left:  js.UndefOr[js.Array[Double]],
    right: js.UndefOr[js.Array[Double]]
) extends scalajs.js.Object

object Range {
  def apply(
      left:  Option[(Double, Double)] = None,
      right: Option[(Double, Double)] = None
  ): Range =
    new Range(
      left.orUndefined.map(x  => Seq(x._1, x._2).toJSArray),
      right.orUndefined.map(x => Seq(x._1, x._2).toJSArray)
    )
}
