package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/9 0009.
 */
public class FibonacciSequence {
    public int Fibonacci(int n) {
        //递归
//        if (n<=0)
//            return 0;
//        else{
//            if (n==1||n==2)
//                return 1;
//            else {
//                return Fibonacci(n-1)+Fibonacci(n-2);
//            }
//        }

        //循环
        int a1 = 1;
        int a2 = 1;
        int s = 0;
        if (n<=0) return 0;
        if (n==1||n==2) return 1;
        for (int i = 3;i<=n;i++){
            s = a1+a2;
            a1 = a2;
            a2 = s;
        }
        return s;
    }

    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        System.out.println(fibonacciSequence.Fibonacci(6));
    }
}
