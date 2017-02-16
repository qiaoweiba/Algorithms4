package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/13 0013.
 */
//题目描述
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
//    所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        int[] b = new int[array.length];
        int j=0,k=0;
        for (int i=0;i<array.length;i++){
            if(array[i]%2 !=0) array[j++] = array[i];
            else {
                b[k++] = array[i];
            }
        }
        for (int i=0;i<k;i++) array[j++] = b[i];

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3,5,6,85,4, 5, 6, 7, 8};
        ReOrderArray r = new ReOrderArray();
        r.reOrderArray(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
