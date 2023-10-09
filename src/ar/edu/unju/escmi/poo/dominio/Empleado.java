package ar.edu.unju.escmi.poo.dominio;

//import ar.edu.unju.escmi.poo.dominio.Prestamo;

public class Empleado extends Usuario{
	private String cargo;
	private float sueldo;
	
	
	public Empleado(int dni, String nombre, String direccion, String telefono, String cargo, float sueldo) {
		super(dni, nombre, direccion, telefono);
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	
	/*public Prestamo buscarPrestamo(int dniSocio) {
		return null;
	}*/
	
	public void prestarLibro (Socio socio) {
		
	}
	
	/*public Libro buscarLibro (string titulo) {
		return null;
	}*/

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
}
