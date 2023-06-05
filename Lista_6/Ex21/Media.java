/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Media {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in); 
		
		int maior = 0;
		int menor = 0;
		
		System.out.print("Digite a quantidade de numeros: ");
		int qtd = leia.nextInt()-1;
		
		for(int i = 0; i <= qtd; i++){
		System.out.print("Digite um numero: ");
		int num = leia.nextInt();
		if(i == 0){
			
		maior = num;
		menor = num;
		}
		
		if(num > maior){
			
			maior = num;
		}
		
		if(num < menor){
			
			menor = num;
		}
	}
	
	System.out.print("Maior: "+ maior +". Menor: "+ menor);
		
	}
}

