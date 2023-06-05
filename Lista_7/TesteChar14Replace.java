import java.util.Scanner;
public class TesteChar14Replace {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String frase = "", saida = "";
		char caracter;
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine().toLowerCase();
	
		System.out.print("Digite o caracter: ");
		caracter = leiaStr.nextLine().toLowerCase().charAt(0);
	
		frase = frase.replace(caracter, '*');
		
		System.out.println("Saida: " + caracter + " = " + frase);	
			
	}
}

