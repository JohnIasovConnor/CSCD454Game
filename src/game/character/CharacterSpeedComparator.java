package game.character;


import java.util.Comparator;

public class CharacterSpeedComparator implements Comparator<GameCharacter> {

	@Override
	public int compare(GameCharacter x, GameCharacter y) {
		
		if(x.getSpeed() < y.getSpeed())
			return -1;
		if(x.getSpeed() > y.getSpeed())
			return 1;
		return 0;
	}

}
