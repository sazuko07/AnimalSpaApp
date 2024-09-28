package com.skilldistillery.spa.entity;

import java.util.Objects;

public class Elephant extends Animal {
	private String noise = "Toooot!";
	private double elephantFood = 25; 
	public Elephant () {}
	
	public Elephant(String name) {
		super(name);
		}
	public Elephant(String name, String noise) {
		super(name);
		this.noise = this.noise +" " +noise;
		}
	@Override 
	public void makeNoise() {
		super.makeNoise();
		System.out.println("The noise i make is " +noise);
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(elephantFood, noise);
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
		Elephant other = (Elephant) obj;
		return Double.doubleToLongBits(elephantFood) == Double.doubleToLongBits(other.elephantFood)
				&& Objects.equals(noise, other.noise);
	}

	@Override 
	public void eat(double quantity) {
		super.eat(elephantFood);
		System.out.println("dont bother me, i am eating "  +elephantFood +"lbs of food");
		}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public double getElephantFood() {
		return elephantFood;
	}

	public void setElephantFood(double elephantFood) {
		this.elephantFood = elephantFood;
	}
	}

