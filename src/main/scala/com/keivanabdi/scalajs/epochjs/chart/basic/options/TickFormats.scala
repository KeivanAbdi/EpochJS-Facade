package com.keivanabdi.scalajs.epochjs.chart.basic.options

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

trait TickFormats extends js.Object {

  var bottom: js.UndefOr[js.Function1[Double, String]]
  var top:    js.UndefOr[js.Function1[Double, String]]
  var left:   js.UndefOr[js.Function1[Double, String]]
  var right:  js.UndefOr[js.Function1[Double, String]]

}

object TickFormats {
  def apply(
      bottom: Option[Double => String] = None,
      top:    Option[Double => String] = None,
      left:   Option[Double => String] = None,
      right:  Option[Double => String] = None
  ): TickFormats = {
    val localBottom = bottom
    val localLeft   = left
    val localRight  = right
    val localTop    = top

    new TickFormats {
      var bottom: js.UndefOr[js.Function1[Double, String]] = localBottom.orUndefined.map(x => x)
      var top:    js.UndefOr[js.Function1[Double, String]] = localTop.orUndefined.map(x => x)
      var left:   js.UndefOr[js.Function1[Double, String]] = localLeft.orUndefined.map(x => x)
      var right:  js.UndefOr[js.Function1[Double, String]] = localRight.orUndefined.map(x => x)

    }

  }
}
