package com.scoping;

public class Car2 {
    private String brandName;
    private Engine engine =new Engine(12,"1200hp","petrol");

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car2(String brandName, Engine engine) {
        this.brandName = brandName;
        this.engine = engine;
    }
}
