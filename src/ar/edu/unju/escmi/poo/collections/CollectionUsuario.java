package ar.edu.unju.escmi.poo.collections;

import java.util.List;
import java.util.ArrayList;

import ar.edu.unju.escmi.poo.dominio.Usuario;
import ar.edu.unju.escmi.poo.dominio.Socio;
import ar.edu.unju.escmi.poo.dominio.Empleado;

public abstract class CollectionUsuario {
	
	public static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static void precargarUsuarios() {
		Usuario usuario1 = new Socio(45761468,"Fernanda","Palpala","3884399274",1);
		Usuario usuario2 = new Socio(46472192,"Marisel","Palpala","3884399274",1);
		Usuario usuario3= new Empleado(45761400,"Maxi","Palpala","3884399274",1);
		Usuario usuario4 = new Socio(45761111,"Max","Palpala","3884399274",1);
		Usuario usuario5 = new Empleado(45761468,"Evelin","Palpala","3884399274",1);
		
	}

	
	
	
}
