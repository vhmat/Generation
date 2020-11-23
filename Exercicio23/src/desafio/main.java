package desafio;

import java.util.*;

public class main {
	public static void main (String[] args) {
		Scanner read = new Scanner (System.in);

		Fornecedor mateus = new Fornecedor("Mateus Vaz", 23, "R. Jo�o Cancian, 161", "(19) 6578-9087", 1500, 2500);
		System.out.println(mateus.getNome()+", a sua idade � "+mateus.getIdade()+" anos e o seu saldo � de R$"+mateus.obterSaldo(mateus.getValorCredito(), mateus.getValorDivida())+"\n");
		
		Empregado chagas = new Empregado ("Lucas Chagas", 24, "R. Jo�o Cancian, 164", "(19) 6578-9447", 02, 6000, 0.5);
		System.out.println(chagas.getNome()+", a sua idade � "+chagas.getIdade()+" anos e seu sal�rio l�quido � de R$"+chagas.calcularSalario(chagas.getSalarioBase(), chagas.getImposto())+"\n");
		
		
		Operario correa = new Operario ("Lucas Correa", 29, "R. Jo�o Cancian, 145", "(19) 6578-9087", 30000, 0.05);
		System.out.println(correa.getNome()+", a sua idade � "+correa.getIdade()+ " anos e a sua comiss�o � de R$"+ correa.calculaComissao(correa.getValorProducao(), correa.getComissao())+"\n");
		
		Vendedor marcelo = new Vendedor ("Marcelo Anci�o", 75, "R. Jo�o Cancian, 140", "(19) 6456-9027", 50000, 0.08);
		System.out.println(marcelo.getNome()+", a sua idade � " +marcelo.getIdade()+ " anos e sua comiss�o � de R$"+ marcelo.calculaComissaoVendedor(marcelo.getValorVendas(), marcelo.getComissao()));
	}
	
}
