package game.data;

public class Damage {
	private int damage;
	
	public Damage(int damage) {
		if(damage < 0) {
			throw new IllegalArgumentException(damage + " is not a correct damage value."); //this shouldn't happen
		}
		this.damage = damage;
	}
	public int getDamage() {
		return damage;
	}
	
	public Damage addDamage(Damage damageToAdd) {
		return new Damage(damage + damageToAdd.getDamage());
	}
}
