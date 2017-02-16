package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/12 0012.
 */
//题目描述:丑数
//把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
public class GetUglyNumber {
    public int GetUglyNumber_Solution(int index) {
//        int count = 0;
//        int n = 0;
//        if (index>0){
//            if (index == 1) return 1;
//            for ( n = 2;count<index-1;n++) {
//                int i = n;
//                while (i != 1) {
//                    if (i % 2 == 0) i = i / 2;
//                    else {
//                        if (i % 3 == 0) i = i / 3;
//                        else {
//                            if (i % 5 == 0) i = i / 5;
//                            else break;
//                        }
//                    }
//
//                }
//                if (i == 1) count++;
//            }
//        }
//        return --n;           //自己算法复杂度过大,超时

        if (index < 7)return index;
        int[] res = new int[index];
        res[0] = 1;
        int t2 = 0, t3 = 0, t5 = 0, i;
        for (i = 1; i < index; ++i)
        {
            res[i] = Math.min(res[t2] * 2, Math.min(res[t3] * 3, res[t5] * 5));
            if (res[i] == res[t2] * 2)t2++;
            if (res[i] == res[t3] * 3)t3++;
            if (res[i] == res[t5] * 5)t5++;
        }
        return res[index - 1];
    }

    public static void main(String[] args) {
        GetUglyNumber getUglyNumber = new GetUglyNumber();
        System.out.println(getUglyNumber.GetUglyNumber_Solution(1));
        System.out.println(getUglyNumber.GetUglyNumber_Solution(2));
        System.out.println(getUglyNumber.GetUglyNumber_Solution(3));
        System.out.println(getUglyNumber.GetUglyNumber_Solution(8));
    }
}
