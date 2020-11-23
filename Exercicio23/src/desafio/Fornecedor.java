package desafio;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor (String nome) {
		super (nome);
	}
	
	public Fornecedor(String nome, int idade, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, idade, endereco, telefone);
		this.setValorCredito(valorCredito);
		this.setValorDivida(valorDivida);
	}
	
	public Fornecedor(String nome, int idade, double valorCredito, double valorDivida) {
		super(nome, idade);
		this.setValorCredito(valorCredito);
		this.setValorDivida(valorDivida);
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo (double valorCredito, double valorDivida) {
		//this.valorDivida = valorDivida;
		//this.valorCredito = valorCredito;
		
		return (valorCredito-valorDivida);
	}
	
	
	
}
