/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar13 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String alfabeto = "";
		
		for(char letra = 'a' ; letra<='z'; letra++){
			
			alfabeto+=letra;
		}
		//bcdfghjklmnpqrstvwxyz
		System.out.println(alfabeto);	
			
			
	}
}

