package sampleprogram;

import java.util.Scanner;

public class SampleTest9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		    
		int age = sc.nextInt();

		if (age >= 60) {
			System.out.println("The person A is a senior citizen");
		} else {
			System.out.println("The person A is not a senior citizen");
		}
	}

}
