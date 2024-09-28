package com.skilldistillery.spa.entity;

import java.util.Arrays;

public class AnimalRetreat {
	public Dog Dog = new Dog("Charlie the Dog"); 
	public Cat Cat = new Cat("Mittens the Cat");
	public Elephant Elephant = new Elephant("Dumbo the Elephant");
	private Attendant attendant;
	 
	private String name;  
	public String getName() {
		return name;
	}

	public AnimalRetreat(String attendantName) {
		attendant = new Attendant(attendantName);
		System.out.println("Welcome to the CatDogElephant animal retreat!");
		System.out.println("We just hired our attendant, " +attendantName);
		System.out.println("Now, we can officially open our CatDogElephant spa and retreat!");
		System.out.println("Welcome to the retreat! a place where cats, dogs, and elephants ");
		System.out.println("are pampered every day and night, each room specially tailored to ");
		System.out.println("each animal's individual needs!");
	}
//	public Animal[] getAnimalRooms() {
//		return animalRooms;
//	}
//
//	public void setAnimalRooms(Animal[] animalRooms) {
//		this.animalRooms = animalRooms;
//	}

	
	public Animal animalRooms[] = new Animal[10];  {
		animalRooms[0] = Cat;
		animalRooms[1] = Dog;
		animalRooms[2] = Elephant;
	}
	public void listGuestAnimals() {
		for (int i = 0; i < animalRooms.length; i++) {
			String guestAnimals = Arrays.toString(animalRooms);
			System.out.println(guestAnimals);
			
				}
		}
	
	
	

	public AnimalRetreat(Animal[] animalRooms) {
		super();
		this.animalRooms = animalRooms;
	}

	

	public Animal[] getAnimalRooms() {
		return animalRooms;
	}

	public void setAnimalRooms(Animal[] animalRooms) {
		this.animalRooms = animalRooms;
	}

	public void checkRooms() {
		int checkRooms = 0;
		for (int i = 0; i < animalRooms.length; i++ ) {
			if(animalRooms[i] == null) {
				checkRooms = i; 
				System.out.println("This room is currently empty");
				System.out.println("There are currently " +checkRooms +"open rooms"); 
				break; 
			}	
				else {
					System.out.println("Current Occupancy: " +animalRooms);
				}
			}
	}
		

	

		public void addAnimalCat() {
			
			for (int i = 0; i < animalRooms.length; i++) {
				if(animalRooms[i] == null) 
					animalRooms[i] = new Cat(getName()); 
				System.out.println("Welcome, new guest! Please make yourself at home");
				break; 
			}
		}
			public void addAnimalDog() {
				
				for (int i = 0; i < animalRooms.length; i++) {
					if(animalRooms[i] == null) 
						animalRooms[i] = new Dog(getName()); 
					System.out.println("Welcome, new guest! Please make yourself at home");
					break; 
				}
			}
				public void addAnimalElephant() {
					
					for (int i = 0; i < animalRooms.length; i++) {
						if(animalRooms[i] == null) 
							animalRooms[i] = new Elephant(getName()); 
						System.out.println("Welcome, new guest! Please make yourself at home");
						break; 
				}
	}
		public void startAttendantRounds() {
			Attendant attendant = new Attendant(getName());
			attendant.makeRounds(animalRooms);
			System.out.println("Our attendant has started making the rounds");
		}
}

