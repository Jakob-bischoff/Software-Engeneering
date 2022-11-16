package interactionBetMore_Game;

public class Shuffle {

	int min = 1;
	int max = 100;



	public int pick() {
		int selected = (int) Math.floor(Math.random() * (max - min + 1) + min);
		return selected;
	}

}
