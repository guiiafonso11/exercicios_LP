/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar24 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String sequencia = "";
		int quantidade = 0;
		int maiorQuantidade = 0;
		
		System.out.print("Entre com a sequencia de bits: ");
		sequencia = leia.nextLine();
		
		for(int i = 0; i< sequencia.length(); i++){
			
			if(sequencia.charAt(i) == '1'){
				quantidade++;
				
			}else{
				quantidade = 0;
				
			}
			maiorQuantidade = (Math.max(maiorQuantidade, quantidade));
			
		}
		System.out.print(maiorQuantidade + " Vezes");
		
	}
}

