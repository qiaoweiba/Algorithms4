/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class tet01 {
//    public static void main(String[] args) {
//        int i = 0;
//        i = i++;
//        System.out.println(i);
//
//        String a="Hello";
//        String c="Hello";
//        char[] b={'H','e','l','l','o'};
//        System.out.println(a);
//        System.out.println(a==c);
//        System.out.println(a.equals(b));
//        System.out.println(c instanceof String);
//        //System.out.println(b instanceof String); ���ᱨ�����Ͳ�һ���޷��Ƚϣ�������ȻΪfalse
//    }

    public static String output ="";
    public static void foo(int i){
        try{
            if(i == 1){
                throw new Exception();
            }
        }catch(Exception e){
            output += "2";
            return ;
        }finally{
            output += "3";
        }
        output += "4";
    }


    public static void main(String[] args) {
        foo(0);
        foo(1);
        System.out.println(output);
    }
}
