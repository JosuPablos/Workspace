package herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona();
		p1.visualizar();
		Persona p2=new Persona("123", "Josu", 23);
		p2.visualizar();
		
		Estudiante e1=new Estudiante();
		e1.visualizar();
		Estudiante e2=new Estudiante("123", "Josu", 23, "1DAMi", "789");
		e2.visualizar();
		
		Profesor pr1=new Profesor();
		pr1.visualizar();
		Profesor pr2=new Profesor("123456", "Pepe", 40, "informática", true);
		pr2.visualizar();
		
		Persona [] aPersonas=new Persona [4];
		aPersonas[0]=e1;
		aPersonas[1]=e2;
		aPersonas[2]=pr1;
		aPersonas[3]=pr2;
		
		for (int i=0; i<aPersonas.length;i++) {
			System.out.println(i+" persona");
			System.out.println(aPersonas[i]);
		}
	}

}
