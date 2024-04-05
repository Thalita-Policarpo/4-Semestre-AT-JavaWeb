package br.edu.infnet.thalitapolicarpo.model.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import br.edu.infnet.thalitapolicarpo.model.domain.Usuario;

public class UsuarioService {

	
		private static Map <Integer , Usuario> usuarios = new HashMap<Integer, Usuario>();

		private static Integer id = 0;
		
		public static void incluir(Usuario User) {
			
			Random rand = new Random();

			User.setNome("Nome" + rand.nextInt(100));
			User.setEmail("usuario" + rand.nextInt(100) + "@exemplo.com");
			User.setLogradouro("Rua " + rand.nextInt(100));
			User.setLocalidade("Cidade" + rand.nextInt(100));
			User.setUf("Estado" + rand.nextInt(100));
		
			User.setId(++id);
			usuarios.put(id, User);
		}
		
		public static void excluir(Integer id) {
			usuarios.remove(id); 
		}
		
		
		public static Collection<Usuario> obterLista(){ 
			return usuarios.values(); 
		}
		 
		
		public static Usuario obterPorId(Integer id){
			return usuarios.get(id);
		}
}
