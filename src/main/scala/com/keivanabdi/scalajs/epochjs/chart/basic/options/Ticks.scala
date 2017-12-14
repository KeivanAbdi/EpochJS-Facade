package com.keivanabdi.scalajs.epochjs.chart.basic.options

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

class Ticks(
    val top:    js.UndefOr[Int],
    val right:  js.UndefOr[Int],
    val bottom: js.UndefOr[Int],
    val left:   js.UndefOr[Int]
) extends scalajs.js.Object

object Ticks {
  def apply(
      top:    Option[Int] = None,
      right:  Option[Int] = None,
      bottom: Option[Int] = None,
      left:   Option[Int] = None
  ): Ticks = new Ticks(
    top.orUndefined,
    right.orUndefined,
    bottom.orUndefined,
    left.orUndefined
  )
}
