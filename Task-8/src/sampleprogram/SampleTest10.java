package sampleprogram;

import java.util.Scanner;

public class SampleTest10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer");

		String number = sc.nextLine();

		int numDigits = String.valueOf(number).length();

		System.out.println("Number of digits in an integer " + numDigits);

	}

}
 