package game.character;

public class HeroFactory extends GameCharacterFactory {

	@Override
	public GameCharacter createCharacter(String characterType) {
		if(characterType.isEmpty() || characterType == null)
			throw new IllegalArgumentException("Provided character type is empty or null.");
		
		if(characterType.equals("Warrior")) {
			return new GameCharacter();
		}
		
		throw new IllegalArgumentException("Unknown chracter type provided for creation.");
	}

}
