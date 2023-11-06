package com.example.demo;

public class Car {
    private  String brand;
    private  String amount;

    public Car(String brand, String amount) {
        this.brand = brand;
        this.amount = amount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
