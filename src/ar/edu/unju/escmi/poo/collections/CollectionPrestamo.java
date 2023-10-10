package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Prestamo;

public abstract class CollectionPrestamo {
	
	public static List<Prestamo> prestamos = new ArrayList<Prestamo>();
	
	public static void agregarPrestamo(Prestamo prestamo) {
		prestamos.add(prestamo);
	}
	
	public static ArrayList<Prestamo> buscarPrestamo(int codigoSocio){
		ArrayList<Prestamo> prestamosHechos = new ArrayList<>();
		for(Prestamo prestamo : prestamos) {
			if( prestamo.getCodigoSocio()== codigoSocio )
				prestamosHechos.add(prestamo);
		}
		return prestamosHechos;
	}
}
