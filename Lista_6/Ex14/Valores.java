/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Valores {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int s = 0;
		int x;
		
		System.out.print("Digite um numero: ");
		int v1 = leia.nextInt();
		
		System.out.print("Digite um numero: ");
		int v2 = leia.nextInt();
		
		if(v2>v1){
		
		for(x = v1; x <= v2; x++){
			
			s=s+x;
		
		}
		System.out.println("a soma deste numeros e dos numeros que estão entre eles é: " + s);
		}
		
	}
}

