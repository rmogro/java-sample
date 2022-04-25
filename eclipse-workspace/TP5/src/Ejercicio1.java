import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {	
		Scanner teclado = new Scanner(System.in);	
		
		System.out.println("Ingrese el coeficiente a: ");		
		double a = teclado.nextDouble();
		
		System.out.println("Ingrese el coeficiente a: ");
		double b = teclado.nextDouble();
		
		System.out.println("Ingrese el coeficiente a: ");
		double c = teclado.nextDouble();
		
		EcuacionCuadratica ec = new EcuacionCuadratica(a, b, c);
			
		System.out.println("DISCRIMINANTE = " + ec.getDiscriminante());
		
		if(ec.tieneRaiz()) {
			System.out.println("UNICA SOLUCION");
			System.out.println("X = " + ec.getX1());
		}
		else if (ec.tieneRaices()) {
			System.out.println("DOS SOLUCIONES");
			System.out.println("X1 = " + ec.getX1());
			System.out.println("X2 = " + ec.getX2());
		}
		else {
			System.out.println("SIN SOLUCION");
		}		
	}
}
