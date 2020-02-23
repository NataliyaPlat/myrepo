package main;

class Vehicle {
    String Model;
    String Maker;
    String Country;
    public Vehicle(String car_model, String car_maker, String car_country) {
        Model = car_model;
        Maker = car_maker;
        Country = car_country;
    }
}
public class MyProgram {
    public static void main (String[] args) {
        Vehicle Audi = new Vehicle("Q5", "Audi", "Germany");
        System.out.println("Audi: " + Audi.Model + " " + Audi.Maker + " "+ Audi.Country);
        Vehicle BMW = new Vehicle("M5", "BMW", "Germany");
        System.out.println("BMW: " + BMW.Model + " " + BMW.Maker + " "+ BMW.Country);
        Vehicle Audi2 = new Vehicle("Q7", "Audi", "Germany");
        System.out.println("Audi2: " + Audi2.Model + " " + Audi2.Maker + " "+ Audi2.Country);
    }
}