package bancoOO.model;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Integer numero, Agencia agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}
	
	public void mostrarSaldo() {
		System.out.println("==== SALDO CONTA CORRENTE ====");
		System.out.println(String.format("Saldo: %.2f", saldo));
	}
}
