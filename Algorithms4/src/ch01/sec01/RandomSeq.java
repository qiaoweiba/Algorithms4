package ch01.sec01;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by Administrator on 2016/11/30 0030.
 */
public class RandomSeq {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for (int i=0;i<N;i++) {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n",x);
        }

//        double[] a = new double[N];
//        for (int i=0;i<N;i++){
//            a[i] = StdRandom.random();
//        }
//        Arrays.sort(a);
//        for(int i=0;i<N;i++) {
//            double x = 1.0 * i / N;
//            double y = a[i]  / 2.0;
//            double rw = 0.5 / N;
//            double rh = a[i]  / 2.0;
//            StdDraw.setPenColor(Color.lightGray);
//            StdDraw.filledRectangle(x,y,rw,rh);
//        }
    }
}
