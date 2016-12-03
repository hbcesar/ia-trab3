package com.bioclassifier;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Result {
	HashMap<Grupo,Integer> map = new HashMap<Grupo, Integer>();
	
	private void counter(){
//		int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
//        for (Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
//            if (entry.getValue()==maxValueInMap) {
//                System.out.println(entry.getKey());     // Print the key with max value
//            }
//        }
	}
	
	public void countVote(Grupo g){
		if(map.containsKey(g)){
			int i = map.get(g);
			map.put(g, ++i);
		} else {
			map.put(g, 1);	
		}
	}
	
	public void setResult(Grupo g){
		if(map.containsKey(g)){
			int i = map.get(g);
			map.put(g, 50);
		} else {
			map.put(g, 50);	
		}
	}
	
	public enum Grupo {
		PEIXE, ANFIBIO, REPTEIS, AVES, MAMIFERO
	}
	
	public enum Animais {
		SALMAO, TUBARAO,
		SAPO, SALAMANDRA,
		JACARE, COBRA, TARTARUGA,
		PINGUIM, PATO, GALINHA,
		MACACO, BALEIA, MORCEGO
	}
	
	public void resultado() {
		int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
      for (Entry<Grupo, Integer> entry : map.entrySet()) {  // Itrate through hashmap
          if (entry.getValue()==maxValueInMap) {
              System.out.println(entry.getKey());     // Print the key with max value
          }
      }
	}
	
	
}
