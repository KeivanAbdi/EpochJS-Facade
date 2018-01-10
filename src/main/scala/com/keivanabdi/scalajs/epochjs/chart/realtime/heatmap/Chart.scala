package com.keivanabdi.scalajs.epochjs.chart.realtime.heatmap

import com.keivanabdi.scalajs.epochjs.chart._
import com.keivanabdi.scalajs.epochjs.chart.realtime.RealtimeChart1
import com.keivanabdi.scalajs.epochjs.chart.realtime.options._

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

class Chart[Push <: FixedLength[_]](
    override val `type`:      js.UndefOr[String],
    override val data:        js.Array[Data],
    override val axes:        js.UndefOr[js.Array[String]],
    override val ticks:       js.UndefOr[Ticks],
    override val tickFormats: js.UndefOr[TickFormats],
    override val fps:         js.UndefOr[Int],
    override val windowSize:  js.UndefOr[Int],
    override val historySize: js.UndefOr[Int],
    override val queueSize:   js.UndefOr[Int],
    override val margins:     js.UndefOr[Margins],
    override val width:       js.UndefOr[Double],
    override val height:      js.UndefOr[Double],
    override val pixelRatio:  js.UndefOr[Double],
    val buckets:              js.UndefOr[Int],
    val bucketRange:          js.UndefOr[js.Array[Int]],
    val bucketPadding:        js.UndefOr[Int],
    val opacity:              js.UndefOr[js.Function2[Double, Double, Double]],
    val paintZeroValues:      js.UndefOr[Boolean]
) extends RealtimeChart1[Push]
    with DataCentered[Data]

/**
  *
  */
object Chart {

  def apply[Push <: FixedLength[_]](
      data:            FixedLengthSwitched[Data, Push],
      axes:            Option[Seq[Ax.Value]] = None,
      ticks:           Option[Ticks] = None,
      thickFormats:    Option[TickFormats] = None,
      fps:             Option[Int] = None,
      windowSize:      Option[Int] = None,
      historySize:     Option[Int] = None,
      queueSize:       Option[Int] = None,
      margins:         Option[Margins] = None,
      width:           Option[Double] = None,
      height:          Option[Double] = None,
      pixelRatio:      Option[Double] = None,
      buckets:         Option[Int] = None,
      bucketRange:     Option[(Int, Int)] = None,
      bucketPadding:   Option[Int] = None,
      opacity:         Option[(Double, Double) => Double] = None,
      paintZeroValues: Option[Boolean] = None
  ): Chart[Push] = new Chart[Push](
    "time.heatmap",
    data.data.toJSArray,
    axes.map(m => m.map(a => a.toString).toJSArray).orUndefined,
    ticks.orUndefined,
    thickFormats.orUndefined,
    fps.orUndefined,
    windowSize.orUndefined,
    historySize.orUndefined,
    queueSize.orUndefined,
    margins.orUndefined,
    width.orUndefined,
    height.orUndefined,
    pixelRatio.orUndefined,
    buckets.orUndefined,
    bucketRange.orUndefined.map(x => Seq(x._1, x._2).toJSArray),
    bucketPadding.orUndefined,
    opacity.orUndefined.map(x => x),
    paintZeroValues.orUndefined
  )

}
