/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class AprovadoReprovado {
	
	public static void main (String[] args) {
		
		Scanner leia    = new Scanner ( System.in );
		Scanner leiaStr = new Scanner ( System.in );
		
		double nota;
		
		System.out.println("Digite sua nota: ");
		nota = leia.nextDouble(); 
		
		if(nota<0 || nota>10){
			System.out.println("VALOR INVALIDO");
			
		}
		
		else{
			if (nota<6){
		System.out.println("Nota: "+ nota + "\n" + "REPROVADO");}
			else{
		System.out.println("Nota: "+ nota + "\n" + "APROVADO");
	}}
		
	}
}

