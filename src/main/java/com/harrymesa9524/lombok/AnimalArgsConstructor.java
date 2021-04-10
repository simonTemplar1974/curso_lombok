package com.harrymesa9524.lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class AnimalArgsConstructor {

	private @NonNull Long idAnimal;
	private String nombre;
	private String raza;
	private Double peso;
	
}
