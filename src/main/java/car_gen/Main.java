package main.java.car_gen;

public class Main {

    public static void main(String[] args) {
    Honda civic = new Honda("green", 1980, 180, true);
    Lexus rx350 = new Lexus("blue",2021, 220, true);
    Toyota supra = new Toyota("red", 2022, 225, false);
    System.out.println(civic.getColor());
    System.out.println(supra.decelerateSpeed());
    System.out.println(supra.convertToElectric());
    }

}
