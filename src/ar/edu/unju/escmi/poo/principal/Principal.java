package ar.edu.unju.escmi.poo.principal;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.escmi.poo.collections.CollectionUsuario;
import ar.edu.unju.escmi.poo.collections.CollectionPrestamo;
import ar.edu.unju.escmi.poo.dominio.Empleado;
import ar.edu.unju.escmi.poo.dominio.Prestamo;
import ar.edu.unju.escmi.poo.dominio.Socio;

public class Principal {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int op;
		do {
			System.out.println("*************MENU*************");
			System.out.println("1) Mostrar socios");
			System.out.println("2) Mostrar empleados");
			System.out.println("3) Realizar un prestamo");
			System.out.println("4) Mostrar prestamos vencidos");
			System.out.println("5) Mostrar prestamo de un socio");
			System.out.println("6) Mostrar los libros con estado disponible");
			System.out.println("7) Agregar un socio");
			System.out.println("8) Exit");
			System.out.println("******************************");
			System.out.println("Seleccione una opcion: ");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				int codigo;
				System.out.println("Ingrese el codigo de socio: ");
				codigo=sc.nextInt();
				Socio socioEncontrado = CollectionUsuario.buscarSocio(codigo);
				if(socioEncontrado != null ) {
					socioEncontrado.mostrarDatos();
				}else {
					System.out.println("No se ha encontrado ningun socio con ese codigo");
				}
				break;
			case 2:
				int dni;
				System.out.println("Ingrese el DNI del empleado: ");
				dni=sc.nextInt();
				Empleado empleadoEncontrado = CollectionUsuario.buscarEmpleado(dni);
				if(empleadoEncontrado != null ) {
					empleadoEncontrado.mostrarDatos();
				}else {
					System.out.println("No se ha encontrado el DNI");
				}
				break;
			case 3:
				break;
			case 4:
				CollectionPrestamo.prestamos.stream().filter(prestamo -> prestamo.isEstado() == false).forEach(Prestamo::mostrarDatos);
				
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
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
