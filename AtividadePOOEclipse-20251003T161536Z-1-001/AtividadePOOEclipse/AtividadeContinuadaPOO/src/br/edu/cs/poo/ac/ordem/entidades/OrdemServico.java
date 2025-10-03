package br.edu.cs.poo.ac.ordem.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor

public class OrdemServico implements Serializable{
	
    private Cliente cliente;
    private PrecoBase precoBase;
    private Notebook notebook;
    private Desktop desktop;
    private LocalDateTime dataHoraAbertura;
    private int prazoEmDias;
    private double valor;

    public LocalDateTime getDataEstimadaEntrega(){

       LocalDateTime dataEstimada = dataHoraAbertura.plusDays(prazoEmDias);
       return dataEstimada;
    }
    
    public String getNumero() {
    	if(notebook != null) {
    		if(cliente.getCpfCnpj().length() >= 14) {
    			
    			return notebook.getIdTipo() + dataHoraAbertura; 
    		}else {
    			return notebook.getIdTipo() + dataHoraAbertura + "000";
    		}
    	}
    	else if(desktop != null) {
    		if(cliente.getCpfCnpj().length() >= 14) {
    			
    			return desktop.getIdTipo() + dataHoraAbertura; 
    		}else {
    			return desktop.getIdTipo() + dataHoraAbertura + "000";
    		}
    	}
    	return null;
    }

}
