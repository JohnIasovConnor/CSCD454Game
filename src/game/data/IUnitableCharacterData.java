package game.data;

public interface IUnitableCharacterData<UNIT> {
	public abstract UNIT add(UNIT toAdd);
	public abstract UNIT subtract(UNIT toSubtract);
	public abstract int getValue();
}
