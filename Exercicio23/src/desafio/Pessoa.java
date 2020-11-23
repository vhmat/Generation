package desafio;

public class Pessoa {
	private String nome;
	private int idade;
	private String endereco;
	private String telefone;
	
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, int idade, String endereco, String telefone) {
		//super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;	
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		//super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome) {
		//super();
		this.nome = nome;
	}
	
	public Pessoa(String nome, int idade) {
		//super();
		this.nome = nome;
		this.idade = idade;
	}

}
