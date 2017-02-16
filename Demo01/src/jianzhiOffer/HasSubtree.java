package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/13 0013.
 */
//题目描述：树的子结构
//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2 == null) return  false;
        if (root1 != null && root2 != null && root1.val == root2.val) {
            return HasSubtree(root1.left, root2.left)
                    && HasSubtree(root1.right, root2.right);
        }
        return root1 == null && root2 == null;
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

        TreeNode b =new TreeNode(2);
        TreeNode b2 = new TreeNode(4);
        b.left = b2;
//        TreeNode b3 = new TreeNode(3);
//        b.right = b3;
//        TreeNode b4 = new TreeNode(4);
//        b2.left = b4;

        HasSubtree h = new HasSubtree();
        System.out.println(h.HasSubtree(a,b));
    }
}
