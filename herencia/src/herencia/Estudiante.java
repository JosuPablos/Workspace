package herencia;

public class Estudiante extends Persona{
	private String matricula;
	private String clase;
	
	public Estudiante () {
		super();
		this.clase="";
		this.matricula="";
	}
	
	public Estudiante (String clase, String matricula) {
		super();
		this.clase=clase;
		this.matricula=matricula;
	}
	
	public Estudiante (String dni, String nombre, int edad, String clase, String matricula) {
		super(dni, nombre, edad);
		this.clase=clase;
		this.matricula=matricula;
	}

	@Override
	public String toString() {
		return "Estudiante [matricula=" + matricula + ", clase=" + clase + ", dni=" + dni + ", nombre=" + nombre
				+ ", edad=" + edad + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("Tu clase es: "+this.clase);
		System.out.println("Tu matricula es: "+this.matricula);
	}
}
