import java.io.File;

public class Clase1 {

	public static void main(String[] args) {
		File archivo1 = new File("C:\\Usuarios\\René\\Escritorio\\Prueba.txt");
		
		//File archivo2 = new File("C:\\Usuarios\\René\\Escritorio", "Prueba.txt");
		
		File directorio =  new File("C:\\Users\\René\\Desktop\\Prueba"); // ojo con los nombres de las carpetas especiales
		
		//File archivo3 = new File(directorio, "Prueba.txt");
		
		//System.out.println(archivo1.getPath());
		//System.out.println(archivo1.getAbsolutePath());
		//System.out.println(archivo1.isDirectory());		
		//System.out.println(directorio.isDirectory());
		File subdir =  new File(directorio, "subdir");
		subdir.delete();
	}

}
