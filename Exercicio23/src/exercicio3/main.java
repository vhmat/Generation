	package exercicio3;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		ProdutoEletronico produto1 = new ProdutoEletronico();
		
		System.out.println("Digite o tipo do produto: ");
		produto1.setTipo(read.next());
		
		System.out.println("Digite o nome do produto: ");
		produto1.setNome(read.next());
		
		System.out.println("Digite a marca do produto: ");
		produto1.setMarca(read.next());
		
		System.out.println("Digite a tens�o do produto: ");
		produto1.setTensao(read.next());
		
		System.out.println("Digite o pre�o do produto: ");
		produto1.setPreco(read.nextDouble());
		
		System.out.println("Digite a quantidade do produto: ");
		produto1.setQuantidade(read.nextInt());
		
		
		
		System.out.println("O tipo do produto � "+produto1.getTipo()+", o nome do produto � "+produto1.getNome()+", sua marca � "+produto1.getMarca()+" a tens�o do produto � igual a "+ produto1.getTensao()+"v."
		+"\nO pre�o unit�rio � de R$"+produto1.getPreco()+". Se voc� comprar "+produto1.getQuantidade()+", o total ser� de R$"+((produto1.getPreco()*produto1.getQuantidade())));

	}

}

/*
 * 	private String tipo;
	private String nome;
	private String marca;
	private double preco;
	private int quantidade;
	private String tensao;
	 *  Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe,
 *  
 *  em seguida crie um objeto produto eletr�nico, 
 *  defina as instancias deste objeto e 
 *  apresente as informa��es deste objeto no console.
*/
