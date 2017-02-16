package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/14 0014.
 */
//题目描述:把数组排成最小的数
//        输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
//        例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        int length = numbers.length;
        String s="";
        if(numbers==null|numbers.equals("")) return s;

        for (int i=0;i<length;i++) {
            int a = numbers[i];
            s +=a;
        }
        return s;
    }

    public static void main(String[] args) {
        PrintMinNumber pm = new PrintMinNumber();
        int[] a = {3, 32, 321};
        System.out.println(pm.PrintMinNumber(a));
        System.out.println(1%1000000007 );
    }
}
