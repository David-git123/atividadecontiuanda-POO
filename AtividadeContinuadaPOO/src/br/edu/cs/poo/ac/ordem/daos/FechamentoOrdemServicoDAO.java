package br.edu.cs.poo.ac.ordem.daos;

import java.io.Serializable;

import br.edu.cs.poo.ac.ordem.entidades.FechamentoOrdemServico;

public class FechamentoOrdemServicoDAO extends DAOGenerico{
	
	public FechamentoOrdemServicoDAO() {
		super(FechamentoOrdemServicoDAO.class);
	}
	
	public FechamentoOrdemServico buscar(String numeroOrdemServico) {
		return (FechamentoOrdemServico)cadastroObjetos.buscar(numeroOrdemServico);		
	}
	
	public boolean incluir(Cliente cliente) {
		if(buscar(cliente.getCpfCnpj())==null) {
			cadastroObjetos.incluir(cliente, cliente.getCpfCnpj());
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean alterar(Cliente cliente){
		
		if(buscar(cliente.getCpfCnpj())!=null) {
			cadastroObjetos.alterar(cliente, cliente.getCpfCnpj());
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean excluir(String cpfCnpj) {
		if(buscar(cpfCnpj) != null) {
			cadastroObjetos.excluir(cpfCnpj);
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
