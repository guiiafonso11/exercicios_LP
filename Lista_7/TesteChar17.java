/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar17 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase1 = "", frase2 = "";
		int contador = 0;	
			
			
		System.out.print("Entre com uma frase: ");
		frase1 = leiaStr.nextLine();
		
		System.out.print("Entre com outra frase: ");
		frase2 = leiaStr.nextLine();
			
		if(frase1.equals(frase2)){
				contador++;
		}
		if(contador>0){
		System.out.println("As frases sao iguais");	
		}
		else{
		System.out.println("As frases nao sao iguais");	
		}
	}
}

