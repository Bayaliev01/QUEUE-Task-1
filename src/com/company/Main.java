package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
Car car = new Car(1,2659);
Car car1 = new Car(2,1034);
Car car2 = new Car(3,2409);
Сharacteristic сharacteristic = new Сharacteristic(2019,"Bmw",13000000.0,"Bleak");
Сharacteristic сharacteristic2 = new Сharacteristic(2015,"Audi",3000000.0,"green");
Сharacteristic сharacteristic3 = new Сharacteristic(2020,"Toyota",1300000.0,"Blue");

        Map<Car,Сharacteristic> map = new HashMap<>();
        map.put(car,сharacteristic);
        map.put(car1,сharacteristic2);
        map.put(car2,сharacteristic3);
        for (Car e : map.keySet() ) {
            System.out.println(e + " "+ map.get(e));
        }
    }
}