package sampleprogram;

import java.util.Scanner;

public class SampleTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int num3 = num1;
		num1 = num2;
		num2 = num3;

		System.out.println("After swapping");
		System.out.println("First number:" + num1);
		System.out.println("Second number:" + num2);
	}

}
