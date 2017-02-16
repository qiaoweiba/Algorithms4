package jianzhiOffer;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/16 0016.
 */
//题目描述:最小的K个数
//        输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (input.length<k |k<1) return list;
        int max = input[0];
        for (int i=0;i<input.length;i++){
            if (i<k) {
                list.add(input[i]);
                max = list.get(i)>max?list.get(i):max;
            }
            else{
                if (input[i]<max){
                    list.remove(list.indexOf(max));
                    list.add(input[i]);
                    max = list.get(0);
                    for (int j=1;j<list.size();j++) {
                        max = list.get(j) > max ? list.get(j) : max;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] in = {4, 5, 1, 6, 2, 7, 3, 8};
        GetLeastNumbers_Solution leastNum = new GetLeastNumbers_Solution();
        ArrayList<Integer> list = leastNum.GetLeastNumbers_Solution(in, 4);
        for (Integer l:list){
            System.out.print(l + " ");
        }
    }
}
