package com.nowcoder.innovationFactory;

/**
 * Created by _NoThankYou on 2016/8/26.
 */
public class ProcessLinkedList {

    public Node swap(Node list) {
        if (null == list || null == list.next) {
            return list;
        }

        Node p = list;
        Node oddHead = new Node();
        Node evenHead = new Node();
        Node pOdd = oddHead;
        Node pEven = evenHead;
        Node preOdd = null;
        Node preEven = null;
        Node oddEnd = null;

        while (null != p) {
            Node next = p.next;
            if ((p.value & 1) == 1) {
                if (null == preOdd) {
                    oddEnd = p;
                }
                oddHead.next = p;
                p.next = preOdd;
                preOdd = p;
            } else {
                evenHead.next = p;
                p.next = preEven;
                preEven = p;
            }
            p = next;
        }
       oddEnd.next = evenHead.next;

        return oddHead.next;
    }

    public static void main(String[] args) {
        Node a = new Node();
        a.value = 4;
        Node b = new Node();
        b.value = 5;
        Node c = new Node();
        c.value = 7;
        Node d = new Node();
        d.value = 1;
        Node e = new Node();
        e.value = 6;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node res = new ProcessLinkedList().swap(a);
        while (res != null) {
            System.out.println(res.value);
            res = res.next;
        }
    }
}

class Node {
    Node next;
    int value;
}


