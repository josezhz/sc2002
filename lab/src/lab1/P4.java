package lab1;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter height: ");
		int height = myScanner.nextInt();

		String line = "AA";
		for (int i = 0; i < height; i++) {
			System.out.println(line);
			if (line.charAt(0) == 'A') {
				line = "BB" + line;
			} else {
				line = "AA" + line;
			}
		}
	}

}
