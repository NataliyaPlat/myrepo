package main;

import java.util.HashMap;

public class Mapping {
    public static void main(String[] args) {
       // Write a Java program to test if a map contains a mapping for the specified key.
        HashMap<String,Integer> map = new HashMap<>();
        map.put("dog",2);
        map.put("cat",1);
        map.put("mouse",3);
        System.out.println(checkKey(map,"cat"));

        //Remove a value from HashMap based on key
        HashMap<String,Integer> first = new HashMap<>();
        first.put("analyst",8);
        first.put("constructor",6);
        first.put("loan",43);
        HashMap<String,Integer> second = new HashMap<>();
        second.put("engineer",2);
        second.put("doctor",1);
        second.put("assistant",5);
        second.putAll(first);
        System.out.println(first);
        //Write a Java program to copy all of the mappings from the specified map to another map
        HashMap<String,String> animals = new HashMap<>();
        animals.put("horse", "black");
        animals.put("fish", "tiny");
        animals.put("cat","noisy");
        animals.remove("horse");
        System.out.println(animals);

    }
    public static boolean checkKey(HashMap<String, Integer> map, String str){
        return map.containsKey(str);
    }

}
