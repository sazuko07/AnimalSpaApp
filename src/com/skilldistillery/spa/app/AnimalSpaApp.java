package com.skilldistillery.spa.app;
import com.skilldistillery.spa.entity.*;
public class AnimalSpaApp {

	public static void main(String[] args) {
		AnimalSpaApp app = new AnimalSpaApp();
		app.run();

	}
	
	public void run() {
		AnimalRetreat retreat = new AnimalRetreat("Bob the Attendant", true);
		Dog Dog = new Dog("Charlie the Dog"); 
		Cat Cat = new Cat("Mittens the Cat");
		Elephant Elephant = new Elephant("Dumbo the Elephant");
		System.out.println("We currently have 3 guests: ");
		System.out.println(Dog.getName());
		System.out.println(Cat.getName());
		System.out.println(Elephant.getName());
	}
}
