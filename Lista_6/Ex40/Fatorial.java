/* Guilherme Afonso de Oliveira Ramos */

import java.util.Scanner;
public class Fatorial {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o numero fatorial: ");
		int x = leia.nextInt();
		
		int f = x;
		
		
		
		while (x > 1){ 
             f = f *(x-1);
             x--;
	}
	System.out.println(f);
}
}

