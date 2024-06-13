package com.test;

import com.vehicles.Car;
import com.vehicles.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        Truck truck = new Truck("Ford", "F-150", 1.5);

        System.out.println("Show The Car Details:");
        car.displayDetails();

        System.out.println("\nShow TheTruck Details:");
        truck.displayDetails();
    }
}
