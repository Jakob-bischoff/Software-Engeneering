package interactionBetMore_Game;

public class BetMore_Game {

	Shuffle s = new Shuffle();

	int compNum;
	int playNum;
	Game_Chair chair;
	

	
	
	public BetMore_Game(Game_Chair chair) {
		this.chair = chair;
	}

	public int pick_card() {
		return s.pick();
	}

	public String calculating(Player Computer, Player Player_2) {
		compNum = chair.Computer.number;
		playNum = chair.Player_2.number;
		
		if (compNum > playNum) {
			return "Computer";
		} else {
			return "Player_2";
		}

	}

}
