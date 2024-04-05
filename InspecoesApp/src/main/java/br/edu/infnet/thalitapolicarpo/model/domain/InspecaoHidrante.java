package br.edu.infnet.thalitapolicarpo.model.domain;

import java.util.List;



public class InspecaoHidrante {
	
	private Integer id;

	private Hidrante hidrante;

//    private List<InspecaoUsuario> inspecaoUsuarios = new ArrayList<>();
	private String dataInspecao;
    private boolean sinalizado;
    private boolean desobstruido;
    private boolean possuiChaveStorz;
    private int quantidadeMangueiras;
    private String status;
    
    private List<MetragemMangueira> metragens;

    private List<ValidadeMangueira> validadesMangueiras;
    
            
	public InspecaoHidrante() {
		super();
	}

	
	

	public InspecaoHidrante(Hidrante hidrante,/* List<InspecaoUsuario> inspecaoUsuarios, */String dataInspecao,
			boolean sinalizado, boolean desobstruido, boolean possuiChaveStorz, int quantidadeMangueiras, String status,
			List<MetragemMangueira> metragens, List<ValidadeMangueira> validadesMangueiras) {
		super();
//		this.inspecaoUsuarios = inspecaoUsuarios;
		this.hidrante = hidrante;		
		this.dataInspecao = dataInspecao;
		this.sinalizado = sinalizado;
		this.desobstruido = desobstruido;
		this.possuiChaveStorz = possuiChaveStorz;
		this.quantidadeMangueiras = quantidadeMangueiras;
		this.status = status;
		this.metragens = metragens;
		this.validadesMangueiras = validadesMangueiras;
	}




	@Override
	public String toString() {
	    StringBuilder stringBuilder = new StringBuilder();
	    stringBuilder.append(getHidrante())
	    		.append("\nId=").append(id)
	            .append("\ndataInspecao=").append(dataInspecao)
	            .append("\nsinalizado=").append(sinalizado)
	            .append("\ndesobstruido=").append(desobstruido)
	            .append("\npossuiChaveStorz=").append(possuiChaveStorz)
	            .append("\nquantidadeMangueiras=").append(quantidadeMangueiras)
	            .append("\n");
	    
	    // Exibição das metragens
	    if (!metragens.isEmpty()) {
	        if (metragens.size() == 1) {
	            stringBuilder.append("metragem=").append(metragens.get(0).getMetragem());
	        } else {
	            for (int i = 0; i < metragens.size(); i++) {
	                stringBuilder.append("metragem mangueira ").append(i + 1).append(": ").append(metragens.get(i).getMetragem()).append("\n");
	            }
	        }
	    }

	    // Exibição das validades das mangueiras
	    if (!validadesMangueiras.isEmpty()) {
	        if (validadesMangueiras.size() == 1) {
	            stringBuilder.append("\nvalidadeMangueiras: ").append(validadesMangueiras.get(0).getValidade());
	        } else {
	            stringBuilder.append("\n");
	            for (int i = 0; i < validadesMangueiras.size(); i++) {
	                stringBuilder.append("validade mangueira ").append(i + 1).append(": ").append(validadesMangueiras.get(i).getValidade()).append("\n");
	            }
	        }
	    }

	    stringBuilder.append("\nStatus: ").append(status);
	    return stringBuilder.toString();
	}


	// Getters and Setters

	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public Hidrante getHidrante() {
		return hidrante;
	}




	public void setHidrante(Hidrante hidrante) {
		this.hidrante = hidrante;
	}




//	public List<InspecaoUsuario> getInspecaoUsuarios() {
//		return inspecaoUsuarios;
//	}
//
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




	public boolean isPossuiChaveStorz() {
		return possuiChaveStorz;
	}




	public void setPossuiChaveStorz(boolean possuiChaveStorz) {
		this.possuiChaveStorz = possuiChaveStorz;
	}




	public int getQuantidadeMangueiras() {
		return quantidadeMangueiras;
	}




	public void setQuantidadeMangueiras(int quantidadeMangueiras) {
		this.quantidadeMangueiras = quantidadeMangueiras;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public List<MetragemMangueira> getMetragens() {
		return metragens;
	}




	public void setMetragens(List<MetragemMangueira> metragens) {
		this.metragens = metragens;
	}




	public List<ValidadeMangueira> getValidadesMangueiras() {
		return validadesMangueiras;
	}




	public void setValidadesMangueiras(List<ValidadeMangueira> validadesMangueiras) {
		this.validadesMangueiras = validadesMangueiras;
	}


	

	
	
}
