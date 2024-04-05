package br.edu.infnet.thalitapolicarpo.model.domain;




public class ValidadeMangueira {

    private Integer id;

    private String validade;


    
    public ValidadeMangueira() {
	}

	public ValidadeMangueira(String validade) {
    	this.validade = validade;
    }
    
    // getters and setters
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

    
}