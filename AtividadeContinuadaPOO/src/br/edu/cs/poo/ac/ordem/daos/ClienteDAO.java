package br.edu.cs.poo.ac.ordem.daos;

import java.io.Serializable;

import br.edu.cs.poo.ac.ordem.entidades.Cliente;

public class ClienteDAO extends DAOGenerico{
	
	public ClienteDAO() {
		super(Cliente.class);
	}
	
	public ClienteDAO procurar(String codigo) {
		return (ClienteDAO)cadastroObjetos.buscar(codigo);		
	}
	
	public boolean adicionar(Cliente cliente) {
		if(procurar(cliente.getCpfCnpj())==null) {
			cadastroObjetos.incluir(cliente, cliente.getCpfCnpj());
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean alterar(Cliente cliente){
		
		if(procurar(cliente.getCpfCnpj())!=null) {
			cadastroObjetos.alterar(cliente, cliente.getCpfCnpj());
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean excluir(Cliente cliente) {
		if(procurar(cliente.getCpfCnpj()) != null) {
			cadastroObjetos.excluir(cliente.getCpfCnpj());
			return true;
		}
		else {
			return false;
		}
	}
	
	public Cliente[] procurarTodos() {
		Serializable[] todos = cadastroObjetos.buscarTodos();
		Cliente[] retorno;
		if(todos!=null && todos.length>0) {
			retorno = new Cliente[todos.length];
			
			for(int i=0; i<todos.length;i++) {
				retorno[i] = (Cliente)todos[i];
			}
			return retorno;	
		}
		else {
			return new Cliente[0];
		}
	}
	
	
	
	
}	