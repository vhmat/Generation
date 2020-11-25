package Exercicio1;

public class Preguica extends Animal{
	private String som;
	private String escalar;
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	public String getEscalar() {
		return escalar;
	}

	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	public String emitirSom() {
		return "desconhecido";
	}
	
	public String capacidadeEscalar() {
		return "escalar �rvores! :)";
	}
	
	@Override
	public String toString() {
		return "pregui�a";
	}
}

/*2-	Implemente um programa que crie os 3 tipos de animais definidos
 *  no exerc�cio anterior e invoque o m�todo que emite o som de cada um
 *   de forma polim�rfica, isto �, independente do tipo de animal.*/