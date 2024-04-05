package br.edu.infnet.thalitapolicarpo.model.domain;


public class Extintor extends Equipamento {
	
    private Integer id;
    private String numeroCilindro;
    private String numeroSeloInmetro;
    private String cargaExtintora;
    

    public Extintor() {
    	super();
    }
	
	public Extintor(int numeroControleInterno, String localizacao, String numeroCilindro, String numeroSeloInmetro, String cargaExtintora) {
		super(numeroControleInterno, localizacao);
		this.numeroCilindro = numeroCilindro;
		this.numeroSeloInmetro = numeroSeloInmetro;
		this.cargaExtintora = cargaExtintora;
		

	}



	@Override
	public String toString() {
		return "\nId:" + getId()
				+ super.toString()				 
				+ "\nExtintor:" + getNumeroCilindro()
				+ "\nSelo do Inmetro:" + getNumeroSeloInmetro()
				+ "\nCarga Extintora:" + getCargaExtintora();
	}

	
	// Getters and Setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroCilindro() {
		return numeroCilindro;
	}

	public void setNumeroCilindro(String numeroCilindro) {
		this.numeroCilindro = numeroCilindro;
	}

	public String getNumeroSeloInmetro() {
		return numeroSeloInmetro;
	}

	public void setNumeroSeloInmetro(String numeroSeloInmetro) {
		this.numeroSeloInmetro = numeroSeloInmetro;
	}

	public String getCargaExtintora() {
		return cargaExtintora;
	}

	public void setCargaExtintora(String cargaExtintora) {
		this.cargaExtintora = cargaExtintora;
	}




}
