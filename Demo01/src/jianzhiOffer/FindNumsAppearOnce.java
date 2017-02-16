package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/15 0015.
 */
//题目描述:数组中只出现一次的数字
//        一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length<2) num1=num2 = null;
        for (int i=0,j=0;i<array.length-j;){
            if ( i!=array.length-j-1&&array[i]==array[array.length-j-1]){
                i++;
                j++;
                continue;
            }
            if (array[i]==array[i+1]) {
                i +=2;continue;
            }
            if (array[array.length-j-1]==array[array.length-j-2]) {
                j +=2;continue;
            }
            else {
              if(num1[0]==0 |num2[0]==0){
                  if(num1[0]==0) {
                      num1[0] = array[i]; i++;
                  }
                  if(num2[0]==0) {
                      num2[0] = array[array.length-j-1];j++;
                  }
              }
               else{
                   if (array[i] ==num1[0]) {
                       i++;
                       num1[0]=0;
                   }
                   if (array[i] ==num2[0]){
                       i++;
                       num2[0]=0;
                   }
                   if (array[array.length-j-1] ==num1[0]) {
                       j++;num1[0]=0;
                   }
                   if (array[array.length-j-1] ==num2[0]){
                       j++;num2[0]=0;
                   }
               }
            }
        }
    }

    public static void main(String[] args) {
        int[] a ={1,5,6,1,7,7,2,2,8,3,3,4,5,6};
        int[] a1 ={1,1,1,1,4,6};
        int[] b =new int[1];
        int[] c =new int[1];
        FindNumsAppearOnce f = new FindNumsAppearOnce();
        f.FindNumsAppearOnce(a1,b,c);
        System.out.print(b[0]+" "+c[0]);
//        System.out.println(b[0]);
    }
}
