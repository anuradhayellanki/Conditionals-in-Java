package com.cashapona.conditionals.jun03;
public class StudentInforIfElseTest {
	public static void main(String[] args) {
		String address=" Pune, India";
		//nested if statements
		if(address.endsWith("India")) {    
			if(address.contains("Hyderabad")) {    
				System.out.println("Your city is Hyderabad");    
			}
			else if(address.contains("Noida")) {    
					System.out.println("Your city is Noida");    
				}
				else {    
					System.out.println(address.split(",")[0]);    
				}    
			}
		else {    
			System.out.println("You are not living in India");  
			}
		}
	}


