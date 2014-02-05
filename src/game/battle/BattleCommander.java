package game.battle;

import java.util.Comparator;
import java.util.PriorityQueue;

import game.character.CharacterSpeedComparator;
import game.character.GameCharacter;

public class BattleCommander {
	static PriorityQueue<GameCharacter> fighters = new PriorityQueue<GameCharacter>(10, new CharacterSpeedComparator());
	
	public static void Battle(GameCharacter[] charactersToFight) {
		//Will sort who goes first by the game characters speed
		//http://www.roguebasin.com/index.php?title=A_priority_queue_based_turn_scheduling_system
		//For what the system may eventually turn into, but at least gets the idea out there.
		for(int i = 0; i < charactersToFight.length; i++)
			fighters.add(charactersToFight[i]);
		
		while(true) {
			GameCharacter attacker = fighters.remove();
			GameCharacter defender = fighters.remove();
			
			attacker.Attack(defender);
			if(defender.getHP().getCurrentHP() < 1)
				break;
			fighters.add(attacker);
			fighters.add(defender);
		}
		
	}
}
