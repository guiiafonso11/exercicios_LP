/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar28 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com uma palavra: ");
		String palavra1 = leia.nextLine();
		
		System.out.print("Entre com outra palavra: ");
		String palavra2 = leia.nextLine();
		
		String concatenar = palavra1.concat(palavra2);
		
		if(palavra1.length() == palavra2.length()){
			System.out.println("Palavra 1: "  + palavra1);
			System.out.println("Palavra 2: "  + palavra2);
			System.out.println("Resultado: " + concatenar);
			
		}
		else{
			System.out.println("Erro!");
			System.out.println("Palavra 1: "  + palavra1);
			System.out.println("Palavra 2: "  + palavra2);
			
			
		}

			
				
	}

}
