package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 23);
		guardador.adicionar(cc);
		
		Conta cc1 = new ContaCorrente(22, 22);
		guardador.adicionar(cc1);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencias(1);
		System.out.println(ref.getNumero());
		
		Object ref1 = guardador.getReferencias(0);
		System.out.println(ref.getNumero());
			
		
	}

}
