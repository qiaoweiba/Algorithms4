package jianzhiOffer;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
//题目描述:二叉树的深度
// 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
public class TreeDepth {

    //递归
//    public int TreeDepth(TreeNode root) {
//        if (root==null) return  0;
//        if (root!=null && root.left==null&& root.right==null) return  1;
//        return 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
//
//        // return root == null? 0 : Math.max(TreeDepth(root.left),TreeDepth(root.right)) + 1;
//    }

    //非递归,层次遍历很好
    public int TreeDepth(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        if (root == null) return 0;
        list.add(root);
        int level = 0;
        while (!list.isEmpty()){
            level++;
            int len = list.size();
            for (int i=0;i<len;i++) {
                TreeNode tem = list.get(0);
                if (tem.left!=null) list.add(tem.left);
                if (tem.right!=null) list.add(tem.right);
                list.remove(0);
            }
        }
        return level;
    }

    public static void main(String[] args) {
        TreeNode a =new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        a.left = a2;
        TreeNode a3 = new TreeNode(3);
        a.right = a3;
        TreeNode a4 = new TreeNode(4);
        a2.left = a4;
        TreeNode a5 = new TreeNode(5);
        a2.right = a5;
        TreeNode a6 = new TreeNode(6);
        a3.left = a6;
        TreeNode a7 = new TreeNode(7);
        a3.right = a7;
        TreeNode a8 = new TreeNode(8);
        a5.left = a8;
        TreeNode a9 = new TreeNode(9);
        a6.right = a9;
        TreeNode a10 = new TreeNode(10);
        a8.right = a10;


        TreeNode b = new TreeNode(0);
        TreeDepth t = new TreeDepth();
        t.TreeDepth(a);
        System.out.println(t.TreeDepth(a));
        System.out.println(t.TreeDepth(b.left));
    }
}
