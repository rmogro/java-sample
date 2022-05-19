
public class Ejercicio18 {

	public static void main(String[] args) {
		int n = 0;
	    int resultado = factorial(n);

	    System.out.println("factoria(" + n + ") = " + resultado);
	}
	
	public static int factorial(int n) {
	    if(n != 0) {
	    	return (n * factorial(n - 1));
	    }
	    else {
	    	return 1;
	    }
	}
}
