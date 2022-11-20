package interactionBetMore_Game;

import java.util.*;

public class Player {
	boolean user_selected;
	int tries = 0;
	Game_Chair chair;
	BetMore_Game Bet = new BetMore_Game(chair);
	public int number;

	public Player(Game_Chair chair) {
		this.chair = chair;
	}

	public int Play() {
		number = Bet.pick_card();
		if (chair.ComNum == 0) {
			return number;
		} else {

			String s = Integer.toString(number);
			System.out.println("Your  Number is " + s + " Are you Happy with the number? ");
			Scanner stringScanner = new Scanner(System.in);
			String answer = stringScanner.next();
			if (answer.equals("yes") ) {
				return number;
			} else {
				user_selected = false;
			}
			while (user_selected == false && tries < 4) {
				int newNumber = Bet.pick_card();
				tries++;
				String j = Integer.toString(newNumber);
				System.out.println("Your  Number is " + j + " Are you Happy with the number? ");
				String answer2 = stringScanner.next();
				if (answer2.equals("yes")) {
					user_selected = true;
				
					
				}
				if(tries==4) {
					newNumber = Bet.pick_card();
				}
				number = newNumber;
			}
			stringScanner.close();

			return number;
		}
		
	}

}
