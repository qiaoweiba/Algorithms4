package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/10 0010.
 */
public class reConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {


//        if(pre.length == 0||in.length == 0){
//            return null;
//        }
//        TreeNode node = new TreeNode(pre[0]);
//        for(int i = 0; i < in.length; i++){
//            if(pre[0] == in[i]){
//                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
//                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length));
//            }
//        }
//        return node;


        TreeNode treeNode = new TreeNode(pre[0]);
        //System.out.print(treeNode.val+" ");
        int i = 0;
        for(;i<in.length;i++){
            if (pre[0]==in[i]) {
                break;
            }
        }
        if (i!=0){
            int[] lpre = new int[i];
            int[] lin = new int[i];
            for (int j = 0;j<i;j++) lpre[j] = pre[j+1];
            for (int k = 0;k<i;k++) lin[k] = in[k];
            treeNode.left = reConstructBinaryTree(lpre,lin);
        }
        if(i!=in.length-1){
            int[] rpre = new int[pre.length-i-1];
            int[] rin = new int[pre.length-i-1];
            for (int j = 0;j<pre.length-i-1;j++) rpre[j] = pre[i+1+j];
            for (int k = 0;k<pre.length-i-1;k++) rin[k] = in[i+1+k];
            treeNode.right = reConstructBinaryTree(rpre,rin);
        }
        return  treeNode;
    }

    public static void main(String[] args) {
        reConstructBinaryTree re = new reConstructBinaryTree();
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        re.reConstructBinaryTree(pre,in);
    }
}
