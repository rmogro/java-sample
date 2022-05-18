import java.io.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		String nombreArchivo = "numNaturales.txt";	// path relativo
		
		
		File archivo = new File(nombreArchivo);	
		
		try {
			if(archivo.exists()) {
				archivo.delete(); // OJOOOOOOOOOOOOOOOOOOOOOOOO!!!!!!!!!!!!!!!!!				
			}
			archivo.createNewFile();			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		BufferedWriter bw = null; 
        try {        	
            bw = new BufferedWriter(new FileWriter(nombreArchivo));
            for(int i = 1; i <=100; i++) {
            	if(i % 10 == 0) {
            		bw.write(i + "\n");            	
            	}
            	else {
            		bw.write(i + " ");
            	}
            }            
        } catch (IOException e) {   
            e.printStackTrace();  
        }
        finally {   
            try {   
                if (bw != null) bw.close();  
            } catch (IOException ex) {
            	System.out.println("Error en el cierre del BufferedWriter");
                ex.printStackTrace();  
            } 
        }

	}

}
