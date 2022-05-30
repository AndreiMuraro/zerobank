package br.com.zerobank.banco.testes;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Andrei"; //Object Literal
		//String outro = new String("Muraro");
		
		nome = nome.replace("A", "o");
		String outro = nome.replace("A", "a");
		
		System.out.println(nome);
	}

}
