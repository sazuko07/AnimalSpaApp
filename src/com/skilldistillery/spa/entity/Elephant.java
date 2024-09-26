package com.skilldistillery.spa.entity;

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
	public void eat(double quantity) {
		super.eat(elephantFood);
		System.out.println("dont bother me, i am eating "  +elephantFood +"lbs of food");
		}
	}

