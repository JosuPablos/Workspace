package herencia;

public class Personaje {
	protected  String nombre;
	protected int nivel;
	protected int puntosVida;
	
	public Personaje() {
		this.nombre="";
		this.nivel=0;
		this.puntosVida=0;
	}
	
	public Personaje(String nombre, int nivel, int puntosVida) {
		this.nombre=nombre;
		this.nivel=nivel;
		this.puntosVida=puntosVida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	
	public void presentarse (){
		System.out.println("El nombre del jugador es "+this.nombre+".");
		System.out.println("El nivel del jugador es "+this.nivel+".");
		System.out.println("Los puntos de vida actuales del jugador son "+this.puntosVida+".");
	}
	
	public void play() {
	}
	
	public int recibirDaño(int cantidadDaño) {
		int daño=0;
		daño=puntosVida-cantidadDaño;
		return daño;
	}
}
