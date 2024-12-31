package com.Jonathan;

public class Main{
    public static void main(String[] args){



        Car car = new Car("Camry", "Toyota Corolla", 50, true);
        Motorcycle motorcycle = new Motorcycle("Pick up", "Yamaha R1", 30, 5);
        Truck truck = new Truck("HEAD", "Ford F-150", 70, 15);

        // instance or object of rental agency and customer
        RentalAgency agency = new RentalAgency();
        Customer customer = new Customer("Jonathan");

        // I am adding vehicles to agency
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // Rent a car
        agency.rentVehicle("Camry", customer, 5);

        // Return the car
        agency.returnVehicle("Camry");



    }
}