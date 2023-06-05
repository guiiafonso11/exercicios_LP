/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar18 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner (System.in);
		
		String cadeia = "";
		int contador = 0;
		
		
		System.out.print("Digite uma cadeia de caracteres: ");
		cadeia = leiaStr.nextLine();
		
		for(int i = 0; i < cadeia.length(); i++){
			if(cadeia.charAt(i) == '1' || cadeia.charAt(i) == '0' ){
				contador++;
		}
	}
	if(contador==8 && cadeia.length()==8){
		System.out.print(cadeia + " - e uma sequencia de 8 bits");
	}
	else{
		System.out.print(cadeia + " - nao e uma sequencia de 8 bits");
	}
}
}
