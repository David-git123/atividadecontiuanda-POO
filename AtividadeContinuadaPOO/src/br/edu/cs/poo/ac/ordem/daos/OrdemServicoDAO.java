package br.edu.cs.poo.ac.ordem.daos;

import java.io.Serializable;

import br.edu.cs.poo.ac.ordem.entidades.OrdemServico;

public class OrdemServicoDAO extends DAOGenerico{

	
	public OrdemServicoDAO() {
		super(OrdemServico.class);
	}
	
	public OrdemServico buscar(String serial) {
		return (OrdemServico)cadastroObjetos.buscar(serial);
	}
	
	public boolean incluir(OrdemServico ordemServico) {
		if(buscar(ordemServico.getNumero())==null) {
			cadastroObjetos.incluir(ordemServico, ordemServico.getNumero());
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean alterar(OrdemServico ordemServico) {
		if(buscar(ordemServico.getNumero())!=null) {
			cadastroObjetos.alterar(ordemServico, ordemServico.getNumero());
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean excluir(String numero) {
		if(buscar(numero)!= null) {
			cadastroObjetos.excluir(numero);
			return true;
		}
		else {
			return false;
		}
	}
	
	public OrdemServico[] procurarTodos() {
		Serializable[] todos = cadastroObjetos.buscarTodos();
		OrdemServico[] retorno;
		if(todos!=null && todos.length>0) {
			retorno = new OrdemServico[todos.length];
			
			for(int i=0; i<todos.length;i++) {
				retorno[i] = (OrdemServico)todos[i];
			}
			return retorno;	
		}
		else {
			return new OrdemServico[0];
		}
	}

}
