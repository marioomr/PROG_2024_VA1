package vectores_Avanzados_I;

public class Asignatura {

	private String nombre;
	private int notaEv1;
	private int notaEv2;
	private int notaFinal;
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNotaEv1() {
		return notaEv1;
	}
	
	public void setNotaEv1(int notaEv1) {
		this.notaEv1 = notaEv1;
	}
	
	public int getNotaEv2() {
		return notaEv2;
	}
	
	public void setNotaEv2(int notaEv2) {
		this.notaEv2 = notaEv2;
	}
	
	public int getNotaFinal() {
		return notaFinal;
	}
	
	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", notaEv1=" + notaEv1 + ", notaEv2=" + notaEv2 + ", notaFinal="
				+ notaFinal + "]";
	}

		
	
	
	
	
}
