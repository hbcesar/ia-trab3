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
	
	private static void setOption(Animal a, String s, String option){
		String parts[] = s.split(", ");
		
		switch(option){
		case "habitat":
			for(String c : parts){
				a.setHabitat(c);
			}
		case "revestimento":
			for(String c : parts){
				a.setRevestimento(c);
			}
		case "locomocao":
			for(String c : parts){
				a.setLocomocao(c);
			}
		case "reproducao":
			for(String c : parts){
				a.setReproducao(c);
			}
		case "alimentacao":
			for(String c : parts){
				a.setAlimentacao(c);
			}
		case "respiracao":
			for(String c : parts){
				a.setRespiracao(c);
			}
		}
		
	}
	
	private static Animal criarAnimal(String habitat, String revestimento, String locomocao, String reproducao, String alimentacao, String respiracao){
		Animal a = new Animal();
		
		if(habitat.length() > 1){
			setOption(a, habitat, "habitat");
		}
		
		if(revestimento.length() > 1){
			setOption(a, revestimento, "revestimento");
		}
		
		if(locomocao.length() > 1){
			setOption(a, locomocao, "locomocao");
		}
		
		if(reproducao.length() > 1){
			setOption(a, reproducao, "reproducao");
		}
		
		if(alimentacao.length() > 1){
			setOption(a, alimentacao, "alimentacao");
		}
		
		if(respiracao.length() > 1){
			setOption(a, respiracao, "respiracao");
		}
		
		return a;
	}
	
	public static Animal obterDoTeclado(){
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
