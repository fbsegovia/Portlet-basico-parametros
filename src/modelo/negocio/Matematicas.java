package modelo.negocio;

import java.util.ArrayList;
import java.util.List;

public class Matematicas {
	
	public List<Integer> calcularNumerosPares(int inicio,int fin){
		List<Integer> listaNumeros = new ArrayList<>();
		for(int i = inicio;i<=fin;i++){
			if(i % 2 == 0){
				listaNumeros.add(i);
			}
		}
		
		return listaNumeros;
	}
}
