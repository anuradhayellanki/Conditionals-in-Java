package com.cashapona.conditionals.jun03;
import java.util.Scanner;
/**
 * @author USER
 */
public class FebinaciiWithForLoop {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number1=0,number2=1,number3;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("How many fabonacii series you want using for loop");
		int num=sc.nextInt();
		System.out.println("Fabonacii series upto "+num);
		for(int i=0;i<num;i++) {
			System.out.print(number1+"  ");
			number3=number1+number2;
			number1=number2;
			number2=number3;
		}

	}
}