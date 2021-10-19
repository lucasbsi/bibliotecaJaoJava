package biblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo extends DomainObject {
	private LocalDate inicio;
	private LocalDate previsaoEntrega;
	private Aluno aluno;
	private LocalDate entrega;
	private Publicacao publicacao;

	public Emprestimo() {
		super();
	}

	public Emprestimo(Publicacao publicacao, Aluno aluno, LocalDate inicio, LocalDate previsaoEntrega,
			LocalDate entrega) {
		super();
		this.inicio = inicio;
		this.previsaoEntrega = previsaoEntrega;
		this.entrega = entrega;
		this.aluno = aluno;
		this.publicacao = publicacao;

	}

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalDate getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	public void setPrevisaoEntrega(LocalDate previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public LocalDate getEntrega() {
		return entrega;
	}

	public void setEntrega(LocalDate entrega) {
		this.entrega = entrega;
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public Integer obterDiasEmAtraso() {
		
		
		if ((this.entrega != null) && (this.aluno != null)) {
			System.out.println("A Publicação "+this.publicacao.getTitulo()+"já foi entregue pelo aluno "+this.aluno.getNome());
			
			return -1;
		}else{
		
			LocalDate localDateNow = LocalDate.now();
			Long difference = ChronoUnit.DAYS.between(localDateNow, this.previsaoEntrega);
			Integer result =  difference.intValue();
//			
//			System.out.println("now"+localDateNow);
//			System.out.println("previsao"+previsaoEntrega);
//					
//			
//			//op1
//			//int result =  difference.intValue();
//			
//			//op2
//			//int result = Long.valueOf(difference).intValue();
//			
//			//op3
			//int result = Math.toIntExact(difference);
			
			return result;
			
		
		
		}
	
	}

	@Override
	public String toString() {
		return "Emprestimo [inicio=" + inicio + ", previsaoEntrega=" + previsaoEntrega + ", aluno=" + aluno
				+ ", entrega=" + entrega + ", publicacao=" + publicacao + "]";
	}
	
	
	
}
