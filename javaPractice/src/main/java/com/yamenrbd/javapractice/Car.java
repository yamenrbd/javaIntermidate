package com.yamenrbd.javapractice;

/**
 * Created by yamen on 11/15/2017.
 */

public class Car {
    private String color;
    private String interior;
    private String brand;

    public Car(String mBrand,String mColor , String mInterior){
        brand=mBrand;
        color=mColor;
        interior=mInterior;
    }
    public void drive(){
        System.out.println("the car is moving");
    }

    public String getColor() {
        return color;
    }

    public String getInterior() {
        return interior;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
