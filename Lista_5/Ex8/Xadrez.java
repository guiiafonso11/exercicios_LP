/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Xadrez {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite a hora de início do jogo: ");
		int horaInicio = leia.nextInt();
		
		System.out.print("Digite a hora finalizada do jogo: ");
		int horaFinal = leia.nextInt();
		
		int duracaoJogo = horaFinal - horaInicio;
		double dias = duracaoJogo / 24;
		if(duracaoJogo > 0){
			if(duracaoJogo >= 24){
				System.out.println("O jogo teve: " + duracaoJogo + "horas de duracao, totalizando: " + dias + " dias");
			}else{
				System.out.println("O jogo teve: " + duracaoJogo + "horas de duracao");
			}
		}else{
			System.out.println("DIGITE VALORES VALIDOS");
		}
		
	}
}

