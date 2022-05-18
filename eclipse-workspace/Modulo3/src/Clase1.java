import java.io.IOException;

public class Clase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		int contador = 0;
		System.out.println("se lee hasta encontrar el fin de línea: ");
		try {
			while( ( c = System.in.read() ) != '\n'){
				contador++;
				System.out.println("compilador: " + c);
				System.out.println("usuario: " + (char)c);
			}
			System.out.println();
			System.out.println(contador);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
