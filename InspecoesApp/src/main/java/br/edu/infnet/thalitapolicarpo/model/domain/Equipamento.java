package br.edu.infnet.thalitapolicarpo.model.domain;


public abstract class Equipamento {
	
	
	private Integer id;
	protected int numeroControleInterno;
    protected String localizacao;
    
    
	public Equipamento() {
		
	}


	public Equipamento(int numeroControleInterno, String localizacao) {
		this.numeroControleInterno = numeroControleInterno;
		this.localizacao = localizacao;
	}

	@Override
	public String toString() {
		return "NºControle Interno: " + numeroControleInterno 
				+ "\nLocalização: " + localizacao;
	}

	
	// Getters and Setters

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public int getNumeroControleInterno() {
		return numeroControleInterno;
	}


	public void setNumeroControleInterno(int numeroControleInterno) {
		this.numeroControleInterno = numeroControleInterno;
	}


	public String getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	

    
	
	
    
}
