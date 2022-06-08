package com.cashapona.conditionals.jun03;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class SwitchCaseTest {
	static void addition(int num1, int num2) {
		System.out.println("First number : "+num1);
		System.out.println("Second number : "+num2);
		int sum=num1+num2;
		System.out.println("Addition of "+num1+" and "+num2+" : "+sum);
	}
	static void subtraction(int num1, int num2) {
		System.out.println("First number : "+num1);
		System.out.println("Second number : "+num2);
		int sub=num1-num2;
		System.out.println("Subtraction of "+num1+" and "+num2+" : "+sub);
	}
	static void multiplication(int num1, int num2) {
		System.out.println("First number : "+num1);
		System.out.println("Second number : "+num2);
		int mul=num1*num2;
		System.out.println("Multiplication of "+num1+" and "+num2+" : "+mul);
	}
	static void division(int num1, int num2) {
		System.out.println("First number : "+num1);
		System.out.println("Second number : "+num2);
		try {
			int div=num1/num2;
			System.out.println("Division of "+num1+" and "+num2+" : "+div);
		}
		catch(Exception e) {
			System.out.println("Division not possible");
		}
	}
	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1=sc.nextInt();
		System.out.println("Enter second number : ");
		int num2=sc.nextInt();
		int ch=0;
		do {
			System.out.println("Menu");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.exit");
			System.out.println("Enter your chioce : ");
			ch=sc.nextInt();
			switch(ch) {
				case 1: 
					addition(num1,num2);
					break;
				case 2: 
					subtraction(num1,num2);
					break;
				case 3: 
					multiplication(num1,num2);
					break;
				case 4: 
					division(num1,num2);
					break;
				case 5:
					break;
				default: 
					System.out.println("Try again later, invalid selecton : ");
				}
			}
			while(ch!=5);
	}
}