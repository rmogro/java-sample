
public class NumeroEntero { // el nombre clase con Mayuscula
	private int valor; // deberia ser privado
	
	public NumeroEntero() { // constructor por defecto		
	}
	
	public NumeroEntero(int x) {
		this.valor = x;
	}
	
	public int suma(NumeroEntero num) {
		return this.valor + num.valor; // si puedo hacerlo porque sigo en el ambito de la misma clase
	}
	
	public int resta(NumeroEntero num) {
		return this.valor - num.valor;
	}
	
	public int producto(NumeroEntero num) {
		return this.valor * num.valor;
	}
	
	public float division(NumeroEntero num) {
		if(num.valor == 0) {
			//System.out.println("No se puede dividir por 0");
			return 0; // to do ver de devolver un valor coherente, caso de div por cero
		}
		else {
			return (float)(this.valor/num.valor);
		}
	}
}
