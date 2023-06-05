/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Intervalo {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int dentroIntervalo = 0;
		int foraIntervalo = 0;
		
		
			for(int i = 0; i<10; i++){
			System.out.print("Digite um valor: ");
			int valor = leia.nextInt();
			if(valor < 20 && valor > 10){
				dentroIntervalo++;
			}else{
				foraIntervalo++;
			}
		}
			System.out.println("Dentro do intevalo: " + dentroIntervalo);
			System.out.println("Fora do intevalo: "	 + foraIntervalo);
				
	}
}

