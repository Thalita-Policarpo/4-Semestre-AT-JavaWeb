package br.edu.infnet.thalitapolicarpo.model.Controller;

import br.edu.infnet.thalitapolicarpo.model.Service.UsuarioService;
import br.edu.infnet.thalitapolicarpo.model.domain.Usuario;
import spark.Route;

public class UsuarioController {

	//listar todos
	public static Route obterLista = (req, res) ->{
					
		return UsuarioService.obterLista();
	};
	
	// incluir
	public static Route incluir = (req, res) ->{
		
		Usuario user =new Usuario();
		
		UsuarioService.incluir(user);
		
		return "Inclusão do usuário: " + user.getNome();
	};
	
	
	//exclusão
	public static Route excluir = (req, res) ->{
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Usuario user = UsuarioService.obterPorId(index);
		
		UsuarioService.excluir(index);
		
		return "Excliusão do Usuário: " + user;
	};
	
	
	//listar um
	public static Route obterPorId = (req, res) ->{
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Usuario user = UsuarioService.obterPorId(index);
		
		return "Recuperar do Usuário: " + user;
	};
	
}
