package com.skilldistillery.spa.entity;

import java.util.Arrays;

public class AnimalRetreat {
	public Dog Dog = new Dog("Charlie the Dog"); 
	
	public Cat Cat = new Cat("Mittens the Cat");
	public Elephant Elephant = new Elephant("Dumbo the Elephant");
	private Attendant attendant;
	private int numOfRooms;
	private String nameOfRetreat;
	 
	
	
	public AnimalRetreat(String attendantName,  String nameOfRetreat, int numOfRooms) {
		super();
		this.numOfRooms = numOfRooms;
		this.nameOfRetreat = nameOfRetreat;
		this.numOfRooms = numOfRooms;
		System.out.println("Welcome to the CatDogElephant animal retreat!");
		System.out.println("We just hired our attendant, " +attendantName);
		System.out.println("Now, we can officially open our CatDogElephant spa and retreat!");
		System.out.println("Welcome to the retreat! a place where cats, dogs, and elephants ");
		System.out.println("are pampered every day and night, each room specially tailored to ");
		System.out.println("each animal's individual needs!");
	}
	
	 
	


	private String name;  
	public String getName() {
		return name;
	}

	public Cat Cat(String name, String makeNoise, double catFood) {
		Cat(Cat.getName(), Cat.getNoise(), Cat.getCatFood());
		return Cat; 
	}
	public Dog Dog(String name, String makeNoise, double dogFood) {
		Dog(Dog.getName(), Dog.getNoise(), Dog.getDogFood());
		return Dog;
	}
	public Elephant Elephant(String name, String makeNoise, double elephantFood) {
		Elephant(Elephant.getName(), Elephant.getNoise(), Elephant.getElephantFood());
		return Elephant; 
	}
//	public Animal[] getAnimalRooms() {
//		return animalRooms;
//	}
//
//	public void setAnimalRooms(Animal[] animalRooms) {
//		this.animalRooms = animalRooms;
//	}

	
	 Animal currentGuests[] = new Animal[10];  {
		 currentGuests[0] = new Cat("Mittens", "Meow!");
		 currentGuests[1] = new Dog("Charlie", "Bark!");
		 currentGuests[2] = new Elephant("Dumbo", "Toooot!");
	}
//	 public void printAnimalRooms() {
//			for (int i = 0; i < currentGuests.length; i++)
//				System.out.println(currentGuests[i]);
//				if(currentGuests[i].equals(null)) {
//					
//				}
//		}


		
	
	
	

	public AnimalRetreat(Animal[] currentGuests) {
		super();
		this.currentGuests = currentGuests;
	}

	

	public Animal[] getcurrentGuests() {
		return currentGuests;
	}

	public void setAnimalRooms(Animal[] currentGuests) {
		this.currentGuests = currentGuests;
	}

	public void checkRooms() {
		int checkRooms;
		for (int i = 0; i < currentGuests.length; i++ ) {
			if(currentGuests[i] == null) {
				checkRooms = i; 
				System.out.println("There are currently " +checkRooms +" open rooms"); 
				break; 
			}	
				else {
					System.out.println("Room occupied by: " +currentGuests[i]);
				}
			}
	}
		

	

		public void addAnimalCat() {
			
			for (int i = 0; i < currentGuests.length; i++) {
				if(currentGuests[i] == null) 
					currentGuests[i] = new Cat(getName()); 
				System.out.println("Welcome, new guest! Please make yourself at home");
				break; 
			}
		}
			public void addAnimalDog() {
				
				for (int i = 0; i < currentGuests.length; i++) {
					if(currentGuests[i] == null) 
						currentGuests[i] = new Dog(getName()); 
					System.out.println("Welcome, new guest! Please make yourself at home");
					break; 
				}
			}
				public void addAnimalElephant() {
					
					for (int i = 0; i < currentGuests.length; i++) {
						if(currentGuests[i] == null) 
							currentGuests[i] = new Elephant(getName()); 
						System.out.println("Welcome, new guest! Please make yourself at home");
						break; 
				}
	}
		public void startAttendantRounds() {
			Attendant attendant = new Attendant(getName());
			attendant.makeRounds(currentGuests);
			System.out.println("Our attendant has started making the rounds");
		}

		
}

