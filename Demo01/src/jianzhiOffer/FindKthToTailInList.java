package jianzhiOffer;

import java.util.Stack;

/**
 * Created by Administrator on 2016/11/13 0013.
 */
//��Ŀ����:�����е�����k�����
//����һ����������������е�����k����㡣
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
//        //����ָ�붼ָ��ͷ���
//        p=head;
//        pre=head;
//        //��¼kֵ
//        int a=k;
//        //��¼�ڵ�ĸ���
//        int count=0;
//        //pָ�����ܣ����Ҽ�¼�ڵ�������pָ������k-1���ڵ��preָ�뿪ʼ�ܣ�
//        //��pָ���ܵ����ʱ��pre��ָָ����ǵ�����k���ڵ�
//        while(p!=null){
//            p=p.next;
//            count++;
//            if(k<1){
//                pre=pre.next;
//            }
//            k--;
//        }
//        //����ڵ����С������ĵ�����k���ڵ㣬�򷵻ؿ�
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
