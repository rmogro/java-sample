import java.util.LinkedList;
import java.util.Stack;

public class EjemploLista2 {

	public static void main(String[] args) {
	    Stack<Integer> pila = new Stack<Integer>();
	    System.out.println("Agregando valores");
	    for(int i = 0; i < 5; i++) {
	    	pila.push(i);
	    }
	    
	    System.out.println("Tamaño inicial de la pila: " + pila.size());
	    System.out.println("Primer elemento en la pila: " + pila.peek());
	    
	    while(!pila.isEmpty()) {
	    	System.out.println("	Elemento retirado de la cola: " + pila.pop());
	    	System.out.println("	Tamaño de la cola: " + pila.size());		    
	    }
	    
	    System.out.println("Tamaño final de la cola: " + pila.size());	   
	}

}
