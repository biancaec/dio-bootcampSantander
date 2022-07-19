package bancoOO.model;

import java.util.HashSet;
import java.util.Set;

public class Agencia {
	
	private static int CONTA = 1;
	
	private Integer numero;
	private String nome;
	private Set<Conta> contas = new HashSet<Conta>();
	
	public Agencia(Integer numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public void criarContaCorrente(Banco banco, Integer numeroCliente) {
		Cliente cliente = banco.getClienteByNumero(numeroCliente);
		contas.add(new ContaCorrente(CONTA, this, cliente));
		CONTA++;
	}
	
	public void criarContaPoupanca(Banco banco, Integer numeroCliente) {
		Cliente cliente = banco.getClienteByNumero(numeroCliente);
		contas.add(new ContaPoupanca(CONTA, this, cliente));
		CONTA++;
	}
	
	public Conta getContaByNumero(Integer numeroConta) {
		Conta conta = contas.stream()
							.filter(e -> Integer.parseInt(e.getNumero()) == numeroConta)
							.findFirst().get();
		return conta;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Agencia [numero=" + numero + ", nome=" + nome + ", contas=" + contas + "]";
	}
	
	
}
