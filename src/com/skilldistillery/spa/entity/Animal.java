package com.skilldistillery.spa.entity;

import java.util.Objects;

public abstract class Animal {
	private	String name;
	private String getName; 
	private String eat; 

	public String getGetName() {
		return getName;
	}

	public void setGetName(String setName) {
		this.getName = setName;
	}

	//methods getters and setters
	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(getName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(getName, other.getName) && Objects.equals(name, other.name);
	}

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
 