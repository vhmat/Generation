package desafio;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private double comissao;
	
	public Vendedor (String nome, int idade, String endereco, String telefone, double valorVendas, double comissao) {
		super(nome, idade, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calculaComissaoVendedor (double valorVendas, double comissao) {
		return (valorVendas*comissao);
	}
}
