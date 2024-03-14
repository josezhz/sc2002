package lab3;

import java.util.Scanner;

public class PlaneApp {
	public static void main(String[] args) {
		Plane plane = new Plane();
		int option;

		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("  Enter the number of your choice: ");
			option = sc.nextInt();

			switch (option) {
			case 1:
				plane.showNumEmptySeats();
				break;
			case 2:
				plane.showEmptySeats();
				break;
			case 3:
				plane.showAssignedSeats(false);
				break;
			case 4:
				plane.showAssignedSeats(true);
				break;
			case 5:
				System.out.println("Assigning Seat ..");
				int seatId, cust_id;
				do {
					System.out.print("  Please enter SeatID: ");
					seatId = sc.nextInt();
				} while (seatId < 1 || 12 < seatId);
				do {
					System.out.print("  Please enter CustomerID: ");
					cust_id = sc.nextInt();
				} while (cust_id <= 0);
				plane.assignSeat(seatId, cust_id);
				break;
			case 6:
				do {
					System.out.print("  Enter SeatID to unassign customer from: ");
					seatId = sc.nextInt();
				} while (seatId < 1 || 12 < seatId);
				plane.unAssignSeat(seatId);
				break;
			case 7:
				break;
			}
		} while (1 <= option && option <= 6);
	}
}
