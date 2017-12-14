package com.keivanabdi.scalajs.epochjs.chart.basic

import com.keivanabdi.scalajs.epochjs.chart.basic.options.{Margins, TickFormats, Ticks}
import com.keivanabdi.scalajs.epochjs.chart.AbstractChart
import com.keivanabdi.scalajs.epochjs.chart.basic.helpers.BasicHelper

import scala.scalajs.js

abstract class RectangularChart extends AbstractChart  {
  val axes:        js.UndefOr[js.Array[String]]
  val ticks:       js.UndefOr[Ticks]
  val tickFormats: js.UndefOr[TickFormats]
  val domain:      js.UndefOr[js.Array[Double]]
  val range:       js.UndefOr[js.Array[Double]]
  val margins:     js.UndefOr[Margins]
  val width:       js.UndefOr[Double]
  val height:      js.UndefOr[Double]
}
