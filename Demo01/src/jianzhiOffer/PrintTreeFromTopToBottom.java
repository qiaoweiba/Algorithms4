package jianzhiOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Administrator on 2016/11/14 0014.
 */
//题目描述:从上往下打印二叉树
//        从上往下打印出二叉树的每个节点，同层节点从左至右打印。
public class PrintTreeFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        if (root==null) return list;
        list.add(root.val);
        stack1.push(root);
        while (!stack1.isEmpty()|!stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            while (!stack2.isEmpty()){
                TreeNode node = stack2.pop();
                TreeNode lnode = node.left;
                if (lnode != null) {
                    list.add(lnode.val);
                    stack1.push(lnode);
                }
                TreeNode rnode = node.right;
                if (rnode != null) {
                    list.add(rnode.val);
                    stack1.push(rnode);
                }
        }

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

        TreeNode n = null;

        PrintTreeFromTopToBottom p = new PrintTreeFromTopToBottom();
        ArrayList<Integer> list = p.PrintFromTopToBottom(a);
        for (Integer l:list){
            System.out.print(l + " ");
        }
    }
}
