/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class MediaAritmedica {
	
	public static void main (String[] args) {
		
		int num1 = 15;
		int num2 = 100;
		int x;
		double s = 0;
		double media;
		double quantidade = 0;
		
		for(x = num1; x <= num2; x++){
			
			s+=x;
			quantidade +=1;
		}
		
		media = s / quantidade;
		
		System.out.print("A media dos numeros: " + media);
		
	}
}

