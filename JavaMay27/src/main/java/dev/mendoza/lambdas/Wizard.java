package dev.mendoza.lambdas;

import java.util.Arrays;
import java.util.List;

public class Wizard {
	String name;
	List<Magic> proficiencies;
	
	interface Potion {
		void makePotion(String ingredient);
	}
	
	public Wizard(String name, Magic... proficiencies) { // Magic[]
		this.name = name;
		this.proficiencies = Arrays.asList(proficiencies);
	}
	
	public static void main(String[] args) {
		Wizard flewpie = new Wizard("Flewpie", Spell.fireball, Spell.frostbolt, Spell.mirrorImage);
		
//		for(int i = 0; i < flewpie.proficiencies.size(); i++ ) {
//			flewpie.proficiencies.get(i).castSpell();
//		}
		
		// Enhanced for loop - shorthand for above for loop
		for(Magic m : flewpie.proficiencies) {
			m.castSpell();
		}
		
		Potion shrink = (ingredient) -> System.out.println("Made a potion using " + ingredient);
		shrink.makePotion("mushroom");
		
		Wizard dewpie = new Wizard("Dewpie", Spell.fireball, () -> System.out.println("Pyroblast"));
		dewpie.proficiencies.forEach((m) -> m.castSpell());
		dewpie.proficiencies.forEach(Magic::castSpell);
	}
}
