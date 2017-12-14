package com.keivanabdi.scalajs.epochjs

import scala.scalajs.js

@js.native
trait MicroJQuery extends js.Object {
  def apply(query:    String): MicroJQuery = js.native
  def epoch[U](input: U):      U           = js.native
}
