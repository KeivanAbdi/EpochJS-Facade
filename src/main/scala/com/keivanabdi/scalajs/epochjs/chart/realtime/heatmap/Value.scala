package com.keivanabdi.scalajs.epochjs.chart.realtime.heatmap

import scala.scalajs.js

class Value(
    val time:      Int,
    val histogram: js.Dynamic,
) extends scalajs.js.Object

object Value {

  def apply(
      time:      Long,
      histogram: Map[Int, Int],
  ): Value = {

    val lit = js.Dynamic.literal()
    histogram.foreach {
      case (a, b) => lit.updateDynamic(a.toString)(b.toString)
    }
    new Value(time.toInt, lit)
  }
}
