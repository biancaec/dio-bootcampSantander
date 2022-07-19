package bancoOO.model;

import java.util.HashSet;
import java.util.Set;

public class Banco {
	private Integer numero;
	private String nome;
	private Set<Agencia> agencias = new HashSet<Agencia>();
	private Set<Cliente> clientes = new HashSet<Cliente>();
	
	private static int AGENCIA = 1;
	private static int CLIENTE = 1;
	
	public Banco(Integer numero, String nome) {
		this.setNumero(numero);
		this.setNome(nome);
	}
	
	public void criarAgencia(String nome){
		agencias.add(new Agencia(AGENCIA, nome));
		AGENCIA++;
	}
	
	public void criarCliente(String nome) {
		clientes.add(new Cliente(CLIENTE, nome));
		CLIENTE++;
	}
	
	public Cliente getClienteByNumero(Integer numero) {
		Cliente cliente = clientes.stream()
									.filter(e -> e.getNumero() == numero)
									.findFirst().get();
		return cliente;
	}
	public Agencia getAgenciaByNumero(Integer numero) {
		Agencia agencia = agencias.stream()
									.filter(e -> e.getNumero() == numero)
									.findFirst().get();
		return agencia;
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
}
