package com.scoping;
public class Car implements Comparable<Car> {
	private String model;
	private String brandName;
	private String power;
	public String toString(){return "model: "+model+" brand: "+brandName+" power: "+power;}
	public Car(String model,String brandName,String power){
		this.model=model;
		this.brandName=brandName;
		this.power=power;
		}
	public int compareTo(Car car){
		return this.model.compareTo(car.model);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}
}
