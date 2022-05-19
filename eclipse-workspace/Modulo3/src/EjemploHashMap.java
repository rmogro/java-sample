import java.util.ArrayList;
import java.util.HashMap;

public class EjemploHashMap {

	public static void main(String[] args) {
		HashMap<String, String> dic =  new HashMap<String, String>();
		dic.put("AR", "Argentina");
		dic.put("CH", "Chile");
		dic.put("BO", "Bolivia");
		//System.out.println(dic.get("AR"));
		//dic.remove("CH");
		//System.out.println(dic.size());			

		for (String clave : dic.keySet()) {System.out.println(clave);}
		for (String valor : dic.values()) { System.out.println(valor);}
		
		for (String clave : dic.keySet()) {			
			System.out.println(clave + " = " + dic.get(clave));
		}
	}

}
