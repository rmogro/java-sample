
public class Taxi {
	
	// atributos
	private int id;
	private int numero;
	private int tipoTarifa; // 1 o 2
	private float precioBajadaBandera; // 58 o 70
	
	// constructores
	
	public Taxi() {
		
	}
	
	public Taxi(int id, int nro, int tipoTarifa) {		
		if(tipoTarifa == 1 || tipoTarifa == 2) {
			this.id = id;
			this.numero = nro;
			this.tipoTarifa = tipoTarifa;
			this.precioBajadaBandera = (tipoTarifa == 1) ? 58 : 70;			
		}
		else {
			System.out.println("Ingrese un valor correcto para el Tipo de Tarifa.");
		}
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int value) {
		this.numero = value;
	}
	
	public int getTipoTarifa() {
		return this.tipoTarifa;
	}
	
	public void setTipoTarifa(int value) {		
		if(value == 1 || value == 2) {			
			this.tipoTarifa = value;
			this.precioBajadaBandera = (this.tipoTarifa == 1) ? 58 : 70;			
		}
		else {
			System.out.println("Ingrese un valor correcto para el Tipo de Tarifa.");
		}
	}
	
	public float getPrecioBajadaBandera() {
		return this.precioBajadaBandera;
	}
	
	// no deberia ir
	//public void setPrecioBandera(float value) {
	//	this.precioBajadaBandera = value;
	//}
	
	public void cambiarTarifa() {
		if(this.tipoTarifa == 1 || this.tipoTarifa == 2) {			
			this.tipoTarifa = (this.tipoTarifa == 1) ? 2 : 1;
			this.precioBajadaBandera = (this.tipoTarifa == 1) ? 58 : 70; // Ojo!!!			
		}
		else {
			System.out.println("Ingrese un valor correcto para el Tipo de Tarifa.");
		}		
	}
	
	public float calcularTotalPagar(float metros) {
		float total = -1;
		if(this.tipoTarifa == 1 || this.tipoTarifa == 2) {						
			total = (this.tipoTarifa == 1) ? this.precioBajadaBandera + (metros * 5) : 
				                             this.precioBajadaBandera + (metros * 8);			
					
		}		
		return total;			
	}
}
