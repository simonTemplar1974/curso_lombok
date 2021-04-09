package com.harrymesa9524.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AnimalGetterSetter {

	private Long idAnimal;
	@Setter private String nombre;
    private String raza;
	@Setter(AccessLevel.NONE) private Double peso;
	
}
