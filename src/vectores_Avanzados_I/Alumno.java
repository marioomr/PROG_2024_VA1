package vectores_Avanzados_I;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String telefono;
	private Asignatura asignaturas[];
	private int i = 0;
	
	public Alumno(String nombre, String apellidos, String telefono) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		asignaturas = new Asignatura [4];
	}
	
	public void addAsignatura(String nombre, int nota1Ev, int nota2Ev, int notaFinal) {
		asignaturas[i].setNombre(nombre);
		asignaturas[i].setNotaEv1(nota1Ev);
		asignaturas[i].setNotaEv2(nota2Ev);
		asignaturas[i].setNotaFinal(notaFinal);
		i++;
	}
	
}
