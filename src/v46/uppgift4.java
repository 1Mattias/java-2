package v46;
//Skriv ett program som beräknar summan av alla tal under 10 000 som är jämnt delbara med 7. 
//7, 14, 21, 28 osv
import java.util.Scanner;

public class uppgift4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int tal = 0;
		int resultat = 0;
		
		while(tal <= 10000) {
			if(tal % 7 ==0)
				resultat += tal;
			tal++;
		}
		System.out.println(resultat);
	}

}
