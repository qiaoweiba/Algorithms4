package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/12 0012.
 */
//题目描述
//写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
public class Add {
    public int Add(int num1,int num2) {
        while ( (num1 & num2 ) !=0) {
            int a = (num1 & num2)<<1;
            int b = num1 ^ num2;
            num1 = a;
            num2 = b;
        }
        return num1|num2;


//         return num2?Add(num1^num2,(num1&num2)<<1):num1; //简单明了，厉害
    }

    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.Add(-2,5));
        System.out.println(a.Add(244,5));
        System.out.println(a.Add(6,7));
        System.out.println((3&5));
        System.out.println(3^5);
    }
}
