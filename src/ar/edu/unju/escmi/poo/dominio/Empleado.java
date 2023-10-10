package ar.edu.unju.escmi.poo.dominio;

import java.util.ArrayList;
import java.time.LocalDate;

import ar.edu.unju.escmi.poo.collections.CollectionLibro;
import ar.edu.unju.escmi.poo.collections.CollectionPrestamo;
import ar.edu.unju.escmi.poo.collections.CollectionUsuario;
import ar.edu.unju.escmi.poo.dominio.Prestamo;

public class Empleado extends Usuario{
	private String cargo;
	private float sueldo;
	
	
	public Empleado(int dni, String nombre, String direccion, String telefono, String cargo, float sueldo) {
		super(dni, nombre, direccion, telefono);
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	
	public void buscarPrestamo(int codigoSocio) {
	
		if(CollectionUsuario.buscarSocio(codigoSocio)!=null) {
			ArrayList<Prestamo> prestamosSocio = CollectionPrestamo.buscarPrestamo(codigoSocio);
			if(prestamosSocio.isEmpty()) {
				System.out.println("El socio no ha realizado ningun prestamo");
			}else {
				for(Prestamo p:prestamosSocio) {
					p.mostrarDatos();
				}
			}
		}
		else {
			System.out.println("El socio no existe");
		}
	}
	
	public void prestarLibro (Socio socio, int diasAVencer, ArrayList<Libro> libros) {
		LocalDate fechaActual = LocalDate.now();
		int diasDePrestamo = diasAVencer;
		int codigoSocio = socio.getCodigo();
		LocalDate fechaVencimiento = fechaActual.plusDays(diasDePrestamo);
		Prestamo prestamo = new Prestamo(fechaActual,fechaVencimiento, codigoSocio, libros);
		
		CollectionPrestamo.agregarPrestamo(prestamo);
	}

	public Libro buscarLibro (String titulo) {
		Libro libro = CollectionLibro.buscarLibro(titulo);
		return libro;
	}

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

	@Override
	public void mostrarDatos() {
		System.out.println("DNI: "+this.dni);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Cargo: "+this.cargo);
		System.out.println("Sueldo: "+this.sueldo);
		System.out.println("Direccion: "+this.direccion);
		System.out.println("Telefono: "+this.telefono);
	}
	
	
	
	
}
