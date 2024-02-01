package vectores_Avanzados_I;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String telefono;
	private Asignatura asignaturas[];
	private int i = 0;
	
	
	public void addAsignatura(String nombre, int nota1Ev, int nota2Ev, int notaFinal) {
		asignaturas[i].setNombre(nombre);
		asignaturas[i].setNotaEv1(nota1Ev);
		asignaturas[i].setNotaEv2(nota2Ev);
		asignaturas[i].setNotaFinal(notaFinal);
		i++;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}


	public void setAsignaturas(int numero) {
		asignaturas = new Asignatura[numero];
	}
	
	
	
	
}
