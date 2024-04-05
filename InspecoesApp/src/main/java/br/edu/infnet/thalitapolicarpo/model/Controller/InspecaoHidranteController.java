package br.edu.infnet.thalitapolicarpo.model.Controller;

import br.edu.infnet.thalitapolicarpo.model.Service.InspecaoHidranteService;
import br.edu.infnet.thalitapolicarpo.model.domain.InspecaoHidrante;
import spark.Route;

public class InspecaoHidranteController {

	//listar todos
	public static Route obterLista = (req, res) ->{
		
		return InspecaoHidranteService.obterLista();
	};
	
	// incluir
	public static Route incluir = (req, res) ->{
		
		InspecaoHidrante inspecaoHidrante = new InspecaoHidrante();
		
		InspecaoHidranteService.incluir(inspecaoHidrante);
		
		return "Inclusão de Inspeção Hidrante: " + inspecaoHidrante.getId();
	};
	
	//exclusão
	public static Route excluir = (req, res) ->{
		
		Integer index = Integer.valueOf(req.params("id"));
		
		InspecaoHidrante inspecaoHidrante = InspecaoHidranteService.obterPorId(index);
		
		InspecaoHidranteService.excluir(index);
		
		return "Excliusão de Inspeção Hidrante "+ inspecaoHidrante;
	};
	
	//listar um
	public static Route obterPorId = (req, res) ->{
		
		Integer index = Integer.valueOf(req.params("id"));
		
		InspecaoHidrante inspecaoHidrante = InspecaoHidranteService.obterPorId(index);
		
		return "Recuperar Inspeção Hidrante " + inspecaoHidrante;
	};
	
}
