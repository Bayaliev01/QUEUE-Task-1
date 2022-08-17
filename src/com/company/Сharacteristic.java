package com.company;

public class Сharacteristic {
    private int yearOfRelease;
    private String model;
    private double price;
    private String color;

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "год выпуска - " + yearOfRelease +
                ", - модель - " + model +
                ", - Цена машины - " + price +
                ", - цвет машины - " + color ;

    }

    public Сharacteristic(int yearOfRelease, String model, double price, String color) {
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.price = price;
        this.color = color;

    }
}
