package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/14 0014.
 */
//题目描述P:翻转单词顺序列
//     牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，
// 有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
// 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
public class ReverseSentence {
    public String ReverseSentence(String str) {
        if (str.trim().equals("")||str==null) return str;
        str = " "+str;
        String s = "";
        int i=str.length()-1,j=i+1;
        for (;i>=0;i--) {
            while (!(' '==str.charAt(i))){
                i--;
            }
            s += str.substring(i,j);
            j=i;
        }
        return s.substring(1,s.length());
    }

    public static void main(String[] args) {
        String str = "I am a student";
        String s = "student. a am I";
        ReverseSentence r = new ReverseSentence();
        System.out.println(r.ReverseSentence(s));
        System.out.println(r.ReverseSentence("       "));
        System.out.println(str.substring(13,14));
    }
}
