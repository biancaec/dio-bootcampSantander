package bancoOO;

import bancoOO.model.Agencia;
import bancoOO.model.Banco;
import bancoOO.model.Conta;

public class Main {

	public static void main(String[] args) {
		
		Banco banco1 = new Banco(1, "Banco UM");
		banco1.criarAgencia("Agencia UM do Banco UM");
		banco1.criarCliente("Cliente UM");
		
		Agencia agencia1 = banco1.getAgenciaByNumero(1);
		agencia1.criarContaCorrente(banco1, 1);
		
		Conta conta1 = agencia1.getContaByNumero(11);
		conta1.depositar(30f);
		conta1.mostrarSaldo();
		
	}

}
