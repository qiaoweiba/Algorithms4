package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/16 0016.
 */
//题目描述:连续子数组的最大和
//            HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维模式识别中,
//              常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,
//              是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},
//                  连续子向量的最大和为8(从第0个开始,到第3个为止)。你会不会被他忽悠住？(子向量的长度至少是1)
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length ==0) return  0;
        int len = array.length;
        int sum = 0;
        int i;
        for (i=0;i<len;i++){
            if (array[i]>0) {
                sum = array[i];
                break;
            }
        }
        int max = sum;
        if (i==len) {
            max = array[0];
            for (int j = 1; j < len; j++) {
                max = array[j] < max ? max : array[j];
            }
            return max;
        }
        for (i=i+1;i<len;i++){
            sum += array[i];
            if (sum<=0) {
                sum=0;
            }else {
                max = sum>max?sum:max;
            }
        }
            return max;
    }

    public static void main(String[] args) {
        int[] a = {6, -3, -2, 7, -15, 1, 2, 2};
        int[] b = {-6, -3, -2, -7, -15, -5, -2, -2};
        FindGreatestSumOfSubArray f = new FindGreatestSumOfSubArray();
        System.out.println(f.FindGreatestSumOfSubArray(b));

    }
}
