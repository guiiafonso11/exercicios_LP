/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class MaiorMenor {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int valor = leia.nextInt();
		
		if(valor > 10){
			System.out.println("É MAIOR QUE 10; VALOR: " + valor);
			
		}else{
			System.out.println("NÃO É MAIOR QUE 10; VALOR: " + valor);
		}
		if(valor == 10){
			System.out.println("O VALOR É IGUAL A DEZ; VALOR: " + valor);
		}
	}
}

