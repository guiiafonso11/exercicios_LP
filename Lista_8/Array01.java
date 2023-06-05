/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class Array01 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int[] vetorA;
		vetorA = new int [15];
			
		for(int i = 0; i<vetorA.length; i++){
			
			System.out.print("Insira um valor: ");
			vetorA[i] = leia.nextInt();
		}
		
		System.out.println("Leu os valores : ");
		
		int posicao = 0;
		
		while(posicao < vetorA.length){
			
			System.out.println("["+ (posicao + 1) + "]" + vetorA [posicao]);
			posicao++;
			
		}
	}
}

