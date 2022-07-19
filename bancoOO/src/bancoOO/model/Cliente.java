package bancoOO.model;

public class Cliente {
	private Integer numero;
	private String nome;
	
	public Cliente(Integer numero, String nome) {
		this.setNumero(numero);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
}
