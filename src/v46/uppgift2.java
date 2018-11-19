package v46;

//Skapa ett program som läser in textrader från 
//konsolen och avslutas när texten EXIT skrivs in.
import java.util.Scanner;

public class uppgift2 {

	public static void main(String[] args) {
		Scanner patte = new Scanner(System.in);
		boolean bigman = true;
		
		while(bigman) {
			String text = patte.next();
			if(text .equals("exit")) {
				bigman = false;
		
			}
			
		}

	}

}
