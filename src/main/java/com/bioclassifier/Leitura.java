package com.bioclassifier;

import java.text.Normalizer;
import java.util.Scanner;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Leitura {
	private static String normalize(String input){
		String convertedString = 
			       Normalizer
			           .normalize(input, Normalizer.Form.NFD)
			           .replaceAll("[^\\p{ASCII}]", "")
			           .toLowerCase();
		
		return convertedString;
	}
	
	private static Animal criarAnimal(String habitat, String revestimento, String locomocao, String reproducao, String alimentacao, String respiracao){
		Animal a = new Animal();
		
		//Divide as entradas em strings diferentes (caso tenha passado mais do que uma)
		if(habitat.length() > 1){
			String parts[] = habitat.split(", ");
			for(String c : parts){
				a.addHabitat(c);
			}
		}
		
		if(revestimento.length() > 1){
			String parts[] = revestimento.split(", ");
			for(String c : parts){
				a.addRevestimento(c);
			}
		}
		
		if(locomocao.length() > 1){
			String parts[] = locomocao.split(", ");
			for(String c : parts){
				a.addLocomocao(c);
			}
		}
		
		if(reproducao.length() > 1){
			String parts[] = reproducao.split(", ");
			for(String c : parts){
				a.addReproducao(c);
			}
		}
		
		if(alimentacao.length() > 1){
			String parts[] = alimentacao.split(", ");
			for(String c : parts){
				a.addAlimentacao(c);
			}
		}
		
		if(respiracao.length() > 1){
			String parts[] = respiracao.split(", ");
			for(String c : parts){
				a.addRespiracao(c);
			}
		}
		
		return a;
	}
	
	public static Animal obterDoTeclado(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String habitat;
		String revestimento;
		String locomocao;
		String reproducao;
		String alimentacao;
		String respiracao;
		Animal a = null;
		KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("ksession-rules");
		
    	//Fica lendo do teclado em loop
		while(true){
			System.out.println("----------- Entradas ---------");
			System.out.print("Habitat: ");
			habitat = normalize(sc.nextLine());
			System.out.print("Revestimento: ");
			revestimento = normalize(sc.nextLine());
			System.out.print("Locomoção: ");
			locomocao = normalize(sc.nextLine());
			System.out.print("Reprodução: ");
			reproducao = normalize(sc.nextLine());
			System.out.print("Alimentação: ");
			alimentacao = normalize(sc.nextLine());
			System.out.print("Respiração: ");
			respiracao = normalize(sc.nextLine());
			
			a = criarAnimal(habitat, revestimento, locomocao, reproducao, alimentacao, respiracao);
			Result r = new Result();
			kSession.insert(a);
			kSession.insert(r);
			System.out.println("----------- Resultados ---------");
	    	kSession.fireAllRules();
	    	kSession = kContainer.newKieSession("ksession-rules");
	    	System.out.println("\n\n");
	    	
		}
	}
}
