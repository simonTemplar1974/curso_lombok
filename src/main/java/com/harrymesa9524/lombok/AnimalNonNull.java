package com.harrymesa9524.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class AnimalNonNull {

	private Long idAnimal;
	private @NonNull String nombre;
	private @NonNull String raza;
	private Double peso;
	
}
