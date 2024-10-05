package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entity.*;

import java.util.Scanner;

public class AnimalSpaApp<animalRooms> {

	public static void main(String[] args) {

		AnimalSpaApp app = new AnimalSpaApp();
		app.AnimalSpaApp();

	}

	public void AnimalSpaApp() {

		AnimalRetreat retreat = new AnimalRetreat("Bob the attendant", "CatDogElephant", 10);
		Scanner scanner = new Scanner(System.in);
		int userChoice = 0;
		System.out.println("We currently have 3 guests: ");
		Dog Dog = new Dog("Charlie the Dog");
		Cat Cat = new Cat("Mittens the Cat");
		Elephant Elephant = new Elephant("Dumbo the Elephant");
		System.out.println(Dog.getName());
		System.out.println(Cat.getName());
		System.out.println(Elephant.getName());
		System.out.println();
		System.out.println("Please choose from one of the following options: ");
		System.out.println("1. List the current occupants of the retreat");
		System.out.println("2. Check a new animal to the retreat");
		System.out.println("3. Tell attendant to start the rounds");
		System.out.println("4. Close the retreat for the night");
		userChoice = scanner.nextInt();

		if (userChoice == 1) {
			userOption1();
			theRest();
		} else if (userChoice == 1) {
			userOption1();
			theRest();
		} else if (userChoice == 2) {
			userOption2();
			theRest();
		} else if (userChoice == 3) {
			userOption3();
			theRest();
		} else if (userChoice == 4) {
			userOption4();
			theRest();
		}
	}

	public void userOption1() {
		int userChoice = 0;
		AnimalRetreat retreat = new AnimalRetreat("Bob the attendant", "CatDogElephant", 10);
		Scanner scanner = new Scanner(System.in);
		retreat.checkRooms();
		theRest();
	}

	public void userOption2() {
		String userChoice = " ";
		int userChoiceNum = 0;
		AnimalRetreat retreat = new AnimalRetreat("Bob the attendant", "CatDogElephant", 10);
		Scanner scanner = new Scanner(System.in);
		System.out.println("what kind of animal are you wanting to check in? ");
		userChoice = scanner.next();
		if (userChoice.equalsIgnoreCase("Dog")) {
			retreat.addAnimalDog();
		} else if (userChoice.equalsIgnoreCase("Cat")) {
			retreat.addAnimalCat();
		} else if (userChoice.equalsIgnoreCase("Elephant")) {
			retreat.addAnimalElephant();
		}
	}

	public void userOption3() {
		AnimalRetreat rounds = new AnimalRetreat("Bob the attendant", "CatDogElephant", 10);
		rounds.makeRounds();
		theRest();
	}

	public void userOption4() {
		System.out.println("The retreat is closing down for the evening. Goodnight!");
		System.exit(0);
	}

	public void theRest() {
		int userChoiceNum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Would you like to select another option? if so, please choose from the 4 previous options: ");
		userChoiceNum = scanner.nextInt();

		if (userChoiceNum == 1) {
			userOption1();
		} else if (userChoiceNum == 2) {
			userOption2();
		} else if (userChoiceNum == 3) {
			userOption3();
		} else if (userChoiceNum == 4) {
			userOption4();
		}
	}
}