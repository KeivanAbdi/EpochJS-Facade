package com.keivanabdi.scalajs.epochjs.chart.realtime.options

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

class Ticks(
    val time:  js.UndefOr[Int],
    val right: js.UndefOr[Int],
    val left:  js.UndefOr[Int]
) extends scalajs.js.Object

object Ticks {
  def apply(
      time:  Option[Int] = None,
      right: Option[Int] = None,
      left:  Option[Int] = None
  ): Ticks = new Ticks(
    time.orUndefined,
    right.orUndefined,
    left.orUndefined
  )
}
