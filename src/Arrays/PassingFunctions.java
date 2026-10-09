package Arrays;

import java.util.Arrays;

public class PassingFunctions {
    static void change(int[] arr){
        arr[0]=99;
    }
    static void main(String[] args) {
       int[]  nums={1,2,3,4};
        System.out.println(Arrays.toString(nums));
        change(nums);//arrays are mutable
        System.out.println(Arrays.toString(nums));
    }
}
