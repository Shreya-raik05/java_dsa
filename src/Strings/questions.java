package Strings;

import java.util.*;

public class questions {
    public static boolean isPalindrome(String str) {
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                i++;
                j--;
            }
           return false;

        }
return  true;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string");
//        StringBuilder s = new StringBuilder(sc.nextLine());
//        for (int i = 0; i < s.length(); i++) {
//            char ch=s.charAt(i);
//            int ascii=(int)ch;
//            if(ascii>=65 && ascii<=90){
//                ascii+=32; //capital->small
//            }
//            else if(ascii>=97 && ascii<=122){
//                ascii-=32; //small ->capital
//            }
//            char dh=(char)ascii;
//            s.setCharAt(i,dh);
//        }
//        System.out.println(s);


        //Question2 given string->return no of palindromic substring
        //Input s="abc"->a,ab,abc,b,bc,c (palindromes are only a,b,c)
        //output 3
        String str = "abcba";
        int i = 0;
        boolean flag = true;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
         if(flag){
             System.out.println("palindrome");
         }else{
             System.out.println("not palindrome");
         }

    }
}