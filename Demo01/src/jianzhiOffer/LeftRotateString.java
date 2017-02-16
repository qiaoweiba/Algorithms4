package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/14 0014.
 */
//题目描述:左旋转字符串
//      汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
//      对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
//      即“XYZdefabc”。是不是很简单？OK，搞定它！
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if (str.length()==0) return str;
        int m = n % str.length() > 0 ? n % str.length() : str.length()+ n % str.length();
        str = str.substring(m ) + str.substring(0, m);  //调用内部函数，偷工减料？机智如我

        return str;
    }

    public static void main(String[] args) {
        String str = "abcXYZdef";
        String s = "";
        LeftRotateString l = new LeftRotateString();
        System.out.println(l.LeftRotateString(str,-1));
        System.out.println(l.LeftRotateString(s,3));
        System.out.println(9%str.length());
        System.out.println(-10%str.length());
    }
}
