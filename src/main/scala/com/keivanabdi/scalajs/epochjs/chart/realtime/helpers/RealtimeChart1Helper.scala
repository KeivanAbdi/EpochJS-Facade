package com.keivanabdi.scalajs.epochjs.chart.realtime.helpers

import com.keivanabdi.scalajs.epochjs.chart.realtime.RealtimeChart1

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

trait RealtimeChart1Helper extends RealtimeHelper {

  implicit class PushTypeConverter[Z <: FixedLength[_]](ac: RealtimeChart1[Z]) {
    def push(input: Z): Unit = {
      ac.rawPush(input.data.toJSArray)
    }
  }
}
