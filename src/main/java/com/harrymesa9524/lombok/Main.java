package com.harrymesa9524.lombok;

import java.io.IOException;

import lombok.NoArgsConstructor;
import lombok.NonNull;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/******* CLASE 4 @Get, @Set, @ToString, @AllArgsConstructor *********************/
		
//		//@AllArgsConstructor
//		Animal animal = new Animal(null, null, null, null);
//
//		//Set
//		animal.setNombre("Perro");
//
//		//Get
//		System.err.println("GET "+animal.getNombre());
//		
//		//@ToString
//		System.err.println("ToString "+animal.toString());
		
		/************* CLASE 5. @CleanUp ***************/
		
		//Cleanup
//		@Cleanup InputStream is = null;
//		int init;
//		char caracter;
//		try {
//			// new input stream created
//			is = new FileInputStream("C://anotacioncleanup.txt");
//
//			System.err.println("Datos leidos del Archivo :");
//			// reads till the end of the stream
//			while((init = is.read())!=-1) {
//				// converts integer to character
//				caracter = (char)init;
//				// prints character
//				System.err.print(caracter);
//			}
//		} catch(Exception e) {
//			// if any I/O error occurs
//			e.printStackTrace();
//		}
		
		/************* CLASE 6. @Getter, @Setter ***************/
//		AnimalGetterSetter animalGetterSetter = new AnimalGetterSetter();
//		animalGetterSetter.se
	
		/************* CLASE 7. @NoArgsConstructor, @RequiredArgsConstructor, @AllArgsConstructor ***************/
//		AnimalArgsConstructor animalArgsConstructor = new AnimalArgsConstructor();
//		animalArgsConstructor = new AnimalArgsConstructor(); //@NoArgsConstructor
//		animalArgsConstructor = new AnimalArgsConstructor(1L, "nombre", "raza", 48.5);
//		animalArgsConstructor = new AnimalArgsConstructor(1L);
		
		/************* CLASE 8. @NonNull ***************/
		try {
//			setNonNull(null);
			setNonNull(new AnimalNonNull(1L, null, "raza", 45.6));
		}catch(NullPointerException e) {
			System.err.println("Error Controlado: "+e.getMessage());
		}
		
		
	}
	
	public static void setNonNull(@NonNull AnimalNonNull animal) {
		System.err.println(animal.toString());
	}

}
