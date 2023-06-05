/* Guilherme Afonso de Oliveira Ramos */


import java.lang.Math;
public class ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		
		int a = (int) (Math.random() * 1000)+1;
		int b = (int) (Math.random() * 20)+1;
		
		System.out.println("Número A: " + a);
		System.out.println("Número B: " + b);
		
		if(a % b == 0){
			System.out.println("A e divisivel: " + (a/b)); 
		}
		else{
			System.out.println("A nao e divisivel: " + (double)a/b); 
		}
		
	}
}

