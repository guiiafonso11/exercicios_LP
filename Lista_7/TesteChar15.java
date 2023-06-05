/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar15 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "", saida = "";
		char caracter;
		int contador = 0;
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine().toLowerCase();
	
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) >= '0' && frase.charAt(i) <= '9'){
				
				contador++;
			}

		}
		if(contador>0){
		System.out.println("A frase tem "+ contador + " caracteres numericos");	
		}
		else{
		System.out.println("A frase nao tem caracteres numericos");		
		}
			
	}
}

