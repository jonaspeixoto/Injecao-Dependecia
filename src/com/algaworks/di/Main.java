package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.service.AtivacaoCliente;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("joao", "joao@321.com", "321321");
		
		AtivacaoCliente ativarCliente = new AtivacaoCliente();
		ativarCliente.ativar(c1);
	}
}
