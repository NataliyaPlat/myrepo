package main;




public class Fizz {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=100; i++){
            if (i%3==0){
                System.out.println("fizz");
            }
            if (i%5==0){
                System.out.println("buzz");
            }
            if (i%5==0 && i%3==0){
                System.out.println("fizzBuzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
