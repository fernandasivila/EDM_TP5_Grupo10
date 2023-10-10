package ar.edu.unju.escmi.poo.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Prestamo {
	
	private LocalDate fechaInicio;
	private LocalDate fechaVencimiento;
	private boolean estado;
	private int codigoSocio;
	private ArrayList<Libro> libros;
	//NOTA: Implementar libros.
	
	public Prestamo(LocalDate fechaInicio, LocalDate fechaVencimiento, int codigoSocio, ArrayList<Libro> libros) {
		this.fechaInicio = fechaInicio;
		this.codigoSocio = codigoSocio;
		this.fechaVencimiento = fechaVencimiento;
		this.estado = true; //prestamo activo
		this.libros = libros;
	}
	public Prestamo(LocalDate fechaVencimiento, int codigoSocio, ArrayList<Libro> libros) {
		this.fechaInicio = LocalDate.now();
		this.codigoSocio = codigoSocio;
		this.fechaVencimiento = fechaVencimiento;
		this.estado = true;
		this.libros = libros;
	}

	public int calcularDias() {
		int dias;
		dias = (int)this.getFechaInicio().until(this.getFechaVencimiento(), ChronoUnit.DAYS);
		return dias;
	}
	public void mostrarDatos() {
		System.out.println("Codigo de Socio: "+this.getCodigoSocio());
		System.out.println("Fecha de Inicio: "+this.getFechaInicio());
		System.out.println("Fecha de Vencimiento: "+this.getFechaVencimiento());
		String aux;
		if(estado)
			aux="Activo";
		else
			aux="Vencido";
		System.out.println("Estado: "+aux);
	}
	public void actualizarDatos() {
		if(this.getFechaInicio().isAfter(LocalDate.now()))
			this.setEstado(!this.isEstado());
	}
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public int getCodigoSocio() {
		return codigoSocio;
	}
	public void setCodigoSocio(int codigoSocio) {
		this.codigoSocio = codigoSocio;
	}
	
}