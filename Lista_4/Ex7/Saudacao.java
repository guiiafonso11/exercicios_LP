/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
import java.lang.Math;
public class Saudacao {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in); 
		
		int opcao;
		double horas;
		
		
		System.out.println("Escolha uma opcao: " + "\n" + "1 - Digite a hora manualmente " + "\n" + "2 - Gerar horario aleatoriamente");
		opcao = leia.nextInt();
		
		if(opcao == 1 || opcao == 2){
			if(opcao==1){
				System.out.println("Digite a hora: ");
				horas = leia.nextInt();
				
				if(horas>=0 && horas<=6){
					System.out.println("ZZZZZZ, As Horas: " + horas  + " Horas");
				}
				if(horas<=11 && horas>=7){
					System.out.println("Bom dia,  As Horas: " + horas + " Horas");
				}
				if(horas>=12 && horas<=17){
					System.out.println("Boa Tarde, As Horas: " + horas + " Horas");
				}
				if(horas>=18 && horas<=23){
					System.out.println("Boa Noite, As Horas: " + horas + " Horas");
				}
			}
			if(opcao == 2){
				
				horas = (int) (Math.random() * 24);
				
				if(horas>=0 && horas<=6){
					System.out.println("ZZZZZZ, As Horas: " + horas  + " Horas");
				}
				if(horas<=11 && horas>=7){
					System.out.println("Bom dia,  As Horas: " + horas + " Horas");
				}
				if(horas>=12 && horas<=17){
					System.out.println("Boa Tarde, As Horas: " + horas + " Horas");
				}
				if(horas>=18 && horas<=23){
					System.out.println("Boa Noite, As Horas: " + horas + " Horas");
				}
				
			}
		}else{
			System.out.println("APENAS OPCOES VALIDAS!");
		}
		
	
		}
	}



