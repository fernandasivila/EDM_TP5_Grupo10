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
			Libro libro6 = new Libro("Antes de Diciembre", "Joana Marcus", "1001", "Romance", 2009, true);
			Libro libro7 = new Libro("Ciudades de humo", "Joana Marcus", "1001", "Ficcion", 2013, true);
			/*Libro libro8 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro9 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro10 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro11 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro12 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro13 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro14 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro15 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro16 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro17 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro18 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro19 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			Libro libro20 = new Libro("El principito", "Antoine de Saint-Exupery", "1001", "Ficcion", 1943, true);
			*/
		}
		public static Libro buscarLibro(String titulo) {
			//
			return null;
		}
		public static void listarLibrosDisponibles() {
			System.out.println("Se deberian mostrar aqui los libros");
		}
}
