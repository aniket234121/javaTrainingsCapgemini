package com.scoping;
class Car{
	private String model;
	private String brandName;
	private String power;
	public String toString(){return "model: "+model+" brand: "+brandName+" power: "+power;}
	public Car(String model,String brandName,String power){
		this.model=model;
		this.brandName=brandName;
		this.power=power;
		}
}
