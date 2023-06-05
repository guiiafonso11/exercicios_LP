/* Guilherme Afonso de Oliveira Ramos */

import java.util.Scanner;
public class Sequencia {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de termos: ");
		int termos = leia.nextInt();
		
		int x = 0;
		termos*=2;
		
		do{
			if(termos>0){
			System.out.print(x + ", ");
			x+=2;
				if(x==termos){
				break;
				}
			}
			else if(termos<0){
				System.out.print("Digite a quantidade de termos novamente: ");
				termos = leia.nextInt();
				termos*=2;
			}
			else{	
			break;
			}
			
			
		}while(true);
		
	}
}

