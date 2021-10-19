package br.com.javajaobiblioteca;

public class Area extends DomainObject {
	private String nome;

	public Area() {
		super();
	}

	public Area(Long id, String nome) {
		super(id);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
