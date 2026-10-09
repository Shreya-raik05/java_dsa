package Arrays;
import java.util.*;
public class Questions {
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int max(int[] arr){
        int maxVal=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    //work on edgecase here like array being null
    static int maxRange(int[] arr, int start, int end){
        int maxVal=arr[start];
        for(int i=start; i<end;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

    static void reverse(int[] arr){
        int start=0;
        int end = arr.length-1;
       while(start<end){
           swap(arr,start,end);
           start++;
           end--;
       }
    }

    public static void main(String[]args) {


        //Swap
        int[] arr = {1, 2, 3, 4, 5, 6};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));

        //QUESTION 2->PRINT MAX
        int[] arr2= {1,2,3,45,5,6};
        System.out.println(max(arr2));
        System.out.println(maxRange(arr2,1,4));
        reverse(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
