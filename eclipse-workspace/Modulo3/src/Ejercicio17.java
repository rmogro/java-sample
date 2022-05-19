
public class Ejercicio17 {

	public static void main(String[] args) {
		float base = 2;
		int exp = 5;
	    float resultado = potencia(base, exp);

	    System.out.println(base + "^" + exp + " = " + resultado);
	}
	
	// algoritmo recursivo
	public static float potencia(float base, int exponente) {
	    if(exponente != 0) {
	    	return (base * potencia(base, exponente - 1));
	    }
	    else {
	    	return 1;
	    }
	}
}
