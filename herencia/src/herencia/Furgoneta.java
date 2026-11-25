package herencia;

public class Furgoneta extends Vehiculo {
	private double altura;
	private double tara;
	private double carga;
	
	public Vehiculo() {
		this.matricula="";
		this.marca="";
		this.modelo="";
		this.color="negro";
		this.añosAntiguedad=0;
		this.precioDia=0;
	}
	
	public Vehiculo(String matricula, String marca, String modelo, String color, int añosAntiguedad, double precioDia) {
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		this.color="negro";
		this.añosAntiguedad=añosAntiguedad;
		this.precioDia=precioDia;
	}
}
