package game.data;

public class HP {
	private int maxHP;
	private int currentHP;
	
	public HP(int HP) {
		this(HP, HP);
	}
	
	private HP(int HP, int maxHP) {
		if(HP < 1)
			throw new IllegalArgumentException(HP + " is not a valid starting HP. Must be greater than 0.");
		this.currentHP = HP;
		this.maxHP = maxHP;
	}
	
	public int getCurrentHP() {
		return currentHP;
	}
	
	public HP addHP(HP hpToAdd) {
		if(currentHP + hpToAdd.getCurrentHP() > maxHP) {
			//TODO Change the logic for this, but just setting it here so it's not empty.
			throw new IllegalArgumentException(hpToAdd + " gives character more HP than their max HP allows.");
		}
		return new HP(currentHP += hpToAdd.getCurrentHP(), maxHP);
	}
	
	public HP subtractHP(HP hpToSubtract) {
		if(currentHP - hpToSubtract.getCurrentHP() < 0) {
			throw new IllegalArgumentException("The class that uses this HP is probably dead.");
		}
		return new HP(currentHP -= hpToSubtract.getCurrentHP(), maxHP);
	}
	
	public void takeDamage(Damage damageToTake) {
		if(currentHP - damageToTake.getDamage() < 0)
			throw new IllegalArgumentException("This class that uses this HP is probably dead.");
		currentHP -= damageToTake.getDamage();
	}
}
