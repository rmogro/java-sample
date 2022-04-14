
public class Persona {
	
	// atributos
	private String nombre;
	private String apellido;
	private int dni;
	private String domicilio;
	
	public Persona() {
		
	}
	
	public Persona(String nom, String ape, int dni, String dom) {
		this.nombre = nom;
		this.apellido = ape;
		this.dni = dni;
		this.domicilio = dom;
	}
	
	public void mostarDatos() {
		System.out.println("Nombre: " + this.apellido + ", " + this.nombre);
		System.out.println("DNI: " + this.dni);
		System.out.println("Domicilio: " + this.domicilio);
	}	
	
}
