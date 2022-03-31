
public class Ejercicio3 {

	public static void main(String[] args) {
		// Esta solucion no es la correcta
		// da una idea de como encarar el algoritmo
		int num1 = 100;
		int num2 = 2;
		int num3 = 5230;
		
		if(num1 > num2 && num1 > num3) {  // && Operador logico: AND
			System.out.println(num1);
		}
		else {
			if(num2 > num1 && num2 > num3) {
				System.out.println(num2);
			}
			else {
				System.out.println(num3);
			}
		}		
	}

}
