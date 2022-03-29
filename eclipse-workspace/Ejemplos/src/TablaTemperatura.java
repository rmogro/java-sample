import java.util.Scanner;

public class TablaTemperatura {

	public static void main(String[] args) {
		double fahrenheit;
		
		System.out.println("	Tabla de Conversión");
		System.out.println("C°				F°");
		System.out.println("====================================");
		for(int celsius = 0; celsius <= 100; celsius = celsius + 5) { // celsius += 5;
			fahrenheit =  (celsius * 9 / 5.0) + 32;
			System.out.println(celsius + "				" + fahrenheit);
		}	
	}
	
}
