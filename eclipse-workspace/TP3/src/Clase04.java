
public class Clase04 {

	public static void main(String[] args) {
		short[] vector = new short[5]; // tamaño del vector
		vector[0] = 5;
		vector[1] = 10;
		vector[2] = 15;
		vector[3] = 20;
		vector[4] = 25;	
		for(int i = 0; i <= vector.length - 1; i++) {
			System.out.println("Elemento del vector en la posicion[" + i + "]: " + vector[i]); // v[0], v[1], ...v[4]
		}
	}

}
