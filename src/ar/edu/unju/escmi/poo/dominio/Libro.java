package ar.edu.unju.escmi.poo.dominio;

public class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	private String genero;
	private int anioPublicacion;
	private boolean estado;
	
	public Libro(String titulo, String autor, String isbn, String genero, int anioPublicacion, boolean estado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.genero = genero;
		this.anioPublicacion = anioPublicacion;
		this.estado = estado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
