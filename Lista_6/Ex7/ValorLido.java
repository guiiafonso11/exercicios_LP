/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class ValorLido{
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		int valor = leia.nextInt();
		
		if(valor <= 0){
				System.out.println("Digite um valor valido!");
		}else{
			
		
			for (int i = 1; i <= 10; i++){ 
		System.out.println(valor +" x "+ i  +" = "+i*valor);
			}
		}
	}
}

