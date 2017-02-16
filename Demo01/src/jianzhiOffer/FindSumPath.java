package jianzhiOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Administrator on 2016/11/15 0015.
 */
//题目描述:二叉树中和为某一值的路径
//        输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
//        路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
public class FindSumPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root==null) return null;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
        Stack<TreeNode> stack =new Stack<TreeNode>();
        int num = target;
        while (root!=null  ){


            while (root!=null ) {
                stack.push(root);
                target -= root.val;
                list.add(root.val);
                root = root.left;
            }
            if (target!=0) {

                target +=list.remove(list.size()-1);
                stack.pop();
            }
            else {
                l.add(list);
            }
            if(!stack.isEmpty()){
                root = stack.pop();
                root = root.right;
            }
        }



        return  l;
    }

    public static void main(String[] args) {
        TreeNode a =new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        a.left = a2;
        TreeNode a3 = new TreeNode(3);
        a.right = a3;
        TreeNode a4 = new TreeNode(4);
        a2.left = a4;
        TreeNode a5 = new TreeNode(7);
        a2.right = a5;
        TreeNode a6 = new TreeNode(6);
        a3.left = a6;
        TreeNode a7 = new TreeNode(7);
        a3.right = a7;

        FindSumPath f = new FindSumPath();
        ArrayList<ArrayList<Integer>> list = f.FindPath(a, 10);
        for (ArrayList<Integer> l:list){
            System.out.print(l + " ");
        }
    }
}
