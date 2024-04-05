package br.edu.infnet.thalitapolicarpo.model.Controller;

import br.edu.infnet.thalitapolicarpo.model.Service.HidranteService;
import br.edu.infnet.thalitapolicarpo.model.domain.Hidrante;
import spark.Route;

public class HidranteController {

	//listar todos
	public static Route obterLista = (req, res) ->{
		
		return HidranteService.obterLista();
	};
	
	// incluir
	public static Route incluir = (req, res) ->{
		
		Hidrante hidrante = new Hidrante();
		
		HidranteService.incluir(hidrante);
		
		return "Inclusão de Hidrante: " + hidrante.getNumeroControleInterno();
	};
	
	//exclusão
	public static Route excluir = (req, res) ->{
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Hidrante hidrante = HidranteService.obterPorId(index);
		
		HidranteService.excluir(index);
		
		return "Excliusão de Hidrante " + hidrante.getNumeroControleInterno();
	};
	
	//listar um
	public static Route obterPorId = (req, res) ->{
		
		Integer index = Integer.valueOf(req.params("id"));
		
		Hidrante hidrante = HidranteService.obterPorId(index);
		
		return "Recuperar Hidrante " + hidrante;
	};
	
}
