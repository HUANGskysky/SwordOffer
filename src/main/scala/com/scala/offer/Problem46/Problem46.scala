package com.scala.offer.Problem46

/**
 * Created by Lemonjing on 2018/6/4.
 * Github: Lemonjing
 */
class Problem46 {

  private def terminal(n: Int):Int = 0

  def sum(n: Int):Int = {
    var _n = n
    val list = List(false, true)
    val methods = this.getClass.getDeclaredMethods
    val index = list.indexOf(_n == 0)
    val curN = _n
    _n -= 1
    curN + methods(index).invoke(this, new Integer(_n)).asInstanceOf[Integer]
  }
}