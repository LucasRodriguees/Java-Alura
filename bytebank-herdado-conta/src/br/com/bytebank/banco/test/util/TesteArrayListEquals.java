package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		Conta cc = new ContaCorrente(22, 23);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(22, 22);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(22, 22);
		
		boolean existe = lista.contains(cc2);
		
		System.out.println("já existe ? " + existe);
		
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
