package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.NotificadorEmail;

public class AtivacaoCliente {
	
	public void ativar(Cliente cliente) {
		cliente.Ativar();
		
		NotificadorEmail notificador = new NotificadorEmail();
		notificador.notificar(cliente, "Seu cadastro está ativo");
	}
}
