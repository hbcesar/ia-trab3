package com.bioclassifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Result {
	HashMap<Grupo,Integer> map = new HashMap<Grupo, Integer>();
	Grupo decisao = null;
	
	public enum Grupo {
		PEIXE, ANFIBIO, REPTEIS, AVES, MAMIFERO
	}
	
//	public enum Animais {
//		SALMAO, TUBARAO,
//		SAPO, SALAMANDRA,
//		JACARE, COBRA, TARTARUGA,
//		PINGUIM, PATO, GALINHA,
//		MACACO, BALEIA, MORCEGO
//	}
	
	public Grupo getDecisao() {
		return decisao;
	}

	public void setDecisao(Grupo grupo) {
		this.decisao = grupo;
	}
	
	public void countVote(Grupo g){
		if(map.containsKey(g)){
			int i = map.get(g);
			map.put(g, ++i);
		} else {
			map.put(g, 1);	
		}
	}
	
	public void removePossibility(Grupo g){
		if(map.containsKey(g)){
			map.remove(g);
		}
	}
	
	public void resultado() {
		ArrayList<Grupo> grupos = new ArrayList<>();
		
		if(!map.isEmpty()){
			int maxValueInMap = (Collections.max(map.values()));  // This will return max value in the Hashmap
		
		
			for (Entry<Grupo, Integer> entry : map.entrySet()) {  // Iterate through hashmap
				if (entry.getValue() == maxValueInMap) {
					grupos.add(entry.getKey());
				}
			}
			
			if(grupos.size() > 1){
				System.out.println("As entradas fornecidas definem os seguintes grupos:");
				
				for(Grupo g : grupos){
					System.out.println(g);
				}
			} else {
				decisao = grupos.get(0);
				System.out.println("O grupo definido é: " + decisao);
			}
		} else {
			System.out.println("Não foi possivel determinar resultado.");
		}
	}
	
	public void clean() {
		map.clear();
	}
	
	
}
