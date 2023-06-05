/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class ADivisivelPorB {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		int a;
		int b;
		
		System.out.print("Digite um numero inteiro de 0 ate 1000 : ");
		a = leia.nextInt();
		
		System.out.print("Digite um numero inteiro de 0 ate 20: ");
		b = leia.nextInt();
		
		if(a > 1000 || a < 0 || b > 20 || b < 0){
			System.out.println("VALORES INVALIDOS!!!!");
			
		}
		else{
			if( a % b == 0 ){
				System.out.println("E DIVISIVEL: " + a + " DIVIDIDO POR " + b + " IGUAL A: " +(a/b));
			}else{
				System.out.println("NAO E DIVISIVEL: " + (double)a/b);
			}
		}
		
		
		
	}
}

