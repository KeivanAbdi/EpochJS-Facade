package com.keivanabdi.scalajs.epochjs.chart

import scala.scalajs.js

trait ValueCentered[Value] extends js.Any {
  val value: Value
}
