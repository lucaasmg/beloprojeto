package br.com.lucasm.beloprojeto;

import java.time.LocalDate;

public class Pessoa {

	private LocalDate dataNascimento;

	public Pessoa(LocalDate niver) {
		this.dataNascimento = niver;
	}

	public Integer getIdade() {
		LocalDate hj = LocalDate.now();
		LocalDate nasc = this.dataNascimento;

		Integer idade = hj.getYear() - nasc.getYear();
		int mesNiver = nasc.getMonthValue();
		Integer diaNiver = nasc.getDayOfMonth();

		int mesAtual = hj.getMonthValue();
		Integer diaAtual = hj.getDayOfMonth();

		Boolean niverOk = mesNiver < mesAtual || (mesNiver == mesAtual && diaNiver <= diaAtual);
		if (!niverOk) {
			idade--;
		}
		return idade;
	}

}
