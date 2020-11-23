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
		
		System.out.println("Digite a tensão do produto: ");
		produto1.setTensao(read.next());
		
		System.out.println("Digite o preço do produto: ");
		produto1.setPreco(read.nextDouble());
		
		System.out.println("Digite a quantidade do produto: ");
		produto1.setQuantidade(read.nextInt());
		
		
		
		System.out.println("O tipo do produto é "+produto1.getTipo()+", o nome do produto é "+produto1.getNome()+", sua marca é "+produto1.getMarca()+" a tensão do produto é igual a "+ produto1.getTensao()+"v."
		+"\nO preço unitário é de R$"+produto1.getPreco()+". Se você comprar "+produto1.getQuantidade()+", o total será de R$"+((produto1.getPreco()*produto1.getQuantidade())));

	}

}

/*
 * 	private String tipo;
	private String nome;
	private String marca;
	private double preco;
	private int quantidade;
	private String tensao;
	 *  Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe,
 *  
 *  em seguida crie um objeto produto eletrônico, 
 *  defina as instancias deste objeto e 
 *  apresente as informações deste objeto no console.
*/
