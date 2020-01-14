package com.doublePointer;

import com.ListNode;

public class HasCycleInList {
    private static boolean hasCycle(ListNode head){
        /**
         * 使用两个指针，一个移动一次，一个移动两次，如果存在环，那么他们一定会相遇
         */
        if(head == null) return false;
        ListNode l1 = head;
        ListNode l2 = head.next;
        while (l1 != null && l2 != null && l2.next != null){
            if(l1 == l2) return true;
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return false;
    }
    public static void main(String[] args){
        ListNode listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(-4);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode1;
        System.out.println(hasCycle(listNode));
    }
}
