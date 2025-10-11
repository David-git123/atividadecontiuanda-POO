package br.edu.cs.poo.ac.ordem.entidades;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Notebook extends Equipamento{
    private boolean carregaDadosSensiveis;

  

    public Notebook(String serial, String descricao, boolean ehNovo, double valorEstimado,
			boolean carregaDadosSensiveis) {
		super(serial, descricao, ehNovo, valorEstimado);
		this.carregaDadosSensiveis = carregaDadosSensiveis;
	}

    

	public String getIdTipo(){
		Equipamento equipamento = new Equipamento;
        return "NO";
    }

	
}
