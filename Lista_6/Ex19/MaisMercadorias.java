/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class MaisMercadorias {
	
	public static void main (String[] args) {
	
		Scanner leia = new Scanner (System.in);
		Scanner leitor = new Scanner (System.in);	
		
		double cont = 0;
		double soma = 0;
		double media =0;
		
		do{
		System.out.print("Digite o valor da mercadoria: ");
		double valorMercadoria = leia.nextDouble();
		
		System.out.print("MAIS MERCADORIAS? (S/N)");
		String maisMercadorias = leitor.next();
	
		soma+=valorMercadoria;
		cont++;
		
		if(maisMercadorias.equals("S")){
			System.out.print("");
			System.out.println("Digite o preço das novas mercadorias: ");
	
		}
		else if(maisMercadorias.equals("s")){
			System.out.print("");
			System.out.println("Digite o preço das novas mercadorias: ");
			
		}
		else{
			media = soma/cont;
			System.out.println("Valor Total:" + soma);
			System.out.println("Media de valor das mercadorias: " + media);
			break;
		
		}
		
		
	}while(true);
}
}
		
		
		



