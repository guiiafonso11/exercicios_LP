/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class Array05 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		
		do{
			
		System.out.print("Insira o numero de posicoes do primeiro vetor (Obs: tem que ser menor ou igual a 15): ");
		int qtdPosicoesVetor1 = leia.nextInt();
		
		int [] vetor1 = new int [qtdPosicoesVetor1];
		
		System.out.print("Insira o numero de posicoes do primeiro vetor (Obs: tem que ser menor ou igual a 15): ");
		int qtdPosicoesVetor2 = leia.nextInt();
		
		int [] vetor2 = new int [qtdPosicoesVetor2];
		
		int somaVetores = vetor1.length + vetor2.length;
		
		if(vetor1.length <= 15 && vetor2.length <= 15){
			
			int [] vetor3 = new int [somaVetores];
			
			System.out.println("Tamanho do novo vetor: " + vetor3.length);
			
			break;
			
		}else{
			System.out.println("Digite um valor valido!");
			
		}
		
	
	}while(true);
	
	}
}

