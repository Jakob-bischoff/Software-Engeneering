package de.uni.koeln.se.state;

public class Elevator {

	public static int current_Floor = 5;
	int dest_Floor;

	private Elv_States State = new Elv_States();

	public Elevator(int dest_floor) {
		this.dest_Floor = dest_floor;
		System.out.println("*** Destination floor is: " + dest_Floor);
		arrive_atFloor();

	}

	private void arrive_atFloor() {
		if (current_Floor > dest_Floor) {
			State.Current_State = State.Moving_down;
			System.out.println(State.Current_State);
			current_Floor--;
			System.out.println(String.valueOf(current_Floor));
			while (current_Floor > dest_Floor) {
				current_Floor--;
				System.out.println(String.valueOf(current_Floor));
			}
			if (current_Floor == dest_Floor) {
				State.Current_State = State.Idle;
			}
		}
		
		if (current_Floor < dest_Floor) {
			State.Current_State = State.Moving_up;
			System.out.println(State.Current_State);
			current_Floor++;
			System.out.println(String.valueOf(current_Floor));
			while (current_Floor < dest_Floor) {
				current_Floor++;
				System.out.println(String.valueOf(current_Floor));
			}
			if (current_Floor == dest_Floor) {
				State.Current_State = State.Idle;
				
			}
		}
		
		if (current_Floor == dest_Floor) {
			State.Current_State = State.Idle;
			System.out.println(State.Current_State);
		}
		

		System.out.println("Arrived at Floor " + String.valueOf(current_Floor));

	}

}
