package game.data;

public class HP implements IUnitableCharacterData<HP> {
	
	private int HP;
	
	public HP(int HP) {
		if(HP < 0)
			throw new IllegalArgumentException(HP + " is not a valid starting HP. Must be non-negative.");
		this.HP = HP;
	}
	
	@Override
	public HP add(HP hpToAdd) {
		if(hpToAdd.getValue() < 0)
			throw new IllegalArgumentException("Adding a negative HP value. Perhaps you should try subtracting instead.");
		
		return new HP(HP += hpToAdd.getValue());
	}
	
	@Override
	public HP subtract(HP hpToSubtract) {
		if(hpToSubtract.getValue() < 1)
			throw new IllegalArgumentException("Subtracting a negative HP value. Perhaps you should try adding instead. Value passed: " + hpToSubtract);
		
		if(HP - hpToSubtract.getValue() < 0)
			return new HP(0);
			
		return new HP(HP -= hpToSubtract.getValue());
	}
	
	@Override
	public int getValue() {
		return HP;
	}
	
	@Override
	public String toString() {
		return "" + HP;
	}
}
