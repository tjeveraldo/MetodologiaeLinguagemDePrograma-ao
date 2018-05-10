package br.unipe.cc.exceptions;

public class ContaCorrente {
	private float valor = 100.0f;
	private String nome = "Everaldo";
	private int numeroConta = 123456;
	
	public void sacar(float valorSaque) throws SaldoInsuficiente {
		
		if(this.valor > valorSaque)
			this.valor -= valorSaque;
		else
			throw new SaldoInsuficiente();
		
	}
	
	public void buscaCliente(String nomeCliente) throws ClienteNaoEncontrado{
		
		if(this.nome == nomeCliente)
			System.out.println("Cliente encontrado.");
		
		else
			throw new ClienteNaoEncontrado();
	}
	
	public void buscaConta(int numeroConta) throws ContaNaoEncontrada {
		
		if(this.numeroConta == numeroConta)
			System.out.println("Conta nao encontrada.");
		
		else
			throw new ContaNaoEncontrada();
	}	

}
