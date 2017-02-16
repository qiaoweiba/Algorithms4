package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
//题目描述:数字在排序数组中出现的次数
//        统计一个数字在排序数组中出现的次数。
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        if (array.length<=0) return 0;
        int start=0,end = array.length-1;
        int mid=0;
        while (start<end){
            mid=start+(end-start)/2;
            if (array[mid]<k){
                start = mid+1;
            }else {
                if (array[mid]>k) end = mid-1;
                else {
//                    if (array[mid]==k &array[mid+1]!=k){
//                        start =mid;
//                    }
//                    if (array[mid]==k &array[mid-1]!=k){ //数组越界
//                        end =mid;
//                }

                    break;
                }
            }
        }
        int i=0,j=0;

//        if (array[mid+i]==k |array[mid-j]==k){
//            for (;array[mid+i]==k |array[mid-j]==k;){
//                if (array[mid+i]==k) i= (mid+i==array.length-1)?i:++i;
//                if (array[mid-j]==k) j=(mid-j==0)?j:++j;
//                if
//
//
//            }
//            return i+j-1;
//        }
        if (start>mid | end<mid) return 0;
        else return 1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 4, 4, 4, 4, 5,5,5, 6, 7, 7, 8, 34, 65,65, 234};
        int[] b = {3,3,3,3,};
        GetNumberOfK g = new GetNumberOfK();
        System.out.println(g.GetNumberOfK(b,3));
    }
}
