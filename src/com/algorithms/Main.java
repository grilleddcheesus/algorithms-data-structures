package com.algorithms;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String model = "Chevrolet";

        //Moment of instantiation
        Truck truck = new Truck();
        Sedan sedan = new Sedan();

        //Setter
        truck.setBrand(model);
        truck.setBrand("GMC");
        sedan.setBrand(model);



        System.out.println("My Truck's brand is " + truck.getBrand());
    }
}
