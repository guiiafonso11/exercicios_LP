/* Guilherme Afonso de Oliveira Ramos */
import java.util.Scanner;
public class TesteChar19 {
	
	public static void main (String[] args) {
		
		boolean palavraPalindroma = true;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		
		String palavra = ler.nextLine();
		
		for(int i = 0;(i < palavra.length()) && (palavraPalindroma == true);i++){
			
			if(palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1) || palavra.charAt(i) == ' '){
				palavraPalindroma = false;
			}
		}
		System.out.print("A palavra digitada " + (palavraPalindroma ? " " : "nao ") + "e palindroma");
}
}
