package Exercicio1;

public class Cavalo extends Animal{
	private String som;
	private String correr;
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String emitirSom() {
		return "relincha";
	}
	
	public String capacidadeCorrer() {
		return "longa distância! :)";
	}
	
	@Override
	public String toString() {
		return "cavalo";
	}
}

/*2-	Implemente um programa que crie os 3 tipos de animais definidos
 *  no exercício anterior e invoque o método que emite o som de cada um
 *   de forma polimórfica, isto é, independente do tipo de animal.*/