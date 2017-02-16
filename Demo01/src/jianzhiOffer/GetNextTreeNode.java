package jianzhiOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
//题目描述:二叉树的下一个结点
//        给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，
//        同时包含指向父结点的指针。
public class GetNextTreeNode {
//    public TreeLinkNode GetNext(TreeLinkNode pNode){
    Stack<TreeLinkNode> stack = new Stack<TreeLinkNode>();

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    ArrayList<Integer> arrayList_loop = new ArrayList<Integer>();
    ArrayList<TreeLinkNode> queue = new ArrayList<TreeLinkNode>();
//----------------------------------递归-------------------------------------------
    public ArrayList<Integer> PreOrderTraversal(TreeLinkNode pNode){
        if (pNode==null) return null;
//        TreeLinkNode root = pNode;
//        while (root.next!=null) root = root.next;
//        if (root==pNode)
//           return root.right;

//        if (root.right!=null) stack.push(root.right);
//         stack.push(root);
//         root = root.left;
//        while (!stack.isEmpty()){
////            if (root.right!=null) stack.push(root.right);
//            while (root!=null){
//                stack.push(root);
//                if (root==pNode)
//                    break;
//                root = root.left;
//            }
//            if (root==pNode)
//                break;
//            root = stack.pop().right;
//
//        }
//        return root;
        arrayList.add(pNode.val);
        PreOrderTraversal(pNode.left);
        PreOrderTraversal(pNode.right);
        return arrayList;
    }
    public ArrayList<Integer> InOrderTraversal(TreeLinkNode pNode){
        if (pNode==null) return null;
        InOrderTraversal(pNode.left);
        arrayList.add(pNode.val);
        InOrderTraversal(pNode.right);
        return arrayList;
    }
    public ArrayList<Integer> PostOrderTraversal(TreeLinkNode pNode){
        if (pNode==null) return null;
        PostOrderTraversal(pNode.left);
        PostOrderTraversal(pNode.right);
        arrayList.add(pNode.val);
        return arrayList;
    }
    public ArrayList<Integer> LevelOrderTraversal(TreeLinkNode pNode){
        if (pNode==null) return null;
        if (!queue.isEmpty())  queue.remove(0);
        arrayList.add(pNode.val);
        queue.add(pNode.left);
        queue.add(pNode.right);
        LevelOrderTraversal(queue.get(0));
        return arrayList;
    }
    //----------------------------------非递归-------------------------------------------
    public ArrayList<Integer> PreOrderTraversal_Loop(TreeLinkNode pNode){
        if (pNode==null) return null;
        stack.push(pNode);
        while (!stack.isEmpty()) {
            pNode = stack.pop();
            arrayList_loop.add(pNode.val);
            if (pNode.right!=null) stack.push(pNode.right);
            pNode =pNode.left;
            while (pNode!=null) {
                if (pNode.right!=null) stack.push(pNode.right);
                arrayList_loop.add(pNode.val);
                pNode = pNode.left;
            }
        }
        return arrayList_loop;
    }
    public ArrayList<Integer> InOrderTraversal_Loop(TreeLinkNode pNode){
        if (pNode==null) return null;
        while (pNode!=null) {
            stack.push(pNode);
            pNode = pNode.left;
        }
        while (!stack.isEmpty()) {
            pNode = stack.pop();
            arrayList_loop.add(pNode.val);
            pNode =pNode.right;
            while (pNode!=null) {
                stack.push(pNode);
                pNode = pNode.left;
            }
        }
        return arrayList_loop;
    }
    public ArrayList<Integer> PostOrderTraversal_Loop(TreeLinkNode pNode){
        if (pNode==null) return null;
//        while (pNode!=null) {
//            stack.push(pNode);
//            pNode = pNode.left;
//        }
//        while (!stack.isEmpty()) {
//            pNode = stack.pop();
//            arrayList_loop.add(pNode.val);
//            if (!stack.isEmpty()){
//                pNode = stack.peek().right;
//                if (pNode!=null){
//                    stack.push(pNode);
//                    if (pNode.left==null & pNode.right==null) arrayList_loop.add(stack.pop().val);
//                    while (pNode.left!=null) {
//                        pNode = pNode.left;
//                        stack.push(pNode);
//                    }
////                    arrayList_loop.add(stack.pop().val);
//
//                }
//            }
//
//        }
        TreeLinkNode q = pNode;
        while (pNode != null) {
            for (; pNode.left != null; pNode = pNode.left)
                stack.push(pNode);
            while (pNode != null && (pNode.right == null ||pNode.right == q)) {
                arrayList_loop.add(pNode.val);
                q=pNode;
                if (stack.empty())
                    return arrayList_loop;
                pNode = stack.pop();
            }
            stack.push(pNode);
            pNode = pNode.right;
        }
        return arrayList_loop;
    }
    public ArrayList<Integer> LevelOrderTraversal_Loop(TreeLinkNode pNode){
        if (pNode==null) return null;
        arrayList_loop.add(pNode.val);
        if (pNode.left!=null)
            queue.add(pNode.left);
        if (pNode.right!=null)
            queue.add(pNode.right);
        while (!queue.isEmpty()){
            pNode = queue.get(0);
            queue.remove(0);
            arrayList_loop.add(pNode.val);
            if (pNode.left!=null)
                queue.add(pNode.left);
            if (pNode.right!=null)
                queue.add(pNode.right);
        }
        return arrayList_loop;
    }

    public static void main(String[] args) {
        TreeLinkNode t = new TreeLinkNode(1);
        TreeLinkNode t2 = new TreeLinkNode(2);
        TreeLinkNode t3 = new TreeLinkNode(3);
        t.left = t2;
        t.right = t3;
        TreeLinkNode t4 = new TreeLinkNode(4);
        TreeLinkNode t5 = new TreeLinkNode(5);
        t2.left = t4;
        t2.right = t5;
        t2.next = t;
        TreeLinkNode t6 = new TreeLinkNode(6);
        TreeLinkNode t7 = new TreeLinkNode(7);
        t3.left = t6;
        t3.right = t7;
        t3.next = t;
        TreeLinkNode t8 = new TreeLinkNode(8);
        t4.left = t8;
        t4.next = t2;
        t5.next = t2;
        t6.next = t3;
        t7.next = t3;
        t8.next = t4;

        GetNextTreeNode g = new GetNextTreeNode();
//        TreeLinkNode a = g.GetNext(t7);
        //        System.out.println(a.val);
        ArrayList<Integer> pre = g.PreOrderTraversal(t);
        System.out.print("递归---先序遍历：");
        for (Integer l:pre){
            System.out.print(l + " ");
        }
        System.out.println();

        ArrayList<Integer> in = g.InOrderTraversal(t);
        System.out.print("递归---中序遍历：");
        for (Integer l:in){
            System.out.print(l + " ");
        }
        System.out.println();

        ArrayList<Integer> post = g.PostOrderTraversal(t);
        System.out.print("递归---后序遍历：");
        for (Integer l:post){
            System.out.print(l + " ");
        }
        System.out.println();

        ArrayList<Integer> level = g.LevelOrderTraversal(t);
        System.out.print("递归---层次遍历：");
        for (Integer l:level){
            System.out.print(l + " ");
        }
        System.out.println();

        ArrayList<Integer> pre_loop = g.PreOrderTraversal_Loop(t);
        System.out.print("非递归---先序遍历：");
        for (Integer l:pre_loop){
            System.out.print(l + " ");
        }
        System.out.println();

        ArrayList<Integer> in_loop = g.InOrderTraversal_Loop(t);
        System.out.print("非递归---中序遍历：");
        for (Integer l:in_loop){
            System.out.print(l + " ");
        }
        System.out.println();

        ArrayList<Integer> post_loop = g.PostOrderTraversal_Loop(t);
        System.out.print("非递归---后序遍历：");
        for (Integer l:post_loop){
            System.out.print(l + " ");
        }
        System.out.println();

//        ArrayList<Integer> level_loop = g.LevelOrderTraversal_Loop(t);
//        System.out.print("非递归---层次遍历：");
//        for (Integer l:level_loop){
//            System.out.print(l + " ");
//        }
//        System.out.println();
    }
}
