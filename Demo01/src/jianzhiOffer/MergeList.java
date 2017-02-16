package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/13 0013.
 */
//题目描述：合并两个排序的链表
// 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class MergeList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode m = null;
        ListNode n = null;
        if (list1 == null ) return list2;
        if (list2 == null ) return list1;
        m = list1.val > list2.val ? list2 : list1;
//        m = list2;
        n = m;
        if(list1.val > list2.val) {
            list2 = list2.next;
        }else {
            list1 = list1.next;
        }
        while (list1!=null & list2 !=null) {
            if (list1.val>list2.val){
                m.next = list2;
                list2 = list2.next;
            }else {
                m.next = list1;
                list1 = list1.next;
            }
            m = m.next;
        }
        m.next = list1 == null ? list2 : list1;
        return n;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(0);
        ListNode p1 = head1;
        ListNode node11 = new ListNode(4);
        head1.next = node11;
        ListNode node12 = new ListNode(17);
        node11.next = node12;
        ListNode node13 = new ListNode(29);
        node12.next = node13;

        ListNode head2 = new ListNode(6);
        ListNode p2 = head2;
        ListNode node21 = new ListNode(11);
        head2.next = node21;
        ListNode node22 = new ListNode(12);
        node21.next = node22;
        ListNode node23 = new ListNode(18);
        node22.next = node23;
        ListNode node24 = new ListNode(19);
        node23.next = node24;
        ListNode node25 = new ListNode(54);
        node24.next = node25;

        System.out.print("head1:");
        while (head1!=null){
            System.out.print(head1.val + " ");
            head1 = head1.next;
        }
        System.out.println();
        System.out.print("head2:");
        while (head2!=null){
            System.out.print(head2.val + " ");
            head2 = head2.next;
        }

        MergeList m = new MergeList();
        ListNode lm = m.Merge(p1, p2);
        System.out.println();
        System.out.print("head1+head2:");
        while (lm!=null){
            System.out.print(lm.val + " ");
            lm = lm.next;
        }
    }
}
