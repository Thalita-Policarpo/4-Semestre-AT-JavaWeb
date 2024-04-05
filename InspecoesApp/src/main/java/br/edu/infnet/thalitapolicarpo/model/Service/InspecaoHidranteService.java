package br.edu.infnet.thalitapolicarpo.model.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import br.edu.infnet.thalitapolicarpo.model.domain.InspecaoHidrante;
import br.edu.infnet.thalitapolicarpo.model.domain.MetragemMangueira;
import br.edu.infnet.thalitapolicarpo.model.domain.ValidadeMangueira;


public class InspecaoHidranteService {

	
	private static Map <Integer , InspecaoHidrante > hidrantes = new HashMap<Integer, InspecaoHidrante>();

	private static Integer id = 0;
	
	public static void incluir(InspecaoHidrante hidrante) {
		
		Random random = new Random();
		//hidrante.setInspecaoUsuarios(new ArrayList<>());
		hidrante.setDataInspecao("01/01/2022");
		hidrante.setSinalizado(random.nextBoolean());
		hidrante.setDesobstruido(random.nextBoolean());
		hidrante.setPossuiChaveStorz(random.nextBoolean());
		hidrante.setQuantidadeMangueiras(random.nextInt(2) + 1);
		hidrante.setStatus("conforme");

		List<MetragemMangueira> metragens = new ArrayList<>();
		metragens.add(new MetragemMangueira(random.nextInt(2) == 0 ? 15 : 30));
		hidrante.setMetragens(metragens);

		List<ValidadeMangueira> validadesMangueiras = new ArrayList<>();
		validadesMangueiras.add(new ValidadeMangueira(random.nextBoolean() ? "valida" : "invalida"));
		hidrante.setValidadesMangueiras(validadesMangueiras);
	
		hidrante.setId(++id);
		hidrantes.put(id, hidrante);
	}
	
	public static void excluir(Integer id) {
		hidrantes.remove(id); 
	}
	
	
	public static Collection<InspecaoHidrante> obterLista(){
		return hidrantes.values();
	}
	
	
	public static InspecaoHidrante obterPorId(Integer id){
		return hidrantes.get(id);
	}
}
