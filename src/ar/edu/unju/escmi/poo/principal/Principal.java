package ar.edu.unju.escmi.poo.principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.escmi.poo.collections.CollectionUsuario;
import ar.edu.unju.escmi.poo.collections.CollectionLibro;
import ar.edu.unju.escmi.poo.collections.CollectionPrestamo;
import ar.edu.unju.escmi.poo.dominio.Empleado;
import ar.edu.unju.escmi.poo.dominio.Libro;
import ar.edu.unju.escmi.poo.dominio.Prestamo;
import ar.edu.unju.escmi.poo.dominio.Socio;
import ar.edu.unju.escmi.poo.dominio.Usuario;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		CollectionUsuario.precargarUsuarios();
		CollectionLibro.precargarLibros();
	
		int op;
		do {
			System.out.println("*****************MENU*****************");
			System.out.println("1) Mostrar socios");
			System.out.println("2) Mostrar empleados");
			System.out.println("3) Realizar un prestamo");
			System.out.println("4) Mostrar prestamos vencidos");
			System.out.println("5) Mostrar prestamos de un socio");
			System.out.println("6) Mostrar los libros disponibles");
			System.out.println("7) Agregar un socio");
			System.out.println("8) Exit");
			System.out.println("**************************************");
			System.out.println("Seleccione una opcion: ");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				ArrayList<Usuario> socios = CollectionUsuario.listarSocios();
				for(Usuario s: socios) {
					s.mostrarDatos();
					System.out.println();
				}
				break;
			case 2:
				ArrayList<Usuario> empleados = CollectionUsuario.listarEmpleados();
				for(Usuario e:empleados) {
					e.mostrarDatos();
					System.out.println();
				}
				break;
			case 3:
				int dniE;
				String titulo;
				char rst;
				Libro libroEncontrado;
				int maximoLibrosPrestados= 4;
				int cantidadLibrosPrestados=0;
				int diasPrestadosLosLibros;
				ArrayList<Libro> librosEncargados = new ArrayList<Libro>();
				
				System.out.println("Empleado (DNI): ");
				dniE=sc.nextInt();
				Empleado emp = CollectionUsuario.buscarEmpleado(dniE);
				
				if(emp!=null) {
				
					System.out.println("Codigo del socio: ");
					int codigoSocio=sc.nextInt();
					Socio socioEncontrado = CollectionUsuario.buscarSocio(codigoSocio);
					if(socioEncontrado!=null) {
						System.out.println("Libros disponibles:");
						CollectionLibro.listarLibrosDisponibles();
						do {
							sc.nextLine();
							System.out.println("\nTitulo del libro: ");
							titulo=sc.nextLine();
							libroEncontrado = emp.buscarLibro(titulo);
							//ibroEncontrado = CollectionLibro.buscarLibro(titulo);
							 if(libroEncontrado!=null) {
								 librosEncargados.add(libroEncontrado);
								 cantidadLibrosPrestados++;
							 }else {
								 System.out.println("Libro no encontrado");
							 }
							System.out.println("Desea otro libro? (s/n): ");
							rst=sc.next().charAt(0);
							
							if(cantidadLibrosPrestados == maximoLibrosPrestados) {
								System.out.println("Se alcanzo el limite de libros para prestar");
							}
						}while(rst != 'n' || cantidadLibrosPrestados<=maximoLibrosPrestados);
						
						System.out.println("Cuantos dias se prestaran los libros?: ");
						diasPrestadosLosLibros= sc.nextInt();
						
						emp.prestarLibro(socioEncontrado, diasPrestadosLosLibros, librosEncargados);
						
						System.out.println("Se ha registrado el prestamo exitosamente");
						
						//Actualizacion de la lista de libros no disponibles
						for(Libro libro: librosEncargados) {
							libro.setEstado(false);
						}
						
					}else {
						System.out.println("El socio no existe");
					}
				}else {
					System.out.println("DENEGADO. Solo los empleados pueden realizar prestamo");
				}
				break;
			case 4:
				//CollectionPrestamo.prestamos.stream().filter(prestamo -> prestamo.isEstado() == false).forEach();
				
				
				ArrayList<Prestamo> prestamosVencidos = CollectionPrestamo.prestamosVencidos();
				if(prestamosVencidos.isEmpty())
					System.out.println("No hay prestamos vencidos");
				else {
					for(Prestamo p:prestamosVencidos) {
						p.mostrarDatos();
					}
				}
				break;
			case 5:
				System.out.println("Empleado (DNI): ");
				dniE=sc.nextInt();
				Empleado emp = CollectionUsuario.buscarEmpleado(dniE);
				
				if(emp!=null) { 
					System.out.println("Codigo del socio: ");
					int codigoSocio = sc.nextInt();
					emp.buscarPrestamo(codigoSocio);
				}else {
					System.out.println("PERMISO DENEGADO");
				}
				
				break;
			case 6:
				CollectionLibro.listarLibrosDisponibles();
				break;
			case 7:
				int codigo,dni;
				String nombre,direccion,telefono;
				
				System.out.println("Codigo: ");
				codigo = sc.nextInt();
				sc.nextLine();
				System.out.println("Nombre: ");
				nombre=sc.nextLine();
				System.out.println("DNI: ");
				dni=sc.nextInt();
				sc.nextLine();
				System.out.println("Direccion: ");
				direccion=sc.nextLine();
				System.out.println("Telefono: ");
				telefono=sc.nextLine();
				
				Socio nuevoSocio = new Socio(dni,nombre,direccion,telefono,codigo);
				CollectionUsuario.agregarUsuario(nuevoSocio);
				
				
				System.out.println("Se ha agregado el nuevo socio con exito");
				break;
			case 8:
				System.out.println("FIN DEL PROGRAMA :D");
				break;
				
			default:
					System.out.println("El numero de opcion no existe");
			}
			
			String pause = br.readLine();
			
		}while(op != 8);
		
		sc.close();
		br.close();
	}

}
