package ExerciciosCollection;

public class Erros {

	public static void main(String[] args) {
		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e) {
			System.out.println("A frase inicial � nula. Para solucionar tal problema foi-lhe atribu�do um valor default");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("Frase antiga: "+frase);
		System.out.println("Frase nova: "+novaFrase);
	}

}
