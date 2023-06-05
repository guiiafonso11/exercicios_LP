/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class VendasEfetuadas {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o salário fixo: ");
		double salarioFixo = leia.nextDouble();
		
		System.out.println("Digite o valor das vendas efetuadas: ");
		double valorVendas = leia.nextDouble();
		

		
		if(valorVendas <= 1500 ){
				double percentualMenor = 3.0 / 100.0;
				double valorFinal = valorVendas + (percentualMenor * valorVendas);
			
				System.out.println("Salário Total: " + valorFinal);
		}else{
				double percentualMenor = 5.0 / 100.0;
				double valorFinal = valorVendas + (percentualMenor * valorVendas);
				System.out.println("Salário Total: " + valorFinal);
		}
		
	}
}

