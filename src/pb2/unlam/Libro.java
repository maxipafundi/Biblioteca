package pb2.unlam;

import java.util.Objects;

public class Libro implements Comparable <Libro> {

	private String titulo;
	private String autor;
	private Integer cantidadDePaginas;
	private Integer publicacion;
	private GeneroDelLibro genero;
	
	public Libro(String titulo, String autor, Integer cantidadDePaginas, Integer publicacion, GeneroDelLibro genero) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.cantidadDePaginas = cantidadDePaginas;
		this.publicacion = publicacion;
		this.genero = genero;
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





	public Integer getCantidadDePaginas() {
		return cantidadDePaginas;
	}




	public void setCantidadDePaginas(Integer cantidadDePaginas) {
		this.cantidadDePaginas = cantidadDePaginas;
	}



	public Integer getPublicacion() {
		return publicacion;
	}



	public void setPublicacion(Integer publicacion) {
		this.publicacion = publicacion;
	}



	public GeneroDelLibro getGenero() {
		return genero;
	}




	public void setGenero(GeneroDelLibro genero) {
		this.genero = genero;
	}




	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}






	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", cantidadDePaginas=" + cantidadDePaginas
				+ ", publicacion=" + publicacion + ", genero=" + genero + "]";
	}





	@Override
	public int compareTo(Libro o) {
		if(this.cantidadDePaginas.equals(o.cantidadDePaginas)) {
			if(this.autor.equals(o.autor)) {
				return this.titulo.compareTo(o.titulo);
			}return this.autor.compareTo(o.autor);
		} return this.cantidadDePaginas.compareTo(o.cantidadDePaginas);
	}
					
		
	}
	
	


