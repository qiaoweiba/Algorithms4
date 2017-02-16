package ch01.sec03;

import java.util.Stack;

/**
 * Created by Administrator on 2016/12/6 0006.
 */
public class Parenttheses {
    public static final char LEFT_PAREN = '(';
    public static final char RIGHT_PAREN = ')';
    public static final char LEFT_BRACE = '{';
    public static final char RIGHT_BRACE = '}';
    public static final char LEFT_BRACKET = '[';
    public static final char RIGHT_BRACKET = ']';
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == LEFT_PAREN) stack.push(LEFT_PAREN);
            if (s.charAt(i) == LEFT_BRACE) stack.push(LEFT_BRACE);
            if (s.charAt(i) == LEFT_BRACKET) stack.push(LEFT_BRACKET);

            if (s.charAt(i) == RIGHT_PAREN){
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_PAREN) return false;
            }
            else  if (s.charAt(i) == RIGHT_BRACE){
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_BRACE) return false;
            }
            else  if (s.charAt(i) == RIGHT_BRACKET){
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_BRACKET) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
//        String ss = "[(])";
        String ss = "[()[]{[]}({})]";
        String s = ss.trim();
        System.out.println(isBalanced(s));
    }
}
