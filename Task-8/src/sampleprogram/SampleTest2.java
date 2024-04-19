package sampleprogram;

import java.util.Scanner;

public class SampleTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("The given number is an even");
		} else {
			System.out.println("The give number is not an even number");
		}
	}

}
