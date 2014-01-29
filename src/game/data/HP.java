package game.data;

public class HP {
	private int maxHP;
	private int currentHP;
	
	public HP(int HP) {
		if(HP < 1) {
			throw new IllegalArgumentException(HP + " is not a valid starting HP. Must be greater than 0.");
		}
		maxHP = HP;
	}
	
	public int getHP() {
		return currentHP;
	}
	
	public void addHP(HP hpToAdd) {
		if(currentHP + hpToAdd.getHP() > maxHP) {
			//TODO Change the logic for this, but just setting it here so it's not empty.
			throw new IllegalArgumentException(hpToAdd + " gives character more HP than their max HP allows.");
		}
		currentHP += hpToAdd.getHP();
	}
	
	public void subtractHP(HP hpToSubtract) {
		if(currentHP - hpToSubtract.getHP() < 0) {
			throw new IllegalArgumentException("The class that uses this HP is probably dead.");
		}
		currentHP -= hpToSubtract.getHP();
	}
}
