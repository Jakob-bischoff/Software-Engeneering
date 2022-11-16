package interactionBetMore_Game;

import java.util.*;

public class Player {
	boolean user_selected;
	int tries = 1;
	Game_Chair chair;
	BetMore_Game Bet = new BetMore_Game();

	public Player(Game_Chair chair) {
		this.chair = chair;
	}

	public int Play() {
		Bet.pick_card();
		if (chair.ComNum == 0) {
			return Bet.pick_card();
		} else {
			int number = Bet.pick_card();
			String s = Integer.toString(number);
			System.out.println("Your  Number is " + s + " Are you Happy with the number? ");
			Scanner stringScanner = new Scanner(System.in);
			String answer = stringScanner.next();
			if (answer == "yes") {
				return Bet.pick_card();
			} else {
				user_selected = false;
			}
			while (user_selected = false || tries < 6) {
				Bet.pick_card();
				tries++;
				int newNuber = Bet.pick_card();
				String j = Integer.toString(newNuber);
				System.out.println("Your new Number is " + j + " Are you Happy with the number?");
				Scanner stringScanner2 = new Scanner(System.in);
				String answer2 = stringScanner2.next();
				if (answer2 == "Yes") {
					user_selected = true;
				}

			}
			return Bet.pick_card();
		}
	}

}
