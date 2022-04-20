
public class Persona {
	
	// atributos
	private String nombre;
	private String apellido;
	private int dni;
	private String domicilio;	
	
	public Persona() { // constructor por defecto
		
	}
	
	public Persona(String nom, String ape, int dni, String dom) {
		this.nombre = nom;
		this.apellido = ape;
		this.dni = dni;
		this.domicilio = dom;		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
	
	public void setDomicilio(String value) {
		this.domicilio = value;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public void setDni(int value) {
		this.dni = value;
	}
	
	public void mostarDatos() {
		//System.out.println("Nombre: " + this.apellido + ", " + this.nombre);
		System.out.println("Nombre: " + this.obtenerNombreCompleto());
		System.out.println("DNI: " + this.dni);
		System.out.println("Domicilio: " + this.domicilio);
	}
	
	private String obtenerNombreCompleto() {
		return this.apellido + ", " + this.nombre;		
	}	
	
}
