package br.edu.cs.poo.ac.ordem.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Desktop {
	 	private boolean ehServidor;

	    public Desktop(boolean ehServidor) {
	        this.ehServidor = ehServidor;
	    }

	    public String getIdTipo(){
	        return "DE";
	    }
}
