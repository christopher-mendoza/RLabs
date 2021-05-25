package dev.mendoza.comparables;

import java.util.Comparator;

public class PokemonHelper implements Comparator<Pokemon> {

	@Override
	public int compare(Pokemon o1, Pokemon o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}

}
