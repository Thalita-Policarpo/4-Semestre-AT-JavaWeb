package br.edu.infnet.thalitapolicarpo.model.Controller;

import br.edu.infnet.thalitapolicarpo.model.Service.ExtintorService;
import br.edu.infnet.thalitapolicarpo.model.domain.Extintor;
import spark.Route;

public class ExtintorController {

	//listar todos
	public static Route obterLista = (req, res) ->{
		
		return ExtintorService.obterLista();
	};
	
	// incluir
	public static Route incluir = (req, res) ->{

		
		Extintor extintor = new Extintor();
		
		ExtintorService.incluir(extintor);
		
		return "Inclusão do Extintor: " + extintor.getNumeroControleInterno();
	};
	
	//exclusão
	public static Route excluir = (req, res) ->{
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Extintor extintor = ExtintorService.obterPorId(index);
		
		ExtintorService.excluir(index);
		
		return "Excliusão de Extintor " + extintor.getNumeroControleInterno();
	};
	
	//listar um
	public static Route obterPorId = (req, res) ->{
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Extintor extintor = ExtintorService.obterPorId(index);
		
		return "Recuperar Extintor " + extintor.getNumeroControleInterno();
	};

	
}
