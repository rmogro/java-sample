
public class Cuenta {
	private Persona titular;
	private double cantidad; 
	
	public Cuenta() {
		
	}
	
	public Cuenta(Persona tit, Double saldoInicial) {
		this.titular = tit;
		this.cantidad = saldoInicial;
	}
}
