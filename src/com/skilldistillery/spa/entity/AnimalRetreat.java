package com.skilldistillery.spa.entity;

public class AnimalRetreat {
	private Attendant attendant; 
	
	public AnimalRetreat(String attendantName) {
		attendant = new Attendant(attendantName);
	}
}
