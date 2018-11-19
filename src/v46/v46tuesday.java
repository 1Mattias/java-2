package v46;

//Skapa ett program som läser in tal från konsolen 
//och när man skriver in talet 0 ska den skriva ut summan av alla tal.

import java.util.Scanner;

public class v46tuesday {

	public static void main(String[] args) {
		
		double tal = 1;
		double summa = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please type a number:");
		
		while(tal != 0) {
			
			
			tal = input.nextDouble();
			summa += tal;
		}
		
		System.out.println("The sum of all numbers is: " + summa);
		
		input.close();
	}

}
