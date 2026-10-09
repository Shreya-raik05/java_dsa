package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimentionalArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        /* int [][]arr=new int[3][];
        int[][] arr2d= {
                {1, 2, 3},//0th index
                {4, 5},//1st
                {6, 7, 8, 9}//2nd ->arr2d[2]={6, 7, 8, 9}
        };

         */
        //individual rows can have diff size
        //2d=array of arrays

        int[][] arr1=new int[3][3];
        System.out.println(arr1.length); //gives no of rows

        //input
        for(int row=0; row<arr1.length; row++){
            //for each row
            for(int col=0; col<arr1[row].length; col++){
                arr1[row][col]=sc.nextInt();
            }
        }
 //output
//        for(int row=0; row<arr1.length; row++){
//            //for each row
//            for(int col=0; col<arr1[row].length; col++){
//                System.out.print(arr1[row][col]+" ");
//            }
//            System.out.println();
//        }
        //another way of output
//        for(int row=0; row<arr1.length; row++){
//            System.out.println(Arrays.toString(arr1[row]));
//        }
        for(int[] a: arr1)
            {
            System.out.println(Arrays.toString(a));
        }
    }

}
