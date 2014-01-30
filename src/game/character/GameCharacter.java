package game.character;
import game.data.Damage;
import game.data.HP;
import game.interfaces.IAttack;
import game.interfaces.IDefend;


public class GameCharacter {
	String name;
	HP HP;
	IAttack weapon;
	IDefend armor;
	int speed;
	
	public GameCharacter(String name, HP startingHP, IAttack weaponToUse, IDefend defenseToUse, int speed)
	{
		this.name = name;
		this.HP = startingHP;
		this.weapon = weaponToUse;
		this.armor = defenseToUse;
		this.speed = speed;
	}
	
	public void setWeapon(IAttack newWeapon) {
		this.weapon = newWeapon;
	}
	
	public void Attack(GameCharacter characterToAttack) {
		weapon.Attack(characterToAttack);
	}
	
	public void Defend(Damage damageToDo) {
		armor.Defend(damageToDo); //TODO add defense, perhaps set varying levels of damage reduction?
	}
	
	public String getName() {
		return name;
	}
	
	public HP getHP() {
		return HP;
	}
	
	public IAttack getWeapon() {
		return weapon;
	}
	
	public IDefend getArmor() {
		return armor;
	}
	
	public int getSpeed() {
		return speed;
	}
}
