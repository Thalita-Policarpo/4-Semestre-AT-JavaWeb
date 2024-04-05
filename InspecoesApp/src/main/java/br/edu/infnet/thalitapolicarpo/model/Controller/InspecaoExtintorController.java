package br.edu.infnet.thalitapolicarpo.model.Controller;

import br.edu.infnet.thalitapolicarpo.model.Service.InspecaoExtintorService;
import br.edu.infnet.thalitapolicarpo.model.domain.InspecaoExtintor;
import spark.Route;

public class InspecaoExtintorController {

	//listar todos
	public static Route obterLista = (req, res) ->{		
		
		return InspecaoExtintorService.obterLista();
	};
	
	// incluir
	public static Route incluir = (req, res) ->{
		
		InspecaoExtintor inspecaoExtintor = new InspecaoExtintor();
		
		InspecaoExtintorService.incluir(inspecaoExtintor);		
		
		return "Inclusão de Inspeção Extintor: " + inspecaoExtintor.getId();
	};
	
	//exclusão
	public static Route excluir = (req, res) ->{
		
		Integer index = Integer.valueOf(req.params("id"));
		
		InspecaoExtintor inspecaoExtintor = InspecaoExtintorService.obterPorId(index);
		
		InspecaoExtintorService.excluir(index);
		
		return "Excliusão de Inspeção Extintor " + inspecaoExtintor.getId();
	};
	
	//listar um
	public static Route obterPorId = (req, res) ->{
		
		Integer index = Integer.valueOf(req.params("id"));
		
		InspecaoExtintor inspecaoExtintor = InspecaoExtintorService.obterPorId(index);
		
		return "Recuperar Inspeção Extintor "+ inspecaoExtintor;
	};
	
}
