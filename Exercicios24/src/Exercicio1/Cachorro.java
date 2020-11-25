package Exercicio1;

public class Cachorro extends Animal{
	private String som;
	private String correr;
	
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

	public String getSom() {
		return som;
	}
	
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public String getCorrer() {
		return correr;
	}
	
	public void setSom(String som) {
		this.som = som;
	}
	
	public String emitirSom() {
		return "late";
	}

	public String capacidadeCorrer() {
		return "curta distância! :)";
	}
	
	@Override
	public String toString() {
		return "cachorro";
	}
	
	
	
}

/*2-	Implemente um programa que crie os 3 tipos de animais definidos
 *  	no exercício anterior e invoque o método que emite o som de cada um
 *   	de forma polimórfica, isto é, independente do tipo de animal.*/