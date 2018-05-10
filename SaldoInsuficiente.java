package br.unipe.cc.exceptions;

public class SaldoInsuficiente extends Exception {
	
	public SaldoInsuficiente() {
		super("Sem saldo na conta");
	}

}
