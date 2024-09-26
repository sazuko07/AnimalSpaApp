package com.skilldistillery.spa.entity;

public class Dog extends Animal{
	private String noise = "Bark!";
	private double dogFood = 1; 
	public Dog() {}

	public Dog(String name) {
		super(name);
	}
	public Dog(String name, String noise) {
		super(name);
		this.noise = this.noise +" " +noise;
	}

	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("The noise i make is " +noise);
	}
	@Override
	public void eat(double quantity) {
		super.eat(dogFood);
		System.out.println("dont bother me, i am eating "  +dogFood +"lbs of dog food");
	}
}