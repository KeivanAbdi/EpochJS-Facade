package com.keivanabdi.scalajs.epochjs.chart.realtime

import com.keivanabdi.scalajs.epochjs.chart.realtime.helpers.RealtimeChart2Helper
import com.keivanabdi.scalajs.epochjs.chart.realtime.options.{ Collection => CommonRealtimeOptions }

package object gauge extends RealtimeChart2Helper with CommonRealtimeOptions {

  implicit val typeHolder: TypeHolder[Value] = TypeHolder[Value]()

  implicit def DoubleConverter(doubleValue: Double): Value = new Value(doubleValue)

  implicit class UpdateHelper[Z](ac: RealtimeChart2[Z]) {
    def update(input: Z): Unit =
      ac.update(input)
  }
}
