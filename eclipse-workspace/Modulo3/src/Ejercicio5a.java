import java.io.*;

public class Ejercicio5a {

	public static void main(String[] args) {
		
		// https://beginnersbook.com/2014/01/how-to-read-file-in-java-using-bufferedreader/
		
		String nombreArchivo = "Ejercicio1.txt"; // path relativo		
		//File archivo = new File(nombreArchivo);
		//System.out.println(archivo.getAbsolutePath());
		
		BufferedReader br = null; 
        try {               
            br = new BufferedReader(new FileReader(nombreArchivo));
            int caracterActual = br.read();
            while(caracterActual != -1) { 
            	char ch = (char)caracterActual;            	
                if(!Character.isSpaceChar(ch)) System.out.print(ch); // metodo de la clase / metodo estatico
                caracterActual = br.read(); 
            }  
        } catch (IOException e) {   
            e.printStackTrace();  
        }
        finally {   
            try {   
                if (br != null) br.close();  
            } catch (IOException ex) {
            	System.out.println("Error en el cierre del BufferedReader");
                ex.printStackTrace();  
            } 
        }		
	}

}
