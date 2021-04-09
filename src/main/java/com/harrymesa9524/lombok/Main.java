package com.harrymesa9524.lombok;

public class Main {

	public static void main(String[] args) {
		
		// @AllArgsConstructor
		Animal animal = new Animal("Gato", 50, "Felino");

		//Set
		animal.setNombre("Perro");

		//Get
		System.err.println("GET "+animal.getNombre());
		
		//@ToString
		System.err.println("ToString "+animal.toString());
		
		
	}

}
