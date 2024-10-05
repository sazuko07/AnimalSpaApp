package com.skilldistillery.spa.entity;

import java.util.Scanner;

public class AnimalRetreat {

	private Attendant attendant;
	private int numOfRooms;
	private String nameOfRetreat;
	public Dog Dog = new Dog("Charlie the Dog"); 
	public Cat Cat = new Cat("Mittens the Cat");
	public Elephant Elephant = new Elephant("Dumbo the Elephant");
	

	public AnimalRetreat(String attendantName, String nameOfRetreat, int numOfRooms) {
		super();
		this.numOfRooms = numOfRooms;
		this.nameOfRetreat = nameOfRetreat;
		this.numOfRooms = numOfRooms;
		System.out.println("Welcome to the CatDogElephant animal retreat!");
		System.out.println("We just hired our attendant, " + attendantName);
		System.out.println("Now, we can officially open our CatDogElephant spa and retreat!");
		System.out.println("Welcome to the retreat! a place where cats, dogs, and elephants ");
		System.out.println("are pampered every day and night, each room specially tailored to ");
		System.out.println("each animal's individual needs!");
	}

	private String name;

	public String getName() {
		return name;
	}
	
	
	
//	public Animal[] getAnimalRooms() {
//		return animalRooms;
//	}
//
//	public void setAnimalRooms(Animal[] animalRooms) {
//		this.animalRooms = animalRooms;
//	}

	Animal currentGuests[] = new Animal[10];
	{
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
		int checkRooms = 0;
		for (int i = 0; i < currentGuests.length; i++) {
			if (currentGuests[i] == null) {
				checkRooms = i;
				System.out.println("Room " + checkRooms + " is currently open");
			}

			else {
				checkRooms = i;
				System.out.println("Room " + checkRooms + " is currently occupied by: " + currentGuests[i].getName());
			}
		}
	}

	public void addAnimalCat() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your cat's name? ");
		String userChoice = scanner.next();
		for (int i = 0; i < currentGuests.length; i++) {
			int checkRooms = i;
			if (currentGuests[i] == null)
				currentGuests[i] = new Cat(userChoice);
			System.out.println("Welcome, " + userChoice + "!" + " Please make yourself at home!");
			System.out.println("you will be checked into room " + checkRooms);
			System.out.println("Room " + checkRooms + " is now occupied by: " + userChoice);
			break;
		}
	}

	public void addAnimalDog() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your dog's name? ");
		String userChoice = scanner.next();
		for (int i = 0; i < currentGuests.length; i++) {
			int checkRooms = i;
			if (currentGuests[i] == null)
				currentGuests[i] = new Dog(userChoice);
			System.out.println("Welcome, " + userChoice + "!" + " Please make yourself at home!");
			System.out.println("you will be checked into room " + checkRooms);
			System.out.println("Room " + checkRooms + " is now occupied by: " + userChoice);
			break;
		}
	}

	public void addAnimalElephant() { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your elephant's name? ");
		String userChoice = scanner.next();
		for (int i = 0; i < currentGuests.length; i++) {
			if (currentGuests[i] == null)
				currentGuests[i] = new Elephant(userChoice);
			int checkRooms = i;
			System.out.println("Welcome, " + userChoice + "!" + " Please make yourself at home!");
			System.out.println("you will be checked into room " + checkRooms);
			System.out.println("Room " + checkRooms + " is now occupied by: " + userChoice);
			break;
		}	
	}

	public void makeRounds() {
		for (int i = 0; i < currentGuests.length; i++) {
			if (currentGuests[i] == null) {
			System.out.println("The room is empty, so Bob will perform room pre-service");
			}
			  else if (currentGuests[i].equals(Cat)) {
				System.out.println("The room is occupied by a cat. Bob will bring cat food for our guest");
				currentGuests[i].eat(.25);
				System.out.println();
				break;
			} else if (currentGuests[i].equals(Dog)) {
				System.out.println("The room is occupied by a Dog. Bob will bring Dog food for our guest");
				currentGuests[i].eat(1);
				System.out.println();
				break;
			} else if (currentGuests[i].equals(Elephant)) {
				System.out.println("The room is occupied by a elephant. Bob will bring elephant food for our guest");
				currentGuests[i].eat(25);
				System.out.println();
				break;
			}
			else System.out.println("Bob is done attending to the current guests today");
		}	
	}	
}