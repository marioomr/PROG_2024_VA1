package vectores_Avanzados_I;

public class Aula {

	private int aula;
	private Alumno alumnos[];
	private int i = 0;
	
	public Aula(int numero) {
		this.aula = numero;
		alumnos = new Alumno[5];
	}
	
	public void addAlumno(String nombre, String apellidos, String telefono) {
		alumnos[i].setNombre(nombre);
		alumnos[i].setApellidos(apellidos);
		alumnos[i].setTelefono(telefono);
		alumnos[i].setAsignaturas(4);
	}
}
