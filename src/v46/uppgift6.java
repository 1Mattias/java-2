package v46;
//Skapa ett program som skriver ut en pyramid efter att anv�ndaren matat in antal rader pyramidens bas ska vara.
//Bas: 4
//   x
//  x x
// x x x
//x x x x

import java.util.Scanner;

public class uppgift6 {

	public static void main(String[] args) {
	
	      Scanner Patte = new Scanner(System.in);

	        int base = Patte.nextInt();

	        for(int i = 0; i<base; i++){
	            for(int j = base - i; j>1; j--){ 
	                System.out.print(" ");
	            }

	            for(int j = 0; j <= i; j++){ 
	                System.out.print("X ");
	            }

	            System.out.println(); 
	        }
	    }
	}