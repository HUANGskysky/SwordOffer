package com.scala.offer.Problem16

import com.scala.offer.Node.ListNode

/**
 * Created by Lemonjing on 2018/5/1.
 * Github: Lemonjing
 */
object Problem16 {

  def reverseList(head:ListNode):ListNode = {
    if (head == null) {
      return null
    }
    var pre:ListNode = null
    var cur = head
    while (cur != null) {
      val next = cur.next
      cur.next = pre
      pre = cur
      cur = next
    }
    pre
  }

  def main(args: Array[String]): Unit = {
    val list1 = new ListNode(1)
    val a = new ListNode(2)
    val b = new ListNode(3)
    val c = new ListNode(4)
    list1.next = a
    a.next = b
    b.next = c
    c.next = null
    var head = reverseList(list1)
    while (head != null) {
      println(head.data)
      head = head.next
    }
  }
}
