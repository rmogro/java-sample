import java.util.ArrayList;
import java.util.Iterator;

public class EjemploLista1 {

	public static void main(String[] args) {
	    ArrayList<String> autos = new ArrayList<String>();
	    autos.add("Volvo");
	    autos.add("BMW");
	    autos.add("Ford");
	    autos.add("Mazda");	    
	    
	    System.out.println("=============== Indice =================");
	    
		for(int i = 0; i < autos.size(); i++) {
			System.out.println(autos.get(i));
		}	 
		
		System.out.println("================= Foreach ===============");
		
	    for(String item: autos) {
	    	System.out.println(item);
	    }
	    
	    System.out.println("=============== Iterador =================");
	    
	    Iterator<String> iter = autos.iterator();

	    while(iter.hasNext()) {
	    	System.out.println(iter.next());
	    }
	}

}
