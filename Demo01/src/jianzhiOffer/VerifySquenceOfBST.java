package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/15 0015.
 */
//题目描述:二叉搜索树的后序遍历序列
//        输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
// 假设输入的数组的任意两个数字都互不相同。
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {

        int length = sequence.length;
        if (length<1) return false;
        if (length==1) return true;
        else {
            int[] lseq = new int[length - 1];
            int[] rseq = new int[length - 1];
            int flag = -1;
            while (sequence.length !=1){
                for (int i = 0; i<length-1;i++) {
                    if (sequence[i] > sequence[length - 1]) {
                        flag = i;
                        break;
                    }
                }
                if (flag==-1) flag = length-1;
                for (int j=0;j<flag;j++) lseq[j]=sequence[j];
                for (int k=0;k<length-1-flag ;k++) {
                    if (sequence[k+flag]<sequence[length-1]) return false;
                    rseq[k]=sequence[k+flag];
                }
                return VerifySquenceOfBST(lseq) & VerifySquenceOfBST(rseq);
            }
            return true;
        }

    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 7, 9, 8, 6};
        int[] b = {6, 2, 1, 3, 8, 7, 9};
        int[] c = {1,2,3,4,5,6,7,8, 9};
        int[] d ={};
        VerifySquenceOfBST v = new VerifySquenceOfBST();
        System.out.println(v.VerifySquenceOfBST(a));
        System.out.println(v.VerifySquenceOfBST(b));
        System.out.println(v.VerifySquenceOfBST(c));
        System.out.println(v.VerifySquenceOfBST(d));

    }
}
