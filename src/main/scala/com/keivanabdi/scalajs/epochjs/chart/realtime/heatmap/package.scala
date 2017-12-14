package com.keivanabdi.scalajs.epochjs.chart.realtime

import com.keivanabdi.scalajs.epochjs.chart.realtime.helpers.RealtimeChart1Helper
import com.keivanabdi.scalajs.epochjs.chart.realtime.options.{Collection => CommonRealtimeOptions}

package object heatmap extends RealtimeChart1Helper with CommonRealtimeOptions {
  implicit val typeHolder: TypeHolder[Value] = TypeHolder[Value]()

}
