package bancoOO.model;

public abstract class Conta {
	
	private String numero;
	private Agencia agencia;
	private Cliente cliente;
	protected Float saldo;
	
	public Conta(Integer numero, Agencia agencia, Cliente cliente) {
		this.numero = numero.toString() + agencia.getNumero().toString();
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = 0f;
	}
	
	public void depositar(Float valor) {
		saldo += valor;
	}
	public void sacar(Float valor) {
		saldo -= valor;
	}
	public void transferir(Float valor, Conta conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}
	
	public abstract void mostrarSaldo();
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

}
