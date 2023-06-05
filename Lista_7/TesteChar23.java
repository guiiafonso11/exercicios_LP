/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar23 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome = "", sobrenome ="";
			
		System.out.print("Insira seu nome completo: ");
		nome = leia.nextLine();
		
		String[] nome1 = nome.split(" ");
		
		String ultimoNome = nome1[nome1.length - 1];
	
		System.out.println(ultimoNome);
		
		
		
	}
}

