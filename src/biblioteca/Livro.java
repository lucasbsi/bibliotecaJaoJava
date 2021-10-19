package biblioteca;

import java.util.List;

public class Livro extends Publicacao {
	private String ISBN;
	private List<Autor> autor;

	public Livro() {
		//super();
	}

	public Livro(Long id, String titulo, Integer numExemplares, Area area, String iSBN) {
		super(id, titulo, numExemplares, area);
		this.ISBN = iSBN;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public void adicionarAutor(Autor autor) {
		this.autor.add(autor);
	}
	
	
	public void adicionarAutor(List<Autor> autor) {
		this.autor = autor;
		
	}
	
	public void removerAutor(Autor autor) {
		this.autor.remove(autor);
	}

	@Override
	public String toString() {
		return "Livro [ISBN=" + ISBN + ", autor=" + autor + ", getTitulo()=" + getTitulo() + ", getNumExemplares()="
				+ getNumExemplares() + ", getNumExemplaresEmprestados()=" + getNumExemplaresEmprestados()
				+ ", getArea()=" + getArea().getNome() + "]";
	}
	
	
}
