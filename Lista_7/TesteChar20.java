/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar20 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = leia.nextLine();
        int quantidade = 1;
        
   
		for(int i = 0;i < frase.length();i++){
			if(frase.charAt(i) == ' '){
				quantidade++;
			}
		}

        System.out.println(quantidade + " palavras");
}
}
