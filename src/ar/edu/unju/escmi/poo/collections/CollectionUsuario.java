package ar.edu.unju.escmi.poo.collections;

import java.util.List;
import java.util.ArrayList;

import ar.edu.unju.escmi.poo.dominio.Usuario;
import ar.edu.unju.escmi.poo.dominio.Socio;
import ar.edu.unju.escmi.poo.dominio.Empleado;

public abstract class CollectionUsuario {
	
	public static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	
	public static void precargarUsuarios() {
		Socio usuario1 = new Socio(45761468,"Fernanda","Palpala","3884399274",1);
		Socio usuario2 = new Socio(46472192,"Marisel","San Salvador de Jujuy","38843995445",2);
		Empleado usuario3= new Empleado(45761400,"Maxi","Perico","3884399244","bibliotecario",(float) 2450.10);
		Socio usuario4 = new Socio(45761111,"Max","El Carmen","38843997889",3);
		Empleado usuario5 = new Empleado(45761468,"Evelin","Salta","3884391534","bibliotecario",(float) 2950.40);
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		usuarios.add(usuario5);
	}


    public static void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    /*public static void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }*/
    
    public static Empleado buscarEmpleado(int dni) {
    	
    	for(int i=0; i<usuarios.size(); i++) {
    		if(usuarios.get(i) instanceof Empleado) {
    			if(usuarios.get(i).getDni() == dni) {
    				return (Empleado) usuarios.get(i);
    			}
    		}
    	}
    	
    	return null;
    }
	
	public static Socio buscarSocio(int codigo) {
		
		for(int i=0; i<usuarios.size(); i++) {
    		if(usuarios.get(i) instanceof Socio) {
    			if(((Socio) usuarios.get(i)).getCodigo() == codigo) {
    				return (Socio) usuarios.get(i);
    			}
    		}
    	}
    	
    	return null;
		
	}
	
	public static ArrayList<Usuario> listarEmpleados(){
		ArrayList<Usuario> empleados = new ArrayList<>();
		for(Usuario usuario : usuarios) {
			if(usuario instanceof Empleado)
				empleados.add(usuario);
		}
		return empleados;
	}
	
	public static ArrayList<Usuario> listarSocios(){
		ArrayList<Usuario> socios = new ArrayList<>();
		for(Usuario usuario : usuarios) {
			if(usuario instanceof Socio)
				socios.add(usuario);
		}
		return socios;
	}
}
