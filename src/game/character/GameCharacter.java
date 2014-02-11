package game.character;
import game.data.Damage;
import game.data.HP;
import game.data.Speed;
import game.interfaces.IAttack;
import game.interfaces.IDefend;


public class GameCharacter {
	
	public class GameCharacterAttributes {
		private String name;
		private HP HP;
		private IAttack weapon;
		private IDefend armor;
		private Speed speed;
	}
	
	private String name;
	private HP maxHP;
	private HP currentHP;
	private IAttack weapon;
	private IDefend armor;
	private int speed;
	
	public GameCharacter(){};
	
	public GameCharacter(String name, HP startingHP, IAttack weaponToUse, IDefend defenseToUse, int speed)
	{
		//make a CharacterAttributes class using fluent interface
		this.name = name;
		this.maxHP = startingHP;
		this.currentHP = startingHP;
		this.weapon = weaponToUse;
		this.armor = defenseToUse;
		this.speed = speed;
	}
		
	public void Attack(GameCharacter characterToAttack) {
		Damage damageToDo = weapon.Attack(characterToAttack);
		characterToAttack.takeDamage(damageToDo);
	}
	
	public void takeDamage(Damage damageToDo) {
		HP hpToRemove = new HP(damageToDo.getValue());
		currentHP = currentHP.subtract(hpToRemove);
	}
	
	public Damage Defend() {
		return armor.Defend(); //TODO add defense to an attack equation
	}
	
	public void setWeapon(IAttack newWeapon) {
		this.weapon = newWeapon;
	}
	
	public void setArmor(IDefend newArmor) {
		this.armor = newArmor;
	}
	
	public String getName() {
		return name;
	}
	
	public HP getHP() {
		return currentHP;
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
	
	@Override
	public String toString() {
		String result = "\nName: " + name;
		result += "\nCurrent HP: " + currentHP;
		result += "\nCurrent Weapon:" + weapon;
		result += "\nCurrent Armor: " + armor;
		result += "\nSpeed: " + speed;
		return result;
	}
}
