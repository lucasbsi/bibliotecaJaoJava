package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import biblioteca.*;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		//------------------- test data ok------------------------
		LocalDate previsaoEntrega = LocalDate.of(2021, 10, 20);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
		System.out.println(dtf);
		LocalDate localDateNow = LocalDate.now();
		
		System.out.println("now"+localDateNow);
		System.out.println("previsao"+previsaoEntrega);
		
//		LocalDate previsaoEntregaLocalDate = previsaoEntrega.toInstant()
//	      .atZone(null)
//	      .toLocalDate();
		
		Long result = ChronoUnit.DAYS.between(localDateNow, previsaoEntrega);
		System.out.println("result"+result);
		
		// ------------locando livro ok ---------------------------------------------------
		
		Area area = new Area((long)1, "Terror");
		Livro livro = new Livro((long)1, "Sherek Anao", 1, area, "9782123456803");
		System.out.println(livro);
		
		Aluno aluno = new Aluno((long)10, "Lucas Santana", "2016000009");
		System.out.println(aluno);
		
		Publicacao pub = new Publicacao() {
		};
		
		//Emprestimo emp = new Emprestimo(new Publicacao(livro.getId(), livro.getTitulo(), livro.getNumExemplares(), livro.getArea()), aluno, LocalDate.of(2021, 10, 19), LocalDate.of(2021, 10, 24), null);
		
		Emprestimo emp1 = new Emprestimo(livro, aluno, LocalDate.of(2021, 10, 19), LocalDate.of(2021, 10, 24), null);
		
		//System.out.println(emp);
		System.out.println(emp1);
		
		//----------------------------locar revista -----------
		//coming soon 
		
	}

}
