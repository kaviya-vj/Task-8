package sampleprogram;

import java.util.Scanner;

public class SampleTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a % 2 != 0) {
			System.out.println("The given number is a prime number");
		} else {
			System.out.println("The given number is not a prime number");
		}
	}
}
