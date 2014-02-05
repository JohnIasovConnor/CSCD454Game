package game.items.armor;

import game.data.Damage;
import game.interfaces.IDefend;

public class Armor implements IDefend {
	String name;
	Damage damageReduction; //currently maybe just flat damage reduction
	
	public Armor(String name, Damage damageToReduce) {
		this.name = name;
		damageReduction = damageToReduce;
	}

	@Override
	public Damage Defend() {
		return damageReduction;
	}

}
