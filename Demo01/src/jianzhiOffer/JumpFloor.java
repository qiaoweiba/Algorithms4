package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/11 0011.
 */
public class JumpFloor {

    public int JumpFloor(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
//    public int JumpFloor(int target) {
//        if (target<=0){
//            return 0;
//        }else {
//            int count = 0;
//            for (int i=0;i<target/2+1;i++) {
//                count += factorial(target - i)/(factorial(i)*factorial(target-2*i));
//            }
//            return count;
//        }
//    }
//    public long factorial(int n) {    //阶乘消耗资源严重，不建议使用
//        return n == 0 ? 1 : n * factorial(n - 1);
//    }

    public static void main(String[] args) {
        JumpFloor j = new JumpFloor();
        System.out.println(j.JumpFloor(7));
//        System.out.println(j.factorial(13));
    }
}
