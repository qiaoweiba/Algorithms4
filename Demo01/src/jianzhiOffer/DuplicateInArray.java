package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/21 0021.
 */
//题目描述:数组中重复的数字
//        在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
//        请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重复的数字2或者3。
public class DuplicateInArray {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length==0|numbers==null) {
            duplication[0] = -1;
            return false;
        }
        int[] flag = new int[length];
        int[] dup = new int[length];
        duplication[0] = -1;
        for (int i=0;i<length;i++){
            flag[i] = -1;
            dup[i] = -1;
        }
        int k=0;
        for (int j=0;j<length;j++){
            if (flag[numbers[j]] == -1){
                flag[numbers[j]] = 0;
            }else {
                if (flag[numbers[j]] == 0){
                    dup[k++] = numbers[j];
                    flag[numbers[j]] ++;
                }
            }
        }
        duplication[0] = dup[(int)Math.floor(Math.random() * k)];
        return duplication[0]==-1?false:true;


//        int[] assist = new int [length];
//        for(int i = 0; i < length; i++){
//            if(assist[numbers[i]] == 0){
//                assist[numbers[i]] ++;
//            }else{
//                duplication[0] = numbers[i];
//                return true;
//            }
//        }
//        return false;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 0, 2, 5, 3};
        int[] a1 = {2, 1, 3, 0};
        int[] a2 = null;
        DuplicateInArray d = new DuplicateInArray();
        int[] b = new int[1];
        System.out.println(d.duplicate(a2,a2.length,b));
        System.out.println(b[0]);
        System.out.println((int) Math.floor(Math.random() * 5));
    }
}
