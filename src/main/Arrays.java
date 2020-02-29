package main;

import java.util.ArrayList;
import java.util.Collection;



public class Arrays {
    public static void main(String[] args) {
        //Initiate an Arraylist. Using For loop add integers from 1 to 10
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
          System.out.println(i);
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
        for (int i =0;i<two.size();i++){
            if (two.get(i)==2){
                two.remove(i);
            }
            System.out.println(two);
        }



        //Remove all odd numbers; With remove method it didnt work out(
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list2.add(list.get(i));
            }
            System.out.println(list2);
        }

        }
    }




