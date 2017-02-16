package jianzhiOffer;

import java.util.Stack;

/**
 * Created by Administrator on 2016/11/13 0013.
 */
//题目描述:链表中倒数第k个结点
//输入一个链表，输出该链表中倒数第k个结点。
public class FindKthToTailInList {
    public ListNode FindKthToTail(ListNode head,int k) {
        Stack<Integer> stack = new Stack<Integer>();
        if (head==null) return null;
        else {
            ListNode p = head;
            while (head!=null) {
                stack.push(head.val);
                head = head.next;
            }
            if (k>stack.size()) return null;
            for (int i = 0; i < stack.size() - k; i++) p = p.next;
            return p;
        }


//        ListNode pre=null,p=null;
//        //两个指针都指向头结点
//        p=head;
//        pre=head;
//        //记录k值
//        int a=k;
//        //记录节点的个数
//        int count=0;
//        //p指针先跑，并且记录节点数，当p指针跑了k-1个节点后，pre指针开始跑，
//        //当p指针跑到最后时，pre所指指针就是倒数第k个节点
//        while(p!=null){
//            p=p.next;
//            count++;
//            if(k<1){
//                pre=pre.next;
//            }
//            k--;
//        }
//        //如果节点个数小于所求的倒数第k个节点，则返回空
//        if(count<a) return null;
//        return pre;

    }

    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        ListNode p = head;
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

        while (head!=null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();

        FindKthToTailInList f = new FindKthToTailInList();
        ListNode pp= f.FindKthToTail(p, 8);
//        System.out.println(pp.val);
    }
}
