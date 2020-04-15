package com.algorithms;

public abstract class Vehicle {

    private String engine, brand, model;
    private int year;
    private boolean electricEngine;

    public boolean isElectricEngine() {
        return electricEngine;
    }

    public void setElectricEngine(boolean electricEngine) {
        this.electricEngine = electricEngine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
