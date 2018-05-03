package com.scala.offer.Problem33

/**
 * Created by Lemonjing on 2018/5/1.
 * Github: Lemonjing
 * 把数组[3,32,321] -> 321323
 */
object Problem33 {

  def arrToMinNumber(a: Array[Int]): String = {
    val b = a.sortWith((o1, o2) => {
      val s1 = String.valueOf(o1) + String.valueOf(o2)
      val s2 = String.valueOf(o2) + String.valueOf(o1)
      s1 < s2
    })
    b.mkString("")
  }

  def main(args: Array[String]): Unit = {
    val a = Array(3, 32, 321)
    println(arrToMinNumber(a))
  }
}
