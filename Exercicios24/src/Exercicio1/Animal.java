package Exercicio1;


public class Animal {
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(final int idade) {
		this.idade = idade;
	}
	
	
	
}


/*2-	Implemente um programa que crie os 3 tipos de animais definidos
 *  no exercício anterior e invoque o método que emite o som de cada um
 *   de forma polimórfica, isto é, independente do tipo de animal.*/