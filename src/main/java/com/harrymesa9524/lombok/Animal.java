package com.harrymesa9524.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Animal {

	private Long idAnimal;
	private String nombre;
	private String raza;
	private Double peso;
	
}
