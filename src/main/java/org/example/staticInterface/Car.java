package org.example.staticInterface;

public class Car implements Vehicle2 {
//    @Override
    public void cleanVehicle2() {
        System.out.println("Cleaning the vehicle");
    }

    public static void main(String args[]) {
        Car car = new Car();
        car.cleanVehicle2();
    }
}
