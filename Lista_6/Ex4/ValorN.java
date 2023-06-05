/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class ValorN {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		int n = leia.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.print(i + " ");
		}
		if(n <= 0){
			System.out.print("Digite um valor valido");
		}
	}
}

