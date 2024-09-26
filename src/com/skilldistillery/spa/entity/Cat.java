package com.skilldistillery.spa.entity;

public class Cat extends Animal {
	private String noise = "Meow!";
	private double catFood = .25; 
	public Cat () {}
	
	public Cat(String name) {
		super(name);
	}
	public Cat(String name, String noise) {
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
		super.eat(catFood);
		System.out.println("dont bother me, i am eating "  +catFood +"lbs of cat food");
	}
}