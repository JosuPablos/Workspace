package herencia;

public class Furgoneta extends Vehiculo {
	private double altura;
	private double tara;
	private double carga;
	
	public Furgoneta() {
		super();
		this.altura=0;
		this.tara=0;
		this.carga=0;
	}
	
	public Furgoneta(String matricula, String marca, String modelo, String color, int añosAntiguedad, double precioDia, double altura, double carga, double tara) {
		super(matricula, marca, modelo, color, añosAntiguedad, precioDia);
		this.altura=altura;
		this.tara=tara;
		this.carga=carga;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getTara() {
		return tara;
	}

	public void setTara(double tara) {
		this.tara = tara;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Furgoneta [altura=" + altura + ", tara=" + tara + ", carga=" + carga + ", matricula=" + matricula
				+ ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", añosAntiguedad=" + añosAntiguedad
				+ ", precioDia=" + precioDia + "]";
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("La altura del vehiculo es: "+this.altura+ " m.");
		System.out.println("El peso del vehiculo sin carga ni pasageros es: "+this.tara+" kg.");
		System.out.println("La carga máxima del vehiculo es: "+this.carga+ " kg.");
	}
}
