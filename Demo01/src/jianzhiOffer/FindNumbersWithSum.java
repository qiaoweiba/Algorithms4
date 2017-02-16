package jianzhiOffer;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/13 0013.
 */
//��Ŀ����:��ΪS����������
//        ����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�?
//        �������?:
//        ��Ӧÿ�����԰����������������С���������
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int l = array.length;
        if (l ==0) return list;
        if (sum< array[0]+array[1] || sum>array[l-2]+array[l-1]) return list;
        int i=0,j=1;
        while (array[i]+array[l-j]!=sum &i<l-j){
            if (array[i]+array[l-j]>sum)j++;
            else i++;
        }
        if (array[i]+array[l-j] == sum) {
            list.add(array[i]);
            list.add(array[l-j]);
        }
        return list;


//        else {
//            int min = array[i];
//            int max = array[l-j];
//            for(;i+1<l-j-1;i++,j++){
//                while (array[i+1]+array[l-j-1]!=sum){
//                    if (array[i+1]+array[l-j-1]>sum)j++;
//                    else i++;
//                }
//                if (array[i+1]*array[l-j-1]<min*max){
//                    min = array[i+1];
//                }
//                break;
//            }
//            list.add(min);
//            list.add(max);
//            return list;


//        ArrayList<Integer> list = new ArrayList<Integer>();
//
//        if(array == null || array.length == 0){
//            return list;
//        }
//        int i = 0;
//        int j = array.length-1;
//        while(i < j){
//            if(array[i] + array[j] < sum){
//                i++;
//            }else if (array[i] + array[j] > sum) {  //因为和一定时， 两个数相差越大，乘积越小，第一次得到的一定是乘积最小的。相乘判断多余！！！！
//                j--;
//            }else {
//                list.add(array[i]);
//                list.add(array[j]);
//                break;
//            }
//        }
//        return list;


    }

    public static void main(String[] args) {
        int[] a = {1,2,4,6,7,8,10,11};
        int[] b = {};
        FindNumbersWithSum findN = new FindNumbersWithSum();
        ArrayList<Integer> list = findN.FindNumbersWithSum(a, 10);
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
