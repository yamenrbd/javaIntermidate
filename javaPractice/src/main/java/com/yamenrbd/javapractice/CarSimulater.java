package com.yamenrbd.javapractice;

public class CarSimulater {
    public static void main(String[] args) {
        System.out.println("lunching car simulator...");

        Car myCar = new Car("BMW","black","leather");
        System.out.println("my car is "+myCar.getBrand()+" and color "+ myCar.getColor()+" with interior "+ myCar.getInterior());
        myCar.setColor("blue");
        System.out.println("but i got paint job and change my car color to "+myCar.getColor());
        myCar.drive();

        SelfDrivingCar autoBoot = new SelfDrivingCar("google","yellow","plastic");
        System.out.println(autoBoot.getColor());
        autoBoot.drive();
        autoBoot.drive();


    }
}
