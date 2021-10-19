package br.com.javajaobiblioteca;

public class Revista extends Publicacao {
	private Integer periodicidadeEmDias;

	public Revista() {
		//super();
	}

	public Revista(Long id, String titulo, Integer numExemplares, Area area, Integer periodicidadeEmDias) {
		super(id, titulo, numExemplares, area);
		this.periodicidadeEmDias = periodicidadeEmDias;
	}

	public Integer getPeriodicidadeEmDias() {
		return periodicidadeEmDias;
	}

	public void setPeriodicidadeEmDias(Integer periodicidadeEmDias) {
		this.periodicidadeEmDias = periodicidadeEmDias;
	}
	
	

}
