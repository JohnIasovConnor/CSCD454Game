package game.data;

public class Speed implements IUnitableCharacterData<Speed> {

	private int speed;
	
	public Speed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public Speed add(Speed toAdd) {
		return new Speed(speed + toAdd.getValue());
	}

	@Override
	public Speed subtract(Speed toSubtract) {
		return new Speed(speed - toSubtract.getValue());
	}

	@Override
	public int getValue() {
		return speed;
	}
	
	@Override
	public String toString() {
		return "" + speed;
	}

}
