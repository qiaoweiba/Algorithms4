package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/12 0012.
 */
//��Ŀ����
//дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
public class Add {
    public int Add(int num1,int num2) {
        while ( (num1 & num2 ) !=0) {
            int a = (num1 & num2)<<1;
            int b = num1 ^ num2;
            num1 = a;
            num2 = b;
        }
        return num1|num2;


//         return num2?Add(num1^num2,(num1&num2)<<1):num1; //�����ˣ�����
    }

    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.Add(-2,5));
        System.out.println(a.Add(244,5));
        System.out.println(a.Add(6,7));
        System.out.println((3&5));
        System.out.println(3^5);
    }
}
