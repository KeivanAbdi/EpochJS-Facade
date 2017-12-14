package com.keivanabdi.scalajs.epochjs.chart.realtime.gauge

import com.keivanabdi.scalajs.epochjs.chart._
import com.keivanabdi.scalajs.epochjs.chart.realtime.options._
import com.keivanabdi.scalajs.epochjs.chart.realtime.RealtimeChart2

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

class Chart(
    override val `type`:      js.UndefOr[String],
    override val value:       Double,
    override val axes:        js.UndefOr[js.Array[String]],
    override val tickFormats: js.UndefOr[TickFormats],
    override val fps:         js.UndefOr[Int],
    override val windowSize:  js.UndefOr[Int],
    override val historySize: js.UndefOr[Int],
    override val queueSize:   js.UndefOr[Int],
    override val margins:     js.UndefOr[Margins],
    override val width:       js.UndefOr[Double],
    override val height:      js.UndefOr[Double],
    override val pixelRatio:  js.UndefOr[Double],
    val domain:               js.UndefOr[js.Array[Double]],
    val ticks:                js.UndefOr[Int],
    val tickSize:             js.UndefOr[Int],
    val tickOffset:           js.UndefOr[Int],
    val format:               js.UndefOr[js.Function1[Double, String]]
) extends RealtimeChart2[Double]
    with ValueCentered[Double]

/**
  *
  */
object Chart {

  def apply(
      value:        Value,
      axes:         Option[Seq[Ax.Value]] = None,
      thickFormats: Option[TickFormats] = None,
      fps:          Option[Int] = None,
      windowSize:   Option[Int] = None,
      historySize:  Option[Int] = None,
      queueSize:    Option[Int] = None,
      margins:      Option[Margins] = None,
      width:        Option[Double] = None,
      height:       Option[Double] = None,
      pixelRatio:   Option[Double] = None,
      domain:       Option[(Double, Double)] = None,
      ticks:        Option[Int] = None,
      tickSize:     Option[Int] = None,
      tickOffset:   Option[Int] = None,
      format:       Option[Double => String] = None
  ): Chart = new Chart(
    "time.gauge",
    value.value,
    axes.map(m => m.map(a => a.toString).toJSArray).orUndefined,
    thickFormats.orUndefined,
    fps.orUndefined,
    windowSize.orUndefined,
    historySize.orUndefined,
    queueSize.orUndefined,
    margins.orUndefined,
    width.orUndefined,
    height.orUndefined,
    pixelRatio.orUndefined,
    domain.orUndefined.map((x: (Double, Double)) => Seq(x._1, x._2).toJSArray),
    ticks.orUndefined,
    tickSize.orUndefined,
    tickOffset.orUndefined,
    format.orUndefined.map(x => x)
  )

}
