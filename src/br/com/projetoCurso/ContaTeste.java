package br.com.projetoCurso;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = "Daniel";
		conta.saldo = 4_000.00;
		conta.exibesaldo();
		
		// conta.saque(2000);
		// conta.exibesaldo();
		
		// conta.deposita(8000);
		// conta.exibesaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Carlos";
		destino.saldo = 5_000.00;
		destino.exibesaldo();
		
		conta.transferenciaValor(destino, 1000);
		System.out.println();
		conta.exibesaldo();
		destino.exibesaldo();
		
	}

}
