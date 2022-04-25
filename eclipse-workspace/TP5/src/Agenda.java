
public class Agenda {
	private Contacto[] listaContactos;
	private int tamano; // puede ir
	//private int cantOcupados;
	
	public Agenda() {
		this.listaContactos = new Contacto[10];
		//this.cantOcupados = 0;
	}
	
	public Agenda(int tamano) {
		this.listaContactos = new Contacto[tamano];
		//this.cantOcupados = 0;
	}
	
	public void anadirContacto(Contacto c) {
		 
        if (existeContacto(c)) { //Indico si existe el contacto
            System.out.println("El contacto con ese nombre ya existe");
        } else if (agendaLlena()) { //Indico si la agenda esta o no llena
            System.out.println("La agenda esta llena, no se pueden meter mas contactos");
        } else {        	
        	int i = 0;
        	while (this.listaContactos[i] != null && i < this.listaContactos.length) {
        		i++;
        	}
        	
        	this.listaContactos[i] = c;   	
        }
 
    }
	
	public boolean existeContacto(Contacto c) {		 
        for (int i = 0; i < this.listaContactos.length; i++) {
            //Controlo nulos e indico si el contacto es el mismo
            if (this.listaContactos[i] != null && c.equals(this.listaContactos[i])) {
            	return true;
            }
        }
        return false; 
    }
	
	public boolean agendaLlena() {
	     
        for (int i = 0; i < this.listaContactos.length; i++) {
            if (this.listaContactos[i] == null) { //Controlo nulos
                return false; //indico que no esta llena
            }
        }
 
        return true; //esta llena
 
    }
	
	public void listadoContactos() {
		for (int i = 0; i < this.listaContactos.length; i++) {
	        if (this.listaContactos[i] != null) {
	        	System.out.println(this.listaContactos[i].toString());
	        	//System.out.println(this.listaContactos[i]);
	        }
        }
	}
	
	public void buscarPorNombre(String nombre) {
		int i = 0;
    	while (this.listaContactos[i] != null && 
    		   !this.listaContactos[i].getNombre().trim().equalsIgnoreCase(nombre) &&
    		   i < this.listaContactos.length) {
    		i++;
    	}
    	
    	if(i == this.listaContactos.length) {
    		System.out.println("NO LO ENCONTRO");
    	}
    	else {
    		System.out.println("Su telefono es " + this.listaContactos[i].getTelefono());
    	}   	 
    }
	
}
