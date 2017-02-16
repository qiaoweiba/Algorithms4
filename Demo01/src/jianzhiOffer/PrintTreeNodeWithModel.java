package jianzhiOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
//题目描述:按之字形顺序打印二叉树
//        请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，
//          第三行按照从左到右的顺序打印，其他行以此类推。
public class PrintTreeNodeWithModel {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int level=0;
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        if (pRoot==null) return list;
        stack1.push(pRoot);
        while (!stack1.isEmpty()|!stack2.isEmpty()){
            ArrayList<Integer> l = new ArrayList<Integer>();
            if (level%2==0) {
                while (!stack1.isEmpty()){
                    pRoot = stack1.pop();
                    if (pRoot.left!=null) stack2.push(pRoot.left);
                    if (pRoot.right!=null) stack2.push(pRoot.right);
                    l .add(pRoot.val);
                }
            }else{
                while (!stack2.isEmpty()){
                    pRoot = stack2.pop();
                    if (pRoot.right!=null) stack1.push(pRoot.right);
                    if (pRoot.left!=null) stack1.push(pRoot.left);
                    l .add(pRoot.val);
                }
            }
            list.add(l);
            level++;
        }
        return list;
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
        a4.left = a8;
        TreeNode a9 = new TreeNode(9);
        a5.left = a9;

        TreeNode b = new TreeNode(0);

        PrintTreeNodeWithModel p = new PrintTreeNodeWithModel();
        ArrayList<ArrayList<Integer>> list = p.Print(a);
        for (ArrayList<Integer> l:list){
            for (Integer n:l){
                System.out.print(n + " ");
            }
        }
    }
}
