package com.keivanabdi.scalajs.epochjs.chart.basic.helpers

trait BasicHelper {

  implicit def TupleConverter1[A](in: A):         Seq[A] = Seq(in)
  implicit def TupleConverter2[A](in: (A, A)):    Seq[A] = Seq(in._1, in._2)
  implicit def TupleConverter3[A](in: (A, A, A)): Seq[A] = Seq(in._1, in._2, in._3)

}
