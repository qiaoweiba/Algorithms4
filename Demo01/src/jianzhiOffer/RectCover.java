package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/11 0011.
 */
//��Ŀ����:���θ���
//���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
public class RectCover {
    public int RectCover(int target) {
        if (target <= 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        return RectCover(target - 1) + RectCover(target - 2);
    }

    public static void main(String[] args) {
        RectCover rectCover = new RectCover();
        System.out.println(rectCover.RectCover(5));
    }
}
