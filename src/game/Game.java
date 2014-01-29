package game;

import game.character.GameCharacter;
import game.data.*;
import game.items.armor.Armor;
import game.items.weapons.Weapon;

public class Game {

	public static void main(String[] args) {
		//How messy
		GameCharacter bestHero = new GameCharacter("Stallman", new HP(200), new Weapon("Freedom", new Damage(100)), new Armor("OpenSource", new Damage(100)));
	}

}
