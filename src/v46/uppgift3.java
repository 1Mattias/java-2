package v46;
//Skriv ett program som l�ser in en f�ljd av tal och multiplicerar ihop dem. 
//Inl�sningen ska avbrytas d� produktens belopp �verstigit 100 000 eller d� 10 st tal skrivits in. 
import java.util.Scanner;

public class uppgift3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		int resultat = 0;
		
		while(true) {
			int x = input.nextInt();
			counter++;
			if(counter == 10) {
				break;
			}
			resultat *= x;
			if(resultat > 100000) {
				break;
			}
			}
			
		}
	}
