package com.ghjkgf;


import com.common.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println(new AddTwoNumbers().addTwoNumbers(new ListNode(2,new ListNode(4)),
                new ListNode(4,new ListNode(6))).val);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode result = l3;
        int flag = 0;
        while(l1!=null && l2!=null){
            ListNode ListNode = new ListNode();
            l3.next = ListNode;
            l3 = ListNode;
            l3.val = (l1.val + l2.val + flag)%10;
            if(l1.val+l2.val+flag>9) {
                flag = 1;
            }
            else {
                flag = 0;
            }
            l1 = l1.next;
            l2 = l2.next;


        }
        while(l1!=null){
            ListNode ListNode = new ListNode((l1.val + flag)%10);
            if(l1.val+flag>9)
                flag = 1;
            else flag = 0;
            l3.next = ListNode;
            l3 = ListNode;
            l1 = l1.next;
        }
        while(l2!=null){
            ListNode ListNode = new ListNode((l2.val + flag)%10);
            if(l2.val+flag>9)
                flag = 1;
            else flag = 0;
            l3.next = ListNode;
            l3 = ListNode;
            l2 = l2.next;
        }
        if(flag==1){
            ListNode ListNode = new ListNode(1);
            l3.next = ListNode;
        }

        return result.next;

    }
}
