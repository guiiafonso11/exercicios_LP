/* Guilherme Afonso de Oliveira Ramos */
public class Sequencia {
	
	public static void main (String[] args) {
		
		for(int i = 1;i < 11;i++){
			System.out.printf("\n" + i + ", ");
			if(i%2 == 0){
				for(int j = 2;j <= i * 2;j += 2){
					System.out.printf(" " + j);	
				}
			}
			else{
				for(int j = 1;j <= i * 2;j += 2){
					System.out.printf(" " + j);	
				}
			}
		}
	}
}

