package com.scala.offer.Problem10

/**
 * Created by Lemonjing on 2018/5/1.
 * Github: Lemonjing
 */
object Problem10 {

  def numberOf1(n: Int): Int = {
    var count = 0
    var _n = n
    while (_n !=0) {
      _n = _n & (_n -1)
      count += 1
    }
    count
  }

  def main(args: Array[String]): Unit = {
    println(numberOf1(3))
    println(numberOf1(4))
  }
}
