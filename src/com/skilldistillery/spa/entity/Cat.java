package com.skilldistillery.spa.entity;

import java.util.Objects;

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
	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public double getCatFood() {
		return catFood;
	}

	public void setCatFood(double catFood) {
		this.catFood = catFood;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(catFood, noise);
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
		Cat other = (Cat) obj;
		return Double.doubleToLongBits(catFood) == Double.doubleToLongBits(other.catFood)
				&& Objects.equals(noise, other.noise);
	}

	@Override
	public void eat(double quantity) {
		super.eat(catFood);
		System.out.println("dont bother me, i am eating "  +catFood +"lbs of cat food");
	}
}