/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class Array08 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner( System.in );
		
		int soma = 0;
		int pares = 0;
		do{
		
		int [] vetorF = new int [5];
		
		
		// ELEMENTOS DO VETOR 1
		
		
		System.out.println("\n...Insira os elementos dos vetor ...\n");
		
		for(int i = 0; i< vetorF.length; i++){
			
			System.out.print("Insira os elementos do vetor: ");
			vetorF[i] = leia.nextInt();
				
			if(vetorF[i] % 	2 != 0){
					
					soma+=vetorF[i];
					
			}
			if(vetorF[i] % 2 == 0){
				
				pares++;
				
			}
		}
		if(pares == vetorF.length){
			
			System.out.print("O vetor nao possue nenhum elemento impar...");
			break;
		}
			
			
			// VALORES DO VETOR 
			
			
			
			System.out.println("\n...Valores do vetorE...\n");
			
			
		for(int i = 0; i< vetorF.length; i++){
			
			System.out.println("["+i+"] > " +  vetorF[i]);
			

		}	
		System.out.println("A soma dos numeros impares: " + soma);	
		break;
		
		
	}
	while(true);
	
	}
}

