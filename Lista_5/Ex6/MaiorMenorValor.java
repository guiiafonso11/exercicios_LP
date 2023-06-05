/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class MaiorMenorValor{
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		int valor1 = leia.nextInt();
		
		System.out.print("Digite outro valor: ");
		int valor2 = leia.nextInt();
		
		if(valor1 > valor2 || valor2 > valor1){
			if(valor1 > valor2){
				System.out.println("Valores: " + "\n" + "1: " + valor1 + "\n" + "2: " + valor2);
				System.out.println("O Primeiro Número digitado é maior que o Segundo" + valor1);
		}else{
				System.out.println("Valores: " + "\n" + "1: " + valor1 + "\n" + "2: " + valor2);
				System.out.println("O Segundo Número digitado é maior que o Primeiro" + valor2);
		}
			}else{
				System.out.println("Valores: " + "\n" + "1: " + valor1 + "\n" + "2: " + valor2);
				System.out.println("OS NÚMEROS SÃO IGUAIS");
			}
		
	}
}

