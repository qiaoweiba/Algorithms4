package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/13 0013.
 */
//��Ŀ��������ת����
// ����һ��������ת�����������������Ԫ�ء�
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
//        Stack<Integer> stack = new Stack<Integer>();
//        while (head !=null) {
//            stack.push(head.val);
//            head = head.next;
//        }
//        ListNode pp = new ListNode(-1);
//        ListNode phead = pp;
//        while (!stack.isEmpty()) {
//            ListNode lst = new ListNode(stack.pop());
//            pp.next = lst;
//            pp = lst;
//        }
//        return phead.next;   //ʹ�ö�ջ��Ч��ƫ�͡�

        ListNode pre = null,next = null; //��ǰ�ڵ���head��preΪ��ǰ�ڵ��ǰһ�ڵ㣬nextΪ��ǰ�ڵ����һ�ڵ�
        while (head!=null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
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
        ListNode pp = reverseList.ReverseList(p);
        while (pp!=null){
            System.out.print(pp.val + " ");
            pp = pp.next;
        }
    }
}
