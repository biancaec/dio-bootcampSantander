package bancoOO.model;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Integer numero, Agencia agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}
	
	public void mostrarSaldo() {
		System.out.println("==== SALDO POUPANCA ====");
		System.out.println(String.format("Saldo: %.2f", saldo));
	}
}
