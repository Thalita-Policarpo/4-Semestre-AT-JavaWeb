 package br.edu.infnet.thalitapolicarpo.model.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import br.edu.infnet.thalitapolicarpo.model.domain.Extintor;

public class ExtintorService {
	
	private static Map <Integer , Extintor> extintores = new HashMap<Integer, Extintor>();


	
	private static Integer id = 0;
	
	
	public static void incluir(Extintor extintor) {
		
		// Cria um objeto Random
		Random random = new Random();

		// Define os arrays com os valores pré-definidos
		String[] cargasExtintoras = {"AP", "CO2", "PQS-BC", "PQS-ABC"};
		String[] localizacoes = {"prédio1", "predio 2", "predio 3"};

		extintor.setId(++id);
		extintor.setCargaExtintora(cargasExtintoras[random.nextInt(cargasExtintoras.length)]);
		extintor.setLocalizacao(localizacoes[random.nextInt(localizacoes.length)]);
		extintor.setNumeroCilindro(String.valueOf(random.nextInt(9000) + 1000));
		extintor.setNumeroControleInterno(random.nextInt(900000) + 100000);
		extintor.setNumeroSeloInmetro(String.valueOf(random.nextInt(900000000) + 100000000));
    	
	    extintores.put(id, extintor);
	}
	
	public static void excluir(Integer id) {
		extintores.remove(id); 
	}
	
	
	public static Collection<Extintor> obterLista(){
		return extintores.values();
	}
	
	
	public static Extintor obterPorId(Integer id){
		return extintores.get(id);
	}
}
