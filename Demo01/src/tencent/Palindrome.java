package tencent;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/8 0008.
 */
public class Palindrome {
    boolean isPalindrome(String str){
        boolean flag = true;
        for (int i=0,j=str.length()-1;i<j;i++,j--){
            if (str.charAt(i)!=str.charAt(j))
                return false;
        }
        return flag;
    }
    int deleteMin(String str){
        if (isPalindrome(str)){
            return 0;
        } else {
            int count = 0;
            for (int i=0,j=str.length()-1;i<j;i++,j--){
                if (str.charAt(i)!=str.charAt(j))
                    count++;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入你要判断的字符串");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("输入的字符串为："+ str);
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(str));
        System.out.println(palindrome.deleteMin(str));
    }
}
