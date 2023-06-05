/* Guilherme Afonso de Oliveira Ramos */


import java.util.Scanner;
public class Prefeitura {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double somaSalario = 0, somaFilhos = 0, cont = 0, mediaSalario = 0, mediaFilhos = 0, maior = 0, habitantesMenor = 0;
		System.out.println("Para finalizar o programa digite um numero negativo.");
		
		for(int i = 1; i>=0; i++){
			System.out.println("Digite o salario de cada habitante: ");
			double salario = leia.nextInt();	
			
			
			if(salario>0){
			System.out.println("Digite o numero de filhos desse mesmo habitante: ");
			double filhos = leia.nextInt();
			
			somaSalario+=salario;
			somaFilhos+=filhos;
			
			if(i==0){
				
				maior = salario;
			}
			if(salario>maior){
				
				maior = salario;
			}
			if(salario<150){
				habitantesMenor++;
			}
			
			
			cont++;
			}
			else{
			habitantesMenor = (habitantesMenor * 100) / cont;
			mediaSalario = somaSalario / cont;
			System.out.println("Media de salario da populacao: " + mediaSalario);
			mediaFilhos = somaFilhos / cont;
			System.out.println("Media de filhos da populacao: " + mediaFilhos);
			System.out.println("Maior salario: " + maior);
			System.out.println("Percentual Salario 150: " + habitantesMenor + "%");
			break;
			}
		}
			
		
	}
}

