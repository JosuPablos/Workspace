package herencia;

public class Profesor extends Persona{
	private String departamento;
	private boolean jefe;
	
	public Profesor () {
		super();
		this.departamento="";
		this.jefe=false;
	}
	
	public Profesor (String dni, String nombre, int edad, String departamento, boolean jefe) {
		super(dni, nombre, edad);
		this.departamento=departamento;
		this.jefe=jefe;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public boolean isJefe() {
		return jefe;
	}

	public void setJefe(boolean jefe) {
		this.jefe = jefe;
	}

	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", jefe=" + jefe + ", dni=" + dni + ", nombre=" + nombre
				+ ", edad=" + edad + "]";
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("Tu departamento es: "+this.departamento);
		System.out.println("¿Es jefe?: "+this.jefe);
	}
}
