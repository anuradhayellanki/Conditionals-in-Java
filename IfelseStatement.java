package com.cashapona.conditionals.jun03;
import java.util.Scanner;
/**
 * @author USER
 *
 */
public class IfelseStatement {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number1,number2;
		@SuppressWarnings("resource")
		//read two numbers from keyboard using scanner class
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number");
		number1=scanner.nextInt();
		System.out.println("Enter second number");
		number2=scanner.nextInt();
		//calculate highest number using if condition 
		if(number1>number2) {
			System.out.println(number1+" is highest");
		}
		else {
			System.out.println(number2+" is highest");
		}
	}
}

