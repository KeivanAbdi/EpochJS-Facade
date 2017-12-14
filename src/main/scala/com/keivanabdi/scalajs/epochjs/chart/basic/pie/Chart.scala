package com.keivanabdi.scalajs.epochjs.chart.basic.pie

import com.keivanabdi.scalajs.epochjs.chart._
import com.keivanabdi.scalajs.epochjs.chart.basic.CircularChart

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

class Chart(
    override val `type`: js.UndefOr[String],
    override val data:   js.Array[Data],
    override val margin: js.UndefOr[Double],
    override val inner:  js.UndefOr[Double],
    override val width:  js.UndefOr[Double],
    override val height: js.UndefOr[Double]
) extends CircularChart
    with DataCentered[Data]

object Chart {
  def apply(
      data:   Seq[Data],
      margin: Option[Double] = None,
      inner:  Option[Double] = None,
      width:  Option[Double] = None,
      height: Option[Double] = None
  ): Chart = new Chart(
    "pie",
    data.toJSArray,
    margin.orUndefined,
    inner.orUndefined,
    width.orUndefined,
    height.orUndefined
  )

}
