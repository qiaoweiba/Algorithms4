package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/12 0012.
 */
//��Ŀ����:����
//��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ����������7�� ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
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
//        return --n;           //�Լ��㷨���Ӷȹ���,��ʱ

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
