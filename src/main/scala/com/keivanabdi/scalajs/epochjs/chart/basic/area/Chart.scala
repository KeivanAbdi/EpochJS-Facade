package com.keivanabdi.scalajs.epochjs.chart.basic.area

import com.keivanabdi.scalajs.epochjs.chart.basic.RectangularChart
import com.keivanabdi.scalajs.epochjs.chart.basic.options._
import com.keivanabdi.scalajs.epochjs.chart._

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

class Chart(
    override val `type`:      js.UndefOr[String],
    override val data:        js.Array[Data],
    override val axes:        js.UndefOr[js.Array[String]],
    override val ticks:       js.UndefOr[Ticks],
    override val tickFormats: js.UndefOr[TickFormats],
    override val domain:      js.UndefOr[js.Array[Double]],
    override val range:       js.UndefOr[js.Array[Double]],
    override val margins:     js.UndefOr[Margins],
    override val width:       js.UndefOr[Double],
    override val height:      js.UndefOr[Double]
) extends RectangularChart
    with DataCentered[Data]

object Chart {

  def apply(
      data:        Seq[Data],
      axes:        Option[Seq[Ax.Value]] = None,
      ticks:       Option[Ticks] = None,
      tickFormats: Option[TickFormats] = None,
      domain:      Option[(Double, Double)] = None,
      range:       Option[(Double, Double)] = None,
      margins:     Option[Margins] = None,
      width:       Option[Double] = None,
      height:      Option[Double] = None
  ) = new Chart(
    "area",
    data.toJSArray,
    axes.map(m => m.map(a => a.toString).toJSArray).orUndefined,
    ticks.orUndefined,
    tickFormats.orUndefined,
    domain.map(x => Seq(x._1, x._2).toJSArray).orUndefined,
    range.map(x => Seq(x._1, x._2).toJSArray).orUndefined,
    margins.orUndefined,
    width.orUndefined,
    height.orUndefined
  )

}
