package com.keivanabdi.scalajs.epochjs.chart.realtime.options

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

class Margins(
    val top:    js.UndefOr[Int],
    val right:  js.UndefOr[Int],
    val bottom: js.UndefOr[Int],
    val left:   js.UndefOr[Int]
) extends scalajs.js.Object

object Margins {
  def apply(
      top:    Option[Int] = None,
      right:  Option[Int] = None,
      bottom: Option[Int] = None,
      left:   Option[Int] = None
  ): Margins = new Margins(
    top.orUndefined,
    right.orUndefined,
    bottom.orUndefined,
    left.orUndefined
  )
}
