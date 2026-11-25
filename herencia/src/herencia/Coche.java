package herencia;

public class Coche extends Vehiculo{
	private boolean descapotable;
	
	public Coche() {
		super();
		this.descapotable=false;
	}
	
	public Coche(String matricula, String marca, String modelo, String color, int añosAntiguedad, double precioDia, boolean descapotable) {
		super(matricula, marca, modelo, color, añosAntiguedad, precioDia);
		this.descapotable=descapotable;
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}

	@Override
	public String toString() {
		return "Coche [descapotable=" + descapotable + ", matricula=" + matricula + ", marca=" + marca + ", modelo="
				+ modelo + ", color=" + color + ", añosAntiguedad=" + añosAntiguedad + ", precioDia=" + precioDia + "]";
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("Su coche es descapotable: "+this.descapotable);
	}
}
