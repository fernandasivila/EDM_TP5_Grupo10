package ar.edu.unju.escmi.poo.dominio;

public class Socio extends Usuario{
	private int codigo;

	public Socio(int dni, String nombre, String direccion, String telefono, int codigo) {
		super(dni, nombre, direccion, telefono);
		this.codigo = codigo;
	}
	
	public void mostrarDatos() {
		System.out.println("DNI: " + this.dni);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Cargo: " + this.codigo);
		System.out.println("Direccion: " + this.direccion);
		System.out.println("Telefono: " + this.telefono);
	}
	
	public void mostrarPrestamos() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	
	
}
