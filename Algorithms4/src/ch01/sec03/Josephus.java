package ch01.sec03;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/12/8 0008.
 */
public class Josephus {
    public static void getOrder(int n,int m){
        if (n<m || n<1 || m<1) return ;
        LinkedList<Integer> q = new LinkedList<Integer>();
        int count = 0;
        for (int i=1;i<=n;i++){
            ++count;
            if (count== m ) {
                System.out.print(i-1+" ");
                count =0;
            }
            else q.add(i);
        }
        while (!q.isEmpty()){
            ++count;
            if (count== m ) {
                System.out.print(q.get(0) - 1 + " ");
                count = 0;
            }
            else {
                q.add(q.get(0));
            }
            q.remove(0);
        }
    }
    public static void main(String[] args) {
        getOrder(7,2);
    }
}
