package game.character;
import game.data.HP;


public class GameCharacter {
	String name;
	HP HP;
	IAttack weapon;
	IDefend defense;
	
	public GameCharacter(String name, HP startingHP, IAttack weaponToUse, IDefend defenseToUse)
	{
		this.name = name;
		this.HP = startingHP;
		this.weapon = weaponToUse;
		this.defense = defenseToUse;
	}
	
	public void Attack(GameCharacter characterToAttack) {
		weapon.Attack(characterToAttack);
	}
	
	public void Defend() {
		defense.Defend(); //TODO add defense, perhaps set varying levels of damage reduction?
	}
}
