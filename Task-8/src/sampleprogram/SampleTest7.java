package sampleprogram;

import java.util.Scanner;

public class SampleTest7 {

	public static void main(String[] args) {

		Scanner UserInput = new Scanner(System.in);

		String ln = UserInput.nextLine();

		int length = ln.length();

		System.out.println("Length of the input String is " + length);
	}

}
