/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class Array07 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner( System.in );
		
		int maior = 0;
		int menor = 0;
		
		do{
			
		System.out.print("Insira o tamanho do vetor E (N<=20): ");
		int tamanho = leia.nextInt();
		int [] vetorE = new int [tamanho];
		
		if(vetorE.length>0 && vetorE.length<=20){
			
			// ELEMENTOS DO VETOR 1
		
		
		System.out.println("\n...Insira os elementos dos vetor ...\n");
		
			
			for(int i = 0; i< vetorE.length; i++){
				
				System.out.print("Digite os elementos do vetor: ");
				vetorE[i] = leia.nextInt();
				
				if(i == 0){
					
					maior = vetorE[i];
					menor = vetorE[i];
					
				}
				
				if(vetorE[i] > maior){
					
					maior=vetorE[i];
					
				}
				if(vetorE[i] < menor){
					
					menor=vetorE[i];
				}
			}
			
			
			// VALORES DO VETOR 
			
			
			
			System.out.println("\n...Valores do vetorE...\n");
			
			for(int i = 0; i< vetorE.length; i++){
				
				System.out.println("["+i+"] > " + vetorE[i]);
				
			}
			
			System.out.println("Maior: " + maior + "\nMenor: " + menor);
			
			break;
			
		}
			
			
		}while(true);
	
	}
}

