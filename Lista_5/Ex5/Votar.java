/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Votar {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int anoAtual = 2022;
		
		System.out.print("Digite seu ano de nascimento: ");
		int anoNasc = leia.nextInt();
		
		int resultado = anoAtual - anoNasc;
		
		if(resultado > 0){
				if(resultado >= 18){
					System.out.println("Você tem: " + resultado + " anos de idade" + "\n" + 
										"VOCÊ PODE VOTAR!");
				}else{
					System.out.println("Você tem: " + resultado + " anos de idade" + "\n" + 
										"VOCÊ NÃO PODE VOTAR!");
				}
		}else{
			System.out.println("DIGITE UM VALOR VÁLIDO");
		}
		
		
	}
}

