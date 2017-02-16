package jianzhiOffer;

/**
 * Created by Administrator on 2016/11/11 0011.
 */
public class RotateArray {
    public int minNumberInRotateArray(int [] array) {


//        public class Solution {
//            public int minNumberInRotateArray(int [] array) {
//                int low = 0 ; int high = array.length - 1;
//                while(low < high){
//                    int mid = low + (high - low) / 2;
//                    if(array[mid] > array[high]){
//                        low = mid + 1;
//                    }else if(array[mid] == array[high]){
//                        high = high - 1;
//                    }else{
//                        high = mid;
//                    }
//                }
//                return array[low];
//            }
//        }

        int min = array[0];
        if (array.length ==0){
            return 0;
        }else {
            for (int i=0;i<array.length;i++) {
                min = min < array[i] ? min : array[i];
            }
            return min;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 2};

        RotateArray rotateArray = new RotateArray();
        System.out.println(rotateArray.minNumberInRotateArray(a));
    }
}
