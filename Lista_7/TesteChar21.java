/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar21 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		
		
		String frase = leia.nextLine();
		
		
		for(int i = 0;i < frase.length();i++){
			
			if(frase.charAt(i) == ' '){
				System.out.print("\n");
			}
			
			else{
				System.out.print(frase.charAt(i));
			}
		}
}
}
