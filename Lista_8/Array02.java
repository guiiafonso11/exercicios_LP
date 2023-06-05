/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class Array02 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int[] vetorB = new int [15];
		
		// Entrando com os valores		
		for(int i = 0; i< 15; i++){
			
			System.out.print("Insira um valor: ");
			vetorB[i] = leia.nextInt();
		}
		
		for(int i = 14; i >= 0; i--){
			
			System.out.println(i + " > " + vetorB[i]);
			
		}
		
	
	}
}

