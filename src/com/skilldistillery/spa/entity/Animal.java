package com.skilldistillery.spa.entity;

public abstract class Animal {
	private	String name;

	//methods getters and setters
	
	public void eat(double quantity) {
		System.out.println("dont bother me, i am eating "  +quantity +"lbs of food");
	}
	public void makeNoise() {
		System.out.println("I am animal, hear me roar!");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
 