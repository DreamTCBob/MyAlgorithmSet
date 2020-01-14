package com;

public class removeNthFromEnd {
    private ListNode remove(ListNode head, int n){
        if(head==null){
            return null;
        }
        if(head.next==null&&n==1){
            return head.next;
        }
        ListNode front=new ListNode(-1);
        front.next=head;
        ListNode slow=front;
        ListNode fast=front;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){//双指针移动，快指针与慢指针之间相差n个距离
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return front.next;
    }
    public static void main(String[] args){
        removeNthFromEnd removeNthFromEnd = new removeNthFromEnd();
        ListNode head = new ListNode(1);
        ListNode listNode = new ListNode(2);
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(5);
        head.next = listNode;
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        ListNode listNode4 = removeNthFromEnd.remove(head, 2);
        while(listNode4 != null){
            System.out.println(listNode4.val);
            listNode4 = listNode4.next;
        }
    }
}
