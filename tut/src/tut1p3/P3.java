package tut1p3;

import java.util.Scanner;

public class P3 {

	public static void bubble(int a[], int n) {
		int i, j, t;
		for (i = n - 2; i >= 0; i--) {
			for (j = 0; j <= i; j++) {
				if (a[j] > a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}

	public static void main(String[] args) {
		int n, i;
		int a[] = new int[100];
		System.out.print("\n\n Enter number of Integer elements to be sorted: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (i = 0; i <= n - 1; i++) {
			System.out.print("\n\n Enter integer value for element no." + (i + 1) + " : ");
			a[i] = in.nextInt();
		}
		bubble(a, n);
		System.out.print("\n\n Finally sorted array is: ");
		for (i = 0; i <= n - 1; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
