package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/11 0011.
 */
//��Ŀ����
//һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
public class JumpFloorII {
    public int JumpFloor(int target) {
        if (target<=0) return -1;
        else {
//            int count = 1;
//            for (int i=0;i<target;i++){
//                count *= 2;
//            }
//            return count/2;
            return 1 << (target - 1);//����λ�Ʋ������У�����
        }

    }

    public static void main(String[] args) {
        JumpFloorII j = new JumpFloorII();
        System.out.println(j.JumpFloor(6));
        System.out.println(2<<5);
    }
}
