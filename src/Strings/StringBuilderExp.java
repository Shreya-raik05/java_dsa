package Strings;

public class StringBuilderExp {
    public static void main(String[] args) {
        //why stringbuilder
        //we can't change individual characters on string but here we can
        //declaration
        StringBuilder str1 = new StringBuilder("hello");

        //hello-->mello
//        str1.setCharAt(0, 'm');
//        System.out.println(str1);
//        str1.append("world");
//        System.out.println(str1);
//        str1.insert(3,'a');
//        System.out.println(str1);
//        str1.deleteCharAt(0);
//        System.out.println(str1);
//
        StringBuilder str2 = new StringBuilder("Shreya");
        System.out.println(str2.reverse());
        System.out.println(str2.delete(2,4));
        //many functions available not to upper case and tolowercase starts with

    }
}
