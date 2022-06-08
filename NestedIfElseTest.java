package com.cashapona.conditionals.jun03;

import java.util.Scanner;
/**
 * @author USER
 */
public class NestedIfElseTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num <100 && num>=1) {
			System.out.println("Its a two digit number");
		}
		else 
			if(num <1000 && num>=100) {
				System.out.println("Its a three digit number");
			}
			else 
				if(num <10000 && num>=1000) {
					System.out.println("Its a four digit number");
				}
				else 
					if(num <100000 && num>=10000) {
						System.out.println("Its a five digit number");			
					}
					else {
						System.out.println("number is not between 1 & 99999");			
		}
	}

}
