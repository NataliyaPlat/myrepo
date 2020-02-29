package main;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        //  Initiate a Set. Using For loop add integers from 1 to 10
          HashSet<Integer> mySet = new HashSet<>();
         for (int i=0;i<=10;i++){
           mySet.add(i);
        }
        System.out.println(mySet);
        //    Remove all odd numbers from sets.
        HashSet<Integer> odd = new HashSet<>();
        for (int i = 0; i  <= 10; i++) {
            odd.add(i);
    }
        HashSet<Integer> new_odd = new HashSet<>();
        for (int i: odd){
            if (i % 2 !=0){
                new_odd.add(i);
            }
        }
        System.out.println(new_odd);


                //  Try to create a set with duplicate values
                HashSet<String> one = new HashSet<>();
                one.add("nice");
                one.add("smart");
                one.add("nice");
                one.add("intelligent");
                System.out.println(one);



    }
}


