package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = " alura ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("alu"));
		System.out.println(outroVazio);
		
		String nome = "Alura"; //object literal
		//String outra = nome.toLowerCase();
		
			System.out.println(nome.length());
			
			for (int i = 0; i < nome.length(); i++) {
				System.out.println(nome.charAt(i));
			}
		
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
//		char c = 'A';
//		char d = 'a';	
//		String outra = nome.replace('A', 'a');
		
//		System.out.println(nome);
//		System.out.println(outra);

	}

}
