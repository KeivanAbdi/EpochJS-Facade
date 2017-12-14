package com.keivanabdi.scalajs.epochjs.chart

import scala.scalajs.js

trait DataCentered[Data] extends js.Any {
  val data: js.Array[Data]

}
