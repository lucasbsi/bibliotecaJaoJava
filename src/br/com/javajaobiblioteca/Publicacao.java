package br.com.javajaobiblioteca;

public class Publicacao extends DomainObject {
	private String titulo;
	private Integer numExemplares;
	private Integer numExemplaresEmprestados;
	
	private Area area;

	public Publicacao() {
		//super();
	}

	public Publicacao(Long id, String titulo, Integer numExemplares, Area area) {
		super(id);
		this.titulo = titulo;
		this.numExemplares = numExemplares;
		this.area = area;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getNumExemplares() {
		return numExemplares;
	}

	public void setNumExemplares(Integer numExemplares) {
		this.numExemplares = numExemplares;
	}

	public Integer getNumExemplaresEmprestados() {
		return numExemplaresEmprestados;
	}

	public void setNumExemplaresEmprestados(Integer numExemplaresEmprestados) {
		this.numExemplaresEmprestados = numExemplaresEmprestados;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	
	
	
	
	

}
