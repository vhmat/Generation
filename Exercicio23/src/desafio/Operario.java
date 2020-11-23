package desafio;

public class Operario extends Pessoa{
	
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, int idade, String endereco, String telefone, double valorProducao, double comissao) {
		super(nome, idade, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double calculaComissao (double valorProducao, double comissao) {
		return (valorProducao*comissao);
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
