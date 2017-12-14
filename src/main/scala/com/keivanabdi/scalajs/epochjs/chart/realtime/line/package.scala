package com.keivanabdi.scalajs.epochjs.chart.realtime
import com.keivanabdi.scalajs.epochjs.chart.realtime.helpers.RealtimeChart1Helper
import com.keivanabdi.scalajs.epochjs.chart.realtime.options.{Collection => CommonRealtimeOptions}
import com.keivanabdi.scalajs.epochjs.chart.realtime.line.options.{Collection => LineOptions}

package object line extends RealtimeChart1Helper with CommonRealtimeOptions with LineOptions {
  implicit val typeHolder: TypeHolder[Value] = TypeHolder[Value]()

}
