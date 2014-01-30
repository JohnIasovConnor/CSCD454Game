package game.battle;

import java.util.Comparator;
import java.util.PriorityQueue;

import game.character.CharacterSpeedComparator;
import game.character.GameCharacter;

public class BattleCommander {
	static PriorityQueue<GameCharacter> fighters = new PriorityQueue<GameCharacter>(10, new CharacterSpeedComparator());
	
	public static void Battle(GameCharacter[] charactersToFight) {
		//Will sort who goes first by the game characters speed
		for(int i = 0; i < charactersToFight.length; i++)
			fighters.add(charactersToFight[i]);
		
		while(true) {
			GameCharacter attacker = fighters.remove();
			GameCharacter defender = fighters.remove();
			
			attacker.Attack(defender);
			fighters.add(attacker);
			
			if(defender.getHP().getCurrentHP() < 1) {
				break;
			}
		}
		
	}
}
