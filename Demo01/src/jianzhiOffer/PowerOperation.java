package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/13 0013.
 */
//��Ŀ����:��ֵ�������η�
//����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
public class PowerOperation {
    public double Power(double base, int exponent) {
        if (base ==0) return 0;
        if (exponent==0) return 1;
        if (exponent==1) return base;
        else if (exponent<0) {
            base =  1 / base;
            exponent = Math.abs(exponent);
        }
        return base*Power(base,exponent-1); //�ݹ飬Ч�ʵ�


        //�򵥿�����
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
