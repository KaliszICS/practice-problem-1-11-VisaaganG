/**
	* File: Lesson 1.11 - Math
	* Author: Visaagan Gunabalachandran
	* Date Created: Feb 24, 2023
	* Date Last Modified: Feb 24, 2023
	*/


import java.util.Scanner; 
public class PracticeProblem {
	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		double num;
		System.out.print("Input a number: ");
		num = input.nextDouble();
		System.out.println(Math.abs(num));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		System.out.print("Input a number: ");
		num1 = input.nextDouble();
		System.out.print("Input another number: ");
		num2 = input.nextDouble();
		num3 = (num1 / num2);
		System.out.println(Math.floor(num3));
		System.out.println(Math.ceil(num3));
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		double num1;
		System.out.print("Input a number: ");
		num1 = input.nextDouble();
		System.out.println(Math.round(Math.sqrt(num1)));

	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		System.out.print("Input a number: ");
		num1 = input.nextDouble();
		System.out.print("Input another number: ");
		num2 = input.nextDouble();
		System.out.println(Math.pow(num1, num2));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		System.out.print("Input a number: ");
		num1 = input.nextDouble();
		System.out.print("Input another number: ");
		num2 = input.nextDouble();
		System.out.print("Input one more number: ");
		num3 = input.nextDouble();
		System.out.println(Math.max(num1, Math.max(num2, num3)));
		System.out.println(Math.min(num1, Math.min(num2, num3)));
		

	}
}
