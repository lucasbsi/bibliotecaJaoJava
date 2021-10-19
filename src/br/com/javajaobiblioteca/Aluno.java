package br.com.javajaobiblioteca;

public class Aluno extends Pessoa {
	private String matricula;

	public Aluno() {
		super();
	}

	public Aluno(Long id, String nome, String matricula) {
		super(id, nome);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	

}
