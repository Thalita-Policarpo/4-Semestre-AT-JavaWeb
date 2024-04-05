package br.edu.infnet.thalitapolicarpo.model.domain;



public class MetragemMangueira {

    private Integer id;

    private Integer metragem;
   
    
    protected MetragemMangueira() {
    }

    public MetragemMangueira(Integer metragem) {
        this.metragem = metragem;
    }
    
    
    
    // getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMetragem() {
		return metragem;
	}

	public void setMetragem(Integer metragem) {
		this.metragem = metragem;
	}

    
    
}