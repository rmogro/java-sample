import java.util.Random;

public class Alumno extends Persona {
	// atributos
	private float[] notas;
	
	public Alumno() {
		// hago algo o no? super()!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	public Alumno(String nombre, String apellido, int dni, String domicilio) {
		super(nombre, apellido, dni, domicilio);			
		this.notas = new float[3];
	}

	public void generarNotas() {
		Random rand = new Random();
		for (int i = 0; i < this.notas.length; i++) {
			this.notas[i] = rand.nextFloat() * 10; // to do
		}
	}

	public void mostrarNotas() {
		for (int i = 0; i < this.notas.length; i++) {
			System.out.println("Materia[" + i + "] = " + this.notas[i]);
		}
	}	
	
	public void mostarDatos() { // redefinimos el metodo de la clase padre
		super.mostarDatos();
		this.mostrarNotas();
	}	
}
