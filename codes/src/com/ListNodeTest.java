package com;

public class ListNodeTest {
    public  static ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode pre=null;////循环建表
        ListNode last=null,newNode;
        int val=0;
        int carry=0;
        while(list1!=null||list2!=null){
            val=((list1==null?0:list1.val)+(list2==null?0:list2.val)+carry)%10;
            carry=((list1==null?0:list1.val)+(list2==null?0:list2.val)+carry)/10;
            list1=list1==null?null:list1.next;
            list2=list2==null?null:list2.next;
            newNode=new ListNode(val);
            if(pre==null){
                pre=newNode;
                last=newNode;
            }else{
                last.next=newNode;
                last=newNode;
            }
        }
        if(carry>0){
            newNode=new ListNode(carry);
            last.next=newNode;
            last=newNode;
        }
        return pre;
    }
    public static void main(String[] args){
        /////l1
        int[] a = new int[]{2,5,2};
        int[] b = new int[]{5,6,4};
        ListNode listNode = buildListNode(a);
        ListNode listNode1 = buildListNode(b);

        ListNode listNode6;
        listNode6 = addTwoNumbers(listNode,listNode1);
        System.out.println(listNode6.val);
        System.out.println(listNode6.next.val);
        System.out.println(listNode6.next.next.val);
//        System.out.println(listNode6.next.next.next.val);
    }
    public static ListNode buildListNode(int [] list){//////链表建表要循环建表，起始节点再加上当前的节点
        ListNode first=null,last=null,newNode;
        for(int i=0;i<list.length;i++){
            newNode=new ListNode(list[i]);
            if(first==null){
                first=newNode;
                last=newNode;
            }else{
                last.next=newNode;
                last=newNode;
            }
        }
        return first;
    }
}
