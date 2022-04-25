
public class Contacto {
	private String nombre;
	private String telefono;	
	
	public Contacto(){
		
	}
	
	public Contacto(String nombre, String telefono){
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String valor){
		this.nombre = valor;
	}
	
	public String getTelefono(){
		return this.telefono;
	}
	
	public void setTelefono(String valor){
		this.telefono = valor;
	}
	
	public boolean equals(Contacto contacto) {		
		return this.nombre.trim().equalsIgnoreCase(contacto.getNombre().trim());			
	}
	
	@Override // sobre escrito
    public String toString() { // esta heredado del Meta Clase: Object
        return "Nombre=" + this.nombre + ", Telefono=" + this.telefono;
    }
    
}
