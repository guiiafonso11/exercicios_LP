/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class ValorNDois {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		int n = leia.nextInt();
		
		if(n <= 0){
			System.out.print("Digite um valor maior que 0 para N");
		}else{	
			for(int i = 1; i <= n; i++){
			System.out.print(i + " ");
		}
	}
	}
}

