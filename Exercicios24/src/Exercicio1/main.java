package Exercicio1;

public class main {

	public static void main(String[] args) {
		Cachorro lhasa = new Cachorro("Yoshi", 3);
		
		Cavalo cavalow = new Cavalo("Pocot�",9);
		
		Preguica preguicosa = new Preguica ("Preguicinha", 30);
		
		System.out.println("O animal � um " + lhasa + " e seu nome � " + lhasa.getNome()+". Sua idade � "+lhasa.getIdade()
		+" anos e possui a capacidade de correr uma "+lhasa.capacidadeCorrer());
		
		System.out.println("O animal � um " + cavalow + " e seu nome � " + cavalow.getNome()+". Sua idade � "+cavalow.getIdade()
		+" anos e possui a capacidade de correr uma "+cavalow.capacidadeCorrer());
		
		System.out.println("O animal � uma "+preguicosa+" e seu nome � "+preguicosa.getNome()+". Sua idade � "+preguicosa.getIdade()
		+" anos e possui a capacidade de "+preguicosa.capacidadeEscalar());
		
	}

}
