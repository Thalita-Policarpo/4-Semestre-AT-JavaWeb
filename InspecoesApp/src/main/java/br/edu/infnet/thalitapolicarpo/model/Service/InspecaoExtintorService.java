package br.edu.infnet.thalitapolicarpo.model.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import br.edu.infnet.thalitapolicarpo.model.domain.InspecaoExtintor;


public class InspecaoExtintorService {

	private static Map <Integer , InspecaoExtintor> inspecoes = new HashMap<Integer, InspecaoExtintor>();

	private static Integer id = 0;
	
	public static void incluir(InspecaoExtintor inspecaoExtintor) {
	
		// Cria um objeto Random
		Random random = new Random();

		// Define os arrays com os valores pré-definidos
		String[] datasInspecao = {"01/01/2020", "15/03/2021", "30/06/2022"};
		String[] status = {"conforme", "nao conforme"};

		// Gera um índice aleatório e usa para pegar um valor dos arrays
		String valorStatus = status[random.nextInt(status.length)];
		String valorData = datasInspecao[random.nextInt(datasInspecao.length)];

		inspecaoExtintor.setId(++id);
		inspecaoExtintor.setSinalizado(random.nextBoolean());
		inspecaoExtintor.setDesobstruido(random.nextBoolean());
		inspecaoExtintor.setManometroPressaoAdequada(random.nextBoolean());
		inspecaoExtintor.setDataInspecao(valorData);
		inspecaoExtintor.setStatus(valorStatus);
		
		inspecoes.put(id, inspecaoExtintor);
	}
	
	public static void excluir(Integer id) {
		inspecoes.remove(id); 
	}
	
	
	public static Collection<InspecaoExtintor> obterLista(){
		return inspecoes.values();
	}
	
	
	public static InspecaoExtintor obterPorId(Integer id){
		return inspecoes.get(id);
	}
}
