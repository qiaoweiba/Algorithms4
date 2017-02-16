package jianzhiOffer;

import java.util.Stack;

/**
 * Created by Administrator on 2016/11/11 0011.
 */
//题目描述
//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
public class ArrayStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {

        if (stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return  stack2.pop();

//        int[] a = new int[stack2.size()];
//        if (stack1.isEmpty() && !stack2.isEmpty()){
//            return stack2.pop();
//        }else {
//            if (stack2.isEmpty()){
//                while (!stack1.isEmpty()) {
//                    stack2.push(stack1.pop());
//                }
//                return stack2.pop();
//            }
//            if (!stack2.isEmpty()){
//                for (int i=0;i<a.length;i++){
//                    a[i] = stack2.pop();
//                }
//                while (!stack1.isEmpty()) {
//                    stack2.push(stack1.pop());
//                }
//                if (a.length!=0){
//                    for (int i=a.length-1;i>=0;i--) {
//                        stack2.push(a[i]);
//                    }
//                }
//                return stack2.pop();
//            }
//        }
//        return stack2.pop();
    }

    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        for (int i=0;i<arrayList.size();i++){
//            System.out.print(arrayList.get(i)+" ");
//        }
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push(1);
        arrayStack.push(4);
        arrayStack.push(5);
        arrayStack.push(6);
        arrayStack.push(2);
        arrayStack.push(3);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        arrayStack.push(7);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        arrayStack.push(8);
        arrayStack.push(9);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
    }
}
