/* Guilherme Afonso de Oliveira Ramos */

import java.util.Scanner;
public class Sequencia {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de termos: ");
		int termos = leia.nextInt();
		
		int x = 1;
		int aux = 0;
		
		do{
			if(termos>0){
			System.out.printf(aux + "/" + x + ", " );
			aux++;
			x++;
			}
			else if(termos<0){
				System.out.print("Digite a quantidade de termos novamente: ");
				termos = leia.nextInt();
			}
			else{	
			break;
			}
			
		}while(x<=termos);
		
	}
}

