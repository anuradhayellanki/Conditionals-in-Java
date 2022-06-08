/**
 * 
 */
package com.cashapona.conditionals.jun03;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class NestedIfElseStatement {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int number1=sc.nextInt();
		System.out.println("Enter second number");
		int number2=sc.nextInt();
		System.out.println("Enter third number");
		int number3=sc.nextInt();
		if((number1>number2)&(number1>number3)){
			System.out.println(number1+" is big");
		}
		if((number2>number1)&&(number2>number3)) {
			System.out.println(number2+" is big");
		}
		if((number3>number1)&&(number3>number2)) {
			System.out.println(number3+" is big");
		}
	}

}
