package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/21 0021.
 */
//题目描述:构建乘积数组
//        给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
public class MultiplyArray {
    public int[] multiply(int[] A) {
        if (A==null|A.length<=0) return null;
        int[] B = new int[A.length];
        for (int i=0;i<B.length;i++){
            B[i] = 1;
            for (int j=0;j<A.length;j++){
                B[i] = j==i?B[i]*1:B[i]*A[j];
            }
        }
        return B;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        MultiplyArray m = new MultiplyArray();
        int[] b = m.multiply(a);
        for (int n:b){
            System.out.print(n + " ");
        }
    }
}
