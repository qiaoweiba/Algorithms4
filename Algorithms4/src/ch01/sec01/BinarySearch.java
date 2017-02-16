package ch01.sec01;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/11/28 0028.
 */
public class BinarySearch {
    public static int rank(int key,int[] a){
        int lo = 0;
        int hi = a.length-1;
        while (lo<=hi){
            int mid = lo+(hi-lo)/2;
            if (key<a[mid]) hi = mid-1;

            else if (key>a[mid]) lo = mid+1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        StdOut.println(whitelist);
        In in = new In(args[1]);
        while (!in.isEmpty()) {
            int key = in.readInt();
            if (rank(key,whitelist)<0)
                StdOut.println(key);
        }

//        File file = new File("tinyT.txt");
//        System.out.println("文件存在么？");
//        System.out.println(file.exists());

    }
}
