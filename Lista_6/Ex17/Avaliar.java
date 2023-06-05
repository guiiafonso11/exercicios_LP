/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Avaliar {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Scanner leitor = new Scanner (System.in);
		
		do{
		String novoCalculo = "S";
		System.out.print("Digite a nota da a1: ");
		double a1 = leia.nextInt();
		
		System.out.print("Digite a nota da a2: ");
		double a2 = leia.nextInt();
		double media;
		
		if(a1 >= 0 && a1 <= 10 && a2 >=0 && a2 <=10){
			media = (a1 + a2) / 2;
			System.out.println("A media: " + media);
			
			System.out.print("NOVO CALCULO (S/N)?");
			novoCalculo = leitor.next();	
			if(novoCalculo.equals("S") ){
				System.out.println("Digite as notas novamente!");
			}
			else{
				break;
			}
		}
		}while(true);
			
				
				
			
	

	}
}

