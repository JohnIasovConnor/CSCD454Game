package game.items.weapons;

import game.character.GameCharacter;
import game.data.Damage;
import game.interfaces.IAttack;

public class Weapon implements IAttack {
	String name;
	Damage damage;
	
	public Weapon(String weaponName, Damage damageWeaponDoes) {
		this.name = weaponName;
		this.damage = damageWeaponDoes;
	}
	
	public String getName() {
		return name;
	}
	
	public Damage getWeaponDamage() {
		return damage;
	}
	
	@Override
	public void Attack(GameCharacter character) {
		character.Defend(damage);
	}

}
