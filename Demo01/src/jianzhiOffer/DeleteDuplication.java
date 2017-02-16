package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/21 0021.
 */
//题目描述:删除链表中重复的结点
//        在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
//        例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead){
        if (pHead==null) return null;
        while (pHead.val==pHead.next.val) pHead = pHead.next;
        ListNode temp = pHead;
        ListNode p = temp;
        int a = pHead.val;
        while (pHead.next!=null){
            if ( a!=pHead.next.val){
                a = pHead.next.val;
                temp.next = pHead.next;
//                temp = pHead;
                temp = temp.next;
            }
            pHead = pHead.next;
        }
        return p;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode a2 = new ListNode(2);
        a.next = a2;
        ListNode a3 = new ListNode(3);
        a2.next = a3;
        ListNode a4 = new ListNode(3);
        a3.next = a4;
        ListNode a5 = new ListNode(4);
        a4.next = a5;
        ListNode a6 = new ListNode(4);
        a5.next = a6;
        ListNode a7 = new ListNode(5);
        a6.next = a7;

        DeleteDuplication d = new DeleteDuplication();
        ListNode l = d.deleteDuplication(a);
//        for (int n:l){
//            System.out.print(n + " ");
//        }
        while (l!=null){
            System.out.print(l.val + " ");
            l = l.next;
        }
    }
}
