package pb2.unlam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Biblioteca {

	private TreeSet <Libro> libros;

	public Biblioteca() {
		super();
		this.libros = new TreeSet<>();
	}
	
	
	
	public void AgregarLibro(Libro libro) {
		this.libros.add(libro);
	}
	
	
	public Integer cantidadDeLibros () {
		return this.libros.size();
	}
	
	
	public void mostrarBiblioteca() {
		for (Libro libro : libros) {
			System.out.println(libro);
		}
	}


	public ArrayList<Libro> librosPorGenero(GeneroDelLibro genero){
		ArrayList<Libro> librosEncontrados = new ArrayList<>();
		for (Libro libro : libros) {
			if(libro.getGenero()== genero) {
				librosEncontrados.add(libro);
			}
			
		}
		
		return librosEncontrados;
	}
	
	
	public Integer cantidadDeLibrosporGenero (GeneroDelLibro genero) {
		ArrayList<Libro> librosEncontrados = new ArrayList<>();
		for (Libro libro : libros) {
			if(libro.getGenero()== genero) {
				librosEncontrados.add(libro);
			}
			
		}
		
		return librosEncontrados.size();
	}
	

	
}
