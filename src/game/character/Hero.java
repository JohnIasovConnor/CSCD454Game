package game.character;

import game.interfaces.IAttack;
import game.interfaces.IDefend;

public class Hero extends GameCharacter {

	public Hero(String name, game.data.HP startingHP, IAttack weaponToUse, IDefend defenseToUse, int speed) {
		super(name, startingHP, weaponToUse, defenseToUse, speed);
		
	}

}
