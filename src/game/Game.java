package game;

import game.battle.BattleCommander;
import game.character.GameCharacter;
import game.data.*;
import game.items.armor.Armor;
import game.items.weapons.Weapon;

public class Game {

	public static void main(String[] args) {
		//How messy, currently speed is lower the number, faster the character
		GameCharacter bestHero = new GameCharacter("Richard", new HP(200), new Weapon("Sword", new Damage(100)), new Armor("Stallman Armor", new Damage(100)), 50);
		GameCharacter worstHero = new GameCharacter("Mark", new HP(15), new Weapon("Fists", new Damage(101)), new Armor("Nothing", new Damage(1)), 100);
		GameCharacter[] characters = {bestHero, worstHero};
		BattleCommander.Battle(characters);
	}

}
