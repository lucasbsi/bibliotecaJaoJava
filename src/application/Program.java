package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hello world");
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
	}

}
