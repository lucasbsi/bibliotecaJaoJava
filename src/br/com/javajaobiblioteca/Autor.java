package br.com.javajaobiblioteca;

public class Autor extends Pessoa {
	private String biografia;

	public Autor() {
		//super();
	}

	public Autor(Long id, String nome, String biografia) {
		super(id, nome);
		this.biografia = biografia;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	
	
	

}
