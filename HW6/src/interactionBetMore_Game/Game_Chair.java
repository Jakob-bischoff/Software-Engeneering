package interactionBetMore_Game;

public class Game_Chair {

	Player Computer = new Player(this);
	Player Player_2 = new Player(this);
	BetMore_Game bet = new BetMore_Game(this);
	public int ComNum = 0;
	public int PlayerNum = 0;



	public void start() {
		if (ComNum == 0) {
			ComNum = Computer.Play();
		} else {
			PlayerNum = Player_2.Play();
		}
	}

	public void FindWinner(Player Computer, Player Player_2) {
		 System.out.println("And the winner is...");
		 System.out.println();
		 System.out.println();
		 System.out.println(bet.calculating(Computer, Player_2));
		 System.out.println("The number of the Computer was " + ComNum);
		 System.out.println("Your number was " + PlayerNum);
		 }
		
	}

