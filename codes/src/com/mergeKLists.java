package com;

public class mergeKLists {
    private static ListNode merge(ListNode[] lists){
        ListNode listNode = new ListNode(0);
        int[] vals = new int[2];
        vals[0] = Integer.MAX_VALUE;
        for(int i = 0 ; i < lists.length ; i++){
            if(lists[i] != null) {
                if (lists[i].val < vals[0]) {
                    vals[0] = lists[i].val;
                    vals[1] = i;
                }
            }
        }
        if(vals[0] != Integer.MAX_VALUE){
            listNode.val = vals[0];
            lists[vals[1]] = lists[vals[1]].next;
            listNode.next = merge(lists);
        }else return null;
        return listNode;
    }
    public static void main(String[] args){
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(5);
        ListNode listNode7 = new ListNode(6);
        listNode.next = listNode4;
        listNode4.next = listNode6;
        listNode1.next = listNode3;
        listNode3.next = listNode5;
        listNode2.next = listNode7;
        ListNode[] listNodes = new ListNode[3];
        listNodes[0] = listNode;
        listNodes[1] = listNode1;
        listNodes[2] = listNode2;
        ListNode listNode8 = merge(listNodes);
        while (listNode8 != null){
            System.out.println(listNode8.val);
            listNode8 = listNode8.next;
        }
    }
}
