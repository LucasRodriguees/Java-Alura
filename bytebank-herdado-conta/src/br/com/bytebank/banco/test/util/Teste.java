package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 23);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(22, 22);
		lista.add(cc1);
		
		System.out.println(" Tamanho: " + lista.size());
		
		Conta ref =  lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println(" Tamanho: " +lista.size());
		
		Conta cc2 = new ContaCorrente(33, 13);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(10, 20);
		lista.add(cc3);
		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("-------------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
