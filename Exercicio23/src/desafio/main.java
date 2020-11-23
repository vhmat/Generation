package desafio;

import java.util.*;

public class main {
	public static void main (String[] args) {
		Scanner read = new Scanner (System.in);

		Fornecedor mateus = new Fornecedor("Mateus Vaz", 23, "R. João Cancian, 161", "(19) 6578-9087", 1500, 2500);
		System.out.println(mateus.getNome()+", a sua idade é "+mateus.getIdade()+" anos e o seu saldo é de R$"+mateus.obterSaldo(mateus.getValorCredito(), mateus.getValorDivida())+"\n");
		
		Empregado chagas = new Empregado ("Lucas Chagas", 24, "R. João Cancian, 164", "(19) 6578-9447", 02, 6000, 0.5);
		System.out.println(chagas.getNome()+", a sua idade é "+chagas.getIdade()+" anos e seu salário líquido é de R$"+chagas.calcularSalario(chagas.getSalarioBase(), chagas.getImposto())+"\n");
		
		
		Operario correa = new Operario ("Lucas Correa", 29, "R. João Cancian, 145", "(19) 6578-9087", 30000, 0.05);
		System.out.println(correa.getNome()+", a sua idade é "+correa.getIdade()+ " anos e a sua comissão é de R$"+ correa.calculaComissao(correa.getValorProducao(), correa.getComissao())+"\n");
		
		Vendedor marcelo = new Vendedor ("Marcelo Ancião", 75, "R. João Cancian, 140", "(19) 6456-9027", 50000, 0.08);
		System.out.println(marcelo.getNome()+", a sua idade é " +marcelo.getIdade()+ " anos e sua comissão é de R$"+ marcelo.calculaComissaoVendedor(marcelo.getValorVendas(), marcelo.getComissao()));
	}
	
}
