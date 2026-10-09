package Strings;
import java.util.*;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaration
//     String str="Shreya Raikwar";
//        System.out.println(str);

        //input
//        String s=sc.next(); //dont read after space
//        System.out.println(s);
//        String s1=sc.nextLine(); //read after space also
//        System.out.println(s1);

        //charAt() and length()
//        String str="hello";
//        String gtr="iello";
//        int len=str.length();//need to add bracket after
        // length on array, also count space
//        System.out.println(len);
//        char ch=str.charAt(4); //cant do str[4] like array
//        System.out.println(ch);

//        indexOf() and compareTo()
//        System.out.println(str.indexOf('o'));//character ka 1st occur index de dega
        //str==gtr->0
        //str<gtr->-ve lexographic
        //str>gtr->+ve  jitni values aage/piche hoga utna integer +ve/-ve return krega
//        System.out.println(str.compareTo(gtr));

//contains() startWith() toUpperCase() toLowerCase() concat()
        String str ="Shreya Raikwar ";
        String str1 = " is devil";
//        System.out.println(str.contains("reya"));
//        System.out.println(str.startsWith("Shre"));
//        System.out.println(str.endsWith("war  "));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
        System.out.println(str.concat(str1)); //join 2 strings
        System.out.println(str.concat("angel"));






    }
}
