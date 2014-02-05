package game.interfaces;

import game.character.GameCharacter;
import game.data.Damage;

public interface IAttack {
	public abstract Damage Attack(GameCharacter character);
}
