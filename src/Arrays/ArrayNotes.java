package Arrays;
import java.util.*;
public class ArrayNotes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Syntax
        //datatype[] variable_name=new datatype[size};
        //store 5 rollnumbers:
       // int[] rolno=new int[5];
       // int[] rolno2={23,24,25};

        //meaning
      //  int[] ros;  //declaration of array,ros is getting defined in the  stack
       // ros=new int[5]; //actually here object is being created in the memory(heap)
       //ros[5]=[0,0,0,0,0,] initially when no value assigned
        //array objects are in heap ,but heap objects are not cotinious
        //array objects in java may not be continious(depend on jvm)
       //new is used to create an object in heap memory

        //array of primitives
       //String[]arr=new String[5];
        //System.out.println(arr[0]);

       // String str=null;
        //int num = null; cant assign null to any primitive datatype

        //internal working of object
        //int[] arr1=new int[5];
      //input using loops
       // for(int i=0;i<arr1.length;i++){
       //arr1[i]=sc.nextInt();
       // }
        //System.out.println(Arrays.toString(arr1));
        //output using loops(enhanced for loop(for each))
       // for (int j : arr1) {
       //     System.out.println(j); //here j represents elements of the array
      //  }
        //System.out.println(arr1[5]);  //index out of bound error

        //array of objects
        String[] str1= new String[4];
        for(int i=0;i<str1.length;i++){
            str1[i]=sc.next();
        }
        System.out.println(Arrays.toString(str1));
        str1[1]="shreya";
        System.out.println(Arrays.toString(str1));


        //multidimentional arrays





    }
}
