
public class ArrayPila2 implements Pila2
{	
	private int[] elementos;
	private int indice;
	
	public ArrayPila2(int tamanio) {
		elementos = new int[tamanio];
		indice = 0;
	}
	
	public void push(int x) {
		elementos[indice] = x;
		indice++;
	}   
	
    public int pop() {
    	indice--;
    	return elementos[indice];    	
    }
    
    public int peek() {
    	return elementos[indice - 1];
    }
    
    public boolean isEmpty() {
    	return indice == 0;
    }
}