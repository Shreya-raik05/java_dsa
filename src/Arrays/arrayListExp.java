package Arrays;

import java.util.ArrayList;
import java.util.Scanner;


public class arrayListExp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        System.out.println(list);
        System.out.println(list.contains(24));
        list.set(0,24);
        System.out.println(list.contains(24));
        list.remove(5);
        System.out.println(list);

//        //input by loop
//        for(int i=0;i<5;i++){
//            list.add(sc.nextInt());
//        }
//        //output
//        for(int i=0;i<5;i++){
//            System.out.println(list.get(i));//pass index here , list[index] santax will not work
//        }

        //internal working
        //size is actually fixed
        //say arraylist fills by some ammount it will create a new arraylist
        // double the size and old list copied into new list old one is deleted

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();

        //initialization
        for(int i=0; i<3;i++){
            list1.add(new ArrayList<>());
        }
        //add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list1.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list1);






    }
}
