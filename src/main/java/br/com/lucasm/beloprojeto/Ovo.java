package br.com.lucasm.beloprojeto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ovo {

	private Integer tamanho;
	private Integer fritada;
	private Boolean quebrado;

	public Ovo(Integer tamanho) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o tamanho do ovo: ");
		this.tamanho = Integer.valueOf(ler.next());
		System.out.println("Informe quanto tempo deseja fritar o ovo: ");
		this.fritada = Integer.valueOf(ler.next());
		this.quebrado = false;
	}

	public void fritar() {
		if (!this.quebrado) {
			throw new RuntimeException("nao pode fritar ovo sem quebrar");
		}
		this.fritada++;
	}

	public void quebrar() {
		this.quebrado = true;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public Boolean isQuebrado() {
		return quebrado;
	}

	public EnumStatusOvo getStatus() {

		BigDecimal t = BigDecimal.valueOf(tamanho);
		BigDecimal f = BigDecimal.valueOf(fritada);
		BigDecimal cal = f.divide(t, 2, RoundingMode.FLOOR);


		if (tamanho > 0 && fritada > 0) {

			if (cal.compareTo(BigDecimal.valueOf(50)) < 0) {
				return EnumStatusOvo.CRU;
			}

			if (cal.compareTo(BigDecimal.valueOf(75)) < 0) {
				return EnumStatusOvo.MEIOCRU;
			}

			if (cal.compareTo(BigDecimal.valueOf(100)) < 0) {
				return EnumStatusOvo.DELICIA;
			}

			if (cal.compareTo(BigDecimal.valueOf(125)) < 0) {
				return EnumStatusOvo.MEIOQUEIMADO;
			}
			return EnumStatusOvo.QUEIMADO;
		}
		return EnumStatusOvo.CRU;
	}
}