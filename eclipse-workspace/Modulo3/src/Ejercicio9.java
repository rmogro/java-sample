
public class Ejercicio9 {

	public static void main(String[] args) {
		ArrayPila pila = new ArrayPila(10);
		pila.push(10);
		pila.push(15);
		pila.push(6);
		pila.push(8);
		pila.push(9);
		System.out.println(pila.peek());
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}		
	}

}
