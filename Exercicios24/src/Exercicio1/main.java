package Exercicio1;

public class main {

	public static void main(String[] args) {
		Cachorro lhasa = new Cachorro("Yoshi", 3);
		
		Cavalo cavalow = new Cavalo("Pocotó",9);
		
		Preguica preguicosa = new Preguica ("Preguicinha", 30);
		
		System.out.println("O animal é um " + lhasa + " e seu nome é " + lhasa.getNome()+". Sua idade é "+lhasa.getIdade()
		+" anos e possui a capacidade de correr uma "+lhasa.capacidadeCorrer());
		
		System.out.println("O animal é um " + cavalow + " e seu nome é " + cavalow.getNome()+". Sua idade é "+cavalow.getIdade()
		+" anos e possui a capacidade de correr uma "+cavalow.capacidadeCorrer());
		
		System.out.println("O animal é uma "+preguicosa+" e seu nome é "+preguicosa.getNome()+". Sua idade é "+preguicosa.getIdade()
		+" anos e possui a capacidade de "+preguicosa.capacidadeEscalar());
		
	}

}
