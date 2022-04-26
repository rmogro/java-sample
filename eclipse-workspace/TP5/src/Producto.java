
public class Producto {
	private String nombre;
	private Double precio;
	private int diasVto; // 365 dias un año
	private boolean perecedero; // true / false
	
	public Producto () {
		
	}
	
	public Producto (String nombre, Double precio, int diasVto, boolean perecedero) {
		this.nombre = nombre;
		this.precio = precio;		
		this.diasVto = diasVto;
		this.perecedero = perecedero;
	}
	
	public Double calcular(int cantidad) {
		double total;
		if(this.perecedero) {
			switch(this.diasVto) {
			  case 1:
			    total = (this.precio / 4) * cantidad;
			    break;
			  case 2:
				  total = (this.precio / 3) * cantidad;
			      break;
			  case 3:
				  total = (this.precio / 2) * cantidad;
				  break;
			  default:
				  total = this.precio * cantidad;
			}
		}
		else {
			total = this.precio * cantidad;
		}
		
		return total;
	}
}
