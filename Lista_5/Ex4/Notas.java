/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Notas {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.print("Digite sua primeira nota: ");
		double nota1 = leia.nextDouble();
		
		System.out.print("Digite sua segunda nota: ");
		double nota2 = leia.nextDouble();
	
		double media = (nota1 + nota2) / 2; 
		
		if(media >= 0){
				if(media >= 6){
					System.out.println("SUA NOTA: " + media + "\n" + "PARABÉNS VOCÊ FOI APROVADO!");
				}else{
					System.out.println("SUA NOTA: " + media + "\n" + "INFELIZMENTE VOCÊ NÃO FOI APROVADO!");
				}
		}else{
			System.out.println("DIGITE UM VALOR VÁLIDO");
		}
		
		
	}
}

