package lab1;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner1 = new Scanner(System.in);
		System.out.print("Enter salary: ");
		int salary = myScanner1.nextInt();
		
		Scanner myScanner2 = new Scanner(System.in);
		System.out.print("Enter merit: ");
		int merit = myScanner2.nextInt();
		
		String grade = null;
		if (salary >= 800) {
			grade = "A";
		} else if (700 <= salary && salary <= 799) {
			if (merit < 20) {grade = "B";}
			else {grade = "A";}
		} else if (650 <= salary && salary <= 699) {
			grade = "B";
		} else if (600 <= salary && salary <= 649) {
			if (merit < 10) {grade = "C";}
			else {grade = "B";}
		} else if (salary <= 599) {
			grade = "C";
		}
		System.out.println("Grade " + grade);
	}

}
