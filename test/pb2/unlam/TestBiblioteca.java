package pb2.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBiblioteca {

	@Test
	public void QueSePuedaCrearUnaBiblioteca() {
		
		Biblioteca biblio = new Biblioteca();
		assertNotNull(biblio);
	}

	
	@Test
	
	public void QueSePuedaCrearUnLibroYAgregarloALaBiblioteca() {
		
		Biblioteca biblio = new Biblioteca();
		
		Libro libro1 = new Libro("La LLamada", "Carlos Palomeque", 200, 1999, GeneroDelLibro.TERROR);
		Libro libro2 = new Libro("El Secreto de sus Ojos", "Pepe Argento", 200, 2010, GeneroDelLibro.TERROR);
		Libro libro3 = new Libro("Sali de ahi maravilla", "Pedro Troglio", 300, 2016, GeneroDelLibro.AUTOAYUDA);
		Libro libro4 = new Libro("Busqueda", "Zen Afleck", 200, 2020, GeneroDelLibro.ACCION);
		
		
		biblio.AgregarLibro(libro1);
		biblio.AgregarLibro(libro2);
		biblio.AgregarLibro(libro3);
		biblio.AgregarLibro(libro4);
		
		Integer re = 4;
		Integer ro= biblio.cantidadDeLibros();
		
		biblio.mostrarBiblioteca();
		System.out.println("------------------------------------------------");
		System.out.println(biblio.librosPorGenero(GeneroDelLibro.TERROR));
		assertEquals(re,ro);
		
		
	}
	
}
