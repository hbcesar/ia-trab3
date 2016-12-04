package com.bioclassifier;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {

	public static void main(String[] args) {
		try {
            // load up the knowledge base
//	        KieServices ks = KieServices.Factory.get();
//    	    KieContainer kContainer = ks.getKieClasspathContainer();
//        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	Leitura.obterDoTeclado();
        	//Teste.testarElementosTabela(kSession);
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}
}
