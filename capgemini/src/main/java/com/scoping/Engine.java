package com.scoping;

public class Engine {
    private int noOfPiston;
    private String power;
    private String type;

    public int getNoOfPiston() {
        return noOfPiston;
    }

    public void setNoOfPiston(int noOfPiston) {
        this.noOfPiston = noOfPiston;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine(int noOfPiston, String power, String type) {
        this.noOfPiston = noOfPiston;
        this.power = power;
        this.type = type;
    }
}

