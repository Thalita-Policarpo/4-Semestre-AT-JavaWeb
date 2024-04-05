package br.edu.infnet.thalitapolicarpo.model.domain;

public class InspecaoExtintor {
	

	private Integer id;
    private Extintor extintor;
//    private List<InspecaoUsuario> inspecaoUsuarios = new ArrayList<>();
    private String dataInspecao;
    private boolean sinalizado;
    private boolean desobstruido;
    private boolean manometroPressaoAdequada;
    private String status;

    public InspecaoExtintor() { }

    

    public InspecaoExtintor(Extintor extintor, /*List<InspecaoUsuario> inspecaoUsuarios,*/ String dataInspecao,
			boolean sinalizado, boolean desobstruido, boolean manometroPressaoAdequada, String status) {
		super();
		this.extintor = extintor;
//		this.inspecaoUsuarios = inspecaoUsuarios;
		this.dataInspecao = dataInspecao;
		this.sinalizado = sinalizado;
		this.desobstruido = desobstruido;
		this.manometroPressaoAdequada = manometroPressaoAdequada;
		
		this.status = status;
	}



	@Override
	public String toString() {
		return  "Id: " + getId()
				+"\nData da Inspeção: " + dataInspecao
				+ "\nSinalizado: " + sinalizado
				+ "\nDesobstruido: " + desobstruido
				+ "\nManometro com pressão adequada: " + manometroPressaoAdequada
				+ "\nSituação do equipamento: " + status;
	}


	// Getters and Setters 
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Extintor getExtintor() {
		return extintor;
	}



	public void setExtintor(Extintor extintor) {
		this.extintor = extintor;
	}



//	public List<InspecaoUsuario> getInspecaoUsuarios() {
//		return inspecaoUsuarios;
//	}
//
//
//
//	public void setInspecaoUsuarios(List<InspecaoUsuario> inspecaoUsuarios) {
//		this.inspecaoUsuarios = inspecaoUsuarios;
//	}



	public String getDataInspecao() {
		return dataInspecao;
	}



	public void setDataInspecao(String dataInspecao) {
		this.dataInspecao = dataInspecao;
	}



	public boolean isSinalizado() {
		return sinalizado;
	}



	public void setSinalizado(boolean sinalizado) {
		this.sinalizado = sinalizado;
	}



	public boolean isDesobstruido() {
		return desobstruido;
	}



	public void setDesobstruido(boolean desobstruido) {
		this.desobstruido = desobstruido;
	}



	public boolean isManometroPressaoAdequada() {
		return manometroPressaoAdequada;
	}



	public void setManometroPressaoAdequada(boolean manometroPressaoAdequada) {
		this.manometroPressaoAdequada = manometroPressaoAdequada;
	}




	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
    
 
}
