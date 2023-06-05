/* Guilherme Afonso de Oliveira Ramos */


import java.lang.Math;
public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		
		int nota = (int) (Math.random() * 10)+1;
		
		if(nota<6){
			System.out.println("Nota: "+ nota + "\n" + "REPROVADO");
		
	}else{
		System.out.println("Nota: "+ nota + "\n" + "APROVADO");
	}}
}

