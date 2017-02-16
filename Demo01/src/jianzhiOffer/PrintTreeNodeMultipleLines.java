package jianzhiOffer;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
//题目描述:把二叉树打印成多行
//        从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
public class PrintTreeNodeMultipleLines {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<TreeNode> a1 = new ArrayList<TreeNode>();
        ArrayList<TreeNode> a2 = new ArrayList<TreeNode>();
        if (pRoot==null) return list;
        a1.add(pRoot);
        while (!a1.isEmpty()|!a2.isEmpty()){
            ArrayList<Integer> l = new ArrayList<Integer>();
            while (!a1.isEmpty()){
                pRoot = a1.get(0);
                l.add(pRoot.val);
                if (pRoot.left!=null) a2.add(pRoot.left);
                if (pRoot.right!=null) a2.add(pRoot.right);
                a1.remove(pRoot);
            }
            if(l.size()!=0) list.add(l);
           ArrayList<Integer> l1 = new ArrayList<Integer>();
            while (!a2.isEmpty()){
                pRoot = a2.get(0);
                l1.add(pRoot.val);
                if (pRoot.left!=null) a1.add(pRoot.left);
                if (pRoot.right!=null) a1.add(pRoot.right);
                a2.remove(pRoot);
            }
            if(l1.size()!=0)list.add(l1);
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

        PrintTreeNodeMultipleLines p = new PrintTreeNodeMultipleLines();
        ArrayList<ArrayList<Integer>> list = p.Print(a);
        for (ArrayList<Integer> l:list){
            for (Integer n:l){
                System.out.print(n + " ");
            }
        }


//        int[] arr = {1,2,3,1,2,'\n',45};
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        char i=10;
//        System.out.println(123+'\n'+123);
//        System.out.println(123+'\n'+123);
//        System.out.print(i);
//        System.out.println("aaaa\nbbbb");

    }
}
