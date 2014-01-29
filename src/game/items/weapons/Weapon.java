package game.items.weapons;

import game.character.GameCharacter;
import game.character.IAttack;
import game.data.Damage;

public class Weapon implements IAttack {
	String name;
	Damage damage;
	
	public Weapon(String weaponName, Damage damageWeaponDoes) {
		this.name = weaponName;
		this.damage = damageWeaponDoes;
	}
	
	@Override
	public void Attack(GameCharacter character) {
		//TODO do da big deeps
	}

}
