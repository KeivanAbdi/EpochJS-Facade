package com.keivanabdi.scalajs.epochjs.chart.basic

import com.keivanabdi.scalajs.epochjs.chart.AbstractChart

import scala.scalajs.js

abstract class CircularChart extends AbstractChart {
  val margin: js.UndefOr[Double]
  val inner:  js.UndefOr[Double]
  val width:  js.UndefOr[Double]
  val height: js.UndefOr[Double]
}
