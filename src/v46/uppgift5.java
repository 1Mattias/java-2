package v46;
//Skapa ett program som med hj�lp av loopar skriver ut f�ljande m�nster:
//x
//xx
//xxx
//xxxx
import java.util.Scanner;
public class uppgift5 {

	public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv in ett nummer");
        int x = input.nextInt();
        stairs(x);
    }
    public static int stairs(int steps){
        char x = 'x';
        for (int i = 0; i < steps; i++ ){
            for (int y = 0; y <= i; y++) {
                System.out.print(x);
            }
            System.out.println();
        }
        return steps;
    }
}

