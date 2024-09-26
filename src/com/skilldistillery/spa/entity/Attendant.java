package com.skilldistillery.spa.entity;

public class Attendant   {
	private String name;

	public Attendant(String name, boolean isHired) {
		this.name = name; 
		isHired = true; 
	}	
	
	public void makeRounds(String[] animalRooms) {
		for(int i = 0; i < animalRooms.length; i++ ) {
		    if(animalRooms[i] == null);
		    	System.out.println("The room is empty, Bob will perform room pre-service");
		    if(animalRooms[i] != null) {
		    		System.out.println("The room is occupied. Bob will bring" +animalRooms[i] +"food for our guest");
		    		super.eat(); 
		    }
		}
	}



 

}
