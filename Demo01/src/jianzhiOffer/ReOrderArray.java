package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/13 0013.
 */
//��Ŀ����
//����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
//    ���е�ż��λ��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        int[] b = new int[array.length];
        int j=0,k=0;
        for (int i=0;i<array.length;i++){
            if(array[i]%2 !=0) array[j++] = array[i];
            else {
                b[k++] = array[i];
            }
        }
        for (int i=0;i<k;i++) array[j++] = b[i];

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3,5,6,85,4, 5, 6, 7, 8};
        ReOrderArray r = new ReOrderArray();
        r.reOrderArray(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
