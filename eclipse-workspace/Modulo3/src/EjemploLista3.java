import java.util.LinkedList;
import java.util.Queue;

public class EjemploLista3 {

	public static void main(String[] args) {
	    Queue<Integer> cola = new LinkedList<Integer>();
	    System.out.println("Agregando valores");
	    for(int i = 0; i < 5; i++) {
	    	cola.add(i);
	    }
	    
	    System.out.println("Tama�o inicial de la cola: " + cola.size());
	    System.out.println("Primer elemento en la cola: " + cola.peek());
	    
	    while(!cola.isEmpty()) {
	    	System.out.println("	Elemento retirado de la cola: " + cola.poll());
	    	System.out.println("	Tama�o de la cola: " + cola.size());		    
	    }
	    
	    System.out.println("Tama�o final de la cola: " + cola.size());	   
	}

}
