package br.com.zerobank.banco.testes;

import br.com.zerobank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22,33);
		
		System.out.println(cc.toString());
		

	}
	

}
