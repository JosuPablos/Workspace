package herencia;

public class Vehiculo {
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected String color;
	protected int añosAntiguedad;
	protected double precioDia;
	
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAñosAntiguedad() {
		return añosAntiguedad;
	}

	public void setAñosAntiguedad(int añosAntiguedad) {
		this.añosAntiguedad = añosAntiguedad;
	}

	public double getPrecioDia() {
		return precioDia;
	}

	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", añosAntiguedad=" + añosAntiguedad + ", precioDia=" + precioDia + "]";
	}
	
	public void visualizar () {
		System.out.println("La matricula de tu coche es: "+this.matricula);
		System.out.println("La marca de tu coche es: "+this.marca);
		System.out.println("El modelo de tu coche es: "+this.modelo);
		System.out.println("El color de tu coche es: "+this.color);
		System.out.println("La antigüedad de tu coche es de: "+this.añosAntiguedad);
		System.out.println("El precio del alquiler de tu coche por día: "+this.precioDia);
	}
	
}

