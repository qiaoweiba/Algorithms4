package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/11 0011.
 */
//题目描述
//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
public class JumpFloorII {
    public int JumpFloor(int target) {
        if (target<=0) return -1;
        else {
//            int count = 1;
//            for (int i=0;i<target;i++){
//                count *= 2;
//            }
//            return count/2;
            return 1 << (target - 1);//运用位移操作进行，更快
        }

    }

    public static void main(String[] args) {
        JumpFloorII j = new JumpFloorII();
        System.out.println(j.JumpFloor(6));
        System.out.println(2<<5);
    }
}
