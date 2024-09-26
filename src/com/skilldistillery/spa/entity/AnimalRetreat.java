package com.skilldistillery.spa.entity;
public class AnimalRetreat {

	
	private Attendant attendant; 
	
	public AnimalRetreat(String attendantName, boolean isHired) {
		attendant = new Attendant(attendantName, true);
		System.out.println("We just hired our attendant, " +attendantName);
	}
	public Animal animalRooms[] = new Animal[10];  {
		animalRooms[0] = new Cat("Mittens the Cat");
		animalRooms[1] = new Dog("Charlie the Dog");
		animalRooms[2] = new Elephant("Dumbo the Elephant");
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
