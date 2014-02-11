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
	
	@Override
	public Damage Attack(GameCharacter character) {
		return damage.subtract(character.Defend());
	}
	
	@Override
	public String toString() {
		String result = "\nWeapon Name: " + name;
		result += "\nDamage Weapon Does: " + damage;
		return result;
	}
}
