package lab3;

import java.util.Arrays;

public class Plane {
	private PlaneSeat[] seat = new PlaneSeat[12];
	private int numEmptySeat = 12;

	public Plane() {
		for (int i = 0; i < 12; i++) {
			seat[i] = new PlaneSeat(i + 1);
		}
	}

	private PlaneSeat[] sortSeats() {
		PlaneSeat[] seatCopy = seat.clone();
		for (int x = 11; x > 0; x--) {
			for (int y = 0; y < x; y++) {
				if (seatCopy[y].getCustomerID() > seatCopy[y + 1].getCustomerID()) {
					PlaneSeat tempSeat = seatCopy[y+1];
					seatCopy[y + 1] = seatCopy[y];
					seatCopy[y] = tempSeat;
				}
			}
		}
		return seatCopy;
	}

	public void showNumEmptySeats() {
		if (numEmptySeat == 1) {
			System.out.println("There is 1 empty seat");
		} else {
			System.out.println("There are " + numEmptySeat + " empty seats");
		}
	}

	public void showEmptySeats() {
		if (numEmptySeat == 0) {
			System.out.println("There are no empty seats.");
		} else {
			System.out.println("The following seats are empty:");
			for (PlaneSeat s : seat) {
				if (!s.isOccupied())
					System.out.println("SeatID " + s.getSeatID());
			}
		}
	}

	public void showAssignedSeats(boolean bySeatId) {
		if (numEmptySeat < 12) {
			for (PlaneSeat s : (bySeatId ? seat : sortSeats())) {
				if (s.isOccupied()) {
					System.out.println(
							"SeatID " + s.getSeatID() + " is assigned to CustomerID " + s.getCustomerID() + ".");
				}
			}
		} else {
			System.out.println("No seats assigned.");
		}
	}

	public void assignSeat(int seatId, int cust_id) {
		for (PlaneSeat s : seat) {
			if (s.getSeatID() == seatId) {
				if (s.isOccupied()) {
					System.out.println("Seat already assigned to a customer.");
					break;
				} else {
					s.assign(cust_id);
					numEmptySeat--;
					System.out.println("Seat Assigned!");
					break;
				}
			}
		}
	}

	public void unAssignSeat(int seatId) {
		for (PlaneSeat s : seat) {
			if (s.getSeatID() == seatId) {
				s.unAssign();
				numEmptySeat++;
				System.out.println("Seat Unassigned!");
				break;
			}
		}
	}
}
