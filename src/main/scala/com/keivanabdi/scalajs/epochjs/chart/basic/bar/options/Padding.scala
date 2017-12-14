package com.keivanabdi.scalajs.epochjs.chart.basic.bar.options

import scala.scalajs.js

class Padding(bar: Double, group: Double) extends js.Object

object Padding {
  def apply(bar: Double, group: Double): Padding = new Padding(bar, group)
}
