package main;

import java.util.ArrayList;
import java.util.Collection;

public class Arrays {
    public static void main(String[] args) {
        //Initiate an Arraylist. Using For loop add integers from 1 to 10
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);
        for (int i = 0; i < 10; i++) {
          //  System.out.println(num.get(i));
        }
      //Create an ArrayList [1,2,3,6,7,3,2,1]. Remove all 2 from Arraylist
        ArrayList<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(2);
        two.add(3);
        two.add(6);
        two.add(7);
        two.add(3);
        two.add(2);
        two.add(1);
        for (int i = 0; i<two.size(); i++){
            if (two.get(i)==2){
                System.out.println("");
            }
            else{
              //  System.out.println(two.get(i));
            }
        }
        //Remove all odd numbers;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        for (int i = 0; i<list.size(); i++){
            if (i % 2 != 0){
                System.out.println(list.get(i));
            }
            else{
                System.out.println("no output");
                System.out.println("array2 branch let's check");
            }
        }


    }
}


