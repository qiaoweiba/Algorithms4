package jianzhiOffer;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/13 0013.
 */
//��Ŀ����:��ΪS��������������
//        С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100�����������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
//        �������:
//        ������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
public class FindContinuousSequenceOfNumber {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> alist = new ArrayList<ArrayList<Integer>>();
        if (sum<3)  return alist ;
        int n = (int)Math.sqrt(2*sum);

        for (;n>1;n--) {
            double a = (double)(2 * sum - n * (n - 1)) / (2 * n);
            if (a%1 ==0 & a>0) {
                ArrayList<Integer> arrayList= new ArrayList<Integer>();
                int b = (int)a;
                for (int i = 0;i<n;i++){
                    arrayList.add(b+ i);
                }
                alist.add(arrayList);

            }else continue;
        }
        return alist;



        //������ѧ��ʽ����:(a1+an)*n/2=s  n=an-a1+1

        //(an+a1)*(an-a1+1)=2*s=k*l(k>l)

        //an=(k+l-1)/2  a1=(k-l+1)/2

//        ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
//        if(sum<3)return list;
//        int s=(int) Math.sqrt(2*sum);
//        for(int i=s;i>=2;i--)
//        {
//            if(2*sum%i==0)
//            {
//                int d=2*sum/i;
//                if(d%2==0&&i%2!=0||d%2!=0&&i%2==0) //d%2==0&&i%2!=0||d%2!=0&&i%2==0����Ϊan=(k+l-1)/2�� a1=(k-l+1)/2��Ҫ�������������k��l������k��l����һ��Ϊż����һ��Ϊ����,��Ϊһ��������һ��ż����Ӽ��ټӼ�һ���ܱ�2����
//                {
//                    int a1=(d-i+1)/2;
//                    int an=(d+i-1)/2;
//                    ArrayList<Integer>temp=new ArrayList<Integer>();
//                    for(int j=a1;j<=an;j++)
//                        temp.add(j);
//                    list.add(temp);
//                }
//            }
//        }
//        return list;
    }

    public static void main(String[] args) {
        FindContinuousSequenceOfNumber findC = new FindContinuousSequenceOfNumber();
        ArrayList<ArrayList<Integer>> arrayList = findC.FindContinuousSequence(1);
        for (int i=0;i<arrayList.size();i++){
            ArrayList a = arrayList.get(i);
            System.out.print("{");
            for (int j = 0;j<a.size();j++){
                System.out.print(a.get(j) + " ");
            }
            System.out.print("}");
        }
    }
}
