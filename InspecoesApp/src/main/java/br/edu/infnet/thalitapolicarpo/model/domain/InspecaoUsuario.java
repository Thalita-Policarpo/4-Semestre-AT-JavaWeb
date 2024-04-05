package br.edu.infnet.thalitapolicarpo.model.domain;


public class InspecaoUsuario {


	private Integer id;

	private Usuario usuario;

	private InspecaoExtintor inspecaoExtintor;

	private InspecaoHidrante inspecaoHidrante;

	public InspecaoUsuario(Usuario usuario, InspecaoExtintor inspecaoExtintor, InspecaoHidrante inspecaoHidrante) {
		super();
		this.usuario = usuario;
		this.inspecaoExtintor = inspecaoExtintor;
		this.inspecaoHidrante = inspecaoHidrante;
	}

	public InspecaoUsuario() {
	}

	@Override
	public String toString() {
		return "UsuarioInspecao [id=" + id + ", usuario=" + usuario + ", inspecaoExtintor=" + inspecaoExtintor
				+ ", inspecaoHidrante=" + inspecaoHidrante + "]";
	}

	// Getters and Setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public InspecaoExtintor getInspecaoExtintor() {
		return inspecaoExtintor;
	}

	public void setInspecaoExtintor(InspecaoExtintor inspecaoExtintor) {
		this.inspecaoExtintor = inspecaoExtintor;
	}

	public InspecaoHidrante getInspecaoHidrante() {
		return inspecaoHidrante;
	}

	public void setInspecaoHidrante(InspecaoHidrante inspecaoHidrante) {
		this.inspecaoHidrante = inspecaoHidrante;
	}
	
	

}