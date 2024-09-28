package com.skilldistillery.spa.entity;

public class Attendant   {
	private String name;
	public void Animal() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Attendant(String name) {
		this.name = name; 
		 
	}	
	
	
	
	public void makeRounds(Animal[] animalRooms) {
		for(int i = 0; i < animalRooms.length; i++ ) {
		    if(animalRooms[i] == null);
		    	System.out.println("The room is empty, so Bob will perform room pre-service");
		    if(animalRooms[i] != null) {
		    	System.out.println("The room is occupied. Bob will bring food for our guest");
		    	animalRooms[i].eat(5);
		    	System.out.println();
		    	
		    }
		 System.out.println("Bob is done attending to the current guests today");
		}
	}
	
		
	}



 


