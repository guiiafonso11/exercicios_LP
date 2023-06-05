/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class MaiorMenor {
	
	public static void main (String[] args) {
		
	Scanner in = new Scanner(System.in);
	int a = 0, maior = 0, menor = 0;

	for(int x = 0; x < 4; x++){
		
		System.out.println("Insira um valor:");
		a = in.nextInt();
		
		if(x == 0){
			
			maior = a;
			menor = a;
		}
		
		if(a > maior){
			
			maior = a;
		}
		
		if(a < menor){
			
			menor = a;
		}
	}
	
	System.out.print("Maior: "+ maior +". Menor: "+ menor);

	}
}

