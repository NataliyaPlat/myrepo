package main;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
        polindrome("this is me".replace(" ", ""));

    }
    static String fizzBuzz(int num){
        if (num%3==0 && num%5==0){
            return "Fizz_Buzz";
        }
        else if (num%5==0){
            return "Fizz";
        }
        else if (num%3==0){
            return  "Buzz";
        }
        else{
            return "1";
        }

    }
    //polindrome
    static void polindrome(String name){
        String new_name = "";
        for (int i=name.length()-1;i>=0;i--){
            new_name+=name.charAt(i);
        }
        if (name.equals(new_name)){
            System.out.println(name + " => this is polindrome");
        }
        else{
            System.out.println( name + " => this is not polindrome ");
        }


    }
}
