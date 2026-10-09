//Level 1 — Syntax + traversal
//1. Print all elements
//2. Sum of elements
//3. Maximum element
//4. Minimum element
//5. Count even and odd
//6. Count positive and negative
//7. Find average
//8. Linear search → return index
//🟡 Level 2 — Logic
//9. Reverse array
//10. Check sorted array
//11. Find second largest
//12. Find second smallest
//13. Count how many times a target occurs
//14. Find duplicate elements
//15. Find the first occurrence of a target
package Arrays;
import java.util.Arrays;
import java.util.Scanner;


public class QuestionsPracticeArr {
    //    public static int sum(int[] arr){
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//           sum=sum+arr[i];
//        }
//        return sum;
//    }
//    public static int max(int[] arr){
//        int max=arr[0];
//        for(int a:arr){
//            if(a>max){
//                max=a;
//            }
//        }
//        return max;
//    }
//    public static int min(int[] arr) {
//        int min = arr[0];
//        for (int a : arr) {
//            if (a < min) {
//                min = a;
//            }
//        }
//        return min;
//    }

//    public static int evenOdd(int[] arr){
//       int count=0;
//        for(int a:arr){
//            if(a%2==0){
//                count++;
//            }
//        }
//        System.out.println("even are"+count);
//        int odd=arr.length-count;
//        System.out.println("odd are"+odd);
//        return count;
//    }

//    public static int positiveNegative(int [] arr){
//        int negative=0;
//        for(int a: arr){
//            if(a<0){
//                negative++;
//            }
//        }
//        int positive=arr.length-negative;
//        System.out.println("positive are "+ positive);
//        System.out.print("negative are ");
//        return negative;
//
//
//    }

//    public static int avg(int[] arr) {
//        int sum = 0;
//        for(int a:arr){
//            sum+=a;
//        }
//        int avg=sum/arr.length;
//        return avg;
//    }

//    public static int linearSearch(int[] arr, int target){
//        int count=-1; //-1 bcz when target not find it return 0 create misunderstanding
//        for(int a=0;a<arr.length;a++){
//            if (arr[a]==target){
//                count=a;
//                break;
//            }
//        }
//        return count;
//
//    }
    public static void swap(int [] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
       arr[b] = temp;
    }

//    public static int secndLarge(int[] arr) {
//        int largest = arr[0];
//        int secndLargest = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                secndLargest = largest;
//                largest = arr[i];
//            }
//            else if (arr[i] > secndLargest) {
//                secndLargest = arr[i];
//            }
//        }
//        return secndLargest;
//
//    }
//
//    public static int secndSmall(int[] arr) {
//        int smallest = arr[0];
//        int secndsmallest = Integer.MAX_VALUE;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < smallest) {
//                secndsmallest = smallest;
//                smallest = arr[i];
//            }
//            else if (arr[i] < secndsmallest) {
//                secndsmallest = arr[i];
//            }
//        }
//        return secndsmallest;
//
//    }

//
//    public static void reverseArray( int[] arr){
//        int start=0;
//        int end=arr.length-1;
//        while(start<end){
//            swap(arr, start,end);
//            start++;
//            end--;
//        }
//
//    }

//    public static boolean checkSort(int[] arr){
//        int sorted=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]<sorted){
//                return false;
//            }
//            sorted=arr[i];
//
//        }
//        return true;
//
//    }

//    public static int targetOccurs(int[] arr, int target){
//        int count=0;
//        for(int a: arr){
//            if(a==target){
//                count++;
//            }
//
//        }
//        return count;
//    }
//
//    public static void duplicateElement(int[] arr) {
//     for(int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[i]==arr[j]){
//                 System.out.println(arr[i]);
//             }
//         }
//     }
//
//    }

        public static int targetReoccur(int[] arr, int target) {
        int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }


            public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                //1 PRINT ALL ELEMENTS
//        int[][] arr= new int[3][3];
//        //input
//        for(int row=0;row<arr.length;row++){
//            for(int col=0; col<arr[row].length ;col++) {
//                arr[row][col] = sc.nextInt();
//            }
//        }
                //output
//        for(int row=0;row<arr.length;row++){
//            for(int col=0; col<arr[row].length ;col++) {
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();


//            for(int[] a:arr){
//                System.out.println(Arrays.toString(a));
//            }
//

                // 2 SUM OF ELEMENTS
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
//        System.out.println(sum(arr));

                //3 MAX ELEMENT
//        System.out.println(max(arr));

                //4.MIN ELEMENT
//        System.out.println(min(arr));

                //5. EVEN ODD
//       int a= evenOdd(arr);
//        System.out.println(a);

                //6. Count positive and negative
//        System.out.println(positiveNegative(arr));

                //7. Find average
//        System.out.println(avg(arr));

                //8. Linear search → return index
//        System.out.println("enter the target number: ");
//        int target = sc.nextInt();
//        System.out.println("Target number index is: " + linearSearch(arr,target));

                //9 Reverse Array
//        reverseArray(arr);
//        System.out.println(Arrays.toString(arr));

                //10 Check sorted array
                //checkSort(arr);
//        System.out.println(checkSort(arr));
//
                //11. Find 2nd Large
//        System.out.println(secndLarge(arr));

                //12.find 2nd smallest
//        System.out.println(secndSmall(arr));

                //13.how many times target occurs
//        System.out.println(targetOccurs(arr, 9));

                //14. Find duplicate elements
//        duplicateElement(arr);

                //15. Find the first occurrence of a target
                System.out.println(targetReoccur(arr, 9));


            }
        }



