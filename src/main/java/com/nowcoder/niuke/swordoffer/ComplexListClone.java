package com.nowcoder.niuke.swordoffer;

/**
 * Created by hztaoran on 2016/8/9.
 */
public class ComplexListClone {
    public RandomListNode Clone(RandomListNode pHead) {
        if (null == pHead) {
            return null;
        }

        copyNode(pHead);
        processRandom(pHead);

        return split(pHead);
    }

    // step1. copy
    private void copyNode(RandomListNode head) {
        RandomListNode p = head;
        while (p != null) {
            RandomListNode cloneNode = new RandomListNode(0);
            cloneNode.label = p.label;
            cloneNode.next = p.next;
            cloneNode.random = null;
            p.next = cloneNode;
            p = cloneNode.next;
        }
    }

    // step2. handle random
    private void processRandom(RandomListNode head) {
        RandomListNode p = head;
        while (null != p) {
            RandomListNode cloneNode = p.next;
            if (p.random != null) {
                cloneNode.random = p.random.next;
            }
            p = cloneNode.next;
        }
    }

    // step3.split
    private RandomListNode split(RandomListNode head) {
        RandomListNode p = head;
        RandomListNode pClone = null;
        RandomListNode cloneHead = null;

        if (null != p) {
            pClone = cloneHead = p.next;
            p.next = pClone.next;
            p = p.next;
        }

        while (null != p) {
            pClone.next = p.next;
            pClone = pClone.next;
            p.next = pClone.next;
            p = p.next;
        }

        return cloneHead;
    }

}
