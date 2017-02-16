package ch01.sec03;

import java.util.Stack;

/**
 * Created by Administrator on 2016/12/6 0006.
 */
public class CompletionBrackets {
    Stack<String> s = new Stack<String>();
    Stack<String> sc = new Stack<String>();
    public Stack<String> completion(String[] a){
        if (a.equals("")||a==null) return sc;
        for (int i=0;i<a.length;i++){
            s.push(a[i]);
        }
        while (!s.isEmpty()){
            if (s.pop().equals(")")) completionBrackets();
        }
        return sc;
    }
    private void completionBrackets(){
        sc.push(")");
        for (int j=0;j<3;j++){
            if (s.pop().equals(")")) completionBrackets();
            sc.push(s.pop());
        }
        sc.push("(");
    }
    public static void main(String[] args) {
        CompletionBrackets c = new CompletionBrackets();
        String input = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        String[] a = input.split(" ");
        for (String aa:a)
            System.out.print(aa+" ");
        System.out.println();
        Stack<String> ac = c.completion(a);
        for (String s:ac)
            System.out.print(s + " ");
    }
}
