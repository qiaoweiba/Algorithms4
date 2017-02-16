package tencent;

/**
 * Created by Administrator on 2016/11/8 0008.
 */
public class Number {
    int[] countsNumber(int length,int[] a){
        int[] b = {0,0};
        b[0] = minNumber(a);
        b[1] = maxNumber(a);
        return b;
    }
    int minNumber(int[] a){
        int min = 100000;
        int count = 0;
        for (int i = 0;i<a.length;i++){
            for (int j = i+1;j<a.length;j++){
                if (Math.abs(a[i]-a[j])<min){
                    min = Math.abs(a[i]-a[j]);
                    count = 1;
                }else {
                    if (Math.abs(a[i]-a[j]) == min)
                        count +=1;
                }
            }
        }
        return  count;
    }
    int maxNumber(int[] a){
        int max = 0;
        int count = 0;
        for (int i = 0;i<a.length;i++){
            for (int j = i+1;j<a.length;j++){
                if (Math.abs(a[i]-a[j])>max){
                    max = Math.abs(a[i]-a[j]);
                    count = 1;
                }else {
                    if (Math.abs(a[i]-a[j]) == max)
                        count +=1;
                }
            }
        }
        return  count;
    }
    public static void main(String[] args) {

        int[] a = {1,3,7,21,23,34,34};
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Number n = new Number();
        int[] b = n.countsNumber(a.length,a);
        for (int j = 0;j<b.length;j++){
            System.out.print(b[j]+" ");
        }
    }
}
