/**
 * Created by Administrator on 2016/10/29 0029.
 */
package testfile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    String value;
    Node left;
    Node right;

    public Node(String s){
        this.value=s;
    }
}
public class JavaTree {
    public static Node createTree() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        Node n ;


        if(s.equals("#"))
            n=null;
        else{
            n=new Node(s);
            n.left=createTree();
            n.right=createTree();
        }

        return n;
    }




    public static void breadthTravel(Node n){
        Queue<Node> q=new LinkedList<Node> ();
        if(n==null)
            System.out.println("no data to read");
        else{
            q.offer(n);
            while(!q.isEmpty()){
                Node n1=q.poll();
                System.out.println(n1.value);
                if(n1.left!=null)
                    q.offer(n1.left);
                if(n1.right!=null){
                    q.offer(n1.right);
                }
            }
        }
    }

    public static void PreOrder(Node n){
        if(n==null)
            return;
        else{
            System.out.println(n.value);
            PreOrder(n.left);
            PreOrder(n.right);
        }
    }

    public static void main(String[] args) throws Exception{
        Node n;
        System.out.println("please input the tree you want to create");
        n=createTree();


        breadthTravel(n);
        PreOrder(n);
    }


}
