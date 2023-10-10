package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import ar.edu.unju.escmi.poo.dominio.*;
import java.util.List;

public abstract class CollectionLibro {

		public static List<Libro> libros= new ArrayList<Libro>();
		
		public static void precargarLibros() {
			Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro2 = new Libro("El Diario de un Aldeano Desafortunado", "Cube Kid", "1002", "Juvenil", 2016, true);
			Libro libro3 = new Libro("Crimenes Sorprendentes de la Historia Argentina", "Ricardo Canaletti", "1003", "Periodismo", 2021, true);
			Libro libro4 = new Libro("Harry Potter y la piedra filosofal", "J. K. Rowling", "1004", "Fantasia", 1997, true);
			Libro libro5 = new Libro("Don Quijote de La Mancha", "Miguel de Cervantes", "1005", "Novela", 1605, true);
			Libro libro6 = new Libro("Antes de Diciembre", "Joana Marcus", "1006", "Romance", 2009, true);
			Libro libro7 = new Libro("Ciudades de humo", "Joana Marcus", "1007", "Ficcion", 2013, true);
			
			libros.add(libro1);
			libros.add(libro2);
			libros.add(libro3);
			libros.add(libro4);
			libros.add(libro5);
			libros.add(libro6);
			libros.add(libro7);
		}
		public static Libro buscarLibro(String titulo) {
			for(Libro libro : libros) {
				if(libro.getTitulo().contains(titulo)) {
					return libro;
				}
			}
			return null;
		}
		public static void listarLibrosDisponibles() {
			for (Libro libro : libros) {
				if(libro.isEstado()) {
					System.out.println(libro);
				}
			}
		}
}
