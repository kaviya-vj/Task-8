package sampleprogram;

import java.util.Scanner;

public class SampleTest3 {

	public static void main(String[] args) {

		// No need for Scanner input, so we'll create an instance of Scanner anyway
		Scanner scanner = new Scanner(System.in);

		// Print the alphabets from 'a' to 'z'
		for (char ch = 'a'; ch <= 'z'; ++ch) {
			System.out.print(ch + " ");
		}

		scanner.close();
	}

}
