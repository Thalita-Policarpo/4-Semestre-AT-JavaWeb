package br.edu.infnet.thalitapolicarpo;

import br.edu.infnet.thalitapolicarpo.model.Controller.ExtintorController;
import br.edu.infnet.thalitapolicarpo.model.Controller.HidranteController;
import br.edu.infnet.thalitapolicarpo.model.Controller.InspecaoExtintorController;
import br.edu.infnet.thalitapolicarpo.model.Controller.InspecaoHidranteController;
import br.edu.infnet.thalitapolicarpo.model.Controller.UsuarioController;
import br.edu.infnet.thalitapolicarpo.model.Controller.ViaCepController;
import spark.Spark;

public class App {

	public static void main(String[] args) {
		
		Spark.port(8080);

		Spark.get("/",
					(req, res) -> {
						return App.class.getResourceAsStream("/index.html");
			});
		
		//ViaCep
		Spark.get("/viacep/:cep", ViaCepController.getAddress);
		
				
		// Usuarios
		Spark.get("/usuario/lista", UsuarioController.obterLista);
		Spark.get("/usuario/incluir", UsuarioController.incluir);
		Spark.get("/usuario/:id/excluir", UsuarioController.excluir);
		Spark.get("/usuario/:id", UsuarioController.obterPorId);
		
				
		//Extintor
		Spark.get("/extintor/lista", ExtintorController.obterLista);
		Spark.get("/extintor/incluir", ExtintorController.incluir);
		Spark.get("/extintor/:id/excluir", ExtintorController.excluir);
		Spark.get("/extintor/:id", ExtintorController.obterPorId);
				
				
		//Hidrante
		Spark.get("/hidrante/lista", HidranteController.obterLista);
		Spark.get("/hidrante/incluir", HidranteController.incluir);
		Spark.get("/hidrante/:id/excluir", HidranteController.excluir);
		Spark.get("/hidrante/:id", HidranteController.obterPorId);
		
				
		//InspecaoExtintor
		Spark.get("/inspecaoExtintor/lista", InspecaoExtintorController.obterLista);
		Spark.get("/inspecaoExtintor/incluir", InspecaoExtintorController.incluir);
		Spark.get("/inspecaoExtintor/:id/excluir", InspecaoExtintorController.excluir);
		Spark.get("/inspecaoExtintor/:id", InspecaoExtintorController.obterPorId);
		
				
		//InspecaoHidrante
		Spark.get("/inspecaoHidrante/lista", InspecaoHidranteController.obterLista);
		Spark.get("/inspecaoHidrante/incluir", InspecaoHidranteController.incluir);
		Spark.get("/inspecaoHidrante/:id/excluir", InspecaoHidranteController.excluir);
		Spark.get("/inspecaoHidrante/:id", InspecaoHidranteController.obterPorId);
		
				

	}
}
