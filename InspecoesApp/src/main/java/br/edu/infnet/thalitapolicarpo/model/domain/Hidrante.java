package br.edu.infnet.thalitapolicarpo.model.domain;


public class Hidrante extends Equipamento {
	

	private Integer id;
    private String dataDeInstalacao;
    private String alturaDeFixacao;
    private String tipoDeHidrante;
      
    
	public Hidrante() {
		super();
	}

	public Hidrante(int numeroControleInterno, String localizacao, String dataDeInstalacao, String alturaDeFixacao, String tipoDeHidrante) {
		super(numeroControleInterno, localizacao);
		this.dataDeInstalacao = dataDeInstalacao;
		this.alturaDeFixacao = alturaDeFixacao;
		this.tipoDeHidrante = tipoDeHidrante;
		
		
	}

	@Override
	public String toString() {
		return 	"Id: " + getId()
				+ super.toString()
				+ "Data de instalação: " + dataDeInstalacao 
				+ "\nAltura de fixação: " + alturaDeFixacao
				+ "\nTipo de Hidrante: " + tipoDeHidrante; 
	}

	
	// Getters and Setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDataDeInstalacao() {
		return dataDeInstalacao;
	}

	public void setDataDeInstalacao(String dataDeInstalacao) {
		this.dataDeInstalacao = dataDeInstalacao;
	}

	public String getAlturaDeFixacao() {
		return alturaDeFixacao;
	}

	public void setAlturaDeFixacao(String alturaDeFixacao) {
		this.alturaDeFixacao = alturaDeFixacao;
	}

	public String getTipoDeHidrante() {
		return tipoDeHidrante;
	}

	public void setTipoDeHidrante(String tipoDeHidrante) {
		this.tipoDeHidrante = tipoDeHidrante;
	}

}
