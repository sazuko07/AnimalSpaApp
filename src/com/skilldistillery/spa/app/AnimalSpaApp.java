package com.skilldistillery.spa.app;
import com.skilldistillery.spa.entity.*;
public class AnimalSpaApp {

	public static void main(String[] args) {
		AnimalSpaApp app = new AnimalSpaApp();
		app.run();

	}
	
	public void run() {
		AnimalRetreat retreat = new AnimalRetreat("Bob the Attendant");
		Dog Dog = new Dog("Charlie"); 
		System.out.println(Dog.getName());
	}
}
