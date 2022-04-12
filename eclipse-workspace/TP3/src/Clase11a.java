import java.util.Scanner;

public class Clase11a {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		
		int[] vector = { 10,	-1,	0,	15,	100, -100,	53 };
		
		int aux;
		for(int i = 0; i < vector.length - 1; i++) { // i = 0 ... n-1
			for(int j = i + 1; j < vector.length; j++) { // j = i+1 ... n
				if(vector[j] < vector[i]) {
					aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}		
		
		for(int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}				
	}	
}
