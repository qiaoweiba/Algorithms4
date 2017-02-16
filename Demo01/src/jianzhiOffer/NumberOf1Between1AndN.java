package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/16 0016.
 */
//题目描述:整数中1出现的次数（从1到n整数中1出现的次数）
//        求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字
//        有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
//        可以很快的求出任意非负整数区间中1出现的次数。
public class NumberOf1Between1AndN {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n<0 |n==0) return 0;
        if (n/10==0 & n%1!=0) return 1;
        else {
            int c,y;
            if (n/100==0 ) {
                c = n/10;
                y = n%10;
//                return c==1?+1:1;
            }
        }

      return 1;
    }

    public static void main(String[] args) {
        NumberOf1Between1AndN o = new NumberOf1Between1AndN();
        System.out.println(o.NumberOf1Between1AndN_Solution(1));
    }
}
