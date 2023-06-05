/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class TrabalhoSemanal {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.print("Quantas horas você trabalhou esse mês: ");
		double horasT = leia.nextDouble();
		
		System.out.print("Digite seu salario por hora: ");
		double salarioHora = leia.nextDouble();
		
		int semana = 40;
		double salarioTotal = salarioHora * horasT;
		
				if(horasT > 160 ){
					double horaExtra = salarioHora * 1.5;
					double salarioTotalExtra = horasT * horaExtra;
					System.out.println("Salário com Hora Extra: " + salarioTotalExtra);
					
				}else{
					System.out.println("Salário: " + salarioTotal);
			}
		
		
	}
}

