package game.items.armor;

import game.character.IDefend;
import game.data.Damage;

public class Armor implements IDefend {
	String name;
	Damage damageReduction; //currently maybe just flat damage reduction
	
	public Armor(String name, Damage damageToReduce) {
		this.name = name;
		damageReduction = damageToReduce;
	}

	@Override
	public void Defend() {
		// TODO Add logic so that if someone is defending, they take reduced damage
		// or just have it pass in the attacker and check here? I don't know

	}

}
