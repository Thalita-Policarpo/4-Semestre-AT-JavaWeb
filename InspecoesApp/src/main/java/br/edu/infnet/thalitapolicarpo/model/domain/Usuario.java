package br.edu.infnet.thalitapolicarpo.model.domain;

public class Usuario {


	Integer id;
	private String nome;
	private String email;
	private String logradouro;
	private String localidade;
	private String uf;
	
//	@OneToMany(mappedBy = "usuario")
 //   private List<InspecaoUsuario> inspecoesUsuario = new ArrayList<>();
	

	public Usuario() {
		
	}

	public Usuario(String nome, String email, String logradouro, String localidade, String uf
			/*List<InspecaoUsuario> inspecoesUsuario*/) {
		super();
		this.nome = nome;
		this.email = email;
		this.logradouro = logradouro;
		this.localidade = localidade;
		this.uf = uf;
//		this.inspecoesUsuario = inspecoesUsuario;
	}

	// Getters and Setters
	


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getLocalidade() {
		return localidade;
	}


	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


//	public List<InspecaoUsuario> getInspecoesUsuario() {
//		return inspecoesUsuario;
//	}
//
//
//	public void setInspecoesUsuario(List<InspecaoUsuario> inspecoesUsuario) {
//		this.inspecoesUsuario = inspecoesUsuario;
//	}

	

}

