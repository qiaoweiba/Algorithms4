package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/11 0011.
 */
//题目描述
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class NumberOf1InBinary {
    public int NumberOf1(int n) {
//        int count = 0;
//        if(n>=0 &&n<128 ){
//            while (n!=0) {
////            count += n-(n >> 1);
////            n = n >> 1;
//                if (n%2==1) count +=1;
//                n = n / 2;
//            }
//        }
//        else {
//            if(n<0 && n>-128)
//            n = 128+n;
//            count = NumberOf1(n)+1;
//        }
//        return count;

        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1InBinary o = new NumberOf1InBinary();
        System.out.println(o.NumberOf1(5));
        System.out.println(o.NumberOf1(7));
        System.out.println(o.NumberOf1(8));
        System.out.println(o.NumberOf1(0));
        System.out.println(o.NumberOf1(-1));
        System.out.println(o.NumberOf1(-127));
        System.out.println(o.NumberOf1(-256));
        System.out.println(5>>>1);
    }
}
