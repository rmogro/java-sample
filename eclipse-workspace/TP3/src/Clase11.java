import java.util.Scanner;

public class Clase11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		
		int[] vector = { 10,	-1,	0,	15,	100, -100,	53 };
		
		System.out.println("Ingrese el elemento a buscar: ");
		int x = teclado.nextInt();
		
		int i = 0;
		boolean encontrado = false;
		int pos = -1;
		while(i < vector.length && !encontrado) {
			if(vector[i] == x) {
				encontrado = true;
				pos = i;
			}
			i++;
		}
		
		if(pos != -1) {
			System.out.println("Se Encontro");
			System.out.println("POS: " + pos);
		}
		else {
			System.out.println("No se Encontro");
		}				
	}	
}
