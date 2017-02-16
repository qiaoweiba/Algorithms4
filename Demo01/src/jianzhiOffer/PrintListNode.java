package jianzhiOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Administrator on 2016/11/10 0010.
 */
public class PrintListNode {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode!=null) {
            stack.push(listNode.val);//arrayList.add(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        head.next = node1;
        ListNode node2 = new ListNode(2);
       node1.next = node2;
        ListNode node3 = new ListNode(3);
       node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
//        while (head!=null){
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
        PrintListNode printListNode = new PrintListNode();
        ArrayList<Integer> arrayList = printListNode.printListFromTailToHead(head);
        for (int i=0;i<arrayList.size();i++){

            System.out.print(arrayList.get(i)+" ");
        }
    }
}
