package com.keivanabdi.scalajs.epochjs.chart.realtime

import com.keivanabdi.scalajs.epochjs.chart.realtime.options._
import com.keivanabdi.scalajs.epochjs.chart.AbstractChart

import scala.scalajs.js

abstract class RealtimeChart2[Update] extends AbstractChart {

  def update(input: Update): Unit = js.undefined

  val axes:        js.UndefOr[js.Array[String]]
  val tickFormats: js.UndefOr[TickFormats]
  val fps:         js.UndefOr[Int]
  val windowSize:  js.UndefOr[Int]
  val historySize: js.UndefOr[Int]
  val queueSize:   js.UndefOr[Int]
  val margins:     js.UndefOr[Margins]
  val width:       js.UndefOr[Double]
  val height:      js.UndefOr[Double]
  val pixelRatio:  js.UndefOr[Double]

}
