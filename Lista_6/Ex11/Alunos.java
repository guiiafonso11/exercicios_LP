/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Alunos {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		double soma = 0;
		double media = 0;
		double cont = 0;
		
		System.out.print("Digite a quantidade de alunos: ");
		int QtdAlunos = leia.nextInt();
		
		for(int i = 0; i < QtdAlunos; i++){
			System.out.print("Digite a nota dos alunos: ");
			int nota = leia.nextInt();
			soma+=nota;
			cont++;
		}
			media = soma / cont;
			System.out.print("Media: " + media);
		
	}
}

