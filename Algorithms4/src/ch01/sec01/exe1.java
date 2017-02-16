package ch01.sec01;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Administrator on 2016/11/30 0030.
 */
public class exe1 {
    public static void main(String[] args) {
        System.out.println(1+2+"3");
        int a=1,b=2,c=0;
//        if (a>b) then c=0;
        if (a>b){c=0;}
        if (a>b)c=0;
//        if (a>b)c=0 else b=0;

        int f =0;
        int g = 1;
        for (int i=0;i<=15;i++){
            StdOut.println(f);
            f = f+g;
            g = f-g;
        }

        System.out.println('b');
        System.out.println('b'+'c');
        System.out.println((char)('a'+4));

        int  N = 100;
        System.out.println(Integer.toBinaryString(N));

        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(--N);

    }
}
