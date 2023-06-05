/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class Array04 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		
		do{
			
		System.out.print("Insira o numero de posicoes do vetor (Obs: tem que ser menor ou igual a 20): ");
		int quantidadePosicoes = leia.nextInt();
		
		int [] vetorD = new int [quantidadePosicoes];
		
		
		
		if(vetorD.length <= 20){
			
			for(int i = 0; i<vetorD.length; i++){
			
			System.out.print("Insira os elementos do vetor: ");
			vetorD[i] = leia.nextInt();
			}
			System.out.println("Leu os valores: ");
			for(int i = 0; i<vetorD.length; i++){	
			System.out.println(i + " > " + vetorD[i]);	
			}
			break;
			
		}else{
			System.out.println("Digite um valor valido!");
			
		}
		
	
	}while(true);
	
	}
}

