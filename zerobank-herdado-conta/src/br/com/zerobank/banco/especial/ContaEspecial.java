package br.com.zerobank.banco.especial;

import br.com.zerobank.banco.modelo.Conta;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
