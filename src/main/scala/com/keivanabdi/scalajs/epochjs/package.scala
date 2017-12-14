package com.keivanabdi.scalajs

import scala.scalajs.js

package object epochjs {
  def jQuery: MicroJQuery = js.Dynamic.global.jQuery.asInstanceOf[MicroJQuery]
}
