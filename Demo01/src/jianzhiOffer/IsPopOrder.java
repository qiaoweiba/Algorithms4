package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/14 0014.
 */
//题目描述：栈的压入、弹出序列
//        输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
// 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
// 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length !=popA.length) return false;
        if (pushA==null | pushA.length ==0) return false;
        int i = 0;
        for (;i<popA.length;i++){
            int j=pushA.length-1;
            while (popA[i]==pushA[j]){

            }
        }
        return i == popA.length ? true : false;
    }

    public static void main(String[] args) {
        IsPopOrder o = new IsPopOrder();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 3, 2, 1};
        System.out.println(o.IsPopOrder(a,b));
    }
}
