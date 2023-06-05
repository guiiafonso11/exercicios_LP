/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class Array06 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner( System.in );
		
		do{
			
		System.out.print("Insira o numero de posicoes do primeiro vetor (Obs: tem que ser menor ou igual a 15): ");
		int qtdPosicoesVetor = leia.nextInt();
		
		int [] vetor1 = new int [qtdPosicoesVetor];
		
		int [] vetor2 = new int [qtdPosicoesVetor];
	
		if(vetor1.length <= 15 && vetor2.length <= 15){
		
		// ELEMENTOS DO VETOR 1
		
		
		System.out.println("\n...Insira os elementos dos vetor 1...\n");
		
		for(int i = 0; i< vetor1.length; i++){
			
			System.out.print("Insira os elementos do vetor1: ");
			vetor1[i] = leia.nextInt();
			
		}
		
		// ELEMENTOS DO VETOR 2
		
		
		System.out.println("\n...Insira os elementos do vetor 2...\n");
			
		for(int i = 0; i< vetor2.length; i++){	
				
			System.out.print("Insira os elementos do vetor2: "); 	
			vetor2[i] = leia.nextInt();
			
			
		}
		
		// VALORES DO VETOR 1
		
			System.out.println("\n...Valores do vetor1...\n");
			
		for(int i = 0; i < vetor1.length; i++){
			
			System.out.println("["+i+"] > " + vetor1[i]);
			 
		}
		
		// VALORES DO VETOR 2
		
		
			System.out.println("\n...Valores do vetor2...\n");
			
		for(int i = 0; i < vetor2.length; i++){
			
			System.out.println("["+i+"] > " + vetor2[i]);
			 
		}
		
		
		//COMPARANDO OS ELEMENTOS
		
		
		System.out.println("Comparando os elementos do vetor1 com o vetor2");
		
		for(int i = 0; i < vetor1.length; i++){
			
			
			
		if(vetor1[i] == vetor2[i]){
			
			System.out.println("Elemento: " + vetor1[i] + " igual em ambos os vetores, na posicao: " + i);  
			
			break;
			
		}
		}	
	}	
		else
		{
			
			System.out.println("Digite um valor valido!");
			
		}
		
	
	}while(true);
	
	}
}

