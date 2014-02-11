package game.data;

public class Damage implements IUnitableCharacterData<Damage> {
	private int damage;
	
	public Damage(int damage) {
		if(damage < 0) {
			throw new IllegalArgumentException(damage + " is not a correct damage value."); //this shouldn't happen
		}
		this.damage = damage;
	}
	
	@Override
	public Damage add(Damage damageToAdd) {
		if(damageToAdd.getValue() < 1)
			throw new IllegalArgumentException("Adding a damage value less than 1.");
		return new Damage(damage + damageToAdd.getValue());
	}
	
	@Override
	public Damage subtract(Damage damageToSubtract) {
		if(damageToSubtract.getValue() < 1)
			throw new IllegalArgumentException("Trying to subtract a damage value less than 1.");
		
		return new Damage(damage - damageToSubtract.getValue());
	}
	
	@Override
	public int getValue() {
		return damage;
	}
	
	@Override
	public String toString() {
		return "" + damage;
	}
}
