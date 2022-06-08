/**
 * 
 */
package com.cashapona.conditionals.jun03;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class FebonaciiSeriesWithWhileLoop {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number1=0,number2=1,number3;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("How many fabonacii series you want using while");
		int num=sc.nextInt();
		System.out.println("Fabonacii series upto "+num);
		int i=0;
		while(i<num) {
			System.out.print(number1+"  ");
			number3=number1+number2;
			number1=number2;
			number2=number3;
			i++;
		}
	}

}
