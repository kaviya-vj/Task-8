package sampleprogram;

import java.util.Scanner;

public class SampleTest1 {
	public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	
 int a= sc.nextInt();
 System.out.println("The value of a = "+a);
 
 int b = sc.nextInt();
 System.out.println("The value of b = "+b);
 
 int c = sc.nextInt();
 System.out.println("The value of c = "+c);
 
 int d =sc.nextInt();
 System.out.println("The value of d = "+d);
 
 int sumab = a+b;
 int sumcd = c +d;
 
 if(sumab>sumcd) {
	 System.out.println("Sum of a and b is greater than sum of c and d");
	 
 }
 else {
	 System.out.println("Sum of a and b is not greater than sum of c and d");
 }
	
	}
	
}
