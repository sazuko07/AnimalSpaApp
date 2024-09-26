package com.skilldistillery.spa.entity;
public class AnimalRetreat {
	private String catRoom;
	private String dogRoom;
	private String elephantRoom;	
	private String openRoom; 
	 

	private Attendant attendant; 
	
	public AnimalRetreat(String attendantName, boolean isHired) {
		attendant = new Attendant(attendantName, true);
		System.out.println("We just hired our attendant, " +attendantName);
	}
	public String animalRooms[] = new String[10];  {
		animalRooms[0] = dogRoom;
		animalRooms[1] = catRoom;
		animalRooms[2] = elephantRoom;
	}

	public void checkForOpenRooms() {
		int checkForOpenRooms = 0;
		for (int i = 0; i < animalRooms.length; i++ ) {
			if(animalRooms[i] == null) {
				checkForOpenRooms = i; 
				System.out.println("This room is currently vacant"); 
				break; 
			}	
				else {
					System.out.println("This room is currently occupied.");
				}
			}
	}

}
