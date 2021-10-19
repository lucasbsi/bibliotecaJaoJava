package br.com.javajaobiblioteca;

public abstract class Pessoa extends DomainObject {
	private String nome;

	public Pessoa() {
		//super();
	}

	public Pessoa(Long id, String nome) {
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
