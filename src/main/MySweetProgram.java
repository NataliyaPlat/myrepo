package main;

public class MySweetProgram {
    public static void main (String[] args) {
        Car Car = new Car();
        Car.setMaker("Honda");
        Car.setModel("Acura");
        Car.setCountryOfCar("Japan");
        System.out.println(Car.getCountryOfCar() + " " + Car.getModel() +  " " + Car.getMaker());
    }
}
class Car {
    public String countryOfCar;
    public String Model;
    private String Maker;
    public String Output() {
        return (getCountryOfCar()+getMaker() + getModel());
    }
    public void setCountryOfCar(String Japan) {
        countryOfCar = Japan;
    }
    public void setModel(String Acura) {
        Model = Acura;
    }
    public void setMaker(String Honda) {
        Maker = Honda;
    }
    public String getModel() {
        return Model;
    }
    public String getMaker() {
        return Maker;
    }
    public String getCountryOfCar() {
        return countryOfCar;
    }
}