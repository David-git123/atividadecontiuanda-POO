package br.edu.cs.poo.ac.ordem.daos;

import java.io.Serializable;

import br.edu.cs.poo.ac.ordem.entidades.Notebook;

public class NotebookDAO extends DAOGenerico{
	
	
	public NotebookDAO() {
		super(Notebook.class);
	}
	
	public Notebook buscar(String serial) {
		return (Notebook)cadastroObjetos.buscar(serial);
	}
	
	public boolean incluir(Notebook notebook) {
		if(buscar(notebook.getSerial())==null) {
			cadastroObjetos.incluir(notebook, notebook.getSerial());
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean alterar(Notebook notebook) {
		if(buscar(notebook.getSerial())!=null) {
			cadastroObjetos.alterar(notebook, notebook.getSerial());
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean excluir(String serial) {
		if(buscar(serial)!= null) {
			cadastroObjetos.excluir(serial);
			return true;
		}
		else {
			return false;
		}
	}
	
	public Notebook[] procurarTodos() {
		Serializable[] todos = cadastroObjetos.buscarTodos();
		Notebook[] retorno;
		if(todos!=null && todos.length>0) {
			retorno = new Notebook[todos.length];
			
			for(int i=0; i<todos.length;i++) {
				retorno[i] = (Notebook)todos[i];
			}
			return retorno;	
		}
		else {
			return new Notebook[0];
		}
	}
}
