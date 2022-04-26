import java.lang.Math;

public class EcuacionCuadratica {
	private double a;
	private double b;
	private double c;
	private double discriminante;
	private double x1;
	private double x2;
	
	public EcuacionCuadratica() {
		
	}
	
	public EcuacionCuadratica(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;	
		
		this.discriminante = Math.pow(b, 2) - (4 * a * c); // b2 - 4ac		 
		
		if(this.tieneRaiz()) { // una unica raiz
			this.x1 = - b / 2 * a;
		}
		else if (this.tieneRaices()) {  // dos raices
			this.x1 = (double) (- b + Math.sqrt(this.discriminante)) / (2 * a);
			this.x2 = (double) (- b - Math.sqrt(this.discriminante)) / (2 * a);
		}
	}
	
	public void setA(double value) {
		this.a = value;
	}
	
	public double getA() {
		return this.a;		
	}
	
	public void setB(double value) {
		this.b = value;
	}
	
	public double getB() {
		return this.b;		
	}
	
	public void setC(double value) {
		this.c = value;
	}
	
	public double getC() {
		return this.c;		
	}
	
	//public void setDiscriminante(double value) {
	//	this.discriminante = value;
	//}
	
	public double getDiscriminante() {
		return this.discriminante;		
	}
	
	public boolean tieneRaiz() {
		return this.discriminante == 0;
		/*
		if(this.discriminante == 0) {
			return true;
		}
		else {
			return false;
		}
		*/
	}
	
	public boolean tieneRaices() {
		return this.discriminante > 0;
	}
	
	public double getX1() {
		return this.x1;
	}
	
	public double getX2() {
		return this.x2;
	}
}
