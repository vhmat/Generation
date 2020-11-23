package desafio;

public class Administrador extends Pessoa{

	private double ajudaDeCusto;
	
	public Administrador(String nome, int idade, String endereco, String telefone, double ajudaDeCusto) {
		super(nome, idade, endereco, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}
}
