package dev.mendoza.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pokemon {// implements Comparable<Pokemon> {
	private String type;
	private int id;
	private String name;
	
	public Pokemon(String type, int id, String name) {
		super();
		this.type = type;
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Pokemon [type=" + type + ", id=" + id + ", name=" + name + "]";
	}

	public Pokemon() {
		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		List<Pokemon> pk = new ArrayList<Pokemon>();
		pk.add(new Pokemon("Water", 263, "Piplup"));
		pk.add(new Pokemon("Electric", 176, "Pikachu"));
		pk.add(new Pokemon("Fire", 66, "Monke"));
		pk.add(new Pokemon("Fire", 45, "Charizard"));
		pk.add(new Pokemon("Electric", 176, "Pikachu"));
		pk.add(new Pokemon("Water", 7, "Squirtle"));
		
		// .sort() method can be overloaded by passing in a Comparator
		// Collections.sort(pk);
		// Collections.sort(pk, (p1, p2) -> {return p1.getType().compareTo(p2.getType()); });
		Collections.sort(pk, new PokemonHelper());
		
		for(Pokemon p : pk) {
			System.out.println(p);
		}
	}

//	@Override
//	public int compareTo(Pokemon o) {
//		// TODO Auto-generated method stub
//		// return this.getId() - o.getId(); // ascending id
//		// return o.getId() - this.getId(); descending id
//		// return this.getType().compareTo(o.getType()); // ascending type
//		int result = this.getType().compareTo(o.getType());
//		if(result != 0) {
//			return result;
//		}
//		return this.getId() - o.getId();
//	}
}
