import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese 1 si viaja durante el día");
		System.out.println("Ingrese 2 si viaje durante la noche");
		System.out.println("Tipo Tarifa: ");
		int tipoTarifa = teclado.nextInt();
		
		System.out.println("Cantidad de metros: ");
		float metros = teclado.nextFloat();		
		
		Taxi objetoTaxi = new Taxi(10, 458, tipoTarifa);
		System.out.println("Precio: " + objetoTaxi.calcularTotalPagar(metros));
		
		objetoTaxi.cambiarTarifa();
		
		System.out.println("Precio: " + objetoTaxi.calcularTotalPagar(metros));
	}

}
