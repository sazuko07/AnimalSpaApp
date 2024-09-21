package com.skilldistillery.spa.entity;

public class Dog extends Animal{
	private String noise = "Bark!";
	
	public Dog() {}

	public Dog(String name) {
		super(name);
	}
	public Dog(String name, String noise) {
		super(name);
		this.noise = this.noise +" " +noise;
	}


	public void makeNoise() {
		super.makeNoise();
		System.out.println("The noise i make is " +noise);
	}
}