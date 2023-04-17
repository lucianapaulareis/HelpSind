package com.ufop.HelpSind.enums;

public enum PaymentSituation {
	
	P("Pago", "P"),
	N("Não foi pago", "N");
	
	private final String name;

	private final String sigla;
	public String getName() {
		return name;
	}

	public String getSigla(){return sigla;}

	private PaymentSituation(String name, String sigla) {
		this.name = name;
		this.sigla = sigla;
	}
}
