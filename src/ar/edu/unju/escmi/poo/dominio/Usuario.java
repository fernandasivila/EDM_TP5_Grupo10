package ar.edu.unju.escmi.poo.dominio;

public abstract class Usuario {
	protected int dni;
	protected String nombre;
	protected String direccion;
	protected String telefono;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(int dni, String nombre, String direccion, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	

}
