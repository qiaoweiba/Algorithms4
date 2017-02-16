package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/13 0013.
 */
//题目描述:数值的整数次方
//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
public class PowerOperation {
    public double Power(double base, int exponent) {
        if (base ==0) return 0;
        if (exponent==0) return 1;
        if (exponent==1) return base;
        else if (exponent<0) {
            base =  1 / base;
            exponent = Math.abs(exponent);
        }
        return base*Power(base,exponent-1); //递归，效率低


        //简单快速幂
//        long long p = abs((long long)exponent);
//        double r = 1.0;
//        while(p){
//            if(p & 1) r *= base;
//            base *= base;
//            p >>= 1;
//        }
//        return exponent < 0 ? 1/ r : r;
    }

    public static void main(String[] args) {
        PowerOperation p = new PowerOperation();
        System.out.println(p.Power(2.2,-3));
    }
}
