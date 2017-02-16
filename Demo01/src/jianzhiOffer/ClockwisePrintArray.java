package jianzhiOffer;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/9 0009.
 */
public class ClockwisePrintArray {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int k = 0;k<Math.min(matrix[0].length,Math.floor((matrix.length+1)/2));k++){
            int i =k,j =k;

                for (;j<matrix[i].length-k;j++){
                    System.out.print(matrix[i][j] + " ");
                    arrayList.add(matrix[i][j]);
                }
                for (i = i+1,j= j-1;i<matrix.length-k && j>=k;i++) {
                    System.out.print(matrix[i][j] + " ");
                    arrayList.add(matrix[i][j]);
                }
                for (i =i-1,j = j-1;j>=k && i>k;j--){
                    System.out.print(matrix[i][j] + " ");
                    arrayList.add(matrix[i][j]);
                }
                for (i =i-1,j=j+1;i>k && j<matrix[i].length-k-1;i--) {
                    System.out.print(matrix[i][j] + " ");
                    arrayList.add(matrix[i][j]);
                }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int b[][] = {{1},{2},{3},{4},{5},{6}};
        int[][] c = {{1,2},{5,6},{9,10},{7,8},{3,4}};
        System.out.println(b.length);
        for (int i = 0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        ClockwisePrintArray clockwisePrintArray = new ClockwisePrintArray();
        clockwisePrintArray.printMatrix(a);
        System.out.println();
        clockwisePrintArray.printMatrix(b);
        System.out.println();
        clockwisePrintArray.printMatrix(c);
    }
}
