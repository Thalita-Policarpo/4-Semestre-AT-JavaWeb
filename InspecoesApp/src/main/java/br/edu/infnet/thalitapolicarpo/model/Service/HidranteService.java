package br.edu.infnet.thalitapolicarpo.model.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import br.edu.infnet.thalitapolicarpo.model.domain.Hidrante;

public class HidranteService {

	private static Map <Integer, Hidrante> hidrantes = new HashMap<Integer, Hidrante>();
	
	private static Integer id = 0;
	
	public static void incluir(Hidrante hidrante) {
		// Cria um objeto Random
		Random random = new Random();

		// Define os arrays com os valores pré-definidos
		String[] localizacoes = {"prédio1", "predio 2", "predio 3"};
		String[] datasDeInstalacao = {"01/01/2020", "15/03/2021", "30/06/2022"};
		String[] alturasDeFixacao = {"1.5m", "2.0m", "2.5m"};
		String[] tiposDeHidrante = {"Tipo1", "Tipo2", "Tipo3"};

		hidrante.setId(++id);
		hidrante.setNumeroControleInterno(random.nextInt(900000) + 100000);
		hidrante.setLocalizacao(localizacoes[random.nextInt(localizacoes.length)]);
		hidrante.setDataDeInstalacao(datasDeInstalacao[random.nextInt(datasDeInstalacao.length)]);
		hidrante.setAlturaDeFixacao(alturasDeFixacao[random.nextInt(alturasDeFixacao.length)]);
		hidrante.setTipoDeHidrante(tiposDeHidrante[random.nextInt(tiposDeHidrante.length)]);

		hidrantes.put(id, hidrante);

	}
	
	public static void excluir(Integer id) {
		hidrantes.remove(id); 
	}
	
	
	public static Collection<Hidrante> obterLista(){
		return hidrantes.values();
	}
	
	
	public static Hidrante obterPorId(Integer id){
		return hidrantes.get(id);
	}
	
	
	
}
