package com.skilldistillery.spa.entity;

import java.util.Objects;

public class Dog extends Animal{
	private String noise = "Bark!";
	private double dogFood = 1; 
	public Dog() {}

	public Dog(String name) {
		super(name);
	}
	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public double getDogFood() {
		return dogFood;
	}

	public void setDogFood(double dogFood) {
		this.dogFood = dogFood;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dogFood, noise);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Double.doubleToLongBits(dogFood) == Double.doubleToLongBits(other.dogFood)
				&& Objects.equals(noise, other.noise);
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