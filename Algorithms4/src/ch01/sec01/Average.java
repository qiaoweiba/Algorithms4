package ch01.sec01;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Administrator on 2016/11/30 0030.
 */
public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int cnt = 0;
        In in = new In(args[0]);
        while (!in.isEmpty()){
            sum += in.readDouble();
            cnt++;
        }
        double avg = sum/cnt;
        StdOut.printf("Average is %.5f\n", avg);
    }
}
