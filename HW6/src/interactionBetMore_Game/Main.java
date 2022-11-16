package interactionBetMore_Game;

public class Main {

	Game_Chair chair = new Game_Chair();

	public static void main(String[] args) {
		Main main = new Main();
		main.begin();
	}

	public void begin() {
		System.out.println("Hello");
		chair.start();
		chair.start();
		chair.FindWinner(chair.Computer, chair.Player_2);
	}
}
