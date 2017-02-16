package ch01.sec01;

/**
 * Created by Administrator on 2016/12/4 0004.
 */
public class StringCircularRotation {
    public boolean isCircularRotation(String str1,String str2){
        if (str1.length()!=str2.length()) return false;
        boolean flag = false;
        for (int i=0 ;i<str1.length();){
            while (str1.charAt(i)!=str2.charAt(0))
                i++;
            str1 = str1.substring(i,str1.length())+str1.substring(0,i);
            flag  = str1.equals(str2)?true:false;
            if (flag) break;
        }
        return flag;
    }

    public static void main(String[] args) {
        StringCircularRotation s = new StringCircularRotation();
        String str1 = "CTGACG";
        String str2 = "TGACGC";
        System.out.println(s.isCircularRotation(str1,str2));
    }
}
