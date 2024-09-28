package com.skilldistillery.spa.app;
import com.skilldistillery.spa.entity.*;
import com.skilldistillery.spa.entity.AnimalRetreat;
import java.util.Scanner; 
public class AnimalSpaApp {

	public static void main(String[] args) {
		AnimalRetreat AnimalRetreat = new AnimalRetreat(); 
		 	 
		AnimalSpaApp app = new AnimalSpaApp();
		app.run();

	}


	
	public void run() {
		
		AnimalRetreat retreat = new AnimalRetreat("Bob the Attendant");
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
		System.out.println("4. Close the retreat for the night");
		userChoice = scanner.nextInt();
		
	
	if(userChoice == 1) {
		 
		AnimalRetreat.listGuestAnimals();
}
	}
}