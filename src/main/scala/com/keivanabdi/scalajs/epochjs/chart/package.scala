package epoch

import com.keivanabdi.scalajs.epochjs.MicroJQuery

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

package object chart {

  def jQuery: MicroJQuery = js.Dynamic.global.jQuery.asInstanceOf[MicroJQuery]


}
