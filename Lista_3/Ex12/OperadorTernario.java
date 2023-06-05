/* Guilherme Afonso de Oliveira Ramos */

public class OperadorTernario {
	
	public static void main (String[] args) {
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 100);
		System.out.println("A= " + a + "\n" + "B= " + b);
		System.out.println(a>b? "a>=b" :a<b? "a<b": b );
		 
	}
}

