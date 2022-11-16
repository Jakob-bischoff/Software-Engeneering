package interactionBetMore_Game;

public class Game_Chair {


	Player Computer = new Player(this);
	Player Player_2 = new Player(this);
	public int ComNum = 0;
	public int PlayerNum = 0;
	String winner;

	public void start() {
		if (ComNum == 0) {
			ComNum = Computer.Play();
		} else {
			PlayerNum = Player_2.Play();
		}
	}
	
	public String FindWinner() {
		return winner;
	}
}
