package com.keivanabdi.scalajs.epochjs.chart.realtime.helpers

import com.keivanabdi.scalajs.epochjs.chart.realtime.TypeHolder


trait RealtimeHelper {

  trait Switchable[A]

  trait FixedLength[T] {
    val data: Seq[T]
  }

  trait FixedLength1[T1] extends FixedLength[T1]

  trait FixedLength2[T2] extends FixedLength[T2]

  trait FixedLength3[T3] extends FixedLength[T3]

  trait FixedLengthSwitched[T1, A1] extends FixedLength[T1] with Switchable[A1]

  trait FixedLength1Switched[T1, A1] extends FixedLength1[T1] with FixedLengthSwitched[T1, A1]

  trait FixedLength2Switched[T2, A2] extends FixedLength2[T2] with FixedLengthSwitched[T2, A2]

  trait FixedLength3Switched[T3, A3] extends FixedLength3[T3] with FixedLengthSwitched[T3, A3]

  object FixedLength1Switched {
    def apply[T, A]: Seq[T] => FixedLength1Switched[T, A] = { (in: Seq[T]) =>
      new FixedLength1Switched[T, A] {
        val data: Seq[T] = in
      }
    }
  }

  object FixedLength2Switched {
    def apply[T, A]: Seq[T] => FixedLength2Switched[T, A] = { (in: Seq[T]) =>
      new FixedLength2Switched[T, A] {
        val data: Seq[T] = in
      }
    }
  }

  object FixedLength3Switched {
    def apply[T, A]: Seq[T] => FixedLength3Switched[T, A] = { (in: Seq[T]) =>
      new FixedLength3Switched[T, A] {
        val data: Seq[T] = in
      }
    }
  }

  implicit def TransformType3[A, V](
      in:                (A, A, A)
  )(implicit typeHolder: TypeHolder[V]): FixedLength3Switched[A, FixedLength3[V]] =
    FixedLength3Switched[A, FixedLength3[V]](Seq(in._1, in._2, in._3))

  implicit def TransformType2[A, V](
      in:                (A, A)
  )(implicit typeHolder: TypeHolder[V]): FixedLength2Switched[A, FixedLength2[V]] =
    FixedLength2Switched[A, FixedLength2[V]](Seq(in._1, in._2))

  implicit def TransformType1[A, V](
      in:                A
  )(implicit typeHolder: TypeHolder[V]): FixedLength1Switched[A, FixedLength1[V]] =
    FixedLength1Switched[A, FixedLength1[V]](Seq(in))
}
