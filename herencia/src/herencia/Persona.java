package herencia;

public class Persona {
	protected String dni;
	protected String nombre;
	protected int edad;
	
	public Persona() {
		this.dni="";
		this.nombre="";
		this.edad=0;
	}

	public Persona(String dni, String nombre, int edad) {
		this.dni= dni;
		this.nombre= nombre;
		this.edad= edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	public void visualizar () {
		System.out.println("Tu DNI es: "+this.dni);
		System.out.println("Tu nombre es: "+this.nombre);
		System.out.println("Tu edad es: "+this.edad);
	}

}
