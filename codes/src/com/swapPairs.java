package com;

public class swapPairs{
    private static ListNode swap(ListNode head){
        if(head == null) return null;
        ListNode listNode = new ListNode(head.val);
        ListNode listNode1 = head.next == null ? null : new ListNode(head.next.val);
        if(listNode1 != null){
            listNode1.next = listNode;
            listNode.next = swap(head.next.next);
        }else return listNode;
        return listNode1;
    }
    public static void main(String[] args){

        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
//        ListNode listNode3 = new ListNode(4);
        listNode.next = listNode1;
        listNode1.next = listNode2;
//        listNode2.next = listNode3;
        ListNode listNode4 = swap(listNode);
        while (listNode4 != null){
            System.out.println(listNode4.val);
            listNode4 = listNode4.next;
        }
    }
}
