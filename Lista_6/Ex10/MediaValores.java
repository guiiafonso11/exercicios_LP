/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class MediaValores{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		double media = 0;
		double cont = 0;
		double soma = 0;
		
		for(int i = 0; i<10; i++){
			System.out.print("Digite um valor: ");
			int valor = leia.nextInt();
			soma+=valor;
			cont++;
	}
			media = soma/cont;
			System.out.println(media);
		}
	}

