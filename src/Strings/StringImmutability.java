package Strings;

public class StringImmutability {
    public static void main(String[] args) {
        //why immutability->bcz interning exist and also
        // due to security reasons
//
//        String str="hello"; //want to dello
////        str.charAt(0)='D'; //not valid
//          str="Dello";//want deilo
//        str=str.substring(0,2)+'i'+str.substring(3);//have performance issues
//        System.out.println(str);

        //performance of string
        //poor due to immutability
//        String str=" ";
//        for(int i=1;i<10;i++){
//            str=str+i;
//        }
//        System.out.println(str);//poor performance too many performance

        //str.equals() and ==
//        not use == on strings
        String s1="hello";
        String s2="hello";
        String s3= new String("hello");
       // System.out.println(s1==s3);//give false
        //s1==s2 gives true same address
//        s1==s3 gives false diffrent address
        System.out.println(s1.equals(s3)); //give true check letter by letter not by address




    }
}
