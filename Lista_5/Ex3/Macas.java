/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Macas {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double precoMenosD = 1.30;
		double precoMaisD = 1.00; 
		
		System.out.print("PREÇO DAS MAÇÃS: 1,30 -> MENOS DE UMA DÚZIA" + "\n" + 
							"PREÇO DAS MAÇÃS: 1,00 -> PELO MENOS UMA DÚZIA" + "\n" +
							"DIGITE A QUANTIDADE DE MAÇÃS QUE VOCÊ PRECISA: ");
		int quantidade = leia.nextInt();
		
		if(quantidade > 0){
				if(quantidade < 12){
					double total = precoMenosD * quantidade;
					System.out.println("TOTAL: " + total);
				}else{
					double total = precoMaisD * quantidade;
					
					System.out.println("TOTAL: " + total);
				}
			
		}else{
			System.out.println("DIGITE UM VALOR VÁLIDO");
		}
		
		
		
	}
}

