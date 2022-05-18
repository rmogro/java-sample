import java.io.*;

public class Ejercicio5b {

	public static void main(String[] args) {
		
		// https://beginnersbook.com/2014/01/how-to-read-file-in-java-using-bufferedreader/
		String nombreArchivo = "Ejercicio1.txt";
		
		BufferedReader br = null; 
        try {               
            br = new BufferedReader(new FileReader(nombreArchivo));
            String lineaActual = br.readLine();
            while(lineaActual != null) {
            	lineaActual = lineaActual.replace(" ", "");
                System.out.println(lineaActual);
                lineaActual = br.readLine(); 
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
