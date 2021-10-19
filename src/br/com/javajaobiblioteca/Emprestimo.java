package br.com.javajaobiblioteca;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Formatter;
import java.time.format.DateTimeFormatter;

public class Emprestimo extends DomainObject {
	private LocalDate inicio;
	private LocalDate previsaoEntrega;
	private Aluno aluno;
	private LocalDate entrega;
	private Publicacao publicacao;

	
	public Emprestimo() {
		super();
	}

	public Emprestimo(Publicacao publicacao, Aluno aluno, Date inicio, Date previsaoEntrega, Date entrega) {
		super();
		this.inicio = inicio;
		this.previsaoEntrega = previsaoEntrega;
		this.entrega = entrega;
		this.aluno = aluno;
		this.publicacao = publicacao;
		
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getPrevisaoEntrega() {
		return previsaoEntrega;
	}

	public void setPrevisaoEntrega(Date previsaoEntrega) {
		this.previsaoEntrega = previsaoEntrega;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Date getEntrega() {
		return entrega;
	}

	public void setEntrega(Date entrega) {
		this.entrega = entrega;
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}
	
	public Long obterDiasEmAtraso() {
		if ((this.entrega != null) && (this.aluno != null)) {
			System.out.println("A Publicação "+this.publicacao.getTitulo()+"já foi entregue pelo aluno "+this.aluno.getNome());
		}else {
		
			
			// data to localdata
			String dataEntregaString = this.previsaoEntrega.toString();
			LocalDate dataEntregaLocalDate = LocalDate.parse(dataEntregaString);
			
			//local data to string
			LocalDate atual = LocalDate.now();
//			DateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
//			
//			
//			Date dateToDateAtual;
//			try {
//				dateToDateAtual = formatter.parse(atual.toString());
//			} catch (ParseException e) {
//				throw new RuntimeException("Erro para calcular datas");
//			} 
			
			
			Long result = ChronoUnit.DAYS.between(this.previsaoEntrega, atual);
			
			return result;
			
			
		
		
		}
	}
		
		public Long obterDiasEmAtraso2() {
			if ((this.entrega != null) && (this.aluno != null)) {
				System.out.println("A Publicação "+this.publicacao.getTitulo()+"já foi entregue pelo aluno "+this.aluno.getNome());
			}else {
			
//			data atual em Date	
				LocalDate atualLocalDate = LocalDate.now();
				
				DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date atualDate = new Date();
				//sdf.format(atualDate); //use to format string and print
				
//--------------------------------------------------------------------------------				
				// data to localdata
				String dataEntregaString = this.previsaoEntrega.toString();
				LocalDate dataEntregaLocalDate = LocalDate.parse(dataEntregaString);				
				
//--------------data em LocalDate-----------------------------------------------------------				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");
				
				LocalDate localDateNow = LocalDate.now();
				
				LocalDate previsaoEntregaLocalDate = this.previsaoEntrega.toInstant()
			      .atZone(null)
			      .toLocalDate();
				
				
				
				Long result = ChronoUnit.DAYS.between(localDateNow, previsaoEntregaLocalDate);
				
				
				return result;
				
				
				
				
				
				
				

				
				//local data to string
			//	LocalDate atual = LocalDate.now();
//				DateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
//				
//				
//				Date dateToDateAtual;
//				try {
//					dateToDateAtual = formatter.parse(atual.toString());
//				} catch (ParseException e) {
//					throw new RuntimeException("Erro para calcular datas");
//				} 
				
			//	Long result = ChronoUnit.DAYS.between(dataEntregaLocalDate, atual);
				
			//	return result;
				
				
			
			
			}
	}
	
	

}
