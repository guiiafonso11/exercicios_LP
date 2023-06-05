/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class Array09 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner( System.in );
		int soma = 0;
		int aux = 0;
		int pares = 0;
		
		int [] vetorF = new int [5];
		do{
		
		// ELEMENTOS DO VETOR 1
		
		
		System.out.println("\n...Insira os elementos dos vetor ...\n");
		
		
		
		for(int i = 0; i < vetorF.length; i++){
			
			System.out.print("Insira os elementos do vetor: ");
			vetorF[i] = leia.nextInt();

			if(vetorF[i] % 2 == 0){
				pares++;
				int [] vetorH = new int [pares];
				aux=vetorF[i];
			}
			if(vetorF[i] % 	2 != 0){
					
					soma++;
					
			}
			
		}
		if(soma == vetorF.length){
			
			System.out.print("O vetor nao possue nenhum elemento par...");
			break;
		}
			
			
			// VALORES DO VETOR 
			
			
			
			System.out.println("\n...Valores do vetorF...\n");
			
			
		for(int i = 0; i< vetorF.length; i++){
			
			System.out.println("["+i+"] > " +  vetorF[i]);
			

		}
			
		System.out.println("Tamanho do vetor H: " + aux);	
		break;
		
		
	}
	while(true);
	
	}
}

